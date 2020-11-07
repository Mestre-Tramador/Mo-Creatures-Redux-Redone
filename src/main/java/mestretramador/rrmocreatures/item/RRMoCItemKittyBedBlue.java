package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyBedBlue;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Blue Kitty Bed item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyBedBlue extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Blue Kitty Bed.                            
    */                                                                               
   public RRMoCItemKittyBedBlue()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_BED_BLUE, new RRMoCItemProviderKittyBedBlue());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Blue Kitty Bed item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Blue Kitty Bed is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderKittyBedBlue) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
