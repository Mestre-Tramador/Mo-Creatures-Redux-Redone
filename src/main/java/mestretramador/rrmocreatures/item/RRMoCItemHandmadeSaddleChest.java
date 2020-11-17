package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeSaddleChest;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Saddlebag item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeSaddleChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Saddlebag.                            
    */                                                                               
   public RRMoCItemHandmadeSaddleChest()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_SADDLE_CHEST, new RRMoCItemProviderHandmadeSaddleChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Saddlebag item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Saddlebag is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderHandmadeSaddleChest) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
