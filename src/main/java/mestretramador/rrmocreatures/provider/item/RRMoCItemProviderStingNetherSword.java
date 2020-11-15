package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Nether Sting Sword item provider.            
 *                                                              
 * @version 0.0.21                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderStingNetherSword extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemStingNetherSword 
    * Nether Sting Sword}.                                                  
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
