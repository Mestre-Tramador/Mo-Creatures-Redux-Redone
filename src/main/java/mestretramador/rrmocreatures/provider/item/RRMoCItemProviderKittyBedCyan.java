package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Cyan Kitty Bed item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderKittyBedCyan extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedCyan 
    * Cyan Kitty Bed}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.group(ItemGroup.DECORATIONS);                 
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
