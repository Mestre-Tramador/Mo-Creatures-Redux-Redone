package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderKittyFood;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Kitty Food item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemKittyFood extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Kitty Food.                            
    */                                                                               
   public RRMoCItemKittyFood()                                                         
   {                                                                                 
       super(Constants.Items.KITTY_FOOD, new RRMoCItemProviderKittyFood());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Kitty Food item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Kitty Food is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderKittyFood) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
