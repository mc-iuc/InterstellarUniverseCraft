package name.interstellar_universe_craft;

import name.interstellar_universe_craft.datagen.ModVillagerPointOfInterestType;
import name.interstellar_universe_craft.datagen.provider.ModWorldGenerator;
import name.interstellar_universe_craft.gen.ModItemModelGenerator;
import name.interstellar_universe_craft.gen.ModLangGenerator;
import name.interstellar_universe_craft.world.feature.ModConfiguredFeatures;
import name.interstellar_universe_craft.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class InterstellarUniverseCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemModelGenerator::new);
		pack.addProvider(ModLangGenerator::new);
		pack.addProvider(ModVillagerPointOfInterestType::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
