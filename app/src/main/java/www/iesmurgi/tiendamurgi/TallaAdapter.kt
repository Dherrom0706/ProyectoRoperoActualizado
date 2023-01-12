package www.iesmurgi.tiendamurgi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class TallaAdapter(context: Context, tallas: List<Talla>):
    ArrayAdapter<Talla>(context,android.R.layout.simple_spinner_item,tallas) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val vista = convertView?: LayoutInflater.from(context).inflate(R.layout.esqueleto_spinner,parent,false)
        getItem(position)?.let { talla ->

            vista.findViewById<TextView>(R.id.tvTallaSpinner).text = talla.nombre
            vista.findViewById<TextView>(R.id.tvPrecioTalla).text = talla.precio.toString()

        }

        return vista
    }
}