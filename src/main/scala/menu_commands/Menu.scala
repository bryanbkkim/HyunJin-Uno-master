package menu_commands

import PlayerOrder._

object Menu {
  
  def initialize() = ???
  
  def showGameArea : String = {
    var result =  Board.show + "\n"
    result += Scoreboard.show + "\n"
    result += CardsRemaining.show
    
    result
  }
  
  def showPlayerOrder : String = {
    return PlayerOrder.show
  }
  
  def advancePlayerOrder : Unit = {
    PlayerOrder.advance
  }
}