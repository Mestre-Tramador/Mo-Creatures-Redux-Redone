package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedMagenta;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Magenta Kitty Bed item.                                          
 *                                                                                   
 * @version 0.028                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedMagenta extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Magenta Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedMagenta()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_MAGENTA, new RRMoCItemProviderKittyBedMagenta());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Magenta Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Magenta Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedMagenta) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
