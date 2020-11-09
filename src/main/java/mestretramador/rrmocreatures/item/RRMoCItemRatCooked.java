package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderRatCooked;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Cooked Rat item.                                          
 *                                                                                   
 * @version 0.0.13                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemRatCooked extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Cooked Rat.                            
    */                                                                               
   public RRMoCItemRatCooked()                                                         
   {                                                                                 
       super(Constants.Items.RAT_COOKED, new RRMoCItemProviderRatCooked());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Cooked Rat item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Cooked Rat is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderRatCooked) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
