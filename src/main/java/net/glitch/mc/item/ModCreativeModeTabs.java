package net.glitch.mc.item;

import net.glitch.mc.McCourseMod;
import net.glitch.mc.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) ->
                    {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.KOHLRABI.get());
                        output.accept(ModItems.PEAT_BRICK.get());

                        output.accept(ModBlock.SOUND_BLOCK.get());
                        output.accept(ModBlock.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlock.RAW_ALEXANDRITE_BLOCK.get());

                        output.accept(ModBlock.ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.NETHER_ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.END_STONE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlock.DEEPSLATE_ALEXANDRITE_ORE.get());

                        output.accept(ModBlock.ALEXANDRITE_STAIRS.get());
                        output.accept(ModBlock.ALEXANDRITE_SLAB.get());

                        output.accept(ModBlock.ALEXANDRITE_PRESSURE_PLATE.get());
                        output.accept(ModBlock.ALEXANDRITE_BUTTON.get());

                        output.accept(ModBlock.ALEXANDRITE_FENCE.get());
                        output.accept(ModBlock.ALEXANDRITE_FENCE_GATE.get());
                        output.accept(ModBlock.ALEXANDRITE_WALL.get());


                        output.accept(ModBlock.ALEXANDRITE_DOOR.get());
                        output.accept(ModBlock.ALEXANDRITE_TRAPDOOR.get());


                        output.accept(ModItems.ALEXANDRITE_SWORD.get());
                        output.accept(ModItems.ALEXANDRITE_PICKAXE.get());
                        output.accept(ModItems.ALEXANDRITE_AXE.get());
                        output.accept(ModItems.ALEXANDRITE_SHOVEL.get());
                        output.accept(ModItems.ALEXANDRITE_HOE.get());
                        output.accept(ModItems.ALEXANDRITE_PAXEL.get());
                        output.accept(ModItems.ALEXANDRITE_HAMMER.get());


                        output.accept(ModItems.ALEXANDRITE_HELMET.get());
                        output.accept(ModItems.ALEXANDRITE_CHESTPLATE.get());
                        output.accept(ModItems.ALEXANDRITE_LEGGINGS.get());
                        output.accept(ModItems.ALEXANDRITE_BOOTS.get());


                    }).build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
