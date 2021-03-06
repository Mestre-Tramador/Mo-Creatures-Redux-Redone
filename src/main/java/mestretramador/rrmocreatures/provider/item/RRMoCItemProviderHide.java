package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;                      
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Hide item provider.            
 *                                                              
 * @version 0.0.29                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderHide extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemHide 
    * Hide}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.MATERIALS); 
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);                   
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
