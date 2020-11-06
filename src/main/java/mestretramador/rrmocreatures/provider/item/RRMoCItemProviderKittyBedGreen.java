package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Green Kitty Bed item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderKittyBedGreen extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedGreen 
    * Green Kitty Bed}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.group(ItemGroup.DECORATIONS);                    
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
