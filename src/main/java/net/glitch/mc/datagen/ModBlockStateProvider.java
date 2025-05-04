package net.glitch.mc.datagen;

import net.glitch.mc.McCourseMod;
import net.glitch.mc.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, McCourseMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlock.ALEXANDRITE_BLOCK);
        blockWithItem(ModBlock.RAW_ALEXANDRITE_BLOCK);

        blockWithItem(ModBlock.ALEXANDRITE_ORE);
        blockWithItem(ModBlock.DEEPSLATE_ALEXANDRITE_ORE);
        blockWithItem(ModBlock.END_STONE_ALEXANDRITE_ORE);
        blockWithItem(ModBlock.NETHER_ALEXANDRITE_ORE);
        
        blockWithItem(ModBlock.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
