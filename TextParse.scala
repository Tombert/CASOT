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
    var counter:Int = 0
    for (i<-0 to a.length-1) {
      if (a(i)=='('){
	counter+=1
	beginIndex = i+1
      }
      else if(a(i)==')'){
	counter-=1
	if(counter == 0){
	  endIndex =  i-1
	  deserialize(a.substring(beginIndex,endIndex))
	}
      }
    }

    // for (i<- 0 to a.length-1){
    //   if(beginParen != '(' && a(i) == '(') {
    // 	beginParen = a(i)
    // 	beginIndex = i
    //   }
    //   if(endParen != ')' && a(a.length-1-i)==')'){
    // 	endParen = a(a.length-1-i)
    // 	endIndex = a.length-1-i
    //   }
    //   if (beginParen == '(' && endParen == ')'){
    // 	var outerMostParen = a.substring(beginIndex, endIndex)
    // 	deserialize(outerMostParen)
    //   }
    // }
    // var objects = a.split('+')
    // for(i<-objects) {
    //   println(i)
    // }
  }
}
