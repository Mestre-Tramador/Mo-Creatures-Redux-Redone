package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Bo item provider.            
 *                                                              
 * @version 0.0.18                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderTMNTBo extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo 
    * Bo}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(ItemGroup.COMBAT);
       PROPERTIES().rarity(Rarity.UNCOMMON);
       PROPERTIES().maxStackSize(1); 
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
