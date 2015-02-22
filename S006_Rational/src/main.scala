object main {
  def main(args:Array[String]) ={
    val c = new Rational(2,6);
    println(c)
  }
  
}

class Rational(n: Int, d:Int){
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer +"/"+ denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
}


