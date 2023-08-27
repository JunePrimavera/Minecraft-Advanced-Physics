package xyz.sillyjune.advancedphysics;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import xyz.sillyjune.advancedphysics.physobj.PhysicsObject;

import java.util.ArrayList;

public class AdvancedPhysics implements ModInitializer {
    public static ArrayList<PhysicsObject> TICKABLE_PHYSICS_OBJECTS;
    @Override
    public void onInitialize() {

    }
    public static Identifier id(String id) {
        return new Identifier("physics", id);
    }

}
