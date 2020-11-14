package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedLightBlue;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Light Blue Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedLightBlue extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Light Blue Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedLightBlue()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_LIGHT_BLUE, new RRMoCItemProviderKittyBedLightBlue());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Light Blue Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Light Blue Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedLightBlue) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
