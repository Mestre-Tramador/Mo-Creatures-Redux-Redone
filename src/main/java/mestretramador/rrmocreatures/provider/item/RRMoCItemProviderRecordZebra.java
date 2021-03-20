package mestretramador.rrmocreatures.provider.item;             
                                                                
import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;                      
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Music Disc - Zebra item provider.            
 *                                                              
 * @version 0.028                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderRecordZebra extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemRecordZebra 
    * Music Disc - Zebra}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.MISC);
       PROPERTIES().rarity(Rarity.RARE);
       PROPERTIES().maxStackSize(1);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
