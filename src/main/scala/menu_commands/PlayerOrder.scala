package menu_commands

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {

  this += new Player("Player1")
  this += new Player("Player2")
  this += new Player("Player3")
  this += new Player("Player4")

  def advance {
    this += this.dequeue
  }

  def show : String = {
    var result = ""    
    for (p <- this.toArray) 
      result += p.name + ", "
    result.substring(0, result.length-2)
  }

  def current : Player = {
    return this.head
  }
}