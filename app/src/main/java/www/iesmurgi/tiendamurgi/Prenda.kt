package www.iesmurgi.tiendamurgi

import android.content.res.Resources

data class Prenda(val nombre: Int, val fotografia: Int, val precioTalla: Map<String,Float>): java.io.Serializable{

    companion object{

        //PRECIOS GENERADOS MEDIANTE TIRADAS DE 2 DADOS DE 100 CARAS
        val prendaSources = listOf(
            Prenda(R.string.calcetin, fotografia = R.drawable.calcetin, mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f)),
            Prenda(R.string.calcetin1, fotografia = R.drawable.calcetin1, mapOf("S" to 30.20f,"M" to 31.20f,"L" to 32.20f)),
            Prenda(R.string.calcetin2,fotografia = R.drawable.calcetin2,  mapOf("S" to 14.41f,"M" to 15.41f,"L" to 16.41f)),
            Prenda(R.string.calcetin3,fotografia = R.drawable.calcetin3,  mapOf("S" to 20.34f,"M" to 21.34f,"L" to 22.34f)),
            Prenda(R.string.calcetin4,fotografia = R.drawable.calcetin4, mapOf("S" to 11.59f,"M" to 12.59f,"L" to 13.59f)),
            Prenda(R.string.camiseta,fotografia = R.drawable.camiseta,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f)),
            Prenda(R.string.camiseta2,fotografia = R.drawable.camiseta2, mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f)),
            Prenda(R.string.camiseta3,fotografia = R.drawable.camiseta3,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.camiseta4,fotografia = R.drawable.camiseta4,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.gorra,fotografia = R.drawable.gorra,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.gorra1,fotografia = R.drawable.gorra1,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.gorra2,fotografia = R.drawable.gorra2,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.leggin,fotografia = R.drawable.legging,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.leggin1,fotografia = R.drawable.legging1,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.pantalon,fotografia = R.drawable.pantalon,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.pantalon1,fotografia = R.drawable.pantalon1,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.pantalon2,fotografia = R.drawable.pantalon2,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.sudadera,fotografia = R.drawable.sudadera,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.sudadera1,fotografia = R.drawable.sudadera1,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.sudadera2,fotografia = R.drawable.sudadera2,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.sudadera3,fotografia = R.drawable.sudadera3,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.vestido,fotografia = R.drawable.vestido,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.vestido1,fotografia = R.drawable.vestido1,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,)),
            Prenda(R.string.vestido2,fotografia = R.drawable.vestido2,  mapOf("S" to 19.60f,"M" to 20.60f,"L" to 21.60f,))
        )
    }

}
