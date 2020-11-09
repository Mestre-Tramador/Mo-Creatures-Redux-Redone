package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantChest;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Elephant Saddlebag item.                                          
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Elephant Saddlebag.                            
    */                                                                               
   public RRMoCItemElephantChest()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_CHEST, new RRMoCItemProviderElephantChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Elephant Saddlebag item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Elephant Saddlebag is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderElephantChest) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
