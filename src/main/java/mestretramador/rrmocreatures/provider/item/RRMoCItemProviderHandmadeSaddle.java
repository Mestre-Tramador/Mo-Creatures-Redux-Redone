package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Handmade Saddle item provider.
 * 
 * @version 0.0.29
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
        PROPERTIES().group(Tabs.ANIMALSTUFF);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().maxStackSize(1); 

        return PROPERTIES();
    }
}
