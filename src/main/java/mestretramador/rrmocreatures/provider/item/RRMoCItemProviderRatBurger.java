package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Rat Burger item provider.
 * 
 * @version 0.0.21
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderRatBurger extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemRatBurger Rat Burger}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemRatBurger Rat Burger}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(8);
        PROPERTIES.saturation(14.5F);
        PROPERTIES.meat();

        return PROPERTIES.build();
    }
}                                                               
