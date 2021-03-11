package com.example.testefragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "name") var consoleName: String,
    @ColumnInfo(name = "consoleMaker") var consoleMaker: String,
    @ColumnInfo(name = "consoleReleaseDate") var consoleReleaseDate: String,
    @ColumnInfo(name = "consoleImage") var consoleImage: String
)