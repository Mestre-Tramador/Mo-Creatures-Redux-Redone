package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantMammothPlatform;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Songhua River Mammoth Platform item.                                          
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantMammothPlatform extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Songhua River Mammoth Platform.                            
    */                                                                               
   public RRMoCItemElephantMammothPlatform()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_MAMMOTH_PLATFORM, new RRMoCItemProviderElephantMammothPlatform());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Songhua River Mammoth Platform item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Songhua River Mammoth Platform is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderElephantMammothPlatform) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
