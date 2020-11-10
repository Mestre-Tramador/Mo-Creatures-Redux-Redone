package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeMountArmorGold;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Gold Mount Armor item.                                          
 *                                                                                   
 * @version 0.0.14                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeMountArmorGold extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Gold Mount Armor.                            
    */                                                                               
   public RRMoCItemHandmadeMountArmorGold()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_MOUNT_ARMOR_GOLD, new RRMoCItemProviderHandmadeMountArmorGold());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Gold Mount Armor item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Gold Mount Armor is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderHandmadeMountArmorGold) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
