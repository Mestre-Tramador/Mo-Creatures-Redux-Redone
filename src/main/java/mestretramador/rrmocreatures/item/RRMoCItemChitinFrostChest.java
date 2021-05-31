package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCChitinArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinFrostChest;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Frost Chitin Chest item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinFrostChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Frost Chitin Chest.                            
    */                                                                               
   public RRMoCItemChitinFrostChest()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_FROST_CHEST, new RRMoCItemProviderChitinFrostChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Frost Chitin Chest item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Frost Chitin Chest is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final EquipmentSlotType slot = ((RRMoCItemProviderChitinFrostChest) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderChitinFrostChest) provider).provideProperties();            

        setItem(new RRMoCChitinArmorItemModel(slot, providerProperties));
   }                                                                                 
}                                                                                    
