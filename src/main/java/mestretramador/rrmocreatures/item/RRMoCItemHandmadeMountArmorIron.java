package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeMountArmorIron;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Iron Mount Armor item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeMountArmorIron extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Iron Mount Armor.                            
    */                                                                               
   public RRMoCItemHandmadeMountArmorIron()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_MOUNT_ARMOR_IRON, new RRMoCItemProviderHandmadeMountArmorIron());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Iron Mount Armor item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Iron Mount Armor is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderHandmadeMountArmorIron) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
