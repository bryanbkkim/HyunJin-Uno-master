
package menu_commands

//******* BOARD *******
object Board {
// create a 13x12 collection of possible places to put cards
  def show : String = {
    var result = "Board:\n" +
                "    [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ]    \n" +
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                     [ ] [ ]                 [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "[ ]                                             [ ]\n" + 
                "    [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ]    \n" +  
                "\n" +
                "Cards in Hand:\n" +
                "Player1 = 7, Player2 = 7, Player3 = 7, Player4 = 7"
    result
  }
}