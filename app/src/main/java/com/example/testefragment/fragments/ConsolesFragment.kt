package com.example.testefragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.adapter.ConsoleAdapter
import com.example.testefragment.data.dao.ConsoleDataSource
import com.example.testefragment.model.Console

class ConsolesFragment : Fragment() {

    private lateinit var recyclerConsoles: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_consoles, container, false)

        recyclerConsoles = view.findViewById(R.id.recycler_view_consoles)

        recyclerConsoles.layoutManager = LinearLayoutManager(view.context)

        recyclerConsoles.adapter = consoleAdapter

        consoleList = ConsoleDataSource.getConsoles(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        return view

    }
}