package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Fur Legs item provider.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderFurLegs extends RRMoCItemProvider implements RRMoCArmorItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemFurLegs Fur Legs}.
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
     * {@link mestretramador.rrmocreatures.item.RRMoCItemFurLegs Fur Legs}.
     */
    @Override
    public IArmorMaterial provideMaterial()
    {        
        return RRMoCItemMaterialProvider.FUR;
    }

    /**
     * Return the equipment slot of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemFurLegs Fur Legs}.
     */
    @Override
    public EquipmentSlotType provideSlot()
    {
        return EquipmentSlotType.LEGS;
    }
}                                                               
