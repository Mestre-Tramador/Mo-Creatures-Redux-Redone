package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCChitinArmorItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDirtHelmet;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dirt Chitin Helmet item.                                          
 *                                                                                   
 * @version 0.028                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDirtHelmet extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dirt Chitin Helmet.                            
    */                                                                               
   public RRMoCItemChitinDirtHelmet()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DIRT_HELMET, new RRMoCItemProviderChitinDirtHelmet());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dirt Chitin Helmet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dirt Chitin Helmet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final EquipmentSlotType slot = ((RRMoCItemProviderChitinDirtHelmet) provider).provideSlot();            
        final Item.Properties providerProperties = ((RRMoCItemProviderChitinDirtHelmet) provider).provideProperties();            

        setItem(new RRMoCChitinArmorItemModel(slot, providerProperties));
   }                                                                                 
}                                                                                    
