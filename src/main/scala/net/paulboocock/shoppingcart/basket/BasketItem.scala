package net.paulboocock.shoppingcart.basket

import net.paulboocock.shoppingcart.item.{ItemInformation, PricingInformation}

class BasketItem(val name: String, val price: Int) extends ItemInformation with PricingInformation
