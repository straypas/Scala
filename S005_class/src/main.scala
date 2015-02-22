object main {
  def main(args:Array[String]) ={
    val c = new Counter
    val c2 = new Counter
    // 中身の数字を変更していく
    c.next(); c.next(); c.next()
    c2.prev(); c2.prev()
    // 一応中身チェック
    println(c.num +" "+ c2.num)
    // 足し算とかけ算
    println(CalcLib.plus(c.num, c2.num))
    println(CalcLib.mult(c.num, c2.num))
  }
}

// クラス
// クラス内変数と関数は同じ名前を使用出来ない
// コンストラクタはクラス名の後に追加、初期値は=で
// 複数コンストラクタも出来るはずだが、分かり難い定義になりそう
class Counter(a:Int = 0){
  // コンストラクタ処理
  private var _num = a
  // １つ増やす
  def next(): Unit= _num+=1
  // １つ減らす
  def prev(): Unit= _num-=1
  // 中身表示
  def num(): Int=_num
}
// シングルトンオブジェクト
object CalcLib {
  def plus(a:Int, b:Int): Int={
    a + b
  }
  def mult(a:Int, b:Int): Int={
    a * b
  }
}
