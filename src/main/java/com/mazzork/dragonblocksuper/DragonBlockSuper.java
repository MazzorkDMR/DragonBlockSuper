package com.mazzork.dragonblocksuper;

import com.mazzork.dragonblocksuper.init.ModBlocks;
import com.mazzork.dragonblocksuper.init.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.joml.Vector3d;

import java.util.Vector;

@Mod(DragonBlockSuper.MODID)

public class DragonBlockSuper {
    public static final String MODID = "dragonblocksuper";

    public DragonBlockSuper() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }

    public static boolean isEntityMoving(LivingEntity entity) {
        Vec3 movementVector = entity.getDeltaMovement();

        double totalVelocity = movementVector.length();

        return totalVelocity > 0.0;
    }
}
