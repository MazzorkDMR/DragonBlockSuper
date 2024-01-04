package com.mazzork.dragonblocksuper.init;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import com.mazzork.dragonblocksuper.init.client.armor.item.SaiyanArmorItem;
import com.mazzork.dragonblocksuper.init.client.armor.item.WeightCapeItem;
import com.mazzork.dragonblocksuper.init.tiers.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonBlockSuper.MODID);

    //ITEMS

    public static final RegistryObject<Item> RAW_KATCHIN = ITEMS.register("raw_katchin",
        ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KATCHIN_INGOT = ITEMS.register("katchin_ingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KATANA_HANDLE = ITEMS.register("katana_handle",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KATANA_BLADE = ITEMS.register("katana_blade",
            ()-> new Item(new Item.Properties()));

    //TOOL - SWORD ITEMS

    public static final RegistryObject<SwordItem> KATANA = ITEMS.register("katana",
            ()-> new SwordItem(
                    Tiers.IRON,
                    7,
                    1.4f,
                    new Item.Properties().durability(400)
            ));

    public static final RegistryObject<SwordItem> TRUNKS_SWORD = ITEMS.register("trunks_sword",
            ()-> new SwordItem(
                    Tiers.IRON,
                    11,
                    1.4f,
                    new Item.Properties().durability(600).rarity(Rarity.UNCOMMON)
            ));


    public static final RegistryObject<SwordItem> BRAVE_SWORD = ITEMS.register("brave_sword",
            ()-> new SwordItem(
                    Tiers.IRON,
                    15,
                    1.4f,
                    new Item.Properties().durability(800).rarity(Rarity.RARE)
            ));

    public static final RegistryObject<SwordItem> Z_SWORD = ITEMS.register("z_sword",
            ()-> new SwordItem(
                    ModTiers.KATCHIN,
                    20,
                    1.4f,
                    new Item.Properties().durability(800).rarity(Rarity.EPIC)
            ));

    //ARMOR ITEMS

    //public static final RegistryObject<ArmorItem> SAIYAN_CHESTPLATE_WY = ITEMS.register("saiyan_chestplate_wy",
    //        () -> new ArmorItem(ModArmorMaterials.SAIYAN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(400))
    //        );

    public static final RegistryObject<ArmorItem> SAIYAN_CHESTPLATE = ITEMS.register("saiyan_chestplate",
            () -> new SaiyanArmorItem(ArmorItem.Type.CHESTPLATE,new Item.Properties().durability(400)));

    public static final RegistryObject<ArmorItem> SAIYAN_LEGGINS = ITEMS.register("saiyan_leggins",
            () -> new SaiyanArmorItem(ArmorItem.Type.LEGGINGS,new Item.Properties().durability(400)));

    public static final RegistryObject<ArmorItem> WEIGHT_CAPE = ITEMS.register("weight_cape",
            () -> new WeightCapeItem(ArmorItem.Type.CHESTPLATE,new Item.Properties().durability(100)));

    //BLOCK ITEMS

    public static final RegistryObject<BlockItem> KATCHIN_ORE = ITEMS.register("katchin_ore",
        ()-> new BlockItem(ModBlocks.KATCHIN_ORE.get(), new Item.Properties()));
}
