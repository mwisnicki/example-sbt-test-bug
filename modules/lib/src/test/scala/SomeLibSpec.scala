import org.scalatest.wordspec.AnyWordSpec

class SomeLibSpec extends AnyWordSpec {
  "Library tests" must {
    "execute in clean environment" in {
      val foo = System.getProperty("foo")
      assert(foo == null)
    }
  }
}
