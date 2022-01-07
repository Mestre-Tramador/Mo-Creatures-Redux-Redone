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

import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRTamableHorseModel;
import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRTamableHorse;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

/**
 * All Horse-like animals have a shared Renderer dedicated, as the rules of genetics,
 * tiers and other specific intrinsics may determine the texture.
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 */
public abstract class MoCRRTamableHorseRenderer<Horse extends MoCRRTamableHorse> extends MoCRRAnimalRenderer<Horse>
{
    /** The base file for the {@link Horse} texture. */
    public static final String FILE = "horse";

    /**
     * In order to render a Horse-like Animal, all the base parameters shall be passed
     * except the shadow radius, as it is default for all.
     *
     * @param context      The context of the rendering.
     * @param model        The Tamable Horse-like {@link MoCRRTamableHorseModel model} to use.
     */
    protected MoCRRTamableHorseRenderer(Context context, MoCRRTamableHorseModel<Horse> model)
    {
        super(context, model, 0.75F);

        this.setFile();
    }

    /**
     * According to the current instance of the {@link Horse}, the
     * genetic rules and breeds influence on the texture.
     *
     * @param horse The {@link Horse} indeed determines what texture is located.
     */
    @Override
    public MoCRRResourceLocation getTextureLocation(Horse horse)
    {
        if(!(this.textureIsLocated()) || horse.canVaryTexture())
        {
            this.setFile(horse);

            this.setTextureLocation(this.file);
        }

        return super.getTextureLocation(horse);
    }

    /**
     * A basic initializer for the {@link MoCRRTamableHorseRenderer#file file} string.
     */
    @Override
    protected void setFile()
    {
        this.file = FILE;
    }

    /**
     * It reuses the {@link MoCRRTamableHorseRenderer#setFile() initializer} to
     * start the file path, but with the {@link Horse} the other rules are
     * applied to generate the new texture.
     *
     * @param horse The Horse indeed determines what texture is located.
     */
    protected abstract void setFile(Horse horse);
}