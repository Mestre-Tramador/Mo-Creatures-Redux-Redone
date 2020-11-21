package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCElephantTusksItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderElephantTusksDiamond;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Diamond Elephant Tusk Sword item.                                          
 *                                                                                   
 * @version 0.0.23                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemElephantTusksDiamond extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Diamond Elephant Tusk Sword.                            
    */                                                                               
   public RRMoCItemElephantTusksDiamond()                                                         
   {                                                                                 
       super(Constants.Items.ELEPHANT_TUSKS_DIAMOND, new RRMoCItemProviderElephantTusksDiamond());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Diamond Elephant Tusk Sword item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Diamond Elephant Tusk Sword is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {         
        final int attackDamage = ((RRMoCItemProviderElephantTusksDiamond) provider).provideAttackDamage();
        final float attackSpeed = ((RRMoCItemProviderElephantTusksDiamond) provider).provideAttackSpeed();
        final Item.Properties providerProperties = ((RRMoCItemProviderElephantTusksDiamond) provider).provideProperties();

        setItem(new RRMoCElephantTusksItemModel(attackDamage, attackSpeed, providerProperties));
   }                                                                                 
}                                                                                    
