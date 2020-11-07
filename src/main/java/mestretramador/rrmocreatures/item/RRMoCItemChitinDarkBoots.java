package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDarkBoots;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dark Chitin Boots item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDarkBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dark Chitin Boots.                            
    */                                                                               
   public RRMoCItemChitinDarkBoots()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DARK_BOOTS, new RRMoCItemProviderChitinDarkBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dark Chitin Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dark Chitin Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinDarkBoots) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
