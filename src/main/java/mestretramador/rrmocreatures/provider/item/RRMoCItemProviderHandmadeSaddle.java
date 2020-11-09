package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Handmade Saddle item provider.
 * 
 * @version 0.0.12
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderHandmadeSaddle extends RRMoCItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade
     * Saddle}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(ItemGroup.TRANSPORTATION);

        return PROPERTIES();
    }
}
