package mestretramador.rrmocreatures.model.item;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.provider.item.RRMoCItemTierProvider;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.SwordItem Sword Item} to act
 * as an Elephant Tusks Sword.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCElephantTusksItemModel extends RRMoCSwordItemModel
{
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond
     * Diamond Elephant Tusk Sword}.
     */
    private static final String DIAMOND = "diamond";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksIron
     * Iron Elephant Tusk Sword}.
     */
    private static final String IRON = "iron";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood
     * Wood Elephant Tusk Sword}.
     */
    private static final String WOOD = "wood";

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
    public RRMoCElephantTusksItemModel(int attackDamage, float attackSpeed, Properties provider)
    {
        super(RRMoCItemTierProvider.TUSK, attackDamage, attackSpeed, provider);
    }

    /** 
     * Redefines the validation of the given set of Ingredients according
     * with the type of the Elephant Tusk Sword.
     * 
     * @param toRepair The Tusk to repair.
     * @param repair   The given Ingredient Material.
     * @return <b>True</b> if the validation is correct.
     */
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {        
        switch(getElephantTusksType())
        {
            case DIAMOND: return (repair.getItem() == Items.DIAMOND);

            case IRON: return (repair.getItem() == Items.IRON_INGOT);

            case WOOD: return repair.getItem().isIn(ItemTags.PLANKS);

            default: return false;
        }
    }

    /**
     * Based on the registred names, get the respective type of the Elephant Tusk Sword.
     * 
     * @return The types {@link #DIAMOND Diamond}, {@link #IRON Iron},
     *         {@link #WOOD Wood} or <i>null</i>.
     */
    @Nullable
    private String getElephantTusksType()
    {
        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.ELEPHANT_TUSKS_DIAMOND: return DIAMOND;
            
            case Constants.Items.ELEPHANT_TUSKS_IRON: return IRON;

            case Constants.Items.ELEPHANT_TUSKS_WOOD: return WOOD;

            default: return null;
        }
    }
}
