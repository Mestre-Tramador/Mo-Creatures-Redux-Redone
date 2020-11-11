package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderEssenceDarkness;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Essence of Darkness item.                                          
 *                                                                                   
 * @version 0.0.16                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemEssenceDarkness extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Essence of Darkness.                            
    */                                                                               
   public RRMoCItemEssenceDarkness()                                                         
   {                                                                                 
       super(Constants.Items.ESSENCE_DARKNESS, new RRMoCItemProviderEssenceDarkness());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Essence of Darkness item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Essence of Darkness is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderEssenceDarkness) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
