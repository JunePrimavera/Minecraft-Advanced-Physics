package xyz.sillyjune.advancedphysics.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.sillyjune.advancedphysics.AdvancedPhysics;
import xyz.sillyjune.advancedphysics.physobj.PhysicsObject;

@Mixin(ServerWorld.class)
public class PhysicsObjectTick {
    @Shadow
    @Final
    private MinecraftServer server;

    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(CallbackInfo ci) {
        for (PhysicsObject physicsObject : AdvancedPhysics.TICKABLE_PHYSICS_OBJECTS) {
            physicsObject.physicsTick(server);
        }
    }
}