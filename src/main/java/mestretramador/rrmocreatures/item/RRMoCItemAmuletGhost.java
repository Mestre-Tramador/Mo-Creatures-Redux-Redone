package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderAmuletGhost;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Ghost Amulet item.                                          
 *                                                                                   
 * @version 0.0.13                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemAmuletGhost extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Ghost Amulet.                            
    */                                                                               
   public RRMoCItemAmuletGhost()                                                         
   {                                                                                 
       super(Constants.Items.AMULET_GHOST, new RRMoCItemProviderAmuletGhost());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Ghost Amulet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Ghost Amulet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderAmuletGhost) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
