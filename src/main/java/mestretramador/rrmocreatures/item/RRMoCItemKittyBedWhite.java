package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedWhite;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone White Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedWhite extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a White Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedWhite()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_WHITE, new RRMoCItemProviderKittyBedWhite());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a White Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the White Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderKittyBedWhite) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
