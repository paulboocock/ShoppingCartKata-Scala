package net.paulboocock.shoppingcart

import net.paulboocock.shoppingcart.basket.Basket
import net.paulboocock.shoppingcart.item.ItemRepository

class ShoppingCart {
  private val _basket: Basket = new Basket()

  def Total: Int = _basket.items.map(_.price).sum

  def Scan(barcode: String) {
    _basket.add(ItemRepository.getByName(barcode))
  }
}
