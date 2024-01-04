package com.mazzork.dragonblocksuper.init;

import com.mazzork.dragonblocksuper.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials {
    public static final ModArmorMaterial SAIYAN = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400 },
            new int[] { 11, 16, 15, 13 },
            20,
            SoundEvents.CHAIN_PLACE,
            () -> Ingredient.of(Items.IRON_INGOT),
            "saiyan",
            0.25f,
            2f
    );

    public static final ModArmorMaterial WEIGHT_CAPE = new ModArmorMaterial(
            new int[] { 0, 300, 0, 0 },
            new int[] { 0, 0, 0, 0 },
            10,
            SoundEvents.WOOL_STEP,
            () -> Ingredient.of(Items.WHITE_WOOL),
            "weight_cape",
            0f,
            0f
    );

}