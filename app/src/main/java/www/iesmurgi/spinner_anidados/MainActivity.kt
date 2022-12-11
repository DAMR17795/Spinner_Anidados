package www.iesmurgi.spinner_anidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    private var spinnerFam: Spinner?= null
    private var spinnerCic: Spinner?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerFam = findViewById(R.id.spinnerFamilias)
        spinnerCic = findViewById(R.id.spinnerCiclos)

        var adaptador: ArrayAdapter<CharSequence> =
            ArrayAdapter.createFromResource(
                this, R.array.array_familias, android.R.layout.simple_spinner_item)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFam?.adapter=adaptador
        spinnerFam?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

               val arrayCiclos = arrayOf(R.array.array_mecanica, R.array.array_informatica, R.array.array_administracion
               , R.array.array_electricidad)

                var adaptador2: ArrayAdapter<CharSequence> =
                    ArrayAdapter.createFromResource(this@MainActivity, arrayCiclos[p2],
                    android.R.layout.simple_spinner_item)

                adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinnerCic?.adapter=adaptador2


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}

