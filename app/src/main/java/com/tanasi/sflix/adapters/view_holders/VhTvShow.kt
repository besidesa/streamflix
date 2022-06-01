package com.tanasi.sflix.adapters.view_holders

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.tanasi.sflix.models.TvShow

class VhTvShow(
    private val _binding: ViewBinding
) : RecyclerView.ViewHolder(
    _binding.root
) {

    private val context = itemView.context
    private lateinit var tvShow: TvShow

    fun bind(tvShow: TvShow) {
        this.tvShow = tvShow
    }
}