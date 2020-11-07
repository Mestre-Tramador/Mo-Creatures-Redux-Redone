package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantTusksDiamond;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Diamond Elephant Tusk Sword item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantTusksDiamond extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Diamond Elephant Tusk Sword.                            
    */                                                                               
   public RRMoCItemElephantTusksDiamond()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_TUSKS_DIAMOND, new RRMoCItemProviderElephantTusksDiamond());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Diamond Elephant Tusk Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Diamond Elephant Tusk Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderElephantTusksDiamond) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
