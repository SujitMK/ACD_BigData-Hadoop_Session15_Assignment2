
// object to match and print result
object Session15_PatternMatch {
  
  //function to match the input course and return the course fee
  def patterMatch(input:String):String = 
  {
    input match 
    {
      case "ANDROID" => "12999"
      case "BIG DATA DEVELOPMENT" => "17999"
      case "SPARK" => "19999"
      case _ => "The course fee is not avaiable at this moment, we will get back to you shortly."
    }
  }
  
  // main function
  def main(args:Array[String]) = 
  {
    println(" ")
    println("Welcome To Acadgild")
    println(" ")
    println("The Available courses are ANDROID, BIG DATA DEVELOPMENT and SPARK")
    println(" ")
    println("Please enter your choice of cource to see the fee for the same.")
    var course = readLine().toString.toUpperCase      // reading user input and converting to string and making it upper case
    
    println(" ")
    // calling patternmatch to get the course fee
    println("The fee for the course " + course +" is "+ patterMatch(course)) 
    
  }
}