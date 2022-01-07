package io.github.mestretramador.mocreaturesrr.client.renderer.model;

import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse;

import net.minecraft.client.model.geom.ModelPart;

/**
 * Horses reuses the base model to implements better methods.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRRHorseModel extends MoCRRTamableHorseModel<MoCRRHorse>
{
    /**
     * For Horses, the root to sculpt is still a requirement.
     *
     * @param root The pivot root part to start the subdivisions and modeling.
     */
    public MoCRRHorseModel(ModelPart root)
    {
        super(root);
    }
}