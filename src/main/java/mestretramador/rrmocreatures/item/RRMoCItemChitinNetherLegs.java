package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinNetherLegs;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nether Chitin Legs item.                                          
 *                                                                                   
 * @version 0.0.15                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinNetherLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nether Chitin Legs.                            
    */                                                                               
   public RRMoCItemChitinNetherLegs()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_NETHER_LEGS, new RRMoCItemProviderChitinNetherLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nether Chitin Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nether Chitin Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinNetherLegs) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
