package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;                      
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Medallion item provider.            
 *                                                              
 * @version 0.028                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderMedallion extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemMedallion 
    * Medallion}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.TOOLS);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
