package net.paulboocock.shoppingcart

import net.paulboocock.shoppingcart.basket.Basket
import net.paulboocock.shoppingcart.item.ItemRepository
import net.paulboocock.shoppingcart.offers.{Offer, OfferProvider}

class ShoppingCart {
  private val _basket: Basket = new Basket()

  def Total: Int = _basket.items.map(_.price).sum - Offers().map(offer => offer.quantity * offer.information.discount).sum

  def Scan(barcode: String) {
    _basket.add(ItemRepository.getByName(barcode))
  }

  def Offers(): Vector[Offer] = {
    _basket.items.distinct.flatMap(b => OfferProvider(b.barcode)).map(op => op.findQualifiedOffers(_basket))
  }
}
