package com.example.fundflow.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fundflow.fragment.PemasukanFragment
import com.example.fundflow.fragment.PengeluaranFragment

class ArusKasPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2 // Pemasukan dan Pengeluaran
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PemasukanFragment()
            1 -> PengeluaranFragment()
            else -> PemasukanFragment()
        }
    }
}
