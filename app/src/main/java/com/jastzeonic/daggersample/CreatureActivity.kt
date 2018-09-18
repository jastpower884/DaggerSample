package com.jastzeonic.daggersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.jastzeonic.daggersample.compenent.DaggerCreatureComponent
import com.jastzeonic.daggersample.model.Creature
import com.jastzeonic.daggersample.model.CreatureModule
import kotlinx.android.synthetic.main.activity_creature.*
import javax.inject.Inject

class CreatureActivity : AppCompatActivity() {


    companion object {
        const val CREATURE_TYPE = "creature_type"
    }

    @Inject
    lateinit var creature: Creature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creature)

        val creatureType = intent.getIntExtra(CREATURE_TYPE, 0)


        DaggerCreatureComponent.builder()
                .creatureModule(CreatureModule(creatureType)).build()
                .inject(this)


        Glide.with(this).load(creature.image())
                .into(creature_image)

        creature_image.postDelayed({
            Toast.makeText(this.applicationContext, creature.shout(), Toast.LENGTH_LONG).show()
        }, 500)


    }
}
