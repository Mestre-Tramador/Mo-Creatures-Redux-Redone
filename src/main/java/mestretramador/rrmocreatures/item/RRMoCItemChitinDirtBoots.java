package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDirtBoots;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dirt Chitin Boots item.                                          
 *                                                                                   
 * @version 0.0.15                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDirtBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dirt Chitin Boots.                            
    */                                                                               
   public RRMoCItemChitinDirtBoots()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DIRT_BOOTS, new RRMoCItemProviderChitinDirtBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dirt Chitin Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dirt Chitin Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinDirtBoots) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
