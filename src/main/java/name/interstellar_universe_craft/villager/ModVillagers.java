package name.interstellar_universe_craft.villager;

import com.google.common.collect.ImmutableSet;
import name.interstellar_universe_craft.InterstellarUniverseCraft;
import name.interstellar_universe_craft.block.ModBlocks;
import name.interstellar_universe_craft.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.apache.http.conn.ssl.PrivateKeyStrategy;
import oshi.annotation.concurrent.Immutable;

public class ModVillagers {
    //在这里注册工作方块
    public static final PointOfInterestType STAR_HUNTER_POI = registerPOI("star_hunter", ModBlocks.STAR_STORAGE_TABLE);
    public static final PointOfInterestType STARGAZER_POI = registerPOI("stargazer_poi", ModBlocks.STAR_GAZING_TABLE);

    //在这里注册职业
    public static final VillagerProfession STAR_HUNTER = registerProfession("star_hunter",
            RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(InterstellarUniverseCraft.MOD_ID,"star_hunter")));
    public static final VillagerProfession STARGAZER = registerProfession("stargazer",
            RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(InterstellarUniverseCraft.MOD_ID,"stargazer_poi")));

    //以下为配置
    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION,new Identifier(InterstellarUniverseCraft.MOD_ID,name),
                VillagerProfessionBuilder.create().id(new Identifier(InterstellarUniverseCraft.MOD_ID,name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }
    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(InterstellarUniverseCraft.MOD_ID,name),
                1,1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
    public static void registerVillagers(){
        InterstellarUniverseCraft.LOGGER.info("registering Villagers for " + InterstellarUniverseCraft.MOD_ID);
    }
    public static void registerTrades(){
        //猎星师
        TradeOfferHelper.registerVillagerOffers(STAR_HUNTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DUST_OF_LEAF,3),
                            new ItemStack(ModItems.DAZZLING_STAR,1),
                            2,2,0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(STAR_HUNTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DAZZLING_STAR,1),
                            new ItemStack(ModItems.STAR_ENERGY_JAR,2),
                            5,2,0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(STAR_HUNTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DAZZLING_STAR,1),
                            new ItemStack(ModItems.CARBON_SILICON_MIXTURE,5),
                            10,2,0.01f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(STAR_HUNTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_SILICON,32),
                            new ItemStack(ModItems.DAZZLING_STAR,1),
                            10,2,0.02f
                    ));
                });

    }
}
