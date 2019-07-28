package net.paulboocock.shoppingcart.offers
import net.paulboocock.shoppingcart.basket.Basket

case class ThresholdOffer(name: String, barcode: String, discount: Int, threshold: Int) extends OfferInformation with OfferProvider {
  override def findQualifiedOffers(basket: Basket): Offer = {
    val numberOfDiscounts = basket.items.count(_.barcode == barcode) / threshold
    Offer(numberOfDiscounts, this)
  }
}
