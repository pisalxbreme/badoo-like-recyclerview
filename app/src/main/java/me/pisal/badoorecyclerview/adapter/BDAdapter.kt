package me.pisal.badoorecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import android.widget.ImageView
import kotlinx.android.synthetic.main.vh_bd.view.*
import me.pisal.badoorecyclerview.R
import me.pisal.badoorecyclerview.model.RelationStatus
import me.pisal.badoorecyclerview.model.User

class BDAdapter: RecyclerView.Adapter <BDAdapter.BDViewHolder>(){

    var models: ArrayList<User> = arrayListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): BDViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.vh_bd, p0, false)
        return BDViewHolder(view)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(p0: BDViewHolder, p1: Int) {
        p0.bindView(models[p1])
    }

    //region view holder
    class BDViewHolder(view: View): RecyclerView.ViewHolder(view) {
        init {

        }

        fun bindView(model: User){
            try {
                itemView.findViewById<ImageView>(R.id.imgProfile).setImageResource(model.imageSrc!!)
                itemView.txtName.text = model.name

                val stub: ViewStub = itemView.findViewById(R.id.tag) as ViewStub
                stub.layoutResource = if (model.status == RelationStatus.LIKE) R.layout.tag_heart else R.layout.tag_new
                stub.inflate()
            }catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}