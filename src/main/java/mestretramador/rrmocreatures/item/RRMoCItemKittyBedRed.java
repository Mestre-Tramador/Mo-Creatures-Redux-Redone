package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedRed;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Red Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.10                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedRed extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Red Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedRed()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_RED, new RRMoCItemProviderKittyBedRed());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Red Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Red Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderKittyBedRed) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
