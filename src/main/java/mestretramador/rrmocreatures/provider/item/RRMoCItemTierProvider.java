package mestretramador.rrmocreatures.provider.item;

import com.google.common.base.Supplier;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

/**
 * Mo'Creatures Redux&Redone Item Tier Provider base.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public enum RRMoCItemTierProvider implements IItemTier
{
    /** Shark Teeth Tier. */
    SHARK(131, 4.0F, 1.0F, 1, 0, () -> Ingredient.fromItems(RegisterItem.SHARK_TEETH.returnAsItem())),
    
    /** Fallen Silver Knights Tier. */
    SILVER(250, 6.0F, 2.0F, 2, 0, () -> Ingredient.EMPTY), // TODO: Add Silver repair Ingredient Material.
    
    /** Scorpion and alikes Stings Tier. */
    STING(1561, 8.5F, 3.0F, 3, 0, () -> Ingredient.fromTag(Tags.Items.MATERIALS_STING)),
    
    /** TMNT Tier. */
    TMNT(250, 6.0F, 1.0F, 2, 0, () -> Ingredient.fromTag(Tags.Items.MATERIALS_TMNT)),
    
    /** Elephant Tusk Sword Tier. */
    TUSK(1000, 7.0F, 0.0F, 4, 0, () -> Ingredient.fromTag(Tags.Items.MATERIALS_TUSK));

    /**
     * A tier is created when all the required params are passed.
     * 
     * @param maxUses        The default uses of the tier.
     * @param efficiency     The efficiency of the weapon.
     * @param attackDamage   Attack damage bonus.
     * @param harvestLevel   Harvesting level.
     * @param enchantability Chance to enchant.
     * @param repairMaterial Material(s) Ingredient(s) to repair.
     */
    RRMoCItemTierProvider(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<Ingredient>(repairMaterial);
    }

    /**
     * Maximium usage.
     */
    private final int maxUses;

    /**
     * Simple efficiency.
     */
    private final float efficiency;
    
    /**
     * Attack damage incrementor.
     */
    private final float attackDamage;
    
    /**
     * Level of harvesting.
     */
    private final int harvestLevel;
    
    /**
     * Enchanting chances.
     */
    private final int enchantability;
    
    /**
     * The Material(s) Ingredient(s) to repair as a
     * {@link net.minecraft.util.LazyValue Lazy Value}.
     */
    private final LazyValue<Ingredient> repairMaterial;

    /**
     * Return the tier maximum usage.
     * 
     * @return Maximium usage.
     */
    @Override
    public int getMaxUses()
    {
        return maxUses;
    }

    /**
     * Return the tier simple efficiency.
     * 
     * @return Simple efficiency.
     */
    @Override
    public float getEfficiency()
    {
        return efficiency;
    }

    /**
     * Return the tier attack damage incrementor.
     * 
     * @return Attack damage incrementor.
     */
    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    /**
     * Return the level of harvesting.
     * 
     * @return Level of harvesting.
     */
    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    /**
     * Return the enchanting chances.
     * 
     * @return Enchanting chances.
     */
    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    /**
     * Return the repairable materials.
     * 
     * @return The Material(s) Ingredient(s) to repair.
     */
    @Override
    public Ingredient getRepairMaterial()
    {
        return repairMaterial.getValue();
    }
}
