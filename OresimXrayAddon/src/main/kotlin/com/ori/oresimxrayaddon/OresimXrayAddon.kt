package com.ori.oresimxrayaddon

import meteordevelopment.meteorclient.addons.MeteorAddon
import meteordevelopment.meteorclient.systems.modules.Modules
import meteordevelopment.meteorclient.systems.commands.Commands

class OresimXrayAddon : MeteorAddon() {
    override fun onInitialize() {
        Modules.get().add(XrayModule())
        Modules.get().add(ChestAuraModule())
        Commands.add(SeedCommand())
    }

    override fun onRegisterCategories() {
        Modules.registerCategory(XrayModule.CATEGORY)
    }

    override fun getPackage(): String = "com.ori.oresimxrayaddon"
}
