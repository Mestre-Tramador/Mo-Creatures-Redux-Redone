package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Wereables for Storage Tag's Items.                                  
 *                                                                                  
 * @version 0.0.17                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagWereablesStorage extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Wereables for Storage tag.                            
     */                                                                             
    public RRMoCItemTagWereablesStorage()                                                    
    {                                                                               
        super(Tags.Items.WEREABLES_STORAGE);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#WEREABLES_STORAGE Wereables for Storage item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemElephantChest Elephant Saddlebag}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddleChest Handmade Saddlebag}</li>
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.ELEPHANT_CHEST.returnAsItem());
        ITEMS.add(RegisterItem.HANDMADE_SADDLE_CHEST.returnAsItem());
    }                                                                               
}                                                                                   
