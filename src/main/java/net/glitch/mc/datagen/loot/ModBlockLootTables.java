package net.glitch.mc.datagen.loot;

import net.glitch.mc.block.ModBlock;
import net.glitch.mc.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider
{

    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        this.dropSelf(ModBlock.ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlock.RAW_ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlock.SOUND_BLOCK.get());

        this.add(ModBlock.ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlock.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));

        this.add(ModBlock.NETHER_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlock.NETHER_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));

        this.add(ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));

        this.add(ModBlock.END_STONE_ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlock.END_STONE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
