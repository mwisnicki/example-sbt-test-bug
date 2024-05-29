import org.scalatest.wordspec.AnyWordSpec

class SomeAppSpec extends AnyWordSpec {
  "App tests" must {
    "execute in test environment" in {
      val foo = System.getProperty("foo")
      assert(foo == "123")
    }
  }
}
