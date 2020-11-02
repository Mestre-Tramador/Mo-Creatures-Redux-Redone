package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeSaddle;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone Handmade Saddle item.
 * @version 0.0.5
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemHandmadeSaddle extends RRMoCItem
{
    /**
     * Using the parent base constructor, create an Handmade Saddle.
     */
    public RRMoCItemHandmadeSaddle()
    {
        super(Constants.Items.HANDMADE_SADDLE, new RRMoCItemProviderHandmadeSaddle());
    }

    /**
     * Return a Handmade Saddle as a {@link Item}
     */
    @Override
    public Item returnAsItem()
    {
        return new Item(((RRMoCItemProviderHandmadeSaddle) provider).provideProperties());
    }
}
