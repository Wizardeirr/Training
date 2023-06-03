package com.example.training.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.training.R
import com.example.training.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private  var _binding:FragmentLoginBinding?=null
    private val binding get() =_binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding=FragmentLoginBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {

            val action=LoginFragmentDirections.actionLoginFragmentToUserInfoFragment2()
            findNavController().navigate(action)
        }
        binding.signupButton.setOnClickListener {
            val action2=LoginFragmentDirections.actionLoginFragmentToRegistirationFragment2()
            findNavController().navigate(action2)
        }


    }

}