package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Handmade Leather Mount Armor item provider.            
 *                                                              
 * @version 0.028                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderHandmadeMountArmorLeather extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorLeather 
    * Handmade Leather Mount Armor}.                                                  
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
