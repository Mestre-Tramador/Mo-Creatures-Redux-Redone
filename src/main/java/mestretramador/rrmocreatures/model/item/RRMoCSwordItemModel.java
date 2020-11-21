package mestretramador.rrmocreatures.model.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.SwordItem Sword Item}.
 * 
 * @version 0.0.23
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCSwordItemModel extends SwordItem
{
    /**
     * Using the parent constructor, create naturally a SwordItem.
     * 
     * @param tier         A Tier for metadata.
     * @param attackDamage The bonus damage.
     * @param attackSpeed  The speed incrementer or decrementer.
     * @param provider     The SwordItem Properties provided.
     */
    public RRMoCSwordItemModel(IItemTier tier, int attackDamage, float attackSpeed, Properties provider)
    {
        super(tier, attackDamage, attackSpeed, provider);
    }
}
