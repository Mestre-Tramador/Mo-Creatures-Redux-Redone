package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.sound.RRMoCSoundEventZebra;

/**
 * Sound Events to registrate.
 * 
 * @version 0.0.16
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RegisterSoundEvent
{
    /** <i>The Zebra Shuffling!</i> music Sound Event. */
    public static final RRMoCSoundEventZebra ZEBRA = new RRMoCSoundEventZebra();

    /**
     * Callback to register all Sound Events.
     */
    public static void registerAll()
    {
        Register.getSoundEventsDeferredRegister().register(ZEBRA.ID, () -> ZEBRA.returnAsSoundEvent());
    }
}
