package io.github.mestretramador.mocreaturesrr.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.mestretramador.mocreaturesrr.client.renderer.MoCRRHorseRenderer;
import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRTamableHorse;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/**
 * All Tamable Horses, being them Natural or Mythical, share the same
 * model, reutilizing it for better performances.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 * @implSpec Made with Blockbench 4.0.5 and exported for Minecraft version 1.17.1 with Mojang mappings.
 */
public final class MoCRRHorseModel<Horse extends MoCRRTamableHorse> extends MoCRRAnimalModel<Horse>
{
    //#region Properties
    /** The Layer Location for the event baking. */
	public static final ModelLayerLocation LAYER_LOCATION = MoCRRAnimalModel.getLayerLocation(
        new MoCRRResourceLocation(MoCRRHorseRenderer.FILE)
    );

    /** Consist on the main part, the body itself. */
    private final ModelPart Horse;

    /** Consist on the using gear, such as saddle and bags. */
    private final ModelPart Gear;

    /** Consist on some mystical parts, like wings and horns. */
    private final ModelPart Mystic;
    //#endregion

    //#region Constructor
    /**
     * The Horse model requires, as normally, a root to start sculpting.
     *
     * @param root The pivot root part to start the subdivisions and modeling.
     */
	public MoCRRHorseModel(ModelPart root)
    {
		this.Horse  = root.getChild("Horse");
		this.Gear   = root.getChild("Gear");
		this.Mystic = root.getChild("Mystic");
	}
    //#endregion

    //#region Main Functions
    /**
     * The Body Layer of the Horse is crated following
     * a series of three major structures, the {@link MoCRRHorseModel#Horse Horse},
     * the {@link MoCRRHorseModel#Gear Gear}, and the {@link MoCRRHorseModel#Mystic Mystic}.
     *
     * @return The definitions already set.
     * @see MoCRRHorseModel#createHorseBodyLayer(PartDefinition) The Horse creation.
     * @see MoCRRHorseModel#createGearBodyLayer(PartDefinition) The Gear creation.
     * @see MoCRRHorseModel#createMysticBodyLayer(PartDefinition) The Mystic creation.
     */
	public static LayerDefinition createBodyLayer()
    {
		MeshDefinition meshDefinition = new MeshDefinition();

		PartDefinition partDefinition = meshDefinition.getRoot();

		createHorseBodyLayer(partDefinition);

        createGearBodyLayer(partDefinition);

		createMysticBodyLayer(partDefinition);

		return LayerDefinition.create(meshDefinition, 128, 128);
	}

    /**
     * Defines all the animations.
     *
     * @param entity          The Horse itself.
     * @param limbSwing       Represent the movement of the limbs.
     * @param limbSwingAmount Represent the amount of movement of the limbs.
     * @param ageInTicks      The time of the movement, in ticks.
     * @param netHeadYaw      The yaw of the animation.
     * @param headPitch       The pitch of the animation.
     */
    // TODO: Implement animations.
    @Override
	public void setupAnim(
        Horse entity,
        float limbSwing,
        float limbSwingAmount,
        float ageInTicks,
        float netHeadYaw,
        float headPitch
    ) { }

    /**
     * Render to the Buffer each part.
     *
     * @param poseStack     The stack of the pose.
     * @param buffer        The Buffer itself.
     * @param packedLight   The light influence.
     * @param packedOverlay The overlay influence.
     * @param red           The R channel.
     * @param green         The G channel.
     * @param blue          The B channel.
     * @param alpha         The A channel.
     */
	@Override
	public void renderToBuffer(
        PoseStack poseStack,
        VertexConsumer buffer,
        int packedLight,
        int packedOverlay,
        float red,
        float green,
        float blue,
        float alpha
    )
    {
		this.Horse.render(poseStack, buffer, packedLight, packedOverlay);
		this.Gear.render(poseStack, buffer, packedLight, packedOverlay);
		this.Mystic.render(poseStack, buffer, packedLight, packedOverlay);
	}
    //#endregion

    //#region Horse
    /**
     * Create the {@link MoCRRHorseModel#Horse Horse} Body Layer.
     *
     * @param partDefinition The Definition to start the modeling.
     */
    private static void createHorseBodyLayer(PartDefinition partDefinition)
    {
        PartDefinition Horse = partDefinition.addOrReplaceChild(
            "Horse",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 4.0F, -10.0F)
        );

		Horse
        .addOrReplaceChild(
            "Head",
            CubeListBuilder
            .create()
            .texOffs(0, 0)
            .addBox(-2.5F, -10.0F, -1.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		PartDefinition Ears = Horse.addOrReplaceChild(
            "Ears",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Ears
        .addOrReplaceChild(
            "HorseEars",
            CubeListBuilder
            .create()
            .texOffs(0, 0)
            .addBox(0.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		    .texOffs(0, 0)
            .addBox(-2.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Ears
        .addOrReplaceChild(
            "MuleEars",
            CubeListBuilder
            .create()
            .texOffs(0, 12)
            .addBox(-2.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		    .texOffs(0, 12)
            .addBox(0.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		PartDefinition Mouth = Horse.addOrReplaceChild(
            "Mouth",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Mouth
        .addOrReplaceChild(
            "UpMouth",
            CubeListBuilder
            .create()
            .texOffs(24, 18)
            .addBox(-2.0F, -10.0F, -7.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		    .texOffs(24, 18)
            .addBox(-2.0F, -10.0F, -8.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Mouth
        .addOrReplaceChild(
            "LowMouth",
            CubeListBuilder
            .create()
            .texOffs(24, 27)
            .addBox(-2.0F, -7.0F, -7.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		    .texOffs(24, 27)
            .addBox(-2.0F, -7.0F, -6.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Horse.addOrReplaceChild(
            "Neck",
            CubeListBuilder
            .create()
            .texOffs(0, 12)
            .addBox(-2.05F, -9.8F, -2.0F, 4.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Horse.addOrReplaceChild(
            "Mane",
            CubeListBuilder
            .create()
            .texOffs(58, 0)
            .addBox(-1.0F, -11.5F, 5.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Horse
        .addOrReplaceChild(
            "Body",
            CubeListBuilder
            .create()
            .texOffs(0, 34)
            .addBox(-5.0F, -8.0F, -19.0F, 10.0F, 10.0F, 24.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 7.0F, 19.0F)
        );

		PartDefinition Legs = Horse.addOrReplaceChild(
            "Legs",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Legs
        .addOrReplaceChild(
            "LFLeg",
            CubeListBuilder
            .create()
            .texOffs(44, 29)
            .addBox(2.1F, 4.0F, -0.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		    .texOffs(44, 41)
            .addBox(2.1F, 12.0F, 0.4F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		    .texOffs(44, 51)
            .addBox(1.6F, 17.1F, -0.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Legs
        .addOrReplaceChild(
            "LBLeg",
            CubeListBuilder
            .create()
            .texOffs(78, 29)
            .addBox(1.5F, 3.0F, 18.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		    .texOffs(78, 43)
            .addBox(2.0F, 12.0F, 19.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		    .texOffs(78, 51)
            .addBox(1.5F, 17.1F, 19.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Legs
        .addOrReplaceChild(
            "RFLeg",
            CubeListBuilder
            .create()
            .texOffs(60, 29)
            .addBox(-5.1F, 4.0F, -0.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		    .texOffs(60, 41)
            .addBox(-5.1F, 12.0F, 0.4F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		    .texOffs(60, 51)
            .addBox(-5.6F, 17.1F, -0.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Legs
        .addOrReplaceChild(
            "RBLeg",
            CubeListBuilder
            .create()
            .texOffs(96, 29)
            .addBox(-5.5F, 3.0F, 18.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(96, 43)
            .addBox(-5.0F, 12.0F, 19.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(96, 51)
            .addBox(-5.5F, 17.1F, 19.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Horse
        .addOrReplaceChild(
            "Tail",
            CubeListBuilder
            .create()
            .texOffs(44, 0)
            .addBox(-1.0F, -2.0F, 24.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		    .texOffs(38, 7)
            .addBox(-1.5F, -3.0F, 27.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		    .texOffs(24, 3)
            .addBox(-1.5F, -5.5F, 33.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );
    }
    //#endregion

    //#region Gear
    /**
     * Create the {@link MoCRRHorseModel#Gear Gear} Body Layer.
     *
     * @param partDefinition The Definition to start the modeling.
     */
    private static void createGearBodyLayer(PartDefinition partDefinition)
    {
        PartDefinition Gear = partDefinition.addOrReplaceChild(
            "Gear",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 4.0F, -10.0F)
        );

		Gear
        .addOrReplaceChild(
            "Saddle",
            CubeListBuilder
            .create()
            .texOffs(106, 9)
            .addBox(-1.5F, -3.0F, 9.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		    .texOffs(80, 0)
            .addBox(-5.0F, -2.0F, 9.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		    .texOffs(80, 9)
            .addBox(-4.0F, -3.0F, 15.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		PartDefinition Stirrups = Gear.addOrReplaceChild(
            "Stirrups",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Stirrups
        .addOrReplaceChild(
            "LStirrup",
            CubeListBuilder
            .create()
            .texOffs(70, 0)
            .addBox(4.5F, -1.0F, 11.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		    .texOffs(74, 0)
            .addBox(4.5F, 5.0F, 11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Stirrups
        .addOrReplaceChild(
            "RStirrup",
            CubeListBuilder
            .create()
            .texOffs(80, 0)
            .addBox(-5.5F, -1.0F, 11.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		    .texOffs(74, 4)
            .addBox(-5.5F, 5.0F, 11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Gear
        .addOrReplaceChild(
            "Halter",
            CubeListBuilder
            .create()
            .texOffs(74, 13)
            .addBox(1.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(80, 12)
            .addBox(-2.5F, -10.1F, -7.0F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.2F))
            .texOffs(74, 13)
            .addBox(-2.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Gear
        .addOrReplaceChild(
            "Reins",
            CubeListBuilder
            .create()
            .texOffs(44, 10)
            .addBox(2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(44, 5)
            .addBox(-2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		PartDefinition Bags = Gear.addOrReplaceChild(
            "Bags",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 20.0F)
        );

        Bags
        .addOrReplaceChild(
            "LBag",
            CubeListBuilder
            .create()
            .texOffs(0, 47)
            .addBox(-13.0F, -21.0F, 4.5F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
            PartPose.offsetAndRotation(0.0F, 20.0F, -10.0F, 0.0F, 1.5708F, 0.0F)
        );

        Bags
        .addOrReplaceChild(
            "RBag",
            CubeListBuilder
            .create()
            .texOffs(0, 34)
            .addBox(-13.0F, -21.0F, -7.5F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
            PartPose.offsetAndRotation(0.0F, 20.0F, -10.0F, 0.0F, 1.5708F, 0.0F)
        );
    }
    //#endregion

    //#region Mystic
    /**
     * Create the {@link MoCRRHorseModel#Mystic Mystic} Body Layer.
     *
     * @param partDefinition The Definition to start the modeling.
     */
    private static void createMysticBodyLayer(PartDefinition partDefinition)
    {
        PartDefinition Mystic = partDefinition.addOrReplaceChild(
            "Mystic",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 24.0F, 0.0F)
        );

		Mystic.addOrReplaceChild(
            "UniHorn",
            CubeListBuilder
            .create()
            .texOffs(24, 0)
            .addBox(-0.5F, -18.0F, 2.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -20.0F, -10.0F)
        );

		PartDefinition Wings = Mystic.addOrReplaceChild(
            "Wings",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		PartDefinition BodyWings = Wings.addOrReplaceChild(
            "BodyWings",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		BodyWings
        .addOrReplaceChild(
            "LWing",
            CubeListBuilder
            .create()
            .texOffs(0, 96)
            .addBox(5.0F, -21.0F, -6.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		    .texOffs(82, 68)
            .addBox(6.0F, -20.9F, -5.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		    .texOffs(0, 68)
            .addBox(17.0F, -21.0F, -6.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		BodyWings
        .addOrReplaceChild(
            "RWing",
            CubeListBuilder
            .create()
            .texOffs(0, 110)
            .addBox(-12.0F, -21.0F, -6.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		    .texOffs(82, 82)
            .addBox(-18.0F, -20.9F, -5.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		    .texOffs(0, 82)
            .addBox(-39.0F, -21.0F, -6.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

		Wings
        .addOrReplaceChild(
            "FairyWings",
            CubeListBuilder
            .create()
            .texOffs(0, 98)
            .addBox(3.5F, -21.0F, -16.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F))
		    .texOffs(0, 68)
            .addBox(-29.5F, -21.0F, -16.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );
    }
    //#endregion
}