package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderBigCatClaw;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone BigCat Claw item.                                          
 *                                                                                   
 * @version 0.0.17                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemBigCatClaw extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a BigCat Claw.                            
    */                                                                               
   public RRMoCItemBigCatClaw()                                                         
   {                                                                                 
       super(Constants.Items.BIGCAT_CLAW, new RRMoCItemProviderBigCatClaw());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a BigCat Claw item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the BigCat Claw is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderBigCatClaw) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
