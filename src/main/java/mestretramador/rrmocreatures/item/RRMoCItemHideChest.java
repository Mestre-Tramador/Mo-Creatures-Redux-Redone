package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHideChest;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Hide Chest item.                                          
 *                                                                                   
 * @version 0.0.26                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHideChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Hide Chest.                            
    */                                                                               
   public RRMoCItemHideChest()                                                         
   {                                                                                 
       super(Constants.Items.HIDE_CHEST, new RRMoCItemProviderHideChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Hide Chest item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Hide Chest is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final IArmorMaterial material = ((RRMoCItemProviderHideChest) provider).provideMaterial();            
        final EquipmentSlotType slot = ((RRMoCItemProviderHideChest) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderHideChest) provider).provideProperties();            

        setItem(new RRMoCArmorItemModel(material, slot, providerProperties));
   }                                                                                 
}                                                                                    
