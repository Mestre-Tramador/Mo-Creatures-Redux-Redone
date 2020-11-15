package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantTusksIron;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Iron Elephant Tusk Sword item.                                          
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantTusksIron extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Iron Elephant Tusk Sword.                            
    */                                                                               
   public RRMoCItemElephantTusksIron()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_TUSKS_IRON, new RRMoCItemProviderElephantTusksIron());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Iron Elephant Tusk Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Iron Elephant Tusk Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderElephantTusksIron) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
