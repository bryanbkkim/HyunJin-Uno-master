
package menu_commands

object CardsRemaining {
  def show : String= {
    var result = "Cards In Hand:\n"
    for (p <- PlayerOrder.toArray)
      result += p.name + " = " + p.card + ", "
    return result.substring(0, result.length - 2) + "\n"

  }
} 