package io.github.mestretramador.mocreaturesrr.client.renderer.model;

import io.github.mestretramador.mocreaturesrr.entity.MoCRRAnimal;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;

/**
 * All MoC R&R's Animals reuses the {@link EntityModel base model} to be
 * rendered, but with slightly improvements on intern functions.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public abstract class MoCRRAnimalModel<Animal extends MoCRRAnimal> extends EntityModel<Animal>
{
    /** The Main Layer of the models. */
    private static final String MAIN = "main";

    /**
     * A simple instantiator for the {@link ModelLayerLocation Layer Location}.
     *
     * @param location The Resource for the Model Layer.
     * @return The instance of the Main Layer with the given resource.
     */
    public static final ModelLayerLocation getLayerLocation(MoCRRResourceLocation location)
    {
        return new ModelLayerLocation(location, MAIN);
    }
}