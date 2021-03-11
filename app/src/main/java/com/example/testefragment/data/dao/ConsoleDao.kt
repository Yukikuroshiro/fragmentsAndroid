package com.example.testefragment.data.dao

import androidx.room.*
import com.example.testefragment.model.Console

@Dao
interface ConsoleDao {

    @Insert
    fun salvar(console: Console)

    @Update
    fun atualizar(console: Console)

    @Delete
    fun excluir(console: Console)

    @Query("SELECT * FROM console ORDER BY id ASC")
    fun listarTodos():List<Console>

}