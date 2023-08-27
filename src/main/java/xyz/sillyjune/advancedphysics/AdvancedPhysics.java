package xyz.sillyjune.advancedphysics;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class AdvancedPhysics implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {

    }
    public static Identifier id(String id) {
        return new Identifier("physics", id);
    }

}
