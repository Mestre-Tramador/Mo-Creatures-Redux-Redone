package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Cooked Ostrich item provider.
 * 
 * @version 0.0.20
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderOstrichCooked extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemOstrichCooked Cooked
     * Ostrich}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(ItemGroup.FOOD);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().food(provideFoodProperties());
        PROPERTIES().maxStackSize(64);

        return PROPERTIES();
    }

    /**
     * Return the Food properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemOstrichCooked Cooked
     * Ostrich}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(6);
        PROPERTIES.saturation(5.5F);
        PROPERTIES.meat();
        
        return PROPERTIES.build();
    }
}                                                               
