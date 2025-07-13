package Generics


/*
    Covariance allows you to pass any subclass of the super class while
    Contravariance allows you instead to pass any super class of the subclass.
*/

class Team<T: Player>(val name: String, private val players: MutableList<in T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the Team.")
        } else {
            players.add(player)
            println("Player: ${player.name} was added to the Team.")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)
open class GamesPlayer(name: String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)

fun main(args: Array<String>) {
    /*
    val footballTeam = Team<Player>(
        "Football Team",
        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"), FootballPlayer("Player 2"))
    )
    */

    val gamesTeam = Team<CounterStrikePlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(GamesPlayer("Player 1"), GamesPlayer("Player 2"))
    )

    val mixedList = mutableListOf(1,2,360,'a','b','c', "hello", "world")

    val specificList1 = getSpecificType<Int>(mixedList)
    val specificList2 = getSpecificType<Char>(mixedList)
    val specificList3 = getSpecificType<String>(mixedList)

    for (element in specificList1) {
        println("Int elements:  $element")
    }
    for (element in specificList2) {
        println("Char elements: $element")
    }
    for (element in specificList3) {
        println("String elements: $element")
    }

}

inline fun < reified T> getSpecificType(list: List<Any>): List<T> {
    val specificList = mutableListOf<T>()
    for (element in list) {
        if (element is T) {
            specificList.add(element)
        }
    }
    return specificList
}

