package mestretramador.rrmocreatures.provider.item;             
                                                                
import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Bo item provider.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderTMNTBo extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.COMBAT);
        PROPERTIES().rarity(Rarity.UNCOMMON);

        return PROPERTIES();
    }

    /**
     * Return the tier of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.TMNT;
    }

    /**
     * Return the attack damage bonus of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 4;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -3.0F;
    }
}                                                               
