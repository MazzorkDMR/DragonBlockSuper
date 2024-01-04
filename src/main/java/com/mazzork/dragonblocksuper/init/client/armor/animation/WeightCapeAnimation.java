package com.mazzork.dragonblocksuper.init.client.armor.animation;

import com.mazzork.dragonblocksuper.init.client.armor.model.WeightCapeModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class WeightCapeAnimation implements IClientItemExtensions {

    public static final WeightCapeAnimation INSTANCE = new WeightCapeAnimation();

    private WeightCapeAnimation() {}

   // @Override
    //public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
   //     WeightCapeModel.INSTANCE.rotate(livingEntity);
   //     return WeightCapeModel.INSTANCE;
   // }
}
