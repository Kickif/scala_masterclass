import munit.FunSuite

class WarmupSuite extends FunSuite {

  test("Returns the sum of the numbers between two numbers a and b") {
    assertEquals(Warmup.sum(1, 1), 1)
    assertEquals(Warmup.sum(1, 3), 6)
    assertEquals(Warmup.sum(-2, 4), 7)
  }

}
