import scala.collection.mutable.Set
//import scala.collection.mutable.HashSet
import scala.collection.immutable.HashSet

// ミュータブル：変更可能なオブジェクト
// イミュータブル：変更不可能なオブジェクト
// Scalaにはミュータブル・イミュータブルのクラスが定義されてる
// イミュータブルの方が速度が出やすい
//    mutable / immutable
//val  修正可能 / 修正不可能
//var  修正可能 / 修正可能
object main {
  def main(args:Array[String]) ={
    val mut = HashSet("A","B")
    var imu = HashSet("C","D")
    //
//    mut += "Add" // 変更出来ない
    imu += "Add"
    //
    println(mut)
    println(imu)
  }
}