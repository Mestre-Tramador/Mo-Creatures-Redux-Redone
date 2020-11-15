package mestretramador.rrmocreatures.provider.sound;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.util.ResourceLocation;

/**                                                                                  
 * Mo'Creatures Redux&Redone <i>The Zebra Shuffling!</i> sound event provider.                           
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */ 
public class RRMoCSoundEventProviderZebra extends RRMoCSoundEventProvider
{
    /**                                                                              
     * Using the parent constructor, start <i>The Zebra Shuffling!</i> with the                         
     * {@link mestretramador.rrmocreatures.util.Constants.Sounds.Music#ZEBRA ZEBRA}
     * constant path. 
     */
    public RRMoCSoundEventProviderZebra()
    {
        super(Constants.Sounds.Music.ZEBRA);
    }

    /**
     * Return the sound event properties of
     * {@link mestretramador.rrmocreatures.sound.RRMoCSoundEventZebra
     * <i>The Zebra Shuffling!</i>}
     */
    @Override
    public ResourceLocation provideProperties()
    {
        return PROPERTIES();
    }    
}
