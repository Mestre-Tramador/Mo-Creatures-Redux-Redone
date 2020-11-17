package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Staff - Light item provider.            
 *                                                              
 * @version 0.0.22                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderStaffLight extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemStaffLight 
    * Staff - Light}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.TOOLS);
       PROPERTIES().rarity(Rarity.RARE);  
       PROPERTIES().maxStackSize(1); 
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
