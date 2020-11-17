package mestretramador.rrmocreatures.model.item;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.provider.item.RRMoCItemTierProvider;

import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;

public class RRMoCTMNTWeaponItemModel extends RRMoCSwordItemModel
{
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
    public RRMoCTMNTWeaponItemModel(int attackDamage, float attackSpeed, Properties provider)
    {
        super(RRMoCItemTierProvider.TMNT, attackDamage, attackSpeed, provider);
    }
    
    /** 
     * Redefines the validation of the given Ingredient to
     * change to wood planks instead of bone meal
     * in the {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo} case.
     * 
     * @param toRepair The TMNT Weapon to repair.
     * @param repair   The given Ingredient Material.
     * @return <b>True</b> if the validation is correct.
     */
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        if(toRepair.getItem() == RegisterItem.TMNT_BO.returnAsItem())
        {
            return repair.getItem().isIn(ItemTags.PLANKS);
        }

        return super.getIsRepairable(toRepair, repair);
    }
}
