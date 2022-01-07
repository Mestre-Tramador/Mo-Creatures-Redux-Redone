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

import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRAnimalModel;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRAnimal;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

/**
 * An Animal Renderer reuses the {@link MobRenderer default} renderer to
 * ensure that it shall only be used to render MoC R&R Animals.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public abstract class MoCRRAnimalRenderer<Animal extends MoCRRAnimal> extends MobRenderer<Animal, MoCRRAnimalModel<Animal>>
{
    /** All files are under this folder. */
    protected static final String PATH = "textures/entities/";

    /** All files have this extension. */
    protected static final String EXT = ".png";

    /** The texture to be rendered of the Animal. */
    private MoCRRResourceLocation textureLocation;

    /** The texture file itself. */
    protected String file;

    /**
     * In order to render an Animal, all the base parameters shall be passed.
     *
     * @param context      The context of the rendering.
     * @param model        The Animal {@link MoCRRAnimalModel model} to use.
     * @param shadowRadius The shadow radius size.
     */
    public MoCRRAnimalRenderer(Context context, MoCRRAnimalModel<Animal> model, float shadowRadius)
    {
        super(context, model, shadowRadius);
    }

    /**
     * Every Renderer assemble the file name differently.
     */
    protected abstract void setFile();

    /**
     * Create the complete path for the
     * {@link MoCRRAnimalRenderer#textureLocation location}
     * of the texture.
     *
     * @param filePath The middle path between the initial folder and the extension.
     * @return A string usually on the {@code "textures/entities/path/to/file.png"} pattern.
     */
    protected static final String assembleTextureLocationPath(String filePath)
    {
        return PATH.concat(filePath).concat(EXT);
    }

    /**
     * Create a file name from the given parts, in <i>snake_case</i>.
     *
     * @param parts The parts should match the "words" of the file.
     * @return The file name in <i>snake_case</i>, without path or extension.
     */
    protected static final String assembleFileName(String[] parts)
    {
        return String.join("_", parts);
    }

    /**
     * Assemble a vector of the parts, namely the "words", of a file name.
     *
     * @param animal The Animal to use in this operation. Note that {@link Animal#canVaryTexture()}
     *               should return {@code true}, at least.
     * @return The parts matching words of the file.
     * @throws UnsupportedOperationException This method cannot be run as there is no parts to create a file name.
     */
    protected String[] assembleFileNameParts(Animal animal) throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("\"Animal\" is a generic type and cannot create a file name for no having parts!");
    }

    /**
     * Accessor for the texture location.
     *
     * @param animal The Animal rendered. <b>Actually it doesn't influence on the texture</b>.
     * @return The location to be loaded and then rendered on the model.
     */
    @Override
    public MoCRRResourceLocation getTextureLocation(Animal animal)
    {
        return this.textureLocation;
    }

    /**
     * The locator of the {@link MoCRRAnimalRenderer#textureLocation texture},
     * according to the given file.
     *
     * @param file The path to file, following the folders structure with slashes (/).
     */
    protected final void setTextureLocation(String file)
    {
        this.textureLocation = new MoCRRResourceLocation(assembleTextureLocationPath(file));
    }

    /**
     * Verification if the texture is located,
     * instantiated as a matter of speak.
     *
     * @return The result equals {@code true} if there is a texture.
     */
    protected final boolean textureIsLocated()
    {
        return (this.textureLocation != null);
    }
}