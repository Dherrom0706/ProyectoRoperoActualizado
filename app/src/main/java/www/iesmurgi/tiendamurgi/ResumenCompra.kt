package www.iesmurgi.tiendamurgi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import www.iesmurgi.tiendamurgi.databinding.ActivityMainBinding
import www.iesmurgi.tiendamurgi.databinding.ActivityResumenCompraBinding
import java.math.RoundingMode
import java.text.DecimalFormat

class ResumenCompra : AppCompatActivity() {
    private var cantidad: Int = 1
    private lateinit var binding: ActivityResumenCompraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResumenCompraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvPrecioNum.text = intent.extras?.getDouble("PRENDA_PRECIO").toString()
        binding.tvPrenda.append(" "+intent.extras?.getString("PRENDA_NOMBRE").toString())
        binding.tvTallaNum.text = (intent?.extras?.getString("PRENDA_TALLA").toString())
        intent?.extras?.getInt("PRENDA_FOTO")?.let { binding.ivFoto.setImageResource(it) }
    }

    fun sumarOnClick(view: View) {
        var cantidad = Integer.parseInt(binding.tvCantidadNum.text.toString())
        binding.tvCantidadNum.text = (cantidad+1).toString()

        var precio = (cantidad+1) * intent.extras?.getDouble("PRENDA_PRECIO")!!
        binding.tvPrecioNum.text = precio.toString()
    }

    fun restarOnClick(view: View) {
        var cantidad = Integer.parseInt(binding.tvCantidadNum.text.toString())
        if (cantidad > 1){
            binding.tvCantidadNum.text = (cantidad-1).toString()
            var precio =  binding.tvPrecioNum.text.toString().toDouble() - intent.extras?.getDouble("PRENDA_PRECIO")!!
            binding.tvPrecioNum.text = precio.toString()
        }
    }

    fun btnComprarOnClick(view: View) {
        Toast.makeText(this,"Compra realizada con exito por valor de "+binding.tvPrecioNum.text+"€",Toast.LENGTH_SHORT).show()
    }
}