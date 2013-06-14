object TextParse {
  def primaryLoop = {
    var ok = true
    println("Please enter a command")
    while(ok){
      print(">")
      val ln = readLine
      ok = ln != null
      if (ok) {
	println(ln)
      }
    }
  }
}
