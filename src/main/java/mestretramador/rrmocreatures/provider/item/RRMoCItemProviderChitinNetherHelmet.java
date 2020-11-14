package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Nether Chitin Helmet item provider.            
 *                                                              
 * @version 0.0.19                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderChitinNetherHelmet extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherHelmet 
    * Nether Chitin Helmet}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.COMBAT);  
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1); 
       PROPERTIES().isImmuneToFire();                 
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
