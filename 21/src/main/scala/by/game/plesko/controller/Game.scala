package by.game.plesko.controller

import by.game.plesko.model.PlayerCards

class Game {
  def getWinner(playerCards: PlayerCards*): PlayerCards =
    playerCards.filter(_.getNumberOfPoints <= 21).sortBy(_.getNumberOfPoints)(Ordering.Int.reverse).head
}
