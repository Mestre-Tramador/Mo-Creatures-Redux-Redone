package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;
import mestretramador.rrmocreatures.util.VanillaIDs;

import net.minecraft.item.Item;                                      
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Wereables to Ride Tag's Items.                                  
 *                                                                                  
 * @version 0.0.12                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagWereablesRide extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Wereables to Ride tag.                            
     */                                                                             
    public RRMoCItemTagWereablesRide()                                                    
    {                                                                               
        super(Tags.Items.WEREABLES_RIDE);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#WEREABLES_RIDE Wereables to Ride item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade Saddle}</li>
     * <li><a href="https://minecraft.gamepedia.com/Saddle"> Minecraft's Saddle</a></li>
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.HANDMADE_SADDLE.returnAsItem());
        
        ITEMS.add(Item.getItemById(VanillaIDs.SADDLE.ID()));
    }                                                                               
}                                                                                   
