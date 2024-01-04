package com.mazzork.dragonblocksuper.init.client.armor.model;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import static net.minecraft.client.model.geom.PartPose.offsetAndRotation;

public class WeightCapeModel extends HumanoidModel<LivingEntity> {

        public static final ModelLayerLocation WEIGHT_CAPE = new ModelLayerLocation(new ResourceLocation(DragonBlockSuper.MODID, "weight_cape"), "main");

        /*
        private final ModelPart body;
        private final ModelPart right_arm;
        private final ModelPart left_arm;
        private final ModelPart right_leg;
        private final ModelPart left_leg;
        private final ModelPart head;
        private final ModelPart hat;
         */

        public WeightCapeModel(ModelPart root) {
            super(root);
            /*
            this.body = root.getChild("body");
            this.right_arm = root.getChild("right_arm");
            this.left_arm = root.getChild("left_arm");
            this.right_leg = root.getChild("right_leg");
            this.left_leg = root.getChild("left_leg");
            this.head = root.getChild("head");
            this.hat = root.getChild("hat");
            */
        }

        private static PartDefinition cube_r1;

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(4, 4).addBox(-5.0F, -0.25F, -2.5F, 10.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                    .texOffs(38, 8).addBox(-6.0F, 0.0F, -3.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-6.0F, 1.0F, 2.0F, 12.0F, 23.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

            PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(39, 26).addBox(-9.0F, -2.25F, -2.5F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
                    .texOffs(24, 23).addBox(-9.0F, -2.25F, 2.5F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(24, 27).addBox(-9.0F, -2.25F, -2.5F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

            PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -2.25F, -2.5F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
                    .texOffs(24, 19).addBox(-1.0F, -2.25F, 2.5F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                    .texOffs(24, 15).addBox(-1.0F, -2.25F, -2.5F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

            PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

            PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 64, 64);
        }

    }

