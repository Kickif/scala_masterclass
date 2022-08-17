import munit.FunSuite

class WarmupSuite extends FunSuite {

  test("sum_rec returns the sum of the numbers between two numbers a and b") {
    assertEquals(Warmup.sum_rec(1, 1), 1)
    assertEquals(Warmup.sum_rec(1, 3), 6)
    assertEquals(Warmup.sum_rec(-2, 4), 7)
  }

  test("sum_tail returns the sum of the numbers between two numbers a and b") {
    assertEquals(Warmup.sum(1, 1), 1)
    assertEquals(Warmup.sum(1, 3), 6)
    assertEquals(Warmup.sum(-2, 4), 7)
    assertEquals(Warmup.sum(3, 1), 6)
  }

  def check_concat[T](
                name: String,
                underTest: (String, Int) => String
              )(implicit loc: munit.Location): Unit = {
    test(name) {
      assertEquals(underTest("", 3), "")
      assertEquals(underTest("foo", 1), "foo")
      assertEquals(underTest("bah", 3), "bahbahbah")
    }
  }

  check_concat("Tail recursive Concatenate a given string n times", Warmup.concat _)
  check_concat("Recursive Concatenate a given string n times", Warmup.concat_rec _)

  test("Calculate fibonacci number for a provided value n") {
    assertEquals(Warmup.fib(1), 1)
    assertEquals(Warmup.fib(2), 1)
    assertEquals(Warmup.fib(3), 2)
    assertEquals(Warmup.fib(4), 3)
    assertEquals(Warmup.fib(7), 13)
  }

  test("Bracket syntax is valid") {
    assert(Warmup.isValid(""))
    assert(Warmup.isValid("()"))
    assert(Warmup.isValid("(())"))
    assert(Warmup.isValid("(())()"))
    assert(Warmup.isValid("(()(()))()"))
    assert(!Warmup.isValid(")("))
    assert(!Warmup.isValid("(()("))
    assert(!Warmup.isValid("(()))"))
  }

  test("Generate all valid bracket expressions") {
    assertEquals(Warmup.generate(1), Set("()"))
    assertEquals(Warmup.generate(2), Set("()()", "(())"))
    assertEquals(Warmup.generate(3), Set("()()()", "()(())", "(())()", "(()())", "((()))"))
  }



}
