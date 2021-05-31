package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantIndianGarment;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Indian Elephant Garment item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantIndianGarment extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Indian Elephant Garment.                            
    */                                                                               
   public RRMoCItemElephantIndianGarment()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_INDIAN_GARMENT, new RRMoCItemProviderElephantIndianGarment());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Indian Elephant Garment item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Indian Elephant Garment is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderElephantIndianGarment) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
