package www.iesmurgi.tiendamurgi

class Talla(var nombre: String, val precio: Float) {
    override fun toString(): String {

        if (nombre.contentEquals("Elige la talla")){
            return nombre
        }

        return nombre + " -> " + precio + "€"
    }
}