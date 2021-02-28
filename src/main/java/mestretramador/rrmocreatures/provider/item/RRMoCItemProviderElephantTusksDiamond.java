package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Diamond Elephant Tusk Sword item provider.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderElephantTusksDiamond extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond
     * Diamond Elephant Tusk Sword}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond
     * Diamond Elephant Tusk Sword}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.TUSK;
    }

    /**
     * Return the attack damage bonus of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond
     * Diamond Elephant Tusk Sword}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 6;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond
     * Diamond Elephant Tusk Sword}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -2.8F;
    }
}                                                               
