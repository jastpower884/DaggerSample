package com.jastzeonic.daggersample.compenent

import com.jastzeonic.daggersample.CreatureActivity
import com.jastzeonic.daggersample.model.CreatureModule
import dagger.Component

@Component(modules = [CreatureModule::class])
interface CreatureComponent {
    fun inject(activity: CreatureActivity)
}