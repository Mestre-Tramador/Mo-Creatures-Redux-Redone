package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderEggHatchableOmelet;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Omelet item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemEggHatchableOmelet extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Omelet.                            
    */                                                                               
   public RRMoCItemEggHatchableOmelet()                                                         
   {                                                                                 
       super(Constants.Items.EGG_HATCHABLE_OMELET, new RRMoCItemProviderEggHatchableOmelet());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Omelet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Omelet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderEggHatchableOmelet) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
