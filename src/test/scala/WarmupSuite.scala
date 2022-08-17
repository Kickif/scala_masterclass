import munit.FunSuite

class WarmupSuite extends FunSuite {

  test("sum_rec returns the sum of the numbers between two numbers a and b") {
    assertEquals(Warmup.sum_rec(1, 1), 1)
    assertEquals(Warmup.sum_rec(1, 3), 6)
    assertEquals(Warmup.sum_rec(-2, 4), 7)
  }

}
