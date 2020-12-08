package com.example.fragmentpager


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.visitor_points.view.*


class MyAdapter(private val context: Context, private val myList:ArrayList<PointsModel>):RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(pointsObject:PointsModel){

            itemView.tv_points.text=pointsObject.pts
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.visitor_points, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(myList[position])
    }


    override fun getItemCount(): Int {
        return myList.size
    }
}