package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Cooked Turkey item provider.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderTurkeyCooked extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTurkeyCooked Cooked
     * ccc
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.FOOD);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().food(provideFoodProperties());
        PROPERTIES().maxStackSize(64);

        return PROPERTIES();
    }

    /**
     * Return the Food properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTurkeyCooked Cooked
     * Turkey}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(7);
        PROPERTIES.saturation(6.1F);
        PROPERTIES.meat();

        return PROPERTIES.build();
    }
}                                                               
