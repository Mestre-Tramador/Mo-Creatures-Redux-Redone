package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCStingSwordItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStingDarkSword;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dark Sting Sword item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStingDarkSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dark Sting Sword.                            
    */                                                                               
   public RRMoCItemStingDarkSword()                                                         
   {                                                                                 
       super(Constants.Items.STING_DARK_SWORD, new RRMoCItemProviderStingDarkSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dark Sting Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dark Sting Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                              
        final int attackDamage = ((RRMoCItemProviderStingDarkSword) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderStingDarkSword) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderStingDarkSword) provider).provideProperties();

        setItem(new RRMoCStingSwordItemModel(attackDamage, attackSpeed, providerProperties)); 
   }                                                                                 
}                                                                                    
