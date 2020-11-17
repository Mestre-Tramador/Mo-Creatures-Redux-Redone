package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCSwordItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderSharkTeethSword;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Shark Teeth Sword item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemSharkTeethSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Shark Teeth Sword.                            
    */                                                                               
   public RRMoCItemSharkTeethSword()                                                         
   {                                                                                 
       super(Constants.Items.SHARK_TEETH_SWORD, new RRMoCItemProviderSharkTeethSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Shark Teeth Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Shark Teeth Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {    
        final IItemTier tier = ((RRMoCItemProviderSharkTeethSword) provider).provideTier();
        final int attackDamage = ((RRMoCItemProviderSharkTeethSword) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderSharkTeethSword) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderSharkTeethSword) provider).provideProperties();                                                                             

        setItem(new RRMoCSwordItemModel(tier, attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
