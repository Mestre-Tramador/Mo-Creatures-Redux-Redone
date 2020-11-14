package mestretramador.rrmocreatures.sound;

import net.minecraft.util.SoundEvent;

/**
 * Mo'Creatures Redux&Redone {@link net.minecraft.util.SoundEvent Sound Event} base.
 * 
 * @version 0.0.19
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCSoundEvent
{
    /** The Sound Event ID. */
    public final String ID;

    /** The Sound Event Provider. */
    protected final Object provider;

    /** The {@link net.minecraft.util.SoundEvent Sound Event} as is. */
    private SoundEvent rrmocSoundEvent;

    /**
     * To create a Mo'Creatures Redux&Redone Sound Event, there is needed to pass and ID
     * and a data provider.
     * 
     * @param ID       Sound Event ID for registration on Constants.
     * @param provider An object of a inherited Provider class.
     */
    protected RRMoCSoundEvent(String ID, Object provider)
    {
        this.ID = ID;
        this.provider = provider;

        createSoundEvent();
    }

    /**
     * Get helper for the current Sound Event.
     * 
     * @return The {@link net.minecraft.util.SoundEvent Sound Event} itself.
     */
    protected SoundEvent getSoundEvent()
    {
        return this.rrmocSoundEvent;
    }

    /**
     * Set helper for the current Sound Event.
     * 
     * @param soundEvent The created {@link net.minecraft.util.SoundEvent Sound Event}.
     */
    protected void setSoundEvent(SoundEvent soundEvent)
    {   
        this.rrmocSoundEvent = soundEvent;
    }

    /**
     * With the created Sound Event and the helper functions, do final adjusts
     * to finally return the Sound Event.
     * 
     * @return The actual Sound Event.
     */
    protected abstract SoundEvent returnAsSoundEvent();

    /**
     * Create a Sound Event with the helper functions.
     */
    protected abstract void createSoundEvent();
}
