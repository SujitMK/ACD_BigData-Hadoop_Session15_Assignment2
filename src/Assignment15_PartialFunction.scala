
// Object to add numbers using partial funtion and to square the input from partial function
object Assignment15_PartialFunction {
  
  def partialFunc(a:Int,b:Int):Int = 
  {
    a+b+10
  }
  
  def square(input:Int):Int = 
  {
    input * input
  }
  
  def main(args:Array[String]) = 
  {
    println(" ")
    println("The Addition using parital function is : " +partialFunc(5,3))
    println(" ")
    println("The Square using parital function Input is : " +square(partialFunc(5,3)))
  }
}