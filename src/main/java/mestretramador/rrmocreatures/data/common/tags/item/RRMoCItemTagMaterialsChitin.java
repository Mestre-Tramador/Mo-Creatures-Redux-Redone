package mestretramador.rrmocreatures.data.common.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.common.provider.tags.item.RRMoCItemTagProvider;
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Chitin Materials Tag's Items.                                  
 *                                                                                  
 * @version 0.0.29                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagMaterialsChitin extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Chitin Materials tag.                        
     */                                                                             
    public RRMoCItemTagMaterialsChitin()                                                    
    {                                                                               
        super(Tags.Items.MATERIALS_CHITIN);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#MATERIALS_CHITIN Chitin Materials item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemChitinDark Dark Chitin}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirt Dirt Chitin}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrost Frost Chitin}</li>                                           
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemChitinNether Nether Chitin}</li>  
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.CHITIN_DARK.returnAsItem());
        ITEMS.add(RegisterItem.CHITIN_DIRT.returnAsItem());
        ITEMS.add(RegisterItem.CHITIN_FROST.returnAsItem());
        ITEMS.add(RegisterItem.CHITIN_NETHER.returnAsItem());
    }                                                                               
}                                                                                   
