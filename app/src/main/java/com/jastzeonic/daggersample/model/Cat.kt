package com.jastzeonic.daggersample.model


import android.net.Uri
import com.jastzeonic.daggersample.BuildConfig
import com.jastzeonic.daggersample.R

class Cat : Creature {
    override fun image(): String {

        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.cat_pixel_image).toString()
    }

    override fun shout(): String {
        return "Nya"
    }

}