package br.tech.mobile.recyclerviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_row.view.*

//This context is not obligatory but we need to use the context os other class
class MainAdapter(context: Context): RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf("First Title", "Second", "3rd", "RecyclerView")

    override fun getItemCount(): Int {
        return videoTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //how do we even create a view
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.view_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val videoTitle = videoTitles.get(position)
        holder.itemView.textView.text = videoTitle
    }

}

class CustomViewHolder(v: View): RecyclerView.ViewHolder(v)