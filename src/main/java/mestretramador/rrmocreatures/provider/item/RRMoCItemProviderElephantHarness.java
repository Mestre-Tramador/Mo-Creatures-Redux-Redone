package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Elephant Harness item provider.            
 *                                                              
 * @version 0.0.22                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderElephantHarness extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemElephantHarness 
    * Elephant Harness}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.TRANSPORTATION);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
