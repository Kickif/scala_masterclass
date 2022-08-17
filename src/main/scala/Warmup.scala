object Warmup {

  def sum_rec(begin: Int, end: Int) : Int = {
    if (begin == end)
      begin
    else
      end + sum_rec(begin, end - 1)
  }
}
