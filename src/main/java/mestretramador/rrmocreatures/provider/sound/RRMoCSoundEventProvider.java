package mestretramador.rrmocreatures.provider.sound;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.util.ResourceLocation;

/**
 * Mo'Creatures Redux&Redone Sound Event Provider base.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCSoundEventProvider
{
    /** Properties to assemble and provide to the Sound Event. */
    private static ResourceLocation PROPERTIES;

    /**
     * To create a Sound Event Provider, there is need to pass a location to the resource.
     * 
     * @param location A valid path to the file.
     */
    protected RRMoCSoundEventProvider(String location)
    {
        PROPERTIES = new ResourceLocation(Constants.MOD_ID, location);
    }

    /**
     * Getter to the Sound Event Properties.
     * 
     * @return The Sound Event Properties in their current state.
     */
    protected ResourceLocation PROPERTIES()
    {
        return PROPERTIES;
    }

    /**
     * Provide the Sound Event Properties for its creation.
     * 
     * @return The Sound Event Properties already setted.
     */
    protected abstract ResourceLocation provideProperties();
}
