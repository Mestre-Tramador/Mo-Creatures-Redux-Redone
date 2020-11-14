package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Raw Rat item provider.
 * 
 * @version 0.0.20
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderRatRaw extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemRatRaw Raw Rat}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemRatRaw Raw Rat}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(3);
        PROPERTIES.saturation(1.0F);
        PROPERTIES.meat();

        return PROPERTIES.build();
    }
}                                                               
