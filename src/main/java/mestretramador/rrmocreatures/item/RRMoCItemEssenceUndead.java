package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemEssenceModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderEssenceUndead;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Essence of the Undead item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemEssenceUndead extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Essence of the Undead.                            
    */                                                                               
   public RRMoCItemEssenceUndead()                                                         
   {                                                                                 
       super(Constants.Items.ESSENCE_UNDEAD, new RRMoCItemProviderEssenceUndead());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Essence of the Undead item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Essence of the Undead is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemEssenceModel(((RRMoCItemProviderEssenceUndead) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
