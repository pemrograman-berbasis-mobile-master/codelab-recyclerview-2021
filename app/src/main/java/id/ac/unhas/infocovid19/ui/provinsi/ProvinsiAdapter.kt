package id.ac.unhas.infocovid19.ui.provinsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import id.ac.unhas.infocovid19.R
import id.ac.unhas.infocovid19.model.Provinsi
import kotlinx.android.synthetic.main.provinsilist_fragment.*
import kotlinx.android.synthetic.main.recyclerview_item_provinsi.view.*

class ProvinsiAdapter(private val daftarProvinsi: ArrayList<Provinsi>) : RecyclerView.Adapter<ProvinsiAdapter.ProvinsiHolder>(){

    class ProvinsiHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(itemProvinsi: Provinsi){
            with(itemView){
                nama_provinsi.text = itemProvinsi.provinsi
                data_provinsi.text = "${itemProvinsi.kasus} positif," +
                        " ${itemProvinsi.sembuh} sembuh, ${itemProvinsi.meninggal} meninggal"
            }
        }
    }

    override fun getItemCount() = daftarProvinsi.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProvinsiAdapter.ProvinsiHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.recyclerview_item_provinsi,parent,false
        )
        return ProvinsiHolder(view)
    }

    override fun onBindViewHolder(holder: ProvinsiAdapter.ProvinsiHolder, position: Int) {
        holder.bind(daftarProvinsi[position])
    }


}