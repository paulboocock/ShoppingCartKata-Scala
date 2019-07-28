class ShoppingCart {
  val prices: Map[String, Int] = Map("Apple" -> 50, "Banana" -> 20, "Carrot" -> 15, "Turnip" -> 75)
  var basket: List[String] = List()

  def Total: Int = basket.map(prices(_)).sum

  def Scan(barcode: String) {
    basket = barcode :: basket
  }
}
