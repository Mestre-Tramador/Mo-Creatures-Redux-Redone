package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderOstrichRaw;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Raw Ostrich item.                                          
 *                                                                                   
 * @version 0.0.29                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemOstrichRaw extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Raw Ostrich.                            
    */                                                                               
   public RRMoCItemOstrichRaw()                                                         
   {                                                                                 
       super(Constants.Items.OSTRICH_RAW, new RRMoCItemProviderOstrichRaw());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Raw Ostrich item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Raw Ostrich is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderOstrichRaw) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
