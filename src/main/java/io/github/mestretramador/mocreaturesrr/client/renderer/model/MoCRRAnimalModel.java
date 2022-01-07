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