package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console


class ConsoleDataSource {
    companion object{
        fun getConsoles(context: Context): List<Console>{
            val consoleDao = DatabaseBuilder.getDatabase(context).consoleDao()

            return consoleDao.listarTodos()
        }
    }

}