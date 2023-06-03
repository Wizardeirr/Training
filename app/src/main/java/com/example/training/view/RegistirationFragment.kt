package com.example.training.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.training.data.RegistrationData
import com.example.training.databinding.FragmentRegistirationBinding
import com.example.training.viewmodel.MyViewModel
import java.util.UUID

class RegistirationFragment : Fragment() {
    private  var _binding: FragmentRegistirationBinding?=null
    private val binding get() =_binding!!
    lateinit var viewModel: MyViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding=FragmentRegistirationBinding.inflate(inflater,container,false)
        val view=binding.root


        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel= ViewModelProvider(this)[MyViewModel::class.java]

        binding.signButton.setOnClickListener {
            val name=binding.editTextUserName.text.toString()
            val surName=binding.editTextUserSurname.text.toString()
            val age=binding.editTextUserAge.text.toString().toInt()
            val email=binding.editTextUserEmail.text.toString()
            val password=binding.editTextPassword.text.toString()
            val phone=binding.editTextUserPhone.text.toString().toInt()

            val Input=RegistrationData(UUID.randomUUID(),name,surName,age,password,phone,email)
            saveAllInformations(Input)


        }
    }
    fun saveAllInformations(regi:RegistrationData){
        viewModel.addUser(regi)
    }
}