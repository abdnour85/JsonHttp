package com.example.jsonhttp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.widget.AppCompatTextView

class ListAdapte (val context: Context, val list:ArrayList<President>):BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val president=list[position]
        val view:View=LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false)
        val presidentId=view.findViewById<AppCompatTextView>(R.id.president_id)
        val presidentName=view.findViewById<AppCompatTextView>(R.id.president_name)
        val presidentPolitic=view.findViewById<AppCompatTextView>(R.id.president_politic)
        val presidentTime=view.findViewById<AppCompatTextView>(R.id.president_time)

        presidentId.text=president.id.toString()
        presidentName.text=president.name
        presidentPolitic.text=president.politic
        presidentTime.text=president.time

        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

}