package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinFrostLegs;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Frost Chitin Legs item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinFrostLegs extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Frost Chitin Legs.                            
    */                                                                               
   public RRMoCItemChitinFrostLegs()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_FROST_LEGS, new RRMoCItemProviderChitinFrostLegs());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Frost Chitin Legs item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Frost Chitin Legs is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinFrostLegs) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
