package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinNetherBoots;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nether Chitin Boots item.                                          
 *                                                                                   
 * @version 0.0.10                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinNetherBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nether Chitin Boots.                            
    */                                                                               
   public RRMoCItemChitinNetherBoots()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_NETHER_BOOTS, new RRMoCItemProviderChitinNetherBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nether Chitin Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nether Chitin Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinNetherBoots) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
