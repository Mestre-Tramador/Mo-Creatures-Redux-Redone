package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedPurple;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Purple Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedPurple extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Purple Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedPurple()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_PURPLE, new RRMoCItemProviderKittyBedPurple());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Purple Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Purple Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedPurple) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
