package by.game.plesko.model

import scala.collection.mutable.ListBuffer

class PlayerCards(deck: CardDeck) {
  private val cards: ListBuffer[Card] = (for (i <- 0 to 1) yield deck.randomCard).to[ListBuffer]

  def getNumberOfPoints: Int = cards.foldLeft(0)((sum, playerCard) => sum + Card.rank(playerCard.rank)._2)

  def takeCard(): Unit = cards += deck.randomCard

  override def toString: String =
    cards.toList.map(playerCard => Card.rank(playerCard.rank)._1 + " " + Card.suit(playerCard.suit)).mkString(", ")
}
