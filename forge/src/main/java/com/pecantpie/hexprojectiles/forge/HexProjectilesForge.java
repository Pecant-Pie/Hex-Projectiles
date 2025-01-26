package com.pecantpie.hexprojectiles.forge;

import com.pecantpie.hexprojectiles.ExampleBlocks;
import com.pecantpie.hexprojectiles.HexProjectiles;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HexProjectiles.MOD_ID)
public class HexProjectilesForge {
    public HexProjectilesForge() {
        // examplemod.accesswidener
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        HexProjectiles.init();
    }
}
