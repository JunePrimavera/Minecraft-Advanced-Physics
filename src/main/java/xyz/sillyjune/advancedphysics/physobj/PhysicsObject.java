package xyz.sillyjune.advancedphysics.physobj;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import xyz.sillyjune.advancedphysics.AdvancedPhysics;

import java.util.ArrayList;

public class PhysicsObject {
    public float mass;
    ArrayList<PhysicsBlock> blocks;
    public Vector3f objectPosition;
    public Vector2f objectRotation;
    public PhysicsObject(ArrayList<PhysicsBlock> blocks, Vector3f objectPosition, Vector2f objectRotation) {
        float mass = 0.0f;
        for (PhysicsBlock block : blocks) {
            mass += block.mass;
            block.offsetPosition = block.originalWorldPosition.sub(objectPosition);
        }
        this.mass = mass;
        this.blocks = blocks;
        this.objectPosition = objectPosition;
        this.objectRotation = objectRotation;
    }


}
