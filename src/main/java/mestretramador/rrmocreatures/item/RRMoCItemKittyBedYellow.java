package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedYellow;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Yellow Kitty Bed item.                                          
 *                                                                                   
 * @version 0.028                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedYellow extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Yellow Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedYellow()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_YELLOW, new RRMoCItemProviderKittyBedYellow());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Yellow Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Yellow Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedYellow) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
