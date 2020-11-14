package mestretramador.rrmocreatures.provider.item;             
                                                                
import net.minecraft.item.Rarity;
import net.minecraft.item.Item.Properties;                      
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Filled Bone Amulet item provider.            
 *                                                              
 * @version 0.0.20                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderAmuletBoneFilled extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletBoneFilled 
    * Filled Bone Amulet}.                                                  
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
