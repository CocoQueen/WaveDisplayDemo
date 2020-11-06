package com.example.wavedisplaydemo

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import coil.api.load

/**
 *@Author Coco
 *@ClassName MyAdapter
 *@Date 2020/11/6 10:22
 *@Description TODO
 */
class MyAdapter(context: Context, var mList: MutableList<Int>) :
    WaveAdapter(context) {

    val imgs = intArrayOf(
        R.mipmap.img1,
        R.mipmap.img2,
        R.mipmap.img3,
        R.mipmap.img4,
        R.mipmap.img5,
        R.mipmap.img6,
        R.mipmap.img1
    )

    override fun createViewHolder(parent: ViewGroup, type: Int): WaveDisplayView.ViewHolder {
        var view = mInflater.inflate(R.layout.item, parent, false)
        return WaveDisplayView.ViewHolder(view)
    }

    override fun bindViewHolder(holder: WaveDisplayView.ViewHolder, position: Int) {
        val img = holder.itemView.findViewById<ImageView>(R.id.item_img)
        img.scaleType=ImageView.ScaleType.FIT_XY
        img.load(imgs[position])
    }

    override fun getItemViewType(i: Int): Int = 0
    override fun getItemCount(): Int = mList.size

}