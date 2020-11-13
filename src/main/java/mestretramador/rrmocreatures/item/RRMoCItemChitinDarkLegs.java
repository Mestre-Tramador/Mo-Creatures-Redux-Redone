package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDarkLegs;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dark Chitin Legs item.                                          
 *                                                                                   
 * @version 0.0.18                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDarkLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dark Chitin Legs.                            
    */                                                                               
   public RRMoCItemChitinDarkLegs()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DARK_LEGS, new RRMoCItemProviderChitinDarkLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dark Chitin Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dark Chitin Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderChitinDarkLegs) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
