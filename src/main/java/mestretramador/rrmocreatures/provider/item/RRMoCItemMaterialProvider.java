package mestretramador.rrmocreatures.provider.item;

import com.google.common.base.Supplier;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

/**
 * Mo'Creatures Redux&Redone Item Material Provider base.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public enum RRMoCItemMaterialProvider implements IArmorMaterial
{
    /** Chitin Material. */
    CHITIN("chitin", 33, new int[] { 3, 6, 8, 3 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F, 0.0F, () -> Ingredient.fromTag(Tags.Items.MATERIALS_CHITIN)),
    
    /** Fur Material. */
    FUR("fur", 6, new int[] { 2, 2, 2, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.fromItems(RegisterItem.FUR.returnAsItem())),
    
    /** Hide Material. */
    HIDE("hide", 10, new int[] { 2, 4, 4, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.fromItems(RegisterItem.HIDE.returnAsItem())),
    
    /** Reptile Hide Material. */
    REPTILE_HIDE("reptile_hide", 8, new int[] { 2, 3, 2, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.fromItems(RegisterItem.REPTILE_HIDE.returnAsItem()));

    /**
     * A material is created when all the required params are passed.
     * 
     * @param name                       A name for the material.
     * @param durabilityFactor           A factor to multiply each durability base.
     * @param damageReductionAmountArray The damage reduction of each slot.
     * @param enchantability             Chances to enchant.
     * @param soundEvent                 When clicked, the wearing produces a sound.
     * @param toughness                  Toughness for special armors.
     * @param knockbackResistance        Knockback resistance for special armors.
     * @param repairMaterial             Material(s) Ingredient(s) to repair.
     */
    private RRMoCItemMaterialProvider(String name, int durabilityFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial)
    {
        this.name = name;
        this.durabilityFactor = durabilityFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    /**
     * Minecraft's Durabilities bases.
     */
    private static final int[] DURABILITY = new int[] { 13, 15, 16, 11 };

    /**
     * Metadata name.
     */
    private final String name;
    
    /**
     * Multiplier for each slot durability.
     */
    private final int durabilityFactor;
    
    /**
     * For each slot, implict a damage reduction bonus.
     */
    private final int[] damageReductionAmountArray;
    
    /**
     * Enchanting chances.
     */
    private final int enchantability;
    
    /**
     * The sound when the armor is weared by clicking.
     */
    private final SoundEvent soundEvent;
    
    /**
     * Special toughness of the armor.
     */
    private final float toughness;
    
    /**
     * Special knockback resistance of the armor.
     */
    private final float knockbackResistance;
    
    /**
     * The Material(s) Ingredient(s) to repair as a
     * {@link net.minecraft.util.LazyValue Lazy Value}.
     */
    private final LazyValue<Ingredient> repairMaterial;

    /**
     * Return the Material metadata name.
     * 
     * @return Metadata name.
     */
    @Override
    public String getName()
    {
        return this.name;
    }

    /**
     * Return the durability of the given slot.
     * 
     * @param slot The slot of armor.
     * @return Slot's Durability already multiplied.
     */
    @Override
    public int getDurability(EquipmentSlotType slot)
    {
        final int index = slot.getIndex();

        return (DURABILITY[index] * this.durabilityFactor);
    }

    /**
     * Return the damage reduction of the given slot.
     * 
     * @param slot The slot of armor.
     * @return Slot's Damage Reduction.
     */
    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot)
    {
        final int index = slot.getIndex();
        
        return this.damageReductionAmountArray[index];
    }

    /**
     * Return the enchanting chances.
     * 
     * @return Enchanting chances.
     */
    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    /**
     * Return the wearing sound.
     * 
     * @return Sound played when weared by click.
     */
    @Override
    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    /**
     * Return the toghness.
     * 
     * @return Special Toughness.
     */
    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    /**
     * Return the knockback resistance.
     * 
     * @return Special Knockback Resistance.
     */
    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }   

    /**
     * Return the repairable materials.
     * 
     * @return The Material(s) Ingredient(s) to repair.
     */
    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.getValue();
    } 
}
