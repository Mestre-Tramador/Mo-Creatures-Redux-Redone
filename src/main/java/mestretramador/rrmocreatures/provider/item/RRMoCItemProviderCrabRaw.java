package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Raw Crab item provider.            
 *                                                              
 * @version 0.0.15                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderCrabRaw extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemCrabRaw 
    * Raw Crab}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.FOOD);
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
