package mestretramador.rrmocreatures.provider.item;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
                                                                
/**                                                             
 * Mo'Creatures Redux&Redone Scroll - Sale item provider.            
 *                                                              
 * @version 0.0.29                                           
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                             
 */                                                             
public class RRMoCItemProviderScrollSale extends RRMoCItemProvider 
{                                                               
   /**                                                          
    * Return the properties of                                  
    * {@link mestretramador.rrmocreatures.item.RRMoCItemScrollSale 
    * Scroll - Sale}.                                                  
    */                                                          
   @Override                                                    
   public Properties provideProperties()                        
   {                                                            
       PROPERTIES().group(Tabs.MAGIC);
       PROPERTIES().rarity(Rarity.RARE);
       PROPERTIES().maxStackSize(1);                   
                                                                
       return PROPERTIES();                                       
   }                                                            
}                                                               
