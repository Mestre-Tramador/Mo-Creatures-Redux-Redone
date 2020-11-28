package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Wood Elephant Tusk Sword item provider.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderElephantTusksWood extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood
     * Elephant Tusk Sword}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(ItemGroup.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);

        return PROPERTIES();
    }

    /**
     * Return the tier of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood
     * Elephant Tusk Sword}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.TUSK;
    }

    /**
     * Return the attack damage of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood
     * Elephant Tusk Sword}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 4;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood
     * Elephant Tusk Sword}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -2.8F;
    }
}                                                               
