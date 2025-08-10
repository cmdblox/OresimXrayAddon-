package com.ori.oresimxrayaddon

import meteordevelopment.meteorclient.systems.modules.Module
import meteordevelopment.meteorclient.systems.modules.ModuleCategory

class XrayModule : Module(CATEGORY, "OresimXray", "Highlights ores based on Oresim data.") {
    init {
        // TODO: connect to Oresim functionality - this is a module stub
    }

    companion object {
        val CATEGORY = ModuleCategory("Oresim")
    }
}
