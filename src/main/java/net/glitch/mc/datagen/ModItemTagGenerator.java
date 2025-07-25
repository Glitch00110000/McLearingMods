package net.glitch.mc.datagen;

import net.glitch.mc.McCourseMod;
import net.glitch.mc.item.ModItems;
import net.glitch.mc.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider
{


    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(p_275343_, p_275729_, p_275322_, McCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        //
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.ALEXANDRITE_HELMET.get(),
                        ModItems.ALEXANDRITE_CHESTPLATE.get(),
                        ModItems.ALEXANDRITE_LEGGINGS.get(),
                        ModItems.ALEXANDRITE_BOOTS.get()
                );
    }

    @Override
    public String getName()
    {
        return "Item Tags";
    }
}
