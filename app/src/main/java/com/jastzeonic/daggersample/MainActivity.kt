package com.jastzeonic.daggersample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jastzeonic.daggersample.model.CreatureModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        creatureDogButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            startActivity(intent)
        }

        creatureCatButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            intent.putExtra(CreatureActivity.CREATURE_TYPE, CreatureModule.CAT)
            startActivity(intent)
        }

        creatureGodzillaButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            intent.putExtra(CreatureActivity.CREATURE_TYPE, CreatureModule.GODZILLA)
            startActivity(intent)
        }


    }
}
