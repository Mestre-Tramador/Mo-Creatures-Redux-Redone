package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStingFrostSword;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Frost Sting Sword item.                                          
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStingFrostSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Frost Sting Sword.                            
    */                                                                               
   public RRMoCItemStingFrostSword()                                                         
   {                                                                                 
       super(Constants.Items.STING_FROST_SWORD, new RRMoCItemProviderStingFrostSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Frost Sting Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Frost Sting Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderStingFrostSword) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
