import scala.util.matching.Regex
object TextParse {
  def primaryLoop = {
    var ok = true
    println("Please enter a command")
    while(ok){
      print(">")
      val ln = readLine
      ok = ln != null
      if (ok) {
	deserialize(ln)
	println(ln)
      }
    }
  }

  def deserialize(a:String):Unit = {
    var beginParen:Char = ' '
    var endParen:Char = ' '
    var beginIndex:Int = 0
    var endIndex:Int = a.length-1
    for (i<- 0 to a.length-1){
      if(beginParen != '(' && a(i) == '(') {
	beginParen = a(i)
	beginIndex = i
      }
      if(endParen != ')' && a(a.length-1-i)==')'){
	endParen = a(a.length-1-i)
	endIndex = a.length-1-i
      }
      if (beginParen == '(' && endParen == ')'){
	var outerMostParen = a.substring(beginIndex, endIndex)
	deserialize(outerMostParen)
      }
    }
    var objects = a.split('+')
    for(i<-objects) {
      println(i)
    }
  }
}
