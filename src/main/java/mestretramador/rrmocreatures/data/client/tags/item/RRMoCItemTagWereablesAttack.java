package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Wereables to Attack Tag's Items.                                  
 *                                                                                  
 * @version 0.0.23                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagWereablesAttack extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Wereables to Attack tag.                            
     */                                                                             
    public RRMoCItemTagWereablesAttack()                                                    
    {                                                                               
        super(Tags.Items.WEREABLES_ATTACK);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#WEREABLES_ATTACK Wereables to Attack item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond Diamond Elephant Tusk Sword}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksIron Iron Elephant Tusk Sword}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood Elephant Tusk Sword}</li>
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                                                                 
        ITEMS.add(RegisterItem.ELEPHANT_TUSKS_DIAMOND.returnAsItem());
        ITEMS.add(RegisterItem.ELEPHANT_TUSKS_IRON.returnAsItem());
        ITEMS.add(RegisterItem.ELEPHANT_TUSKS_WOOD.returnAsItem());
    }                                                                               
}                                                                                   
