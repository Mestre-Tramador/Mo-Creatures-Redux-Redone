package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemScrollModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderScrollSale;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Scroll - Sale item.                                          
 *                                                                                   
 * @version 0.0.25                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemScrollSale extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Scroll - Sale.                            
    */                                                                               
   public RRMoCItemScrollSale()                                                         
   {                                                                                 
       super(Constants.Items.SCROLL_SALE, new RRMoCItemProviderScrollSale());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Scroll - Sale item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Scroll - Sale is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemScrollModel(((RRMoCItemProviderScrollSale) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
