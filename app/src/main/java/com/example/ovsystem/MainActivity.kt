package com.example.ovsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bnv_Main.add(MeowBottomNavigation.Model(1, R.drawable.shops))
        bnv_Main.add(MeowBottomNavigation.Model(2, R.drawable.searchs))
        bnv_Main.add(MeowBottomNavigation.Model(3, R.drawable.ic_favorite))
        bnv_Main.add(MeowBottomNavigation.Model(4, R.drawable.account))


        bnv_Main.show(3, true)



        replace(HomeFragment())
        bnv_Main.setOnClickMenuListener {
            when (it.id) {
                1 -> replace(HomeFragment())
                2 -> replace(HomeFragment())
                3 -> replace(HomeFragment())
                4 -> replace(HomeFragment())
            }

        }


    }

    private fun replace(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
    }
}