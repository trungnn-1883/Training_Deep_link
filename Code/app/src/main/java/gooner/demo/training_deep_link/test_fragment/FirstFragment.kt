package gooner.demo.training_deep_link.test_fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

import gooner.demo.training_deep_link.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FirstFragment : androidx.fragment.app.Fragment() {

    var mNextBtn: Button? = null
    val mArgs : FirstFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mNextBtn = view.findViewById(R.id.fragment_first_next_btn)

        var title = arguments?.getString("title")


        FirstFragmentDirections.actionNavFirstFragmentToNavSecondFragment()
        mNextBtn?.setOnClickListener {
            when (title) {
                "second" -> view.findNavController().navigate(R.id.nav_second_fragment)
                "third" -> view.findNavController().navigate(R.id.nav_third_fragment)
                else -> view.findNavController().navigate(R.id.nav_second_fragment)
            }
        }

    }


}
