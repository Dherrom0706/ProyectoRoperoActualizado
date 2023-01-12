package www.iesmurgi.tiendamurgi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioGroup
import www.iesmurgi.tiendamurgi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //para limpiar las opciones
        binding.listViObjetosCompra.clearChoices()

        //adaptador
        Adapter(this,Prenda.prendaSources).also { adapter ->
            binding.listViObjetosCompra.adapter = adapter
        }


        /*val tallas = listOf(
            resources.getString(R.string.tamanio_S),
            resources.getString(R.string.tamanio_m),
            resources.getString(R.string.tamanio_l),
        )*/

        binding.listViObjetosCompra.setOnItemClickListener { parent, view, position, _ ->
           // var radioButton = (view.findViewById<RadioGroup>(R.id.groupTallas).checkedRadioButtonId)

            val prendaEscogida = parent.adapter.getItem(position) as Prenda
            val intent = Intent(this,ResumenCompra::class.java)
            println(prendaEscogida.nombre)

            intent.putExtra("PRENDA_NOMBRE",resources.getString(prendaEscogida.nombre))
            intent.putExtra("PRENDA_FOTO",prendaEscogida.fotografia)
            //intent.putExtra("PRENDA_PRECIO",prendaEscogida.precio)
            //intent.putExtra("PRENDA_TALLA",tallas[radioButton % 3])
            startActivity(intent)


        }

    }
}