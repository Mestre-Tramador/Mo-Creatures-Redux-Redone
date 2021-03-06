package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Filled Ghost Amulet item provider.            
 *                                                              
 * @version 0.0.29                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderAmuletGhostFilled extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGhostFilled 
    * Filled Ghost Amulet}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {               
       PROPERTIES().group(null);                                             
       PROPERTIES().rarity(Rarity.UNCOMMON);      
       PROPERTIES().maxStackSize(1);
       PROPERTIES().isImmuneToFire();                
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
