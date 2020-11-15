package mestretramador.rrmocreatures.model.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.util.SoundEvent SoundEvent}.
 * 
 * @version 0.0.21
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCSoundEventModel extends SoundEvent
{
    /**
     * Using the parent constructor, create naturally a SoundEvent.
     * 
     * @param provider The SoundEvent Properties provided.
     */
    public RRMoCSoundEventModel(ResourceLocation provider)
    {
        super(provider);
    }    
}
