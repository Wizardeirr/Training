package com.example.training.userinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.training.data.RegistrationData
import com.example.training.databinding.UserinforawBinding

class UserInfoAdapter(private val userList:List<RegistrationData>): RecyclerView.Adapter<UserInfoAdapter.UserInfoViewHolder>() {
    class UserInfoViewHolder(val binding: UserinforawBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserInfoViewHolder {

        val binding = UserinforawBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserInfoViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserInfoViewHolder, position: Int) {
        val user=userList[position]
        holder.binding.textViewName.text=user.userName
        holder.binding.textViewAge.text= user.userAge.toString()
        holder.binding.textViewEmail.text=user.userEmail


    }
}