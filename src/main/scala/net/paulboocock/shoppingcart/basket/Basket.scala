package net.paulboocock.shoppingcart.basket

class Basket {
  private var _basket: Vector[BasketItem] = Vector()

  def items: Vector[BasketItem] = _basket
  def add(item: BasketItem): Unit = _basket = _basket :+ item
}