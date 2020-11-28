package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Food;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Heart of the Undead item provider.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderHeartUndead extends RRMoCItemProvider implements RRMoCItemFoodProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHeartUndead Heart of the
     * Undead}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(ItemGroup.MATERIALS);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().food(provideFoodProperties());
        PROPERTIES().maxStackSize(64);

        return PROPERTIES();
    }

    /**
     * Return the Food properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHeartUndead Heart of the
     * Undead}.
     */
    @Override
    public Food provideFoodProperties()
    {
        final Food.Builder PROPERTIES = new Food.Builder();

        PROPERTIES.hunger(5);
        PROPERTIES.saturation(4.8F);
        PROPERTIES.meat();
        
        provideEffectsOfTheUndead().forEach((effect) -> {
            PROPERTIES.effect(effect, 1.0F);
        });
        
        return PROPERTIES.build();
    }
}                                                               
