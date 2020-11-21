package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderUnicornHorn;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Unicorn Horn item.                                          
 *                                                                                   
 * @version 0.0.23                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemUnicornHorn extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Unicorn Horn.                            
    */                                                                               
   public RRMoCItemUnicornHorn()                                                         
   {                                                                                 
       super(Constants.Items.UNICORN_HORN, new RRMoCItemProviderUnicornHorn());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Unicorn Horn item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Unicorn Horn is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderUnicornHorn) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
