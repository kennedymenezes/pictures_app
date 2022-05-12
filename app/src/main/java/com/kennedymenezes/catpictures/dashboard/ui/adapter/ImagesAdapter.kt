package com.kennedymenezes.catpictures.dashboard.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kennedymenezes.catpictures.R
import com.kennedymenezes.catpictures.dashboard.data.response.Data
import com.kennedymenezes.catpictures.databinding.ItemImageBinding

class ImagesAdapter(
    private val imagesList: List<Data>
) : RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImagesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        holder.bind(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }

    inner class ImagesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemImageBinding.bind(itemView)

        fun bind(image: Data){
            Glide.with(itemView.context).load(image.imagesList[0].imgUrl).into(binding.ivImageHolder)
        }
    }
}