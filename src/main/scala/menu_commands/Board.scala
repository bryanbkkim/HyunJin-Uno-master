
package menu_commands

//******* BOARD *******
object Board {
// create a 13x12 collection of possible places to put cards
  val rows = 13
  val cols = 12
  val cards = Array.ofDim[Card](rows, cols)  
  for {  i <- 0 until rows
         j <- 0 until cols
  } if(i == 0 || i == 13 || j== 0 || j == 14 || (i==6 && j == 6)|| (i ==6 && j ==7)){cards(i)(j) = new Card}

  def show : String = {
    var result = "Board:\n"
    for ( i <- 0 until rows ) {
      for ( j <- 0 until cols )
        result += cards(i)(j).show
      result += "\n"
    }
    result
  }
}