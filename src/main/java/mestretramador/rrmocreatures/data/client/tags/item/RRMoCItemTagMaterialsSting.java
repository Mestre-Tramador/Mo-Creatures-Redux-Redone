package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Sting Materials Tag's Items.                                  
 *                                                                                  
 * @version 0.0.23                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagMaterialsSting extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Sting Materials tag.                        
     */                                                                             
    public RRMoCItemTagMaterialsSting()                                                    
    {                                                                               
        super(Tags.Items.MATERIALS_STING);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#MATERIALS_STING Sting Materials item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemStingDark Dark Sting}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemStingDirt Dirt Sting}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemStingFrost Frost Sting}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemStingNether Nether Sting}</li>                                           
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.STING_DARK.returnAsItem());                                                  
        ITEMS.add(RegisterItem.STING_DIRT.returnAsItem());
        ITEMS.add(RegisterItem.STING_FROST.returnAsItem());
        ITEMS.add(RegisterItem.STING_NETHER.returnAsItem());
    }                                                                               
}                                                                                   
