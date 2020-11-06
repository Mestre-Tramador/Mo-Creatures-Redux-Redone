package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Filled Fish Net item provider.            
 *                                                              
 * @version 0.0.9                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderFishNetFilled extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemFishNetFilled 
    * Filled Fish Net}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES.rarity(Rarity.UNCOMMON);
                                                                
       return PROPERTIES;                                       
   }                                                            
}                                                               
