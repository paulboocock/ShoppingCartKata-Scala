package net.paulboocock.shoppingcart.offers

import net.paulboocock.shoppingcart.basket.Basket

trait OfferProvider {
  def findQualifiedOffers(basket: Basket): Offer
}

object OfferProvider {
  def apply(barcode: String): OfferProvider = ThresholdOffer("Apple 3 for 120", "Apple", 30, 3)
}