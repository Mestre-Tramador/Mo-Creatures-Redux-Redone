package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderTMNTNunchaku;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Nunchaku item.                                          
 *                                                                                   
 * @version 0.0.11                                                                
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
       setItem(new Item(((RRMoCItemProviderTMNTNunchaku) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
