package com.mazzork.dragonblocksuper.init.client.armor.item;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import com.mazzork.dragonblocksuper.init.ModArmorMaterials;
import com.mazzork.dragonblocksuper.init.client.armor.model.SaiyanArmorModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class SaiyanArmorItem extends ArmorItem {

    private static final String textureLocation = new ResourceLocation(DragonBlockSuper.MODID, "textures/models/armor/saiyan_chestplate.png").toString();

    public SaiyanArmorItem(Type pType, Properties pProperties) {
        super(ModArmorMaterials.SAIYAN, pType, pProperties);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return textureLocation;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private SaiyanArmorModel model;

            @Nullable
            @Override
            public net.minecraft.client.model.HumanoidModel<?> getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
                if (null == model) {
                    model = new SaiyanArmorModel(Minecraft.getInstance().getEntityModels().bakeLayer(SaiyanArmorModel.SAIYAN_ARMOR));
                }
                return model;
            }
        });
    }
}
