package name.interstellar_universe_craft.datagen;

import name.interstellar_universe_craft.datagen.provider.PointOfInterestTagProvider;
import name.interstellar_universe_craft.villager.ModVillagers;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.concurrent.CompletableFuture;

public class ModVillagerPointOfInterestType extends PointOfInterestTagProvider {

    public ModVillagerPointOfInterestType(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
                .add(ModVillagers.STAR_HUNTER_POI);
        getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
                .add(ModVillagers.STARGAZER_POI);
    }
}
