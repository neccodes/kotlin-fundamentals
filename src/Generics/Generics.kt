package Generics

/*
    fun main(args: Array<String>) {
        val footballPlayer = FootballPlayer("Football player 1")
        val footballPlayer2 = FootballPlayer("Football player 2")

        val baseballPlayer = BaseballPlayer("Baseball player 1")
        val baseballPlayer2 = BaseballPlayer("Baseball player 2")

        val footballTeam = Team("Football Team", mutableListOf(footballPlayer))
        footballTeam.addPlayer(footballPlayer2)
        footballTeam.addPlayer(footballPlayer)

        val baseballTeam = Team< BaseballPlayer>("Baseball Team", mutableListOf(baseballPlayer))
        baseballTeam.addPlayer(baseballPlayer2)
        baseballTeam.addPlayer(baseballPlayer)

        val gamesTeam = Team<GamesPlayer>("Games Team", mutableListOf())
    }

    class Team<T: Player>(val name: String, val players: MutableList<T>) {
        fun addPlayer(player: T) {
            if (players.contains(player)) {
                println("Player: ${player.name} is already in the Team ${this.name}")
            } else {
                players.add(player)
                println("Player: ${player.name} was added in the Team ${this.name}")
            }
        }
    }

    open class Player(val name: String)
    class FootballPlayer(name: String): Player(name)
    class BaseballPlayer(name: String): Player(name)
    class GamesPlayer(name: String): Player(name)
*/