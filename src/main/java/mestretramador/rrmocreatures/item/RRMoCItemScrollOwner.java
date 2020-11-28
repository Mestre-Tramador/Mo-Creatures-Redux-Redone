package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemScrollModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderScrollOwner;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Scroll - Owner item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemScrollOwner extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Scroll - Owner.                            
    */                                                                               
   public RRMoCItemScrollOwner()                                                         
   {                                                                                 
       super(Constants.Items.SCROLL_OWNER, new RRMoCItemProviderScrollOwner());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Scroll - Owner item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Scroll - Owner is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemScrollModel(((RRMoCItemProviderScrollOwner) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
