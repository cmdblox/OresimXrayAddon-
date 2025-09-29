package com.ori.oresimxrayaddon

import meteordevelopment.meteorclient.systems.modules.Module
import meteordevelopment.meteorclient.systems.modules.ModuleCategory

class XrayModule : Module(CATEGORY, "OresimXray", "Highlights ores based on Oresim data.") {
    init {
        // This is a stub module. To fully integrate with Oresim, call Meteor's Oresim API
        // when OresimState.seed changes, compute ore positions and render via Meteor's rendering utilities.
    }

    companion object {
        val CATEGORY = ModuleCategory("Oresim")
    }
}
