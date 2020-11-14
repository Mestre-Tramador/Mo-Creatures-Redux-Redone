package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderStaffEnder;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Staff - Ender item.                                          
 *                                                                                   
 * @version 0.0.20                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemStaffEnder extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Staff - Ender.                            
    */                                                                               
   public RRMoCItemStaffEnder()                                                         
   {                                                                                 
       super(Constants.Items.STAFF_ENDER, new RRMoCItemProviderStaffEnder());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Staff - Ender item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Staff - Ender is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderStaffEnder) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
