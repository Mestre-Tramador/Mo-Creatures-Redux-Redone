package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinDirtLegs;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dirt Chitin Legs item.                                          
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinDirtLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dirt Chitin Legs.                            
    */                                                                               
   public RRMoCItemChitinDirtLegs()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_DIRT_LEGS, new RRMoCItemProviderChitinDirtLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dirt Chitin Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dirt Chitin Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinDirtLegs) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
