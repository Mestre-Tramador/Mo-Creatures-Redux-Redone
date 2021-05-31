package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Dirt Sting Sword item provider.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderStingDirtSword extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting
     * Sword}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);

        return PROPERTIES();
    }

    /**
     * Return the tier of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting
     * Sword}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.STING;
    }

    /**
     * Return the attack damage bonus of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting
     * Sword}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 3;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting
     * Sword}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -2.4F;
    }
}                                                               
