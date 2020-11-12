package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Cooked Turtle item provider.            
 *                                                              
 * @version 0.0.17                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderTurtleCooked extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemTurtleCooked 
    * Cooked Turtle}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.FOOD);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(64);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
