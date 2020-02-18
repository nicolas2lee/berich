package com.xinrui.berich.presentation.dashboard.fortune.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xinrui.berich.R
import com.xinrui.berich.presentation.dashboard.fortune.model.FundModel


class FundListAdapter(val fundList: List<FundModel>, val context: Context) : RecyclerView.Adapter<FundListAdapter.ViewHolder>(){
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        return ViewHolder(
            layoutInflater.inflate(R.layout.rv_fund_txt, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return fundList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder.view.findViewById<TextView>(R.id.tv_txt).setText(fundList.get(position).name)
        //holder.view.setText(fundList.get(position).name)
    }


}