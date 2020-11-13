package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderSharkTeeth;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Shark Teeth item.                                          
 *                                                                                   
 * @version 0.0.18                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemSharkTeeth extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Shark Teeth.                            
    */                                                                               
   public RRMoCItemSharkTeeth()                                                         
   {                                                                                 
       super(Constants.Items.SHARK_TEETH, new RRMoCItemProviderSharkTeeth());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Shark Teeth item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Shark Teeth is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderSharkTeeth) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
