package mestretramador.rrmocreatures.provider.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

/**
 * Mo'Creatures Redux&Redone Hide Legs item provider.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemProviderHideLegs extends RRMoCItemProvider implements RRMoCArmorItemProvider
{
    /**
     * Return the properties of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHideLegs Hide Legs}.
     */
    @Override
    public Properties provideProperties()
    {
        PROPERTIES().group(ItemGroup.COMBAT);
        PROPERTIES().rarity(Rarity.COMMON);

        return PROPERTIES();
    }

    /**
     * Return the material of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHideLegs Hide Legs}.
     */
    @Override
    public IArmorMaterial provideMaterial()
    {
        return RRMoCItemMaterialProvider.HIDE;
    }

    /**
     * Return the equipment slot of
     * {@link mestretramador.rrmocreatures.item.RRMoCItemHideLegs Hide Legs}.
     */
    @Override
    public EquipmentSlotType provideSlot()
    {
        return EquipmentSlotType.LEGS;
    }
}                                                               
