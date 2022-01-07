//#region License
/**
 *  Mo'Creatures Redux&Redone is an attempt to restore the original
 *  DrZharks' Mo'Creatures with redesign ideas.
 *  Copyright (C) 2022 Mestre Tramador
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
//#endregion

package io.github.mestretramador.mocreaturesrr.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.mestretramador.mocreaturesrr.client.renderer.MoCRRTamableHorseRenderer;
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
 * Model, reutilizing it for better performances.
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 * @implSpec Made with Blockbench 4.0.5 and exported for Minecraft version 1.17.1 with Mojang mappings.
 */
public abstract class MoCRRTamableHorseModel<Horse extends MoCRRTamableHorse> extends MoCRRAnimalModel<Horse>
{
    //#region Properties
    /** The Layer Location for the event baking. */
    public static final ModelLayerLocation LAYER_LOCATION = MoCRRAnimalModel.getLayerLocation(
        new MoCRRResourceLocation(MoCRRTamableHorseRenderer.FILE)
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
     * All Horse-like animal model requires, as normally, a root to start sculpting.
     *
     * @param root The pivot root part to start the subdivisions and modeling.
     */
    protected MoCRRTamableHorseModel(ModelPart root)
    {
        this.Horse  = root.getChild("Horse");
        this.Gear   = root.getChild("Gear");
        this.Mystic = root.getChild("Mystic");
    }
    //#endregion

    //#region Main Functions
    /**
     * The Body Layer of the Horse-like animal is crated following
     * a series of three major structures, the {@link MoCRRTamableHorseModel#Horse Horse},
     * the {@link MoCRRTamableHorseModel#Gear Gear}, and the {@link MoCRRTamableHorseModel#Mystic Mystic}.
     *
     * @return The definitions already set.
     * @see MoCRRTamableHorseModel#createHorseBodyLayer(PartDefinition) The Horse creation.
     * @see MoCRRTamableHorseModel#createGearBodyLayer(PartDefinition) The Gear creation.
     * @see MoCRRTamableHorseModel#createMysticBodyLayer(PartDefinition) The Mystic creation.
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
    @Override
    public void setupAnim(
        Horse entity,
        float limbSwing,
        float limbSwingAmount,
        float ageInTicks,
        float netHeadYaw,
        float headPitch
    )
    {
        // TODO: Implement animations.
    }

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
     * Create the {@link MoCRRTamableHorseModel#Horse Horse} Body Layer.
     *
     * @param partDefinition The Definition to start the modeling.
     */
    private static void createHorseBodyLayer(PartDefinition partDefinition)
    {
        PartDefinition Horse = partDefinition.addOrReplaceChild(
            "Horse",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 24.0F, 0.0F)
        );

        Horse.addOrReplaceChild(
            "Head",
            CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -27.5F, -8.0F)
        );

        PartDefinition Ears = Horse.addOrReplaceChild(
            "Ears",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        Ears.addOrReplaceChild(
            "HorseEars",
            CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(0.45F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.45F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -30.5F, -5.5F)
        );

        Ears.addOrReplaceChild(
            "MuleEars",
            CubeListBuilder.create()
            .texOffs(0, 12)
            .addBox(-2.0F, -3.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(0.0F, -3.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -32.5F, -5.5F)
        );

        PartDefinition Mouth = Horse.addOrReplaceChild(
            "Mouth",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        Mouth.addOrReplaceChild(
            "UpMouth",
            CubeListBuilder.create()
            .texOffs(24, 18)
            .addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -28.5F, -14.0F)
        );

        Mouth.addOrReplaceChild(
            "LowMouth",
            CubeListBuilder.create()
            .texOffs(24, 27)
            .addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -26.0F, -14.0F)
        );

        Horse.addOrReplaceChild(
            "Neck",
            CubeListBuilder.create()
            .texOffs(0, 12)
            .addBox(-2.0F, -7.0F, -4.0F, 4.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
            PartPose.offset(-0.05F, -22.8F, -8.0F)
        );

        Horse.addOrReplaceChild(
            "Mane",
            CubeListBuilder.create()
            .texOffs(58, 0)
            .addBox(-1.0F, -8.0F, -2.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -23.5F, -3.0F)
        );

        Horse.addOrReplaceChild(
            "Body",
            CubeListBuilder.create()
            .texOffs(0, 34)
            .addBox(-5.0F, -5.0F, -12.0F, 10.0F, 10.0F, 24.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -16.0F, 2.0F)
        );

        PartDefinition Legs = Horse.addOrReplaceChild(
            "Legs",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        PartDefinition FrontLegs = Legs.addOrReplaceChild(
            "FrontLegs",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        FrontLegs.addOrReplaceChild(
            "FrontLegL",
            CubeListBuilder.create()
            .texOffs(44, 29)
            .addBox(-1.5F, -9.7F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(44, 41)
            .addBox(-1.5F, -1.7F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(44, 51)
            .addBox(-2.0F, 3.4F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(3.6F, -6.3F, -8.1F)
        );

        FrontLegs.addOrReplaceChild(
            "FrontLegR",
            CubeListBuilder.create()
            .texOffs(60, 29)
            .addBox(-1.5F, -9.7F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(60, 41)
            .addBox(-1.5F, -1.7F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(60, 51)
            .addBox(-2.0F, 3.4F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(-3.6F, -6.3F, -8.1F)
        );

        PartDefinition BackLegs = Legs.addOrReplaceChild(
            "BackLegs",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        BackLegs.addOrReplaceChild(
            "BackLegL",
            CubeListBuilder.create()
            .texOffs(78, 29)
            .addBox(1.5F, -17.0F, 8.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(78, 43)
            .addBox(2.0F, -8.0F, 9.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(78, 51)
            .addBox(1.5F, -2.9F, 9.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        BackLegs.addOrReplaceChild(
            "BackLegR",
            CubeListBuilder.create()
            .texOffs(96, 29)
            .addBox(-5.5F, -17.0F, 8.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
            .texOffs(96, 43)
            .addBox(-5.0F, -8.0F, 9.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(96, 51)
            .addBox(-5.5F, -2.9F, 9.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        Horse.addOrReplaceChild(
            "Tail",
            CubeListBuilder.create()
            .texOffs(44, 0)
            .addBox(-1.0F, -0.1667F, -6.8333F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(38, 7)
            .addBox(-1.5F, -1.1667F, -3.8333F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(24, 3)
            .addBox(-1.5F, -3.6667F, 2.1667F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -21.8333F, 20.8333F)
        );
    }
    //#endregion

    //#region Gear
    /**
     * Create the {@link MoCRRTamableHorseModel#Gear Gear} Body Layer.
     *
     * @param partDefinition The Definition to start the modeling.
     */
    private static void createGearBodyLayer(PartDefinition partDefinition)
    {
        PartDefinition Gear = partDefinition.addOrReplaceChild(
            "Gear",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 24.0F, 0.0F)
        );

        Gear.addOrReplaceChild(
            "Saddle",
            CubeListBuilder.create()
            .texOffs(80, 0)
            .addBox(-5.0F, 0.1667F, -4.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(106, 9)
            .addBox(-1.5F, -0.8333F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(80, 9)
            .addBox(-4.0F, -0.8333F, 2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -22.1667F, 3.0F)
        );

        PartDefinition Stirrups = Gear.addOrReplaceChild(
            "Stirrups",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        Stirrups.addOrReplaceChild(
            "StirrupL",
            CubeListBuilder.create()
            .texOffs(70, 0)
            .addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(74, 0)
            .addBox(-0.5F, 1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(5.0F, -16.0F, 2.0F)
        );

        Stirrups.addOrReplaceChild(
            "StirrupR",
            CubeListBuilder.create()
            .texOffs(80, 0)
            .addBox(-0.5F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(74, 4)
            .addBox(-0.5F, 1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(-5.0F, -16.0F, 2.0F)
        );

        Gear.addOrReplaceChild(
            "Halter",
            CubeListBuilder.create()
            .texOffs(80, 12)
            .addBox(-2.5F, -2.9F, -4.6667F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.2F))
            .texOffs(74, 13)
            .addBox(1.5F, -0.8F, -1.6667F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .texOffs(74, 13)
            .addBox(-2.5F, -0.8F, -1.6667F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -27.2F, -12.3333F)
        );

        Gear.addOrReplaceChild(
            "Reins",
            CubeListBuilder.create()
            .texOffs(44, 10)
            .addBox(2.6F, -1.5F, -8.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(44, 5)
            .addBox(-2.6F, -1.5F, -8.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -24.5F, -8.0F)
        );

        PartDefinition Bags = Gear.addOrReplaceChild(
            "Bags",
            CubeListBuilder.create(),
            PartPose.offset(0.0F, -17.0F, 10.5F)
        );

        Bags.addOrReplaceChild(
            "BagR",
            CubeListBuilder.create()
            .texOffs(0, 34)
            .addBox(-4.0F, -4.0F, -1.5F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
            PartPose.offsetAndRotation(-6.5F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F)
        );

        Bags.addOrReplaceChild(
            "BagL",
            CubeListBuilder.create()
            .texOffs(0, 47)
            .addBox(-4.0F, -4.0F, -1.5F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
            PartPose.offsetAndRotation(6.5F, 0.0F, 0.0F, -3.1416F, 1.5708F, 3.1416F)
        );
    }
    //#endregion

    //#region Mystic
    /**
     * Create the {@link MoCRRTamableHorseModel#Mystic Mystic} Body Layer.
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
            "Horn",
            CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -34.0F, -7.5F)
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

        BodyWings.addOrReplaceChild(
            "BodyWingL",
            CubeListBuilder.create()
            .texOffs(0, 96)
            .addBox(-11.1667F, -1.0333F, -5.8333F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
            .texOffs(82, 68)
            .addBox(-10.1667F, -0.9333F, -4.8333F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
            .texOffs(0, 68)
            .addBox(0.8333F, -1.0333F, -5.8333F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
            PartPose.offset(16.1667F, -19.9667F, -0.1667F)
        );

        BodyWings.addOrReplaceChild(
            "BodyWingR",
            CubeListBuilder.create()
            .texOffs(0, 110)
            .addBox(4.1667F, -1.0333F, -5.8333F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
            .texOffs(82, 82)
            .addBox(-1.8333F, -0.9333F, -4.8333F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
            .texOffs(0, 82)
            .addBox(-22.8333F, -1.0333F, -5.8333F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
            PartPose.offset(-16.1667F, -19.9667F, -0.1667F)
        );

        Wings.addOrReplaceChild(
            "FairyWings",
            CubeListBuilder.create()
            .texOffs(0, 98)
            .addBox(3.5F, 0.0F, -15.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F))
            .texOffs(0, 68)
            .addBox(-29.5F, 0.0F, -15.0F, 26.0F, 0.0F, 30.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, -21.0F, -1.0F)
        );
    }
    //#endregion
}