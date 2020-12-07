package by.game.plesko.view

import by.game.plesko.controller.Game
import by.game.plesko.model.{CardDeck, PlayerCards}

object Main extends App {
  val deck = new CardDeck
  val game = new Game
  val player1 = new PlayerCards(deck)
  val player2 = new PlayerCards(deck)
  val player3 = new PlayerCards(deck)
  val player4 = new PlayerCards(deck)
  player1.takeCard()
  player2.takeCard()
  player2.takeCard()
  println(game.getWinner(player1, player2, player3, player4))
}
