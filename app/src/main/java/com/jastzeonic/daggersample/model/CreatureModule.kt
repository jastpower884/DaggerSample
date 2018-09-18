package com.jastzeonic.daggersample.model

import dagger.Module
import dagger.Provides

@Module
class CreatureModule(private val creatureType: Int) {

    companion object {
        const val DOG: Int = 0
        const val CAT: Int = 1
        const val GODZILLA: Int = 2
    }

    @Provides
    fun provideCreature(): Creature {

        return when (creatureType) {
            CAT ->
                Cat()
            DOG ->
                Dog()
            GODZILLA ->
                Godzilla()
            else ->
                Dog()
        }

    }

}