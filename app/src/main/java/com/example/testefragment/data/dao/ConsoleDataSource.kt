package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console


class ConsoleDataSource {
    companion object{
        fun getConsoles(context: Context): ArrayList<Console>{
            var consoles = ArrayList<Console>()

            consoles.add(Console(
                 1,
                "Playstation 4",
                "Sony",
                "2013-11-15",
                context.getDrawable(R.drawable.ps4)!!
            ))

            consoles.add(Console(
                2,
                "Playstation 5",
                "Sony",
                "2020-09-16",
                context.getDrawable(R.drawable.ps5)!!
            ))
            consoles.add(Console(
                3,
                "Nintendo Switch",
                "Nintendo",
                "2017-03-03",
                context.getDrawable(R.drawable.switchconsole)!!
            ))

            return consoles
        }
    }

}