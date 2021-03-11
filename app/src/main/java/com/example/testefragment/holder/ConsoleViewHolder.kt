package com.example.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.model.Console
import kotlinx.android.synthetic.main.holder_console_layout.view.*

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val consoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val consoleMaker = itemView.findViewById<TextView>(R.id.text_view_console_maker)
    val consoleReleaseDate = itemView.findViewById<TextView>(R.id.text_view_console_date)
    val consoleImage = itemView.findViewById<ImageView>(R.id.console_image)

    fun bind(console: Console){
        consoleName.text = console.consoleName
        consoleMaker.text = console.consoleMaker
        consoleReleaseDate.text = console.consoleReleaseDate
    }
}