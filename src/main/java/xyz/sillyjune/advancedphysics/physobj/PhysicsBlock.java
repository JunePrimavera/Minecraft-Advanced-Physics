package xyz.sillyjune.advancedphysics.physobj;

import net.minecraft.block.Block;
import org.joml.Vector3f;

public class PhysicsBlock {

    float mass;
    Block block;
    Vector3f offsetPosition;
    Vector3f originalWorldPosition;
    public PhysicsBlock(Block block, Vector3f worldPosition) {
        this.block = block;
        this.mass = block.getBlastResistance() * block.getHardness();
        this.originalWorldPosition = worldPosition;
    }
}
