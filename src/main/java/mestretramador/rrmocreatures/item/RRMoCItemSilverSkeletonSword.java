package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCSwordItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderSilverSkeletonSword;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Silver Skeleton Sword item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemSilverSkeletonSword extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Silver Skeleton Sword.                            
    */                                                                               
   public RRMoCItemSilverSkeletonSword()                                                         
   {                                                                                 
       super(Constants.Items.SILVER_SKELETON_SWORD, new RRMoCItemProviderSilverSkeletonSword());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Silver Skeleton Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Silver Skeleton Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {          
        final IItemTier tier = ((RRMoCItemProviderSilverSkeletonSword) provider).provideTier();
        final int attackDamage = ((RRMoCItemProviderSilverSkeletonSword) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderSilverSkeletonSword) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderSilverSkeletonSword) provider).provideProperties();
    
        setItem(new RRMoCSwordItemModel(tier, attackDamage, attackSpeed, providerProperties)); 
   }                                                                                 
}                                                                                    
