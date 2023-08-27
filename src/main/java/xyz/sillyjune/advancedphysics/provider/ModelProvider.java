package xyz.sillyjune.advancedphysics.provider;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModelProvider implements ModelResourceProvider {
        @Override
        public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) {
            return modelProviderContext.loadModel(identifier);
        }
}
