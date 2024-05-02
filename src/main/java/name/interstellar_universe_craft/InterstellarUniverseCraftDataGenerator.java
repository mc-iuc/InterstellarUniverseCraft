package name.interstellar_universe_craft;

import name.interstellar_universe_craft.datagen.ModVillagerPointOfInterestType;
import name.interstellar_universe_craft.gen.ModItemModelGenerator;
import name.interstellar_universe_craft.gen.ModLangGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class InterstellarUniverseCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemModelGenerator::new);
		pack.addProvider(ModLangGenerator::new);
		pack.addProvider(ModVillagerPointOfInterestType::new);
	}
}
