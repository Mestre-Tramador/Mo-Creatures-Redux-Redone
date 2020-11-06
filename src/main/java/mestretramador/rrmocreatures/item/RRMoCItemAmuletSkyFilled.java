package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderAmuletSkyFilled;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Filled Sky Amulet item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemAmuletSkyFilled extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Filled Sky Amulet.                            
    */                                                                               
   public RRMoCItemAmuletSkyFilled()                                                         
   {                                                                                 
       super(Constants.Items.AMULET_SKY_FILLED, new RRMoCItemProviderAmuletSkyFilled());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Filled Sky Amulet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Filled Sky Amulet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderAmuletSkyFilled) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
