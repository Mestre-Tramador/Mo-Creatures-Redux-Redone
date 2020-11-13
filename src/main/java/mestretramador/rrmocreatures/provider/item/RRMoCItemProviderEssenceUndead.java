package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Essence of the Undead item provider.            
 *                                                              
 * @version 0.0.18                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderEssenceUndead extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceUndead 
    * Essence of the Undead}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.BREWING);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                     
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
