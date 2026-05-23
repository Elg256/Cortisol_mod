package net.tech.cortisolmod.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.tech.cortisolmod.CortisolMod;
import terrablender.api.Regions;

public class ModBiomes {
    public static final ResourceKey<Biome> CORTISOL_BIOME =
            ResourceKey.create(
                    Registries.BIOME,
                    new ResourceLocation(CortisolMod.MOD_ID, "cortisol_biome"));
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(
                new ResourceLocation(CortisolMod.MOD_ID, "cortisol_biome"), 1)
        );
    }
}
