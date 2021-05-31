package mestretramador.rrmocreatures.data.common.tags.item;                              
                                                                                         
import mestretramador.rrmocreatures.data.common.provider.tags.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                                   
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Items;                                           
                                                                                         
/**                                                                                      
 * Mo'Creatures Redux&Redone Chests Tag's Items.                                       
 *                                                                                       
 * @version 0.0.29                                                                    
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                      
 */                                                                                      
public class RRMoCItemTagChests extends RRMoCItemTagProvider                            
{                                                                                        
    /**                                                                                  
     * Using the parent constructor, creates the Chests tag.                             
     */                                                                                  
    public RRMoCItemTagChests()                                                         
    {                                                                                    
        super(Tags.Items.CHESTS);                                                          
    }                                                                                    
                                                                                         
    /**                                                                                  
     * <p>                                                                             
     * The setter sets the {@link Tags.Items#CHESTS Chests item                            
     * tag} to the below items:                                                          
     * </p>                                                                            
     * <ul>                                                                            
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddleChest Handmade Saddlebag}</li>                                                
     * <li>{@link net.minecraft.item.Items#CHEST Minecraft's Chest}</li>                                                
     * </ul>                                                                           
     */                                                                                  
    @Override                                                                            
    protected void setItemsToTag()                                                       
    {                                                                                    
        ITEMS.add(RegisterItem.HANDMADE_SADDLE_CHEST.returnAsItem());

        ITEMS.add(Items.CHEST);
    }                                                                                    
}                                                                                        
