package com.example.modu3_21411035

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class halamantgs5 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var menuAdapter: menuAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamantgs5)

        recyclerView = findViewById(R.id.rv_menu)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)



        foodList.add(Food(R.drawable.papeda,"Papeda"))
        foodList.add(Food(R.drawable.rawon,"rawon"))
        foodList.add(Food(R.drawable.sopayam,"sop ayam"))
        foodList.add(Food(R.drawable.geprek,"ayam geprek"))
        foodList.add(Food(R.drawable.pecel,"pecel"))

        menuAdapter = menuAdapter(foodList)
        recyclerView.adapter = menuAdapter

        menuAdapter.onItemClick = {
                val intent = Intent(this, detailActivity::class.java)
                startActivity(intent)
            }

        }




    }












