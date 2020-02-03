  
package menu_commands

object Scoreboard {
  def show = {
    var result = "Scores:\n"
    for (p <- PlayerOrder.toArray)
      result += p.name + " = " + p.card + ", "
    result = result.substring(0, result.length - 2) + "\n"

    if (PlayerOrder.current.card == 0) {
      result += PlayerOrder.current.name + " Wins!\n"
    }

    result
  }
}