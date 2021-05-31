package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemEssenceModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderEssenceFire;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Essence of Fire item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemEssenceFire extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Essence of Fire.                            
    */                                                                               
   public RRMoCItemEssenceFire()                                                         
   {                                                                                 
       super(Constants.Items.ESSENCE_FIRE, new RRMoCItemProviderEssenceFire());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Essence of Fire item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Essence of Fire is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemEssenceModel(((RRMoCItemProviderEssenceFire) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
