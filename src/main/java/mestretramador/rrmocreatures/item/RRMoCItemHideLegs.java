package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHideLegs;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Hide Legs item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHideLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Hide Legs.                            
    */                                                                               
   public RRMoCItemHideLegs()                                                         
   {                                                                                 
       super(Constants.Items.HIDE_LEGS, new RRMoCItemProviderHideLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Hide Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Hide Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final IArmorMaterial material = ((RRMoCItemProviderHideLegs) provider).provideMaterial();            
        final EquipmentSlotType slot = ((RRMoCItemProviderHideLegs) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderHideLegs) provider).provideProperties();            

        setItem(new RRMoCArmorItemModel(material, slot, providerProperties));
   }                                                                                 
}                                                                                    
