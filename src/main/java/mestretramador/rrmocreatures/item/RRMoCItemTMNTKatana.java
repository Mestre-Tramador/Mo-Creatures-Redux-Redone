package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCTMNTWeaponItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTMNTKatana;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Katana item.                                          
 *                                                                                   
 * @version 0.0.25                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTMNTKatana extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Katana.                            
    */                                                                               
   public RRMoCItemTMNTKatana()                                                         
   {                                                                                 
       super(Constants.Items.TMNT_KATANA, new RRMoCItemProviderTMNTKatana());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Katana item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Katana is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {    
        final int attackDamage = ((RRMoCItemProviderTMNTKatana) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderTMNTKatana) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderTMNTKatana) provider).provideProperties();                                                                             
        
        setItem(new RRMoCTMNTWeaponItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
