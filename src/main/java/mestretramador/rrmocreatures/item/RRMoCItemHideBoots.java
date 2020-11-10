package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHideBoots;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Hide Boots item.                                          
 *                                                                                   
 * @version 0.0.14                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHideBoots extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Hide Boots.                            
    */                                                                               
   public RRMoCItemHideBoots()                                                         
   {                                                                                 
       super(Constants.Items.HIDE_BOOTS, new RRMoCItemProviderHideBoots());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Hide Boots item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Hide Boots is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderHideBoots) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
