package net.glitch.mc.datagen;

import net.glitch.mc.McCourseMod;
import net.glitch.mc.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.earlydisplay.ElementShader;
import net.minecraftforge.registries.ForgeRegistries;
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

        stairsBlock((StairBlock) ModBlock.ALEXANDRITE_STAIRS.get(), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));

        slabBlock(((SlabBlock) ModBlock.ALEXANDRITE_SLAB.get()), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlock.ALEXANDRITE_BUTTON.get(), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlock.ALEXANDRITE_FENCE.get(), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlock.ALEXANDRITE_FENCE_GATE.get(), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));
        wallBlock((WallBlock) ModBlock.ALEXANDRITE_WALL.get(), blockTexture(ModBlock.ALEXANDRITE_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock) ModBlock.ALEXANDRITE_DOOR.get(), modLoc("block/alexandrite_door_bottom"), modLoc("block/alexandrite_door_top"), "cutout");

        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlock.ALEXANDRITE_TRAPDOOR.get(), modLoc("block/alexandrite_trapdoor"), true, "cutout");

        blockItem(ModBlock.ALEXANDRITE_STAIRS);
        blockItem(ModBlock.ALEXANDRITE_SLAB);

        blockItem(ModBlock.ALEXANDRITE_PRESSURE_PLATE);

        blockItem(ModBlock.ALEXANDRITE_FENCE_GATE);


        blockItem(ModBlock.ALEXANDRITE_TRAPDOOR, "_bottom");
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
