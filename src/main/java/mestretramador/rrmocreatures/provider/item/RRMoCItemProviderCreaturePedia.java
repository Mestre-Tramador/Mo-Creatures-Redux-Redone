package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Creaturepedia item provider.            
 *                                                              
 * @version 0.0.20                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderCreaturePedia extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemCreaturePedia 
    * Creaturepedia}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.MISC);
       PROPERTIES().rarity(Rarity.COMMON);
       PROPERTIES().maxStackSize(1);                 
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
