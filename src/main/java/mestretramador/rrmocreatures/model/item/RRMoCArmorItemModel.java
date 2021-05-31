package mestretramador.rrmocreatures.model.item;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.ArmorItem Armor Item}.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCArmorItemModel extends ArmorItem
{
    /**
     * Using the parent constructor, create naturally an ArmorItem.
     * 
     * @param material The metadata material of the armor for set definition.
     * @param slot     The slot of the armor piece.
     * @param provider The ArmorItem Properties provided.
     */
    public RRMoCArmorItemModel(IArmorMaterial material, EquipmentSlotType slot, Properties provider)
    {
        super(material, slot, provider);
    }    

    /**
     * Since armor textures are rendered separtely, this method creates the paths
     * to MoC R&R armor textures.
     * 
     * @param stack  Current ItemStack.
     * @param entity The wearer.
     * @param slot   Slot of usage.
     * @param type   Subtype for overlaying.
     * @return The correct path for the assets.
     */
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        String armor = "";

        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.FUR_BOOTS:
            case Constants.Items.FUR_CHEST:
            case Constants.Items.FUR_HELMET:
            case Constants.Items.FUR_LEGS:
                armor+="fur_";
            break;

            case Constants.Items.HIDE_BOOTS:
            case Constants.Items.HIDE_CHEST:
            case Constants.Items.HIDE_HELMET:
            case Constants.Items.HIDE_LEGS:
                armor+="hide_";
            break;

            case Constants.Items.REPTILE_HIDE_BOOTS:
            case Constants.Items.REPTILE_HIDE_CHEST:
            case Constants.Items.REPTILE_HIDE_HELMET:
            case Constants.Items.REPTILE_HIDE_LEGS:
                armor+="reptile_hide_";
            break;

            case Constants.Items.CHITIN_DARK_BOOTS:
            case Constants.Items.CHITIN_DARK_CHEST:
            case Constants.Items.CHITIN_DARK_HELMET:
            case Constants.Items.CHITIN_DARK_LEGS:
                armor+="chitin_dark_";
            break;

            case Constants.Items.CHITIN_DIRT_BOOTS:
            case Constants.Items.CHITIN_DIRT_CHEST:
            case Constants.Items.CHITIN_DIRT_HELMET:
            case Constants.Items.CHITIN_DIRT_LEGS:
                armor+="chitin_dirt_";
            break;

            case Constants.Items.CHITIN_FROST_BOOTS:
            case Constants.Items.CHITIN_FROST_CHEST:
            case Constants.Items.CHITIN_FROST_HELMET:
            case Constants.Items.CHITIN_FROST_LEGS:
                armor+="chitin_frost_";
            break;

            case Constants.Items.CHITIN_NETHER_BOOTS:
            case Constants.Items.CHITIN_NETHER_CHEST:
            case Constants.Items.CHITIN_NETHER_HELMET:
            case Constants.Items.CHITIN_NETHER_LEGS:
                armor+="chitin_nether_";
            break;
        }

        armor+= this.slot.equals(EquipmentSlotType.LEGS) ? "2" : "1";

        armor+=".png";

        return new ResourceLocation(Constants.MOD_ID, (Constants.TEXTURES_PATH + Constants.ARMOR_PATH + armor)).toString();
    }
}
