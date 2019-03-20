package com.example.zhuodong.testedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv.adapter = object: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                    return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_et, parent, false))
            }

            override fun getItemCount() = 100

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            }
        }
    }
}

class MyViewHolder(view: View): RecyclerView.ViewHolder(view)
