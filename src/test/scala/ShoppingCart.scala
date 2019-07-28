import org.scalatest.FunSuite

class ShoppingCartSuite extends FunSuite  {
    test("One Apple should cost 50") {
        val cart = new ShoppingCart()
        cart.Scan("Apple")
        assert(cart.Total === 50)
    }

    test("One Banana should cost 20") {
        val cart = new ShoppingCart()
        cart.Scan("Banana")
        assert(cart.Total === 20)
    }

    test("One Carrot should cost 15") {
        val cart = new ShoppingCart()
        cart.Scan("Carrot")
        assert(cart.Total === 15)
    }

    test("One Turnip should cost 75") {
        val cart = new ShoppingCart()
        cart.Scan("Turnip")
        assert(cart.Total === 75)
    }

    test("Two Apples should cost 100") {
        val cart = new ShoppingCart()
        cart.Scan("Apple")
        cart.Scan("Apple")
        assert(cart.Total === 100)
    }
}
