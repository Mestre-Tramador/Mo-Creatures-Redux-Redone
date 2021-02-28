package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedLightGray;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Light Gray Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.27                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedLightGray extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Light Gray Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedLightGray()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_LIGHT_GRAY, new RRMoCItemProviderKittyBedLightGray());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Light Gray Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Light Gray Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedLightGray) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
