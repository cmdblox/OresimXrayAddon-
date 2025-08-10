package com.ori.oresimxrayaddon

import meteordevelopment.meteorclient.systems.modules.Module
import meteordevelopment.meteorclient.events.world.TickEvent
import meteordevelopment.orbit.EventHandler
import net.minecraft.block.Blocks
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import meteordevelopment.meteorclient.systems.modules.ModuleCategory
import kotlin.math.sqrt

class ChestAuraModule : Module(XrayModule.CATEGORY, "ChestAura", "Automatically opens nearby chests.") {
    private val range = setting("Range", 4.5, 1.0, 8.0)

    @EventHandler
    private fun onTick(event: TickEvent.Pre) {
        val player = mc.player ?: return
        val world = mc.world ?: return
        val playerPos = player.blockPos

        BlockPos.iterate(
            playerPos.x - range.get().toInt(),
            playerPos.y - range.get().toInt(),
            playerPos.z - range.get().toInt(),
            playerPos.x + range.get().toInt(),
            playerPos.y + range.get().toInt(),
            playerPos.z + range.get().toInt()
        ).forEach { pos ->
            val blockState = world.getBlockState(pos)
            if (blockState.block == Blocks.CHEST) {
                val distSq = playerPos.getSquaredDistance(pos)
                if (distSq <= range.get() * range.get()) {
                    mc.interactionManager?.interactBlock(
                        player,
                        Hand.MAIN_HAND,
                        BlockHitResult(player.eyePos, player.horizontalFacing, pos, false)
                    )
                }
            }
        }
    }
}
