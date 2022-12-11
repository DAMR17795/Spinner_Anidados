package www.iesmurgi.spinner_anidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    //Creacion variables
    private var spinnerFam: Spinner?= null
    private var spinnerCic: Spinner?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Asignacion Variables
        spinnerFam = findViewById(R.id.spinnerFamilias)
        spinnerCic = findViewById(R.id.spinnerCiclos)

        //Adaptador para el primer Spinner-Familias
        var adaptador: ArrayAdapter<CharSequence> =
            ArrayAdapter.createFromResource(
                this, R.array.array_familias, android.R.layout.simple_spinner_item)

        //layout para mostrar las familias
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //Asignacion de adaptador a Spinner
        spinnerFam?.adapter=adaptador

        //Metodo Listener para asignar el segundo adaptador y spinner
        spinnerFam?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                //Array con los ciclos
               val arrayCiclos = arrayOf(R.array.array_mecanica, R.array.array_informatica, R.array.array_administracion
               , R.array.array_electricidad)

                //Segundo adaptador para spinnerCic
                var adaptador2: ArrayAdapter<CharSequence> =
                    ArrayAdapter.createFromResource(this@MainActivity, arrayCiclos[p2],
                    android.R.layout.simple_spinner_item)

                //layout para mostrar los ciclos
                adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

                //Asignacion de adaptador a spinner
                spinnerCic?.adapter=adaptador2


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}

