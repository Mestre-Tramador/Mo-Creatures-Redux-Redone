package mestretramador.rrmocreatures.model.item;

import java.util.ArrayList;
import java.util.HashSet;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.provider.item.RRMoCItemMaterialProvider;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.ArmorItem Armor Item} to act
 * as a Chitin Armor.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCChitinArmorItemModel extends RRMoCArmorItemModel
{
    /**
     * Case String to any
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDark
     * Dark Chitin} armor piece.
     */
    private static final String DARK = "dark";
    
    /**
     * Case String to any
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirt
     * Dirt Chitin} armor piece.
     */
    private static final String DIRT = "dirt";
    
    /**
     * Case String to any
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrost
     * Frost Chitin} armor piece.
     */
    private static final String FROST = "frost";
    
    /**
     * Case String to any
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNether
     * Nether Chitin} armor piece.
     */
    private static final String NETHER = "nether";

     /**
     * <p>
     * Using the parent constructor, create naturally an ArmorItem.
     * </p>
     * <p>
     * The Material is already passed.
     * </p>
     * <p>
     * <b>None alteration is made on the Properties.</b>
     * </p>
     * 
     * @param slot     The slot of the armor piece.
     * @param provider The ArmorItem Properties provided.
     */
    public RRMoCChitinArmorItemModel(EquipmentSlotType slot, Properties provider) 
    {
        super(RRMoCItemMaterialProvider.CHITIN, slot, provider);
    }
    
    /**
     * Check if the player is wearing a full set of the same
     * Chitin Armor and, if it is, apply an effect until the
     * armor is removed.
     * 
     * @param stack  Current ItemStack.
     * @param world  Current World.
     * @param player The wearer.
     */
    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
    {
        if(getIfChitinArmorIsAllTheSame(player))
        {
            final int effectTime = 300;
            final int amplifier = 0;

            switch(getArmorChitinType(null))
            {
                case DARK:
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, effectTime, amplifier));
                break;

                case DIRT:
                    player.addPotionEffect(new EffectInstance(Effects.REGENERATION, effectTime, amplifier));
                break;

                case FROST:
                    player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, effectTime, amplifier));
                break;

                case NETHER:
                    player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, effectTime, amplifier));
                break;
            }
        }

        super.onArmorTick(stack, world, player);
    }

    /**
     * Redefines the repairable configuration to filter between the
     * already defined Items on the Material.
     * 
     * @param toRepair The Chitin Armor to repair.
     * @param repair   An Ingredient Material in the
     *                 {@link mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagMaterialsChitin
     *                 Chitin Materials}.
     * @return <b>True</b> if the type of the Chitin Armor matches the type of the Chitin.
     */
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        switch(getArmorChitinType(toRepair))
        {
            case DARK: return repair.getItem().equals(RegisterItem.CHITIN_DARK.returnAsItem());
            
            case DIRT: return repair.getItem().equals(RegisterItem.CHITIN_DIRT.returnAsItem());
            
            case FROST: return repair.getItem().equals(RegisterItem.CHITIN_FROST.returnAsItem());
            
            case NETHER: return repair.getItem().equals(RegisterItem.CHITIN_NETHER.returnAsItem());

            default: return false;
        }
    }

    /**
     * Simple verification if all the current weared armors are of the
     * same chitin type.
     * 
     * @param player The wearer.
     * @return <b>True</b> if the set is of only one type.
     */
    private boolean getIfChitinArmorIsAllTheSame(PlayerEntity player)
    {
        ArrayList<String> armors = new ArrayList<String>();
        
        armors.add(getArmorChitinType(player.getItemStackFromSlot(EquipmentSlotType.FEET)));
        armors.add(getArmorChitinType(player.getItemStackFromSlot(EquipmentSlotType.CHEST)));
        armors.add(getArmorChitinType(player.getItemStackFromSlot(EquipmentSlotType.HEAD)));
        armors.add(getArmorChitinType(player.getItemStackFromSlot(EquipmentSlotType.LEGS)));

        return (new HashSet<String>(armors).size() <= 1);
    }

    /**
     * Based on the registred names, get the respective type of the Chitin Armor.
     * 
     * @param stack If passed, override the verification of {@code this}.
     * @return The types {@link #DARK Dark}, {@link #DIRT Dirt},
     *         {@link #FROST Frost}, {@link #NETHER Nether} or <i>null</i>.
     */
    @Nullable
    private String getArmorChitinType(@Nullable ItemStack stack)
    {
        String item = this.getRegistryName().getPath();

        if(stack != null)
        {
            item = stack.getItem().getRegistryName().getPath();
        }

        switch(item)
        {
            case Constants.Items.CHITIN_DARK_BOOTS:
            case Constants.Items.CHITIN_DARK_CHEST:
            case Constants.Items.CHITIN_DARK_HELMET:
            case Constants.Items.CHITIN_DARK_LEGS:
            return DARK;

            case Constants.Items.CHITIN_DIRT_BOOTS:
            case Constants.Items.CHITIN_DIRT_CHEST:
            case Constants.Items.CHITIN_DIRT_HELMET:
            case Constants.Items.CHITIN_DIRT_LEGS:
            return DIRT;

            case Constants.Items.CHITIN_FROST_BOOTS:
            case Constants.Items.CHITIN_FROST_CHEST:
            case Constants.Items.CHITIN_FROST_HELMET:
            case Constants.Items.CHITIN_FROST_LEGS:
            return FROST;

            case Constants.Items.CHITIN_NETHER_BOOTS:
            case Constants.Items.CHITIN_NETHER_CHEST:
            case Constants.Items.CHITIN_NETHER_HELMET:
            case Constants.Items.CHITIN_NETHER_LEGS:
            return NETHER;

            default: return null;
        }
    }
}
