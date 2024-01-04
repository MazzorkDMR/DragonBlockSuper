package com.mazzork.dragonblocksuper.init.tiers;

import com.mazzork.dragonblocksuper.init.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier KATCHIN = new ForgeTier(
            5,
            500,
            8.0F,
            4.0F,
            18,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.KATCHIN_INGOT::get)
    );
}
