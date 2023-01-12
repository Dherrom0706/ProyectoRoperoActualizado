package www.iesmurgi.tiendamurgi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView


class Adapter(context: Context, prendas:List<Prenda>):
    ArrayAdapter<Prenda>(context,android.R.layout.simple_list_item_1,prendas) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val vista = convertView?: LayoutInflater.from(context).inflate(R.layout.esqueleto_prenda,parent,false)
        getItem(position)?.let { prenda ->
            vista.findViewById<ImageView>(R.id.imagenPrenda).apply {
                setImageResource(prenda.fotografia)
            }
            vista.findViewById<TextView>(R.id.nombrePrenda).text =
                context.resources.getString(prenda.nombre)

            var listaTallas = ArrayList<Talla>()
            listaTallas.add(Talla("Elige la talla",0f))

            for ((k,v) in prenda.precioTalla){
                listaTallas.add(Talla(k,v))
            }

            vista.findViewById<Spinner>(R.id.spinner).adapter = TallaAdapter(context,listaTallas)
        //vista.findViewById<TextView>(R.id.tvPrecioMain).text = prenda.precio.toString()
        }

        return vista
    }

}