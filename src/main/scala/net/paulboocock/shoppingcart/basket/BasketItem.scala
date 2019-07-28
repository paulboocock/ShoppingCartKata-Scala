package net.paulboocock.shoppingcart.basket

import net.paulboocock.shoppingcart.item.{ItemInformation, PricingInformation}

case class BasketItem(barcode: String, price: Int) extends ItemInformation with PricingInformation
