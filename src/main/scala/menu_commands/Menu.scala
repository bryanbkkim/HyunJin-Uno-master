package menu_commands


object Menu {
  
  def initialize() = ???
  
  def showGameArea : String = {
    var result =                 "Board:\n" +
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
  
  def showPlayerOrder : String = {
    var result = "Player1, Player2, Player3, Player4"
    result
  }
  
  def advancePlayerOrder : String = {
    var result = "Player2, Player3, Player4, PLayer1"
    result
  }
}