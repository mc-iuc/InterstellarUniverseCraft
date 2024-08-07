package name.interstellar_universe_craft.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.RegistryWorldView;
import net.minecraft.world.poi.PointOfInterestType;

import java.lang.reflect.ParameterizedType;
import java.util.concurrent.CompletableFuture;

public abstract class PointOfInterestTagProvider extends FabricTagProvider<PointOfInterestType> {
    public PointOfInterestTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE,completableFuture);
    }
}
