package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Nether Chitin Chest item provider.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderChitinNetherChest extends RRMoCItemProvider implements RRMoCArmorItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherChest Nether
     * Chitin Chest}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(Tabs.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);
        PROPERTIES().isImmuneToFire();

        return PROPERTIES();
    }

    /**
     * Return the material of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherChest Nether
     * Chitin Chest}.
     */
    @Override
    public IArmorMaterial provideMaterial()
    {
        return RRMoCItemMaterialProvider.CHITIN;
    }

    /**
     * Return the equipment slot of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherChest Nether
     * Chitin Chest}.
     */
    @Override
    public EquipmentSlotType provideSlot()
    {
        return EquipmentSlotType.CHEST;
    }
}                                                               
