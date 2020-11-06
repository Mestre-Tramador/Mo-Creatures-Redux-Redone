package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeMountArmorLeather;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Leather Mount Armor item.                                          
 *                                                                                   
 * @version 0.0.9                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeMountArmorLeather extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Leather Mount Armor.                            
    */                                                                               
   public RRMoCItemHandmadeMountArmorLeather()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_MOUNT_ARMOR_LEATHER, new RRMoCItemProviderHandmadeMountArmorLeather());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Leather Mount Armor item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Leather Mount Armor is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderHandmadeMountArmorLeather) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
