package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemFoodModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTurtleCookedSoup;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Turtle Soup item.                                          
 *                                                                                   
 * @version 0.0.27                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTurtleCookedSoup extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Turtle Soup.                            
    */                                                                               
   public RRMoCItemTurtleCookedSoup()                                                         
   {                                                                                 
       super(Constants.Items.TURTLE_COOKED_SOUP, new RRMoCItemProviderTurtleCookedSoup());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Turtle Soup item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Turtle Soup is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemFoodModel(((RRMoCItemProviderTurtleCookedSoup) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
