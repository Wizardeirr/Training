package com.example.training.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.training.data.RegistrationData
import com.example.training.viewmodel.LoginViewModel
import com.volkankelleci.training.databinding.FragmentRegistirationBinding

class RegistirationFragment : Fragment() {
    private  var _binding: FragmentRegistirationBinding?=null
    private val binding get() =_binding!!
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
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


        viewModel= ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.signButton.setOnClickListener {
            val name=binding.editTextUserName.text.toString()
            val surName=binding.editTextUserSurname.text.toString()
            val age=binding.editTextUserAge.text.toString().toInt()
            val email=binding.editTextUserEmail.text.toString()
            val password=binding.editTextPassword.text.toString()
            val phone=binding.editTextUserPhone.text.toString().toInt()

            val Input=RegistrationData(0,name,surName,age,password,phone,email)
            val girdi=viewModel.insertUser(Input)
            binding.showInfos.text=girdi.toString()
        }

    }


}