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

  def deserialize(a:String) = {
    
    var objects = a.split('+')
    for(i<-objects) {
      println(i)
    }
  }
}
