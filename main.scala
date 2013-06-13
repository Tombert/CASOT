  object mainProgram {
    def main(args: Array[String]) {
      var ok = true
      println("Please enter a command")
      while(ok){
	print(">")
	val ln = readLine
	ok = ln != null
	if (ok) println(ln)
      }
    }
  }

