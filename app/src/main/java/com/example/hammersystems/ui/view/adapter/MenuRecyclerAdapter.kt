package com.example.hammersystems.ui.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hammersystems.R

class MenuRecyclerAdapter() :
    RecyclerView.Adapter<MenuRecyclerAdapter.MenuRecyclerHolder>() {

    private val IMAGES1 = mutableListOf(
        "https://cdnn21.img.ria.ru/images/98976/61/989766135_0:105:2000:1230_600x0_80_0_0_b7a15601fc51de5b8c0db1c1a1c4ae62.jpg.webp",
        "https://www.tokyo-city.ru/images/interesno/Pitctca_-_natcionalnoe_italyanskoe_blyudo.jpg",
        "https://img1.russianfood.com/dycontent/images_upl/309/big_308219.jpg",
        "https://cdnn21.img.ria.ru/images/98976/61/989766135_0:105:2000:1230_600x0_80_0_0_b7a15601fc51de5b8c0db1c1a1c4ae62.jpg.webp",
        "https://www.tokyo-city.ru/images/interesno/Pitctca_-_natcionalnoe_italyanskoe_blyudo.jpg",
        "https://img1.russianfood.com/dycontent/images_upl/309/big_308219.jpg",
        "https://cdnn21.img.ria.ru/images/98976/61/989766135_0:105:2000:1230_600x0_80_0_0_b7a15601fc51de5b8c0db1c1a1c4ae62.jpg.webp",
        "https://www.tokyo-city.ru/images/interesno/Pitctca_-_natcionalnoe_italyanskoe_blyudo.jpg",
        "https://img1.russianfood.com/dycontent/images_upl/309/big_308219.jpg"
    )
    class MenuRecyclerHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView
        init {
            imageView = view.findViewById(R.id.menu_picture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuRecyclerHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_item, parent, false)

        return MenuRecyclerHolder(view)
    }

    override fun onBindViewHolder(holder: MenuRecyclerHolder, position: Int) {
        val image = IMAGES1[position]

        with(holder.itemView) {
            Glide.with(context)
                .load(image)
                .into(holder.imageView)
        }
    }

    override fun getItemCount() = IMAGES1.size
}