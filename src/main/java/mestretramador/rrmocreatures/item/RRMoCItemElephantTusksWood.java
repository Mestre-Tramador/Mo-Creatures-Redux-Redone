package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCElephantTusksItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantTusksWood;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wood Elephant Tusk Sword item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantTusksWood extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Wood Elephant Tusk Sword.                            
    */                                                                               
   public RRMoCItemElephantTusksWood()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_TUSKS_WOOD, new RRMoCItemProviderElephantTusksWood());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Wood Elephant Tusk Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Wood Elephant Tusk Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
        final int attackDamage = ((RRMoCItemProviderElephantTusksWood) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderElephantTusksWood) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderElephantTusksWood) provider).provideProperties();

        setItem(new RRMoCElephantTusksItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
