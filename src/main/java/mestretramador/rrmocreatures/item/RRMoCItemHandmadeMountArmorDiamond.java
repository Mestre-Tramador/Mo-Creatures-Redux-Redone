package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderHandmadeMountArmorDiamond;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Handmade Diamond Mount Armor item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemHandmadeMountArmorDiamond extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Handmade Diamond Mount Armor.                            
    */                                                                               
   public RRMoCItemHandmadeMountArmorDiamond()                                                         
   {                                                                                 
       super(Constants.Items.HANDMADE_MOUNT_ARMOR_DIAMOND, new RRMoCItemProviderHandmadeMountArmorDiamond());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Handmade Diamond Mount Armor item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Handmade Diamond Mount Armor is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderHandmadeMountArmorDiamond) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
