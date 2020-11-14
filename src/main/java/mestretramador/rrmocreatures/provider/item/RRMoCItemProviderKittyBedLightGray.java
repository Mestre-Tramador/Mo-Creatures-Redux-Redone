package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Light Gray Kitty Bed item provider.            
 *                                                              
 * @version 0.0.20                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderKittyBedLightGray extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedLightGray 
    * Light Gray Kitty Bed}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.DECORATIONS); 
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
