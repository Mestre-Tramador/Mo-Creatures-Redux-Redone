package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantHarness;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Elephant Harness item.                                          
 *                                                                                   
 * @version 0.0.16                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantHarness extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Elephant Harness.                            
    */                                                                               
   public RRMoCItemElephantHarness()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_HARNESS, new RRMoCItemProviderElephantHarness());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Elephant Harness item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Elephant Harness is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderElephantHarness) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
