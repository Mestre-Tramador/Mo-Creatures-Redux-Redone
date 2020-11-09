package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Essence of Light item provider.            
 *                                                              
 * @version 0.0.13                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderEssenceLight extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceLight 
    * Essence of Light}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.BREWING);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
