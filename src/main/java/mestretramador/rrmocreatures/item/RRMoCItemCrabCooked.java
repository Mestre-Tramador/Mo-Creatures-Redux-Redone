package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderCrabCooked;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Cooked Crab item.                                          
 *                                                                                   
 * @version 0.0.25                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemCrabCooked extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Cooked Crab.                            
    */                                                                               
   public RRMoCItemCrabCooked()                                                         
   {                                                                                 
       super(Constants.Items.CRAB_COOKED, new RRMoCItemProviderCrabCooked());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Cooked Crab item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Cooked Crab is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderCrabCooked) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
