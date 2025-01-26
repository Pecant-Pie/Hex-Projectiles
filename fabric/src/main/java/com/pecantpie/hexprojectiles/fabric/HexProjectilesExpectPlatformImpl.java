package com.pecantpie.hexprojectiles.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class HexProjectilesExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
