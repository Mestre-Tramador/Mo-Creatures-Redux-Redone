package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCStingSwordItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStingDirtSword;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Dirt Sting Sword item.                                          
 *                                                                                   
 * @version 0.0.23                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStingDirtSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Dirt Sting Sword.                            
    */                                                                               
   public RRMoCItemStingDirtSword()                                                         
   {                                                                                 
       super(Constants.Items.STING_DIRT_SWORD, new RRMoCItemProviderStingDirtSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Dirt Sting Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Dirt Sting Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                           
        final int attackDamage = ((RRMoCItemProviderStingDirtSword) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderStingDirtSword) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderStingDirtSword) provider).provideProperties();

        setItem(new RRMoCStingSwordItemModel(attackDamage, attackSpeed, providerProperties)); 
   }                                                                                 
}                                                                                    
