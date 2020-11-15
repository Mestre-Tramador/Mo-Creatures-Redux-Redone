package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Reptile Hide Boots item provider.            
 *                                                              
 * @version 0.0.21                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderReptileHideBoots extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHideBoots 
    * Reptile Hide Boots}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.COMBAT);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                                         
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
