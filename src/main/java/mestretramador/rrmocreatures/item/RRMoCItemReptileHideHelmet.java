package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderReptileHideHelmet;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Reptile Hide Helmet item.                                          
 *                                                                                   
 * @version 0.0.10                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemReptileHideHelmet extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Reptile Hide Helmet.                            
    */                                                                               
   public RRMoCItemReptileHideHelmet()                                                         
   {                                                                                 
       super(Constants.Items.REPTILE_HIDE_HELMET, new RRMoCItemProviderReptileHideHelmet());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Reptile Hide Helmet item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Reptile Hide Helmet is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderReptileHideHelmet) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
