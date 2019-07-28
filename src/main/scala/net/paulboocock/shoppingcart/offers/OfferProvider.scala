package net.paulboocock.shoppingcart.offers

import net.paulboocock.shoppingcart.basket.Basket

trait OfferProvider {
  def findQualifiedOffers(basket: Basket): Offer
}

object OfferProvider {
  def apply(barcode: String): Option[OfferProvider] = barcode match {
    case "Apple" => Option(ThresholdOffer("Apple 3 for 120", "Apple", 30, 3))
    case "Banana" => Option(ThresholdOffer("Banana 5 for 80", "Banana", 20, 5))
    case "Turnip" => Option(ThresholdOffer("Turnip BOGOF", "Turnip", 75, 2))
    case _ => None
  }
}
