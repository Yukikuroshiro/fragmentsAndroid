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
            "Mortal Kombat é uma série de jogos criados pelo estúdio de Chicago da Midway Games. Em 2011, depois da falência da Midway, a produção de Mortal Kombat foi adquirida pela Warner Bros, tornando-se em seguida na Netherealm. A Warner detém atualmente os direitos da série. ",
                4.0f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "2013-11-29",context.getDrawable(R.drawable.ps5)!!),
                    Console(2, "Playstation 5", "Sony", "2020-09-20",context.getDrawable(R.drawable.ps5)!!)
                ))
            )

            games.add(Game(
                2,
                "Persona 5 Royal",
                context.getDrawable(R.drawable.persona)!!,
                "Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus. O jogo é cronologicamente a sexta edição da série Persona, que faz parte principalmente da franquia Megami Tensei.",
                5.0f,
                listOf(
                    Console(1, "Playstation 4", "Sony", "2013-11-29",context.getDrawable(R.drawable.ps5)!!),
                    Console(2, "Playstation 5", "Sony", "2020-09-20",context.getDrawable(R.drawable.ps5)!!)
                ))
            )

            games.add(Game(
                3,
                "Persona 4 Golden",
                context.getDrawable(R.drawable.persona_4)!!,
                "Shin Megami Tensei: Persona 4, também conhecido como Persona 4, é um RPG para PlayStation 2 produzido pela Atlus, lançado originalmente em Julho de 2008. Cronologicamente, é o quinto episódio da série Persona, spin-off de Shin Megami Tensei.",
                4.8f,
                listOf(
                    Console(1, "Playstation Vita", "Sony", "2010-11-29",context.getDrawable(R.drawable.ps5)!!)
                ))
            )

            games.add(Game(
                4,
                "Chrono Trigger",
                context.getDrawable(R.drawable.chronotrigger)!!,
                "Chrono Trigger é um jogo de RPG eletrônico desenvolvido pela Square Co. Foi lançado para o console Super Nintendo no Japão em março de 1995, e uma versão aprimorada para PlayStation foi lançada em novembro de 1999.",
                4.8f,
                listOf(
                    Console(1, "Super Nintendo", "Nintendo", "2010-11-29",context.getDrawable(R.drawable.ps5)!!),
                    Console(2, "GBA", "Nintendo", "2010-11-29",context.getDrawable(R.drawable.ps5)!!),
                    Console(1, "Nintendo DS", "Nintendo", "2010-11-29",context.getDrawable(R.drawable.ps5)!!),
                    Console(1, "Playstation", "Sony", "2010-11-29",context.getDrawable(R.drawable.ps5)!!)
                ))
            )

            return games
        }
    }
}