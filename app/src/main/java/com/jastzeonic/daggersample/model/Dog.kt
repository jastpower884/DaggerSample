package com.jastzeonic.daggersample.model


import android.net.Uri
import com.jastzeonic.daggersample.BuildConfig
import com.jastzeonic.daggersample.R

class Dog : Creature {
    override fun image(): String {

        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.dog_pixel_image).toString()
    }

    override fun shout(): String {
        return "Woof"
    }

}