package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinNetherChest;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nether Chitin Chest item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinNetherChest extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nether Chitin Chest.                            
    */                                                                               
   public RRMoCItemChitinNetherChest()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_NETHER_CHEST, new RRMoCItemProviderChitinNetherChest());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nether Chitin Chest item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nether Chitin Chest is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinNetherChest) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
