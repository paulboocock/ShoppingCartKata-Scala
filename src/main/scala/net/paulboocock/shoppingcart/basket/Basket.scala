package net.paulboocock.shoppingcart.basket

class Basket {
  private var _basket: List[BasketItem] = List()

  def items: List[BasketItem] = _basket
  def add(item: BasketItem): Unit = _basket = item :: _basket
}