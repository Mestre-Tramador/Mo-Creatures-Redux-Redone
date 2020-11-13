package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedOrange;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Orange Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.18                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedOrange extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Orange Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedOrange()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_ORANGE, new RRMoCItemProviderKittyBedOrange());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Orange Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Orange Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedOrange) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
