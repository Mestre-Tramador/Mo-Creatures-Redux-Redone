package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderChitinFrostBoots;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Frost Chitin Boots item.                                          
 *                                                                                   
 * @version 0.0.14                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemChitinFrostBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Frost Chitin Boots.                            
    */                                                                               
   public RRMoCItemChitinFrostBoots()                                                         
   {                                                                                 
       super(Constants.Items.CHITIN_FROST_BOOTS, new RRMoCItemProviderChitinFrostBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Frost Chitin Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Frost Chitin Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderChitinFrostBoots) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
