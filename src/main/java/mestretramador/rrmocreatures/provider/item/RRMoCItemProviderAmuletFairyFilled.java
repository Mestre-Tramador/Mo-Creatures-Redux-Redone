package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;                      
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Filled Fairy Amulet item provider.            
 *                                                              
 * @version 0.0.29                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderAmuletFairyFilled extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletFairyFilled 
    * Filled Fairy Amulet}.                                                  
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
