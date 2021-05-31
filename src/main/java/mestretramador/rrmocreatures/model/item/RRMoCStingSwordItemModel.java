package mestretramador.rrmocreatures.model.item;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.provider.item.RRMoCItemTierProvider;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.SwordItem Sword Item} to act
 * as a Sting Sword.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCStingSwordItemModel extends RRMoCSwordItemModel
{
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDarkSword
     * Dark Sting Sword}.
     */
    private static final String DARK = "dark";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword
     * Dirt Sting Sword}.
     */
    private static final String DIRT = "dirt";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingFrostSword
     * Frost Sting Sword}.
     */
    private static final String FROST = "frost";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStingNetherSword
     * Nether Sting Sword}.
     */
    private static final String NETHER = "nether";

    /**
     * <p>
     * Using the parent constructor, create naturally a SwordItem.
     * </p>
     * <p>
     * The Tier is already passed.
     * </p>
     * <p>
     * <b>None alteration is made on the Properties.</b>
     * </p>
     * 
     * @param attackDamage The bonus damage.
     * @param attackSpeed  The speed incrementer or decrementer.
     * @param provider     The SwordItem Properties provided.
     */
    public RRMoCStingSwordItemModel(int attackDamage, float attackSpeed, Properties provider)
    {
        super(RRMoCItemTierProvider.STING, attackDamage, attackSpeed, provider);
    }

    /**
     * Redefines the hitting to apply an Effect according with the type of the
     * Sting Sword.
     * 
     * @param stack    Used ItemStack.
     * @param target   The Entity target.
     * @param attacker The Entity attacker.
     * @return It just apply an Effect and return the parent implementation.
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        final int effectTime = 100;

        switch(getStingSwordType())
        {
            case DARK:
                target.addPotionEffect(new EffectInstance(Effects.WITHER, effectTime));
            break;
        
            case DIRT:
                target.addPotionEffect(new EffectInstance(Effects.POISON, effectTime));
            break;
        
            case FROST:
                target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, effectTime));
            break;
        
            case NETHER:
                target.setFire((int) Math.ceil(effectTime / 10));
            break;
        }

        return super.hitEntity(stack, target, attacker);
    }

    /**
     * Redefines the repairable configuration to filter between the
     * already defined Items on the Tier.
     * 
     * @param toRepair The Sting Sword to repair.
     * @param repair   An Ingredient Material in the
     *                 {@link mestretramador.rrmocreatures.data.common.tags.item.RRMoCItemTagMaterialsSting
     *                 Sting Materials}.
     * @return <b>True</b> if the type of the Sting Sword matches the type of the Sting.
     */
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        switch(getStingSwordType())
        {
            case DARK: return (repair.getItem() == RegisterItem.STING_DARK.returnAsItem());
            
            case DIRT: return (repair.getItem() == RegisterItem.STING_DIRT.returnAsItem());
            
            case FROST: return (repair.getItem() == RegisterItem.STING_FROST.returnAsItem());
            
            case NETHER: return (repair.getItem() == RegisterItem.STING_NETHER.returnAsItem());

            default: return false;
        }
    }

    /**
     * Based on the registred names, get the respective type of the Sting Sword.
     * 
     * @return The types {@link #DARK Dark}, {@link #DIRT Dirt},
     *         {@link #FROST Frost}, {@link #NETHER Nether} or <i>null</i>.
     */
    @Nullable
    private String getStingSwordType()
    {
        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.STING_DARK_SWORD: return DARK;

            case Constants.Items.STING_DIRT_SWORD: return DIRT;
            
            case Constants.Items.STING_FROST_SWORD: return FROST;
            
            case Constants.Items.STING_NETHER_SWORD: return NETHER;
            
            default: return null;
        }       
    }
}
