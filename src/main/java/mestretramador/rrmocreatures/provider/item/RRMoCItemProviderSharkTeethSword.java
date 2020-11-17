package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Shark Teeth Sword item provider.
 * 
 * @version 0.0.22
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderSharkTeethSword extends RRMoCItemProvider implements RRMoCSwordItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeethSword Shark Teeth
     * Sword}.
     */
    @Override
    public Properties provideProperties() {
        PROPERTIES().group(ItemGroup.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().maxDamage(131);

        return PROPERTIES();
    }

    /**
     * Return the tier of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeethSword Shark Teeth
     * Sword}.
     */
    @Override
    public IItemTier provideTier()
    {
        return RRMoCItemTierProvider.SHARK;
    }

    /**
     * Return the attack damage bonus of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeethSword Shark Teeth
     * Sword}.
     */
    @Override
    public int provideAttackDamage()
    {
        return 3;
    }

    /**
     * Return the attack speed decrementor of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeethSword Shark Teeth
     * Sword}.
     */
    @Override
    public float provideAttackSpeed()
    {
        return -2.4F;
    }
}                                                               
