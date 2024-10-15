package dam.pmdm.navigationexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FirstFragment", "onCreateView called")
        val view = inflater.inflate(R.layout.first, container, false)
        val button: Button = view.findViewById(R.id.next_button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        // Establecer el título de la Toolbar a vacío
//        (activity as AppCompatActivity).supportActionBar?.title = ""
        return view
    }
}