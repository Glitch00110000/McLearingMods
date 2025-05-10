package net.glitch.mc.datagen;

import net.glitch.mc.McCourseMod;
import net.glitch.mc.block.ModBlock;
import net.glitch.mc.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, McCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlock.ALEXANDRITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlock.ALEXANDRITE_BLOCK.get(),
                ModBlock.RAW_ALEXANDRITE_BLOCK.get(),
                ModBlock.NETHER_ALEXANDRITE_ORE.get(),
                ModBlock.ALEXANDRITE_ORE.get(),
                ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get(),
                ModBlock.SOUND_BLOCK.get(),
                ModBlock.END_STONE_ALEXANDRITE_ORE.get(),
                ModBlock.ALEXANDRITE_STAIRS.get(),
                ModBlock.ALEXANDRITE_SLAB.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlock.ALEXANDRITE_BLOCK.get(),
                ModBlock.RAW_ALEXANDRITE_BLOCK.get(),
                ModBlock.NETHER_ALEXANDRITE_ORE.get(),
                ModBlock.ALEXANDRITE_ORE.get(),
                ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get(),
                ModBlock.END_STONE_ALEXANDRITE_ORE.get(),
                ModBlock.ALEXANDRITE_STAIRS.get(),
                ModBlock.ALEXANDRITE_SLAB.get());
    }

    @Override
    public String getName()
    {
        return "Block Tags";
    }
}
