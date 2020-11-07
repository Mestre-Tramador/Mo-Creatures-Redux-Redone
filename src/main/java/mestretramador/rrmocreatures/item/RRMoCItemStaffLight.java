package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStaffLight;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Staff - Light item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStaffLight extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Staff - Light.                            
    */                                                                               
   public RRMoCItemStaffLight()                                                         
   {                                                                                 
       super(Constants.Items.STAFF_LIGHT, new RRMoCItemProviderStaffLight());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Staff - Light item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Staff - Light is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderStaffLight) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
