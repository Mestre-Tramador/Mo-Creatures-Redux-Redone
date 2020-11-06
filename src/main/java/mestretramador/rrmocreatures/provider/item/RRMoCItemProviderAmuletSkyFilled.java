package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Filled Sky Amulet item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderAmuletSkyFilled extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletSkyFilled 
    * Filled Sky Amulet}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.rarity(Rarity.UNCOMMON);
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
