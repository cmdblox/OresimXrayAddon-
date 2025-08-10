package com.ori.oresimxrayaddon

import meteordevelopment.meteorclient.systems.commands.Command
import meteordevelopment.meteorclient.utils.player.ChatUtils

class SeedCommand : Command("seed", "Sets the world seed for Oresim calculations.") {
    override fun run(args: Array<String>) {
        if (args.size < 2) {
            info("Usage: .seed <seed> <version>")
            return
        }

        val seedStr = args[0]
        val version = args[1]

        // Store into shared state for Oresim/Xray to consume
        OresimState.seed = seedStr
        OresimState.version = version

        ChatUtils.info("Oresim seed set to $seedStr for version $version")
    }
}
