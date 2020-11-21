package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderEggHatchable;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Egg Hatchable item.                                          
 *                                                                                   
 * @version 0.0.23                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemEggHatchable extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Egg Hatchable.                            
    */                                                                               
   public RRMoCItemEggHatchable()                                                         
   {                                                                                 
       super(Constants.Items.EGG_HATCHABLE, new RRMoCItemProviderEggHatchable());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Egg Hatchable item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Egg Hatchable is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderEggHatchable) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
