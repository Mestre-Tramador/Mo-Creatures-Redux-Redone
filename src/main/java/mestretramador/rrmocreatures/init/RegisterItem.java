package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle;

/**
 * Items to registrate.
 * @version 0.0.5
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RegisterItem
{
    /** Handmade Saddle item. */
    public static final RRMoCItemHandmadeSaddle HANDMADE_SADDLE = new RRMoCItemHandmadeSaddle();

    /**
     * Callback to register all items.
     */
    public static void registerAll()
    {
        Register.getItemsDeferredRegister().register(HANDMADE_SADDLE.ID, () -> HANDMADE_SADDLE.returnAsItem());
    }
}
