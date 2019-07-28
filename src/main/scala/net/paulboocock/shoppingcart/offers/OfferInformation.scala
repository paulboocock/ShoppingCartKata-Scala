package net.paulboocock.shoppingcart.offers

trait OfferInformation {
  def name: String
  def barcode: String
  def discount: Int
}