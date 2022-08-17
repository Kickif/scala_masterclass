object Warmup {

  def sum(begin: Int, end: Int) : Int = {
    if (begin == end)
      begin
    else
      end + sum(begin, end - 1)
  }
}
