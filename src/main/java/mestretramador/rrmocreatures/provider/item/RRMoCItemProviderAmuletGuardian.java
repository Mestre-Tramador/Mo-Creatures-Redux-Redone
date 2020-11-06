package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Guardian Amulet item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderAmuletGuardian extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGuardian 
    * Guardian Amulet}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.group(ItemGroup.TOOLS);                    
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
