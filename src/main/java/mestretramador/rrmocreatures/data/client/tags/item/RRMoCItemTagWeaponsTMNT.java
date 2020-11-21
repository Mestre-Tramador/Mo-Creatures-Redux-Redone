package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone TMNT Weapons Tag's Items.                                  
 *                                                                                  
 * @version 0.0.23                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagWeaponsTMNT extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the TMNT Weapons tag.                            
     */                                                                             
    public RRMoCItemTagWeaponsTMNT()                                                    
    {                                                                               
        super(Tags.Items.WEAPONS_TMNT);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#WEAPONS_TMNT TMNT Weapons item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemTMNTKatana Katana}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemTMNTNunchaku Nunchaku}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemTMNTSai Sai}</li>
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.TMNT_BO.returnAsItem());                                                 
        ITEMS.add(RegisterItem.TMNT_KATANA.returnAsItem());                                                 
        ITEMS.add(RegisterItem.TMNT_NUNCHAKU.returnAsItem());                                                 
        ITEMS.add(RegisterItem.TMNT_SAI.returnAsItem());                                                 
    }                                                                               
}                                                                                   
