package mestretramador.rrmocreatures.provider.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;

/**
 * Mo'Creatures Redux&Redone Armor Item Provider base.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public interface RRMoCArmorItemProvider
{
    /**
     * Provide the Armor Item Material for its creation.
     * 
     * @return Armor Material already created.
     */
    public IArmorMaterial provideMaterial(); 

    /**
     * Provide the Armor Item Slot for its creation.
     * 
     * @return A {@link net.minecraft.inventory.EquipmentSlotType Slot} enumeration.
     */
    public EquipmentSlotType provideSlot();
}
