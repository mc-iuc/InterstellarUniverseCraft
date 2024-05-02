package name.interstellar_universe_craft;

import name.interstellar_universe_craft.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import javax.swing.event.CaretListener;

public class InterstellarUniverseCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STAR_STORAGE_TABLE,RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STAR_GAZING_TABLE,RenderLayer.getTranslucent());
    }
}
