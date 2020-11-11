package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantIndianHowdah;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Indian Elephant Howdah item.                                          
 *                                                                                   
 * @version 0.0.15                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantIndianHowdah extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Indian Elephant Howdah.                            
    */                                                                               
   public RRMoCItemElephantIndianHowdah()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_INDIAN_HOWDAH, new RRMoCItemProviderElephantIndianHowdah());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Indian Elephant Howdah item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Indian Elephant Howdah is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderElephantIndianHowdah) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
