package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Hide Helmet item provider.            
 *                                                              
 * @version 0.0.17                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderHideHelmet extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemHideHelmet 
    * Hide Helmet}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.COMBAT); 
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                                        
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
