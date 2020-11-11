package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Handmade Leather Mount Armor item provider.            
 *                                                              
 * @version 0.0.15                                           
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
       PROPERTIES().group(ItemGroup.TRANSPORTATION);                    
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
