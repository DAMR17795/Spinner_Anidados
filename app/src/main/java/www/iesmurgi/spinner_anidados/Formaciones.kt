package www.iesmurgi.spinner_anidados

data class Formaciones(val formacion:String) {
    companion object {
        val formacionsource = listOf(
            Formaciones ("Mecanica"),
            Formaciones ("Formacion Profesional Grado Medio"),
            Formaciones ("Formacion Profesional Grado Superior")
        )
    }
    override fun toString(): String {
        return formacion
    }
}
