package net.paulboocock.shoppingcart.repository

trait Repository[T] {
  def getByName(name: String): T
}
