package com.besson.arknights.screen;

import com.besson.arknights.ArknightsFurniture;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SmallSlotScreenHandler> SMALL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(ArknightsFurniture.MOD_ID, "small_slot"),
                    new ExtendedScreenHandlerType<>(SmallSlotScreenHandler::new));
    public static void registerScreenHandlers() {

    }
}
