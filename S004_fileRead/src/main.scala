import java.io.File
import scala.io.Source

object main {
  def main(args:Array[String]) ={
    def stringLengthMax(a:String, b:String) = if(a.length()>b.length()) a else b
    // ファイル名
    val fileName = "test.txt"
    if(new File(fileName).exists()){
      // reduceLeftはforeachのようにループ処理を行うが
      // 返り値は最後のループ処理を戻すという命令
      // reduceLeftの処理は  m=f(m,n), f(l,m)のような構造を再帰的に行う処理
      // 類似にreduce, reduceRightがある
      val lines = Source.fromFile(fileName).getLines().toList
      var pre = 0
      val maxLine = lines.reduceLeft((a,b) =>{ if(a.length()>b.length()) a else b })
      // 事前に関数を定義しておくと、こういうふうに記述出来る
//      val maxLine = lines.reduceLeft(stringLengthMax)
      println("Max Line length : "+maxLine.length())
      
      // 出力する
      // lines.foreach で１行ずつループで処理
      // (println) 部分は (println(_)) という形状であり
      // _ はforeach処理内で発生する引数である
      println(" ----- file start ----- ")
      lines.foreach(println)
      println(" ----- file end ----- ")
    }else{
      println("Error : File not found.")
    }
  }
}