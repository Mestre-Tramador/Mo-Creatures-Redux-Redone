package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Dirt Chitin Legs item provider.            
 *                                                              
 * @version 0.0.16                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderChitinDirtLegs extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirtLegs 
    * Dirt Chitin Legs}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
      PROPERTIES().group(ItemGroup.COMBAT);
                                                                
      return PROPERTIES();                                       
   }                                                            
}                                                               
