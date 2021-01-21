package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console
import com.example.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context): ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
            "Mortal Kombat é um jogo de luta bem legal!",
            4.5,
                listOf(
                    Console(1, "Playstation 4", "Sony", "2013-11-29"),
                    Console(2, "Playstation 5", "Sony", "2020-09-20")
                ))
            )

            games.add(Game(
                2,
                "Persona 5 Royal",
                context.getDrawable(R.drawable.persona)!!,
                "Persona 5 Royal é um jogo RPG bem legal!",
                5.0,
                listOf(
                    Console(1, "Playstation 4", "Sony", "2013-11-29"),
                    Console(2, "Playstation 5", "Sony", "2020-09-20")
                ))
            )

            games.add(Game(
                3,
                "Persona 4 Golden",
                context.getDrawable(R.drawable.persona_4)!!,
                "Persona 4 Golden é um jogo RPG bem legal!",
                5.0,
                listOf(
                    Console(1, "Playstation Vita", "Sony", "2010-11-29")
                ))
            )

            return games
        }
    }
}