package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderScrollFreedom;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Scroll - Freedom item.                                          
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemScrollFreedom extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Scroll - Freedom.                            
    */                                                                               
   public RRMoCItemScrollFreedom()                                                         
   {                                                                                 
       super(Constants.Items.SCROLL_FREEDOM, new RRMoCItemProviderScrollFreedom());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Scroll - Freedom item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Scroll - Freedom is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderScrollFreedom) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
