object Main {
  def main(args:Array[String]) ={
    val param = Array("abc","def","ghi","jkl","mln")
    //
    println("whereを使ったループ処理")
    var i=0;
    while(i < param.length){
      print(param(i)+",")
      i += 1
    }
    println()
    //
    println("forを使ったループ処理")
    for(p <- param) print(p+",")
    println()
    //
    println("関数型特有のループ処理")
    param.foreach(p => print(p+","))
    println()
  }
}

