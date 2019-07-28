package net.paulboocock.shoppingcart.offers

import net.paulboocock.shoppingcart.repository.Repository

object OffersRepository extends Repository[OfferProvider] {
  override def getByName(name: String): OfferProvider = ThresholdOffer("Apple 3 for 120", "Apple", 30, 3)
}
