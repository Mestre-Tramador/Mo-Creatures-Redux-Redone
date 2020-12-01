package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderReptileHideLegs;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Reptile Hide Legs item.                                          
 *                                                                                   
 * @version 0.0.26                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemReptileHideLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Reptile Hide Legs.                            
    */                                                                               
   public RRMoCItemReptileHideLegs()                                                         
   {                                                                                 
       super(Constants.Items.REPTILE_HIDE_LEGS, new RRMoCItemProviderReptileHideLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Reptile Hide Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Reptile Hide Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final IArmorMaterial material = ((RRMoCItemProviderReptileHideLegs) provider).provideMaterial();            
        final EquipmentSlotType slot = ((RRMoCItemProviderReptileHideLegs) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderReptileHideLegs) provider).provideProperties();            

        setItem(new RRMoCArmorItemModel(material, slot, providerProperties));
   }                                                                                 
}                                                                                    
