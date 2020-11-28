package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Blank Scroll item provider.            
 *                                                              
 * @version 0.0.24                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderScrollBlank extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemScrollBlank 
    * Blank Scroll}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.MISC);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(16);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
