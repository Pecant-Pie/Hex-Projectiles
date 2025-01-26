package com.pecantpie.hexprojectiles.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.pecantpie.hexprojectiles.ExampleBlocks;
import com.pecantpie.hexprojectiles.HexProjectiles;
import net.fabricmc.api.ModInitializer;

public class HexProjectilesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HexProjectiles.init();
        HexProjectiles.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), HexProjectiles.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
