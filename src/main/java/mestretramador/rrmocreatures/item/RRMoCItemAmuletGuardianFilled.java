package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderAmuletGuardianFilled;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Filled Guardian Amulet item.                                          
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemAmuletGuardianFilled extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Filled Guardian Amulet.                            
    */                                                                               
   public RRMoCItemAmuletGuardianFilled()                                                         
   {                                                                                 
       super(Constants.Items.AMULET_GUARDIAN_FILLED, new RRMoCItemProviderAmuletGuardianFilled());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Filled Guardian Amulet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Filled Guardian Amulet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderAmuletGuardianFilled) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
