package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHideBoots;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Hide Boots item.                                          
 *                                                                                   
 * @version 0.0.26                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHideBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Hide Boots.                            
    */                                                                               
   public RRMoCItemHideBoots()                                                         
   {                                                                                 
       super(Constants.Items.HIDE_BOOTS, new RRMoCItemProviderHideBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Hide Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Hide Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final IArmorMaterial material = ((RRMoCItemProviderHideBoots) provider).provideMaterial();            
        final EquipmentSlotType slot = ((RRMoCItemProviderHideBoots) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderHideBoots) provider).provideProperties();            

        setItem(new RRMoCArmorItemModel(material, slot, providerProperties));
   }                                                                                 
}                                                                                    
