package fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.app.Person.fromBundle
import androidx.fragment.app.Fragment
import com.example.kitxvari.R

class PasuxebiFragment : Fragment(R.layout.pasuxebi_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.saxeli).text = PasuxebiFragment.fromBundle(requireArguments()).argName.toString()
        view.findViewById<TextView>(R.id.gvari).text = PasuxebiFragment.fromBundle(requireArguments()).argLastName.toString()
        view.findViewById<TextView>(R.id.dabadebistarigi).text = PasuxebiFragment.fromBundle(requireArguments()).argEmail.toString()
        view.findViewById<TextView>(R.id.sakontaqtoinformacia).text = PasuxebiFragment.fromBundle(requireArguments()).argEmail.toString()
        view.findViewById<TextView>(R.id.sacxovrebeli).text = PasuxebiFragment.fromBundle(requireArguments()).argEmail.toString()
    }
}



