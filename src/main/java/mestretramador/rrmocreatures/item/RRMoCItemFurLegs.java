package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderFurLegs;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Fur Legs item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemFurLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Fur Legs.                            
    */                                                                               
   public RRMoCItemFurLegs()                                                         
   {                                                                                 
       super(Constants.Items.FUR_LEGS, new RRMoCItemProviderFurLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Fur Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Fur Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final IArmorMaterial material = ((RRMoCItemProviderFurLegs) provider).provideMaterial();            
        final EquipmentSlotType slot = ((RRMoCItemProviderFurLegs) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderFurLegs) provider).provideProperties();            

        setItem(new RRMoCArmorItemModel(material, slot, providerProperties));
   }                                                                                 
}                                                                                    
