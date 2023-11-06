package com.example.prjapiomdb

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.prjapiomdb.databinding.ListDatamovieBinding
import com.example.prjapiomdb.modeldata.MovieData

class MovieAdapter(
    private val listMovie:ArrayList<MovieData>
):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemlist:ListDatamovieBinding):RecyclerView.ViewHolder(itemlist.root){
        private val binding = itemView
        fun bind(movieData: MovieData){
            with(binding){
                Glide.with(itemView).load(movieData.gambar).into()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}