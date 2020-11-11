package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderAmuletGuardian;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Guardian Amulet item.                                          
 *                                                                                   
 * @version 0.0.15                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemAmuletGuardian extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Guardian Amulet.                            
    */                                                                               
   public RRMoCItemAmuletGuardian()                                                         
   {                                                                                 
       super(Constants.Items.AMULET_GUARDIAN, new RRMoCItemProviderAmuletGuardian());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Guardian Amulet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Guardian Amulet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderAmuletGuardian) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
