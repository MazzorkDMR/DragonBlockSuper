package com.mazzork.dragonblocksuper.init.client.armor.model;

import com.mazzork.dragonblocksuper.DragonBlockSuper;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class SaiyanArmorModel extends HumanoidModel<LivingEntity> {

    public static final ModelLayerLocation SAIYAN_ARMOR = new ModelLayerLocation(new ResourceLocation(DragonBlockSuper.MODID, "saiyan_armor"), "main");

    private final ModelPart body;
    private final ModelPart right_arm;
    private final ModelPart left_arm;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    private final ModelPart head;
    private final ModelPart hat;

	public SaiyanArmorModel(ModelPart root) {
        super(root);
        this.body = root.getChild("body");
        this.right_arm = root.getChild("right_arm");
        this.left_arm = root.getChild("left_arm");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
        this.head = root.getChild("head");
        this.hat = root.getChild("hat");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.0908F, 0.0F));

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 0.0F));

        PartDefinition lower_body = body.addOrReplaceChild("lower_body", CubeListBuilder.create().texOffs(50, 22).addBox(0.15F, 14.25F, -3.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, -3.25F, 0.0F, -1.5708F, 0.0F));

        PartDefinition upper_body = body.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 1.5F, -3.0F, 10.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = upper_body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 12).addBox(-2.5F, -1.5F, -2.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 30).addBox(-3.5F, -1.5F, -2.75F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 30).addBox(3.5F, -1.5F, -2.75F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(-5.0F, 10.5F, -3.5F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(29, 15).addBox(-3.0F, -1.0F, -3.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 0).addBox(-3.5F, 1.5F, 1.25F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r2 = right_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 10).addBox(4.0F, -1.0F, -3.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(23, 24).addBox(4.0F, -1.0F, -3.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(33, 7).addBox(4.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.5F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));

        PartDefinition cube_r3 = left_arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 0).addBox(-10.0F, -1.0F, -3.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(23, 32).addBox(-10.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 23).addBox(-10.0F, -1.0F, -3.0F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.5F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(50, 14).addBox(-5.5F, -13.25F, -3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 0).addBox(4.5F, -13.25F, -3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}