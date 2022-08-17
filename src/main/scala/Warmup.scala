import scala.annotation.tailrec

object Warmup {

  def sum(begin: Int, end: Int) : Int = {
    @tailrec
    def sum_tail(acc:Int, begin:Int, end: Int) : Int = {
      if (begin == end)
        acc + end
      else
        sum_tail(acc + end, begin, end - 1)
    }

    if (begin > end)
      sum_tail(0, end, begin)
    else
      sum_tail(0, begin, end)
  }
  def sum_rec(begin: Int, end: Int) : Int = {
    if (begin == end)
      begin
    else
      end + sum_rec(begin, end - 1)
  }

  def concat(string: String, n: Int): String = {
    @tailrec
    def concat_tail(acc: String, n: Int): String = {
      if (n == 1)
        acc
      else
        concat_tail(string + acc, n - 1)
    }

    concat_tail(string, n)
  }

  def concat_rec(string: String, n: Int): String = {
    if (n == 1)
      string
    else
      string + concat(string, n - 1)
  }

  def fib(n: Int): Int = {
    @tailrec def fib_tail(prev1: Int, prev2: Int, n: Int): Int = {
      if (n == 3)
        prev1 + prev2
      else
        fib_tail(prev2, prev1 + prev2, n - 1)
    }

    if (n < 3)
      1
    else
      fib_tail(1, 1, n)
  }

  def isValid(expr:String) : Boolean = {
    @tailrec def isValid_tail(count : Int, expr:String) : Boolean = {
      if (expr == "")
        count == 0
      else {
        expr.head match {
          case '(' => isValid_tail(count + 1, expr.tail)
          case ')' => isValid_tail(count - 1, expr.tail)
          case _ => isValid_tail(count, expr.tail)
        }
      }
    }
    isValid_tail(0, expr)
  }
}
