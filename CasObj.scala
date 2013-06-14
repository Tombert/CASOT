trait CasObj {
  var coef:Int = 1
  var subList = List(CasNum)
  //This is going to be a generic superclass that every object in the repl will inherit from.  The reason we're making it is I think it'll be easier to append attributes this way. 
  def +( A:Int,  B:Int) = {}

}
