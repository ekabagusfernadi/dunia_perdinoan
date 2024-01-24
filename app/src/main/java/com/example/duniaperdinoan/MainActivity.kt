package com.example.duniaperdinoan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDinos: RecyclerView
    private var list: ArrayList<Dino> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDinos = findViewById(R.id.rv_dinos)
        rvDinos.setHasFixedSize(true)

        list.addAll(DinosData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    private fun showRecyclerList() {
        rvDinos.layoutManager = LinearLayoutManager(this)
        val listDinoAdapter = ListDinoAdapter(list)
        rvDinos.adapter = listDinoAdapter

        listDinoAdapter.setOnItemClickCallback(object : ListDinoAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Dino) {
                showSelectedDino(data)
            }
        })
    }

    private fun showSelectedDino(dino: Dino) {
//        Toast.makeText(this, "Kamu memilih " + dino.name, Toast.LENGTH_SHORT).show()
        val detailDinoIntent = Intent(this@MainActivity, DetailDinoActivity::class.java)
        detailDinoIntent.putExtra(DetailDinoActivity.EXTRA_NAME, dino.name)
        detailDinoIntent.putExtra(DetailDinoActivity.EXTRA_DETAIL, dino.detail)
        detailDinoIntent.putExtra(DetailDinoActivity.EXTRA_PHOTO, dino.photo)
        startActivity(detailDinoIntent)
    }
}