package com.mazzork.dragonblocksuper.init;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DragonBlockSuper.MODID);

    //public static final RegistryObject<Block> KATCHIN_BLOCK = BLOCKS.register("katchin_block",
      //      ()-> new Block(BlockBehaviour.Properties.of()
       //             .mapColor(MapColor.COLOR_GREEN)
        //            .requiresCorrectToolForDrops()
          //          .strength(3.5f, 20.0f)
            //));

    public static final RegistryObject<DropExperienceBlock> KATCHIN_ORE = BLOCKS.register("katchin_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
}
