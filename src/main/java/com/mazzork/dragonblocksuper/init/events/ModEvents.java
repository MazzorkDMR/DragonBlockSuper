package com.mazzork.dragonblocksuper.init.events;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import com.mazzork.dragonblocksuper.init.client.armor.model.SaiyanArmorModel;
import com.mazzork.dragonblocksuper.init.client.armor.model.WeightCapeModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DragonBlockSuper.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvents {
    @SubscribeEvent
    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions e) {
        e.registerLayerDefinition(SaiyanArmorModel.SAIYAN_ARMOR, SaiyanArmorModel::createBodyLayer);
        e.registerLayerDefinition(WeightCapeModel.WEIGHT_CAPE, WeightCapeModel::createBodyLayer);
    }
}