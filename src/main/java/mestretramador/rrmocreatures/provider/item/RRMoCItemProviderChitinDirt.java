package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Dirt Chitin item provider.            
 *                                                              
 * @version 0.0.21                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderChitinDirt extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirt 
    * Dirt Chitin}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.MATERIALS);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
