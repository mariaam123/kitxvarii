package fragments

import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kitxvari.R

class KitxvebiFragment : Fragment(R.layout.kitxvebi_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val saxeli = view.findViewById<EditText>(R.id.saxeli)
        val gvari = view.findViewById<EditText>(R.id.gvari)
        val dabadebistarigi = view.findViewById<EditText>(R.id.dabadebistarigi)
        val sakontaqto = view.findViewById<EditText>(R.id.sakontaqtoinformacia)
        val misamarti = view.findViewById<EditText>(R.id.sacxovrebeli)
        val shenaxva = view.findViewById<Button>(R.id.shenaxva)

        val navController = Navigation.findNavController(view)

        shenaxva.setOnClickListener{
            val saxeli = saxeli.text.toString()
            val gvari = gvari.text.toString()
            val dabadebistarigi = dabadebistarigi.text.toString()
            val sakontaqto = sakontaqto.text.toString()
            val misamarti = misamarti.text.toString()

            if (saxeli.isEmpty() || gvari.isEmpty() || dabadebistarigi.isEmpty() || sakontaqto.isEmpty() || misamarti.isEmpty())
                return@setOnClickListener

            val action = SearchFragmentDestination.actionKitxvebiFragmentToPasuxebiFragment(saxeli, gvari, dabadebistarigi, sakontaqto, misamarti)
            navController.navigate(action)


        }

    }
}

