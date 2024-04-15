package com.example.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }

    fun btClick(view: View)
    {
        val buSelected = view as Button
        var cellId = 0
        when (buSelected.id)
        {
            R.id.button1 -> cellId = 1
            R.id.bt2 -> cellId = 2
            R.id.bt3 -> cellId = 3
            R.id.bt4 -> cellId = 4
            R.id.bt5 -> cellId = 5
            R.id.bt6 -> cellId = 6
            R.id.bt7 -> cellId = 7
            R.id.bt8 -> cellId = 8
            R.id.bt9 -> cellId = 9

        }

        //Log.d("btClick",buSelected.id.toString())
        // Log.d("btClick : celled" , cellId.toString())
        playGame(cellId , buSelected)

    }

    private var activePlayer = 1

    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()

    private fun playGame(cellId: Int , buSelected: Button)
    {
        if (activePlayer == 1)
        {
            buSelected.text = "x"
            buSelected.setBackgroundResource(R.color.blue)
            player1.add(cellId)
            activePlayer = 2

        } else
        {
            buSelected.text = "o"
            buSelected.setBackgroundResource(R.color.darkGreen)
            player2.add(cellId)
            activePlayer = 1
        }
        buSelected.isEnabled = false

    }
}