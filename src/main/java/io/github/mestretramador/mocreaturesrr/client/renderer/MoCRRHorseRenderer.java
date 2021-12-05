package io.github.mestretramador.mocreaturesrr.client.renderer;

import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRHorseModel;
import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRTamableHorse;
import io.github.mestretramador.mocreaturesrr.util.MoCRRResourceLocation;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

/**
 * Horses have a renderer dedicated, as the rules of genetics, tiers and other
 * specific breed intrinsics determine the texture.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRRHorseRenderer<Horse extends MoCRRTamableHorse> extends MoCRRAnimalRenderer<Horse>
{
    /** The base file for the {@link Horse} texture. */
    public static final String FILE = "horse";

    /** The texture file itself. */
    private String file;

    /**
     * The Horse renderer uses only the given context,
     * as the model and the shadow radius size are all
     * internally set.
     *
     * @param context The context of the rendering.
     */
    public MoCRRHorseRenderer(Context context)
    {
        super(
            context,
            new MoCRRHorseModel<Horse>(context.bakeLayer(MoCRRHorseModel.LAYER_LOCATION)),
            0.75F
        );

        this.setFile();
    }

    /**
     * According to the current instance of the {@link Horse}, the
     * genetic rules and breeds influence on the texture.
     *
     * @param horse The Horse indeed determines what texture is located.
     */
    @Override
    public MoCRRResourceLocation getTextureLocation(Horse horse)
    {
        if(!(this.textureIsLocated()))
        {
            this.setFile(horse);

            this.setTextureLocation(this.file);
        }

        return super.getTextureLocation(horse);
    }

    /**
     * A basic initializer for the {@link MoCRRHorseRenderer#file file} string.
     */
    private void setFile()
    {
        this.file = FILE;
    }

    /**
     * It reuses the {@link MoCRRHorseRenderer#setFile() initializer} to
     * start the file path, but with the {@link Horse} the other rules are
     * applied to generate the new texture.
     *
     * @param horse The Horse indeed determines what texture is located.
     */
    // TODO: Use the parameter to find the correct texture.
    private void setFile(Horse horse)
    {
        this.setFile();
    }
}