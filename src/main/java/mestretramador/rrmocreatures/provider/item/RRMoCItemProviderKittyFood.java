package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Kitty Food item provider.
 * 
 * @version 0.0.18
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderKittyFood extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyFood Kitty Food}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyFood Kitty Food}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(2);
        PROPERTIES.saturation(0.2F);
        PROPERTIES.effect(provideNotEdibleEffect(), 1.0F);
        PROPERTIES.effect(provideRawMeatEffect(), 1.0F);
        
        return PROPERTIES.build();
    }
}                                                               
