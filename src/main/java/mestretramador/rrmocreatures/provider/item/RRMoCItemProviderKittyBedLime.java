package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Lime Kitty Bed item provider.            
 *                                                              
 * @version 0.0.29                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderKittyBedLime extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedLime 
    * Lime Kitty Bed}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.ANIMALSTUFF); 
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
