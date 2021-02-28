package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Nether Chitin item provider.            
 *                                                              
 * @version 0.0.27                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderChitinNether extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNether 
    * Nether Chitin}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.MATERIALS);  
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);
       PROPERTIES().isImmuneToFire();                  
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
