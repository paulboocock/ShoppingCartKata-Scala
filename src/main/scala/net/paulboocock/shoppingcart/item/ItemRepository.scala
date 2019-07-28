package net.paulboocock.shoppingcart.item

import net.paulboocock.shoppingcart.basket.BasketItem
import net.paulboocock.shoppingcart.repository.Repository

object ItemRepository extends Repository[BasketItem] {
  val items: Map[String, BasketItem] = Map(
    "Apple" -> BasketItem("Apple", 50),
    "Banana" -> BasketItem("Banana", 20),
    "Carrot" -> BasketItem("Carrot", 15),
    "Turnip" -> BasketItem("Turnip", 75)
  )

  override def getByName(barcode: String): BasketItem = items(barcode)
}
