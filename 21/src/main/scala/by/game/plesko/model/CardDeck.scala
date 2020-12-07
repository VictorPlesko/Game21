package by.game.plesko.model

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Card {
  val suit: List[String] = List("Diamonds", "Hearts", "Spades", "Clubs")
  val rank: List[Pair[String, Int]] = List(
    ("Jack", 2),
    ("Queen", 3),
    ("King", 4),
    ("6", 6),
    ("7", 7),
    ("8", 8),
    ("9", 9),
    ("10", 10),
    ("Ace", 11))
}

case class Card(suit: Int, rank: Int)

class CardDeck {

  private val deck = (for (i <- 0 to 3; j <- 0 to 8) yield Card(i, j)).to[ListBuffer]

  def randomCard: Card = deck.remove(Random.nextInt(deck.length))

  override def toString: String =
    deck.toList.map(playerCard => Card.rank(playerCard.rank)._1 + " " + Card.suit(playerCard.suit)).mkString(", ")
}
