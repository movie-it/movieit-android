package com.movie.it

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.movie.it.my.MyFragment

class MainFragmentStateAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> FriendFragment()
            2 -> MyFragment()
            else -> throw Exception("Invalid index in MainFragmentStateAdapter.")
        }
    }
}