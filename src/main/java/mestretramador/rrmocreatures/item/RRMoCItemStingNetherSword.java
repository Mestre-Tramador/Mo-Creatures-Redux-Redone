package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCStingSwordItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStingNetherSword;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nether Sting Sword item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStingNetherSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nether Sting Sword.                            
    */                                                                               
   public RRMoCItemStingNetherSword()                                                         
   {                                                                                 
       super(Constants.Items.STING_NETHER_SWORD, new RRMoCItemProviderStingNetherSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nether Sting Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nether Sting Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {
        final int attackDamage = ((RRMoCItemProviderStingNetherSword) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderStingNetherSword) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderStingNetherSword) provider).provideProperties();
        
        setItem(new RRMoCStingSwordItemModel(attackDamage, attackSpeed, providerProperties)); 
   }                                                                                 
}                                                                                    
