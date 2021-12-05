package io.github.mestretramador.mocreaturesrr.client.renderer;

import javax.annotation.Nullable;

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
     * Accessor for the texture location.
     *
     * @param animal The Animal rendered. <b>Actually it doesn't influence on the texture</b>.
     * @return The location to be loaded and then rendered on the model.
     */
    @Override
    public MoCRRResourceLocation getTextureLocation(@Nullable Animal animal)
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