package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Rarity;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Frost Chitin Chest item provider.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderChitinFrostChest extends RRMoCItemProvider implements RRMoCArmorItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostChest Frost
     * Chitin Chest}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);

        return PROPERTIES();
    }

    /**
     * Return the material of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostHelmet Frost
     * Chitin Helmet}.
     */
    @Override
    public IArmorMaterial provideMaterial()
    {
        return RRMoCItemMaterialProvider.CHITIN;
    }

    /**
     * Return the equipment slot of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostHelmet Frost
     * Chitin Helmet}.
     */
    @Override
    public EquipmentSlotType provideSlot()
    {
        return EquipmentSlotType.CHEST;
    }
}                                                               
