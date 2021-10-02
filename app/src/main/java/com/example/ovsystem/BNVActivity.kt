package com.example.ovsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class BNVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bnv_activity)

        /*  bottomNavigationView.background = null
          bottomNavigationView.menu.getItem(2).isEnabled = false

          fab.setOnClickListener { startActivity(Intent(this@BNVActivity,MainActivity::class.java)) }
          */


        val navigation = findViewById<BottomNavigationView>(R.id.navigation)

        val navControler = findNavController(R.id.my_nav_host_fragment)


        /*      val appBarConfiguration = AppBarConfiguration(
                  setOf(
                      R.id.shopFragment,
                      R.id.exploreFragment,
                      R.id.cartFragment,
                      R.id.favouriteFragment,
                      R.id.accountFragment
                  )
              )
              setupActionBarWithNavController(navControler, appBarConfiguration)*/


        navigation.setupWithNavController(navControler)


    }


}
