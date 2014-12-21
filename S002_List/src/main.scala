object Main {
  def main(args:Array[String]) ={
    // リスト定義と結合
    var p1 = List(1,2,3,4)
    var p2 = List(2,3,4,5)
    var p3 = p1 ::: p2  // 結合演算子
    var p5 = p1 ++ p2  // 上と同じ 部分的に箇所によっては使用出来ない
    p3.foreach { n => print(n+",") }
    println()
    //
    p3 = p3.+:(10)  // 前方結合
    p3 = p3.::(20)  // 前方結合
    p3 = 30 :: p3  // 前方結合
    p3.foreach{ n => print(n+",")}
    println()
    // Listは末尾追加機能が存在しないので、
    // 追加する為のリストを作成するか
    // reverceを工夫して追加する必要がある
    var p4 = p1
    p4 = p4 ::: 10 :: 20 :: 30 :: Nil
    p4 = p4.reverse
    p4 = 40 :: p4
    p4 = 50 :: p4
    p4 = p4.reverse
    println(p4)
    // リストの探索
    println("Int==10 : " + p4.exists { x => x==10 })
    println("Int==15 : " + p4.exists { x => x==15 })
    println("Count Int%3==0 : " + p4.count { x => x%3==0 })
    println("All plus1 : " + p4.map { x => x+1 })
  }
}

