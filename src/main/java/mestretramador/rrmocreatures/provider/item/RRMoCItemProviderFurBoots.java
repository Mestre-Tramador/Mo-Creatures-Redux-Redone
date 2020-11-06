package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Fur Boots item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderFurBoots extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemFurBoots 
    * Fur Boots}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.group(ItemGroup.COMBAT);                    
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
