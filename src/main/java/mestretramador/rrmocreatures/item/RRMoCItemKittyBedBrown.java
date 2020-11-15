package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedBrown;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Brown Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedBrown extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Brown Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedBrown()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_BROWN, new RRMoCItemProviderKittyBedBrown());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Brown Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Brown Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedBrown) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
