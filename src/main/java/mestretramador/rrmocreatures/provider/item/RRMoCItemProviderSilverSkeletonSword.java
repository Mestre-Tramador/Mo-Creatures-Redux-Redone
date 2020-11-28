package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Silver Skeleton Sword item provider.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderSilverSkeletonSword extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSilverSkeletonSword Silver
     * Skeleton Sword}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSilverSkeletonSword Silver
     * Skeleton Sword}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.SILVER;
    }

    /**
     * Return the attack damage bonus of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSilverSkeletonSword Silver
     * Skeleton Sword}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 2;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSilverSkeletonSword Silver
     * Skeleton Sword}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -2.0F;
    }
}                                                               
