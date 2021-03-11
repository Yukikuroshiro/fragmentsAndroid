package com.example.testefragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.adapter.ConsoleAdapter
import com.example.testefragment.data.dao.ConsoleDataSource
import com.example.testefragment.data.dao.DatabaseBuilder
import com.example.testefragment.model.Console

class ConsolesFragment : Fragment(), View.OnClickListener {

    private lateinit var recyclerConsoles: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()
    private lateinit var editNome: EditText
    private lateinit var editCriador: EditText
    private lateinit var buttonSalvar: Button
    private lateinit var buttonCancelar: Button
    private lateinit var dialog: AlertDialog
    private lateinit var addConsoleButton: ImageButton

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

        addConsoleButton = view.findViewById(R.id.add_console_button)

        addConsoleButton.setOnClickListener(this)

//        listarTodos()

        return view

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.add_console_button -> {
                abrirCadastroConsole()
            }
            R.id.button_cancelar -> {
                dialog.dismiss()
            }
            R.id.button_salvar -> {
                dialog.dismiss()
            }
        }
    }

    private fun abrirCadastroConsole() {
        val alert_dialog = AlertDialog.Builder(view!!.context)
        val view = layoutInflater.inflate(R.layout.cadastro_console, null)
        alert_dialog.setView(view)

        editNome = view.findViewById(R.id.edit_nome)
        editCriador = view.findViewById(R.id.edit_criador)

        buttonSalvar = view.findViewById(R.id.button_salvar)

        buttonSalvar.setOnClickListener(this)
        buttonCancelar = view.findViewById(R.id.button_cancelar)

        dialog = alert_dialog.create()
        dialog.setCancelable(false)
        dialog.show()

        buttonCancelar.setOnClickListener(this)

    }

//    private fun listarTodos() {
//        val consoleDao =  DatabaseBuilder.getDatabase(view!!.context).consoleDao()
//
//        val consoles = consoleDao.listarTodos()
//
//        val consoleAdapter = ConsoleAdapter()
//
//        recyclerConsoles.layoutManager = LinearLayoutManager(view!!.context)
//
//        consoleAdapter.updateConsoleList(consoles)
//
//        recyclerConsoles.adapter = consoleAdapter
//    }
}