package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDirtChest;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dirt Chitin Chest item.                                          
 *                                                                                   
 * @version 0.0.17                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDirtChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dirt Chitin Chest.                            
    */                                                                               
   public RRMoCItemChitinDirtChest()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DIRT_CHEST, new RRMoCItemProviderChitinDirtChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dirt Chitin Chest item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dirt Chitin Chest is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderChitinDirtChest) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
