package com.pecantpie.hexprojectiles;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class HexProjectilesExpectPlatform {
    /**
     * an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: com.pecantpie.hexprojectiles.HexProjectilesExpectPlatform#platformName()
     * Actual Fabric: com.pecantpie.hexprojectiles.fabric.HexProjectilesExpectPlatformImpl#platformName()
     * Actual Forge: com.pecantpie.hexprojectiles.forge.HexProjectilesExpectPlatformImpl#platformName()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static String platformName() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
