package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Egg Hatchable item provider.            
 *                                                              
 * @version 0.0.27                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderEggHatchable extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemEggHatchable 
    * Egg Hatchable}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(null);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(16);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
