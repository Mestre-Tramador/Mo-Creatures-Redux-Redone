package mestretramador.rrmocreatures.sound;

import mestretramador.rrmocreatures.model.sound.RRMoCSoundEventModel;
import mestretramador.rrmocreatures.provider.sound.RRMoCSoundEventProviderZebra;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.util.SoundEvent;

/**                                                                                                                
 * Mo'Creatures Redux&Redone <i>The Zebra Shuffling!</i> music sound event. 
 *                                                                                                                 
 * @version 0.0.24                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */   
public class RRMoCSoundEventZebra extends RRMoCSoundEvent
{
    /**
     * Using the parent constructor, create a <i>The Zebra Shuffling!</i> music sound event. 
     */
    public RRMoCSoundEventZebra()
    {
        super(Constants.Sounds.Music.ZEBRA, new RRMoCSoundEventProviderZebra());
    }

    /**
     * With the {@link mestretramador.rrmocreatures.sound.RRMoCSoundEvent#setSoundEvent(SoundEvent)
     * set helper function}, the <i>The Zebra Shuffling!</i> music sound event is created.
     */
    @Override
    protected void createSoundEvent()
    {
        setSoundEvent(new RRMoCSoundEventModel(((RRMoCSoundEventProviderZebra) provider).provideProperties()));
    }

    /**
     * Return the <i>The Zebra Shuffling!</i> music sound event in its current state.
     */
    @Override
    public SoundEvent returnAsSoundEvent()
    {
        return getSoundEvent();
    }
}
