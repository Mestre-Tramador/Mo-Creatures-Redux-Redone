package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHeartUndead;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Heart of the Undead item.                                          
 *                                                                                   
 * @version 0.0.13                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHeartUndead extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Heart of the Undead.                            
    */                                                                               
   public RRMoCItemHeartUndead()                                                         
   {                                                                                 
       super(Constants.Items.HEART_UNDEAD, new RRMoCItemProviderHeartUndead());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Heart of the Undead item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Heart of the Undead is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderHeartUndead) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
