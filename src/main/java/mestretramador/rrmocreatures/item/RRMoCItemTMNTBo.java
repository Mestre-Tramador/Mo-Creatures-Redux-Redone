package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCTMNTWeaponItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTMNTBo;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Bo item.                                          
 *                                                                                   
 * @version 0.0.22                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTMNTBo extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Bo.                            
    */                                                                               
   public RRMoCItemTMNTBo()                                                         
   {                                                                                 
       super(Constants.Items.TMNT_BO, new RRMoCItemProviderTMNTBo());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Bo item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Bo is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                         
        final int attackDamage = ((RRMoCItemProviderTMNTBo) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderTMNTBo) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderTMNTBo) provider).provideProperties();

        setItem(new RRMoCTMNTWeaponItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
