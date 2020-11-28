package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.IItemTier;

/**
 * Mo'Creatures Redux&Redone SwordItem Provider base.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public interface RRMoCSwordItemProvider
{
    /**
     * Provide the Sword Item Tier for its creation.
     * 
     * @return Item tier already created.
     */
    public IItemTier provideTier();
    
    /**
     * Provide the Sword Item attack
     * damage bonus for its creation.
     * 
     * @return A simple integer value to add to the damage.
     */
    public int provideAttackDamage();
    
    /**
     * Provide the Sword Item attack
     * damage incrementor or decrementor
     * for its creation.
     * 
     * @return A float value to add or subtract to the speed.
     */
    public float provideAttackSpeed();    
}
