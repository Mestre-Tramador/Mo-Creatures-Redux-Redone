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

package io.github.mestretramador.mocreaturesrr.client.renderer;

import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRHorseModel;
import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRTamableHorseModel;
import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

/**
 * Horses have a renderer dedicated, as the rules of genetics, tiers and other
 * specific breed intrinsics determine the texture.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRRHorseRenderer extends MoCRRTamableHorseRenderer<MoCRRHorse>
{
    /**
     * The Horse Renderer uses only the given context,
     * as the Model and the shadow radius size are all
     * internally set.
     *
     * @param context The context of the rendering.
     */
    public MoCRRHorseRenderer(Context context)
    {
        super(
            context,
            new MoCRRHorseModel(context.bakeLayer(MoCRRTamableHorseModel.LAYER_LOCATION))
        );
    }

    /**
     * The vector is composed of the {@link MoCRRTamableHorseRenderer#FILE base file name},
     * plus the name {@code String}s of the Horse {@link MoCRRHorse#getHorseTier() Tier} and
     * {@link MoCRRHorse#getHorseBreed() Breed}.
     *
     * @param horse The current Horse is necessary to determine its texture based on the species.
     */
    @Override
    protected final String[] assembleFileNameParts(MoCRRHorse horse)
    {
        return new String[] {
            FILE,
            horse.getHorseTier().toFileNameString(),
            horse.getHorseBreed().toFileNameString()
        };
    }

    /**
     * As Horses can vary their textures, the file name is set by
     * {@link MoCRRHorseRenderer#assembleFileNameParts(MoCRRHorse) assembling the parts}.
     */
    @Override
    protected void setFile(MoCRRHorse horse)
    {
        this.file = assembleFileName(assembleFileNameParts(horse));
    }
}