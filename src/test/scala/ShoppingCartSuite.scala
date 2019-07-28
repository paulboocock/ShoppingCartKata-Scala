import net.paulboocock.shoppingcart.ShoppingCart
import org.scalatest.{BeforeAndAfter, FunSuite}

class ShoppingCartSuite extends FunSuite with BeforeAndAfter {

    var cart: ShoppingCart = _

    before {
        cart = new ShoppingCart()
    }

    test("No items should cost 0") {
        assert(cart.Total === 0)
    }

    test("Unknown items should throw NoSuchElementException") {
        assertThrows[NoSuchElementException] {
            cart.Scan("Unknown")
        }
    }

    test("One Apple should cost 50") {
        cart.Scan("Apple")
        assert(cart.Total === 50)
    }

    test("One Banana should cost 20") {
        cart.Scan("Banana")
        assert(cart.Total === 20)
    }

    test("One Carrot should cost 15") {
        cart.Scan("Carrot")
        assert(cart.Total === 15)
    }

    test("One Turnip should cost 75") {
        cart.Scan("Turnip")
        assert(cart.Total === 75)
    }

    test("Two Apples should cost 100") {
        cart.Scan("Apple")
        cart.Scan("Apple")
        assert(cart.Total === 100)
    }

    test("One Apple and One Banana should cost 70") {
        cart.Scan("Apple")
        cart.Scan("Banana")
        assert(cart.Total === 70)
    }

    test("Three Apples should cost 120") {
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        assert(cart.Total === 120)
    }

    test("Five Apples should cost 220") {
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        assert(cart.Total === 220)
    }

    test("Six Apples should cost 240") {
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        cart.Scan("Apple")
        assert(cart.Total === 240)
    }
}
