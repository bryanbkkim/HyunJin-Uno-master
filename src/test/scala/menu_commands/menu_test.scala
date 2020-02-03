package menu_commands

import org.scalatest.FunSpec 
import org.scalatest.Matchers
import org.scalactic.source.Position.apply

class Menu_Test extends FunSpec with Matchers{
    describe("UNO") {
        describe("has a menu") {

            //******** SHOW GAME AREA **************
            it("can show the game area, including cards in hand, number of cards per player, the cards they have, the discard pile, the draw pile.") { //13*13 board
                val expectedResult =
                "Board:\n" +
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
                Menu.showGameArea should be(expectedResult)
            }

            //******** SHOW PLAYER ORDER ************
            it("can show the player order") {
                val expectedResult = "Player1, Player2, Player3, Player4"
                Menu.showPlayerOrder should be(expectedResult)
            }

            //******** ADVANCED ORDER ****************
            it("can advance the player order") {
                val expectedResult = "Player2, Player3, Player4, PLayer1"
                Menu.advancePlayerOrder should be(expectedResult)
            }
        }
    }
}