package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.sound.RRMoCSoundEventWhip;
import mestretramador.rrmocreatures.sound.RRMoCSoundEventZebra;

/**
 * Sound Events to registrate.
 * 
 * @version 0.028
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RegisterSoundEvent
{
    /** Whip Crack effect Sound Event. */
    public static final RRMoCSoundEventWhip WHIP = new RRMoCSoundEventWhip();

    /** <i>The Zebra Shuffling!</i> music Sound Event. */
    public static final RRMoCSoundEventZebra ZEBRA = new RRMoCSoundEventZebra();

    /**
     * Callback to register all Sound Events.
     */
    public static void registerAll()
    {
        registerAllEffects();
        registerAllMusics();
    }

    private static void registerAllEffects()
    {
        Register.getSoundEventsDeferredRegister().register(WHIP.ID, () -> WHIP.returnAsSoundEvent());
    }

    private static void registerAllMusics()
    {
        Register.getSoundEventsDeferredRegister().register(ZEBRA.ID, () -> ZEBRA.returnAsSoundEvent());
    }
}
