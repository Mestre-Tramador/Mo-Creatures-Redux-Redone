package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Reptile Hide item provider.            
 *                                                              
 * @version 0.0.22                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderReptileHide extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHide 
    * Reptile Hide}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.MATERIALS);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
