package com.jastzeonic.daggersample.model

import android.net.Uri
import com.jastzeonic.daggersample.BuildConfig
import com.jastzeonic.daggersample.R

class Godzilla : Creature {
    override fun image(): String {
        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.godzilla_pixelart_by_ermagix).toString()
    }

    override fun shout(): String {
        return "RoooooooArrrrrrrr"
    }

}