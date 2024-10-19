package com.besson.arknights.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public final class PlayerLieDownEvents {
    public static final Event<PlayerLieDown> PLAYER_LIE_DOWN =
            EventFactory.createArrayBacked(PlayerLieDown.class, callbacks -> (player, pos) -> {
                for (PlayerLieDown callback : callbacks) {
                    ActionResult result = callback.onPlayerLieDown(player, pos);
                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }
        return ActionResult.PASS;
    });

    @FunctionalInterface
    public interface PlayerLieDown {
        ActionResult onPlayerLieDown(PlayerEntity player, BlockPos pos);
    }
}
