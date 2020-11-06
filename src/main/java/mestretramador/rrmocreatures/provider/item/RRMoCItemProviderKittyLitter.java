package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Kitty Litter item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderKittyLitter extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemKittyLitter 
    * Kitty Litter}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.group(ItemGroup.DECORATIONS);
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
