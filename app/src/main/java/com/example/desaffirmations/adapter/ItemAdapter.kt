package com.example.desaffirmations.adapter
/*para capturar os dados da Datasource e formata-los para que cada Desaffirmation
seja exibida como um item na RecyclerView utilizei um Adapter que é um padrão de design que
adapta os dados para algo que possa ser usado pelo RecyclerView*/
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desaffirmations.R
import com.example.desaffirmations.model.Desaffirmation

class ItemAdapter(
    private val context: Context,//para fornecer informações sobre como resolver os recursos de string, essa e outras infos
    //são armezenadas em instancia de obejto Context

    private val dataset: List<Desaffirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    /*O RecyclerView não interage diretamente com as visualizações de itens, mas lida com ViewHolders.
    Um ViewHolder representa uma única visualização de item de lista em um RecyclerView e pode ser
     reutilizado sempre que possível. Uma instância ViewHolder contém referências às visualizações individuais
     em um layout de item de lista.*/
    class ItemViewHolder(private  val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
}