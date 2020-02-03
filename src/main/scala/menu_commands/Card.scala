
package menu_commands

//******* Card *******
class Card (val color : Char, val number : Int) {

  def show = {
    var result : String = color.toString + number.toString
    if (result.length < 3) result += " "
    result
  }
}