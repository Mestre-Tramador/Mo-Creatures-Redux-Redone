package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCTMNTWeaponItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTMNTNunchaku;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nunchaku item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTMNTNunchaku extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Nunchaku.                            
    */                                                                               
   public RRMoCItemTMNTNunchaku()                                                         
   {                                                                                 
       super(Constants.Items.TMNT_NUNCHAKU, new RRMoCItemProviderTMNTNunchaku());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Nunchaku item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Nunchaku is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {       
        final int attackDamage = ((RRMoCItemProviderTMNTNunchaku) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderTMNTNunchaku) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderTMNTNunchaku) provider).provideProperties();   

        setItem(new RRMoCTMNTWeaponItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
