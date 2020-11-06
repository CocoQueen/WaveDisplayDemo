package com.example.wavedisplaydemo

import android.content.Context
import android.view.LayoutInflater

/**
 *@Author Coco
 *@ClassName WaveAdapter
 *@Date 2020/11/6 10:20
 *@Description TODO
 */
abstract class WaveAdapter(val context: Context) :
    WaveDisplayView.Adapter<WaveDisplayView.ViewHolder>() {
    protected var mInflater: LayoutInflater = LayoutInflater.from(context)
}