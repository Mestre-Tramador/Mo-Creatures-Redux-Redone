package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCTMNTWeaponItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTMNTSai;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Sai item.                                          
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemTMNTSai extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Sai.                            
    */                                                                               
   public RRMoCItemTMNTSai()                                                         
   {                                                                                 
       super(Constants.Items.TMNT_SAI, new RRMoCItemProviderTMNTSai());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Sai item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Sai is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                    
        final int attackDamage = ((RRMoCItemProviderTMNTSai) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderTMNTSai) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderTMNTSai) provider).provideProperties();   

        setItem(new RRMoCTMNTWeaponItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
