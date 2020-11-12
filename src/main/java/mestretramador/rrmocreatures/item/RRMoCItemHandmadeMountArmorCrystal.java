package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeMountArmorCrystal;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Crystal Mount Armor item.                                          
 *                                                                                   
 * @version 0.0.17                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeMountArmorCrystal extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Crystal Mount Armor.                            
    */                                                                               
   public RRMoCItemHandmadeMountArmorCrystal()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_MOUNT_ARMOR_CRYSTAL, new RRMoCItemProviderHandmadeMountArmorCrystal());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Crystal Mount Armor item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Crystal Mount Armor is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderHandmadeMountArmorCrystal) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
