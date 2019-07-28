package net.paulboocock.shoppingcart.item

import net.paulboocock.shoppingcart.basket.BasketItem
import net.paulboocock.shoppingcart.repository.Repository

object ItemRepository extends Repository[BasketItem] {
  val items: Map[String, BasketItem] = Map(
    "Apple" -> new BasketItem("Apple", 50),
    "Banana" -> new BasketItem("Banana", 20),
    "Carrot" -> new BasketItem("Carrot", 15),
    "Turnip" -> new BasketItem("Turnip", 75))

  override def getByName(barcode: String): BasketItem = items(barcode)
}
