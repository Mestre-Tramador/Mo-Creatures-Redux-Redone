package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Unicorn Horn item provider.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderUnicornHorn extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemUnicornHorn Unicorn Horn}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.MATERIALS);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().food(provideFoodProperties());
        PROPERTIES().maxStackSize(64);

        return PROPERTIES();
    }

    /**
     * Return the Food properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemUnicornHorn Unicorn Horn}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(2);
        PROPERTIES.saturation(1.6F);
        
        provideEffectsOfLight().forEach((effect) -> {
            PROPERTIES.effect(effect, 1.0F);
        });
        
        return PROPERTIES.build();
    }
}                                                               
