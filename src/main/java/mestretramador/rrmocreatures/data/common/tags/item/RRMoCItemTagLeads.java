package mestretramador.rrmocreatures.data.common.tags.item;                              
                                                                                         
import mestretramador.rrmocreatures.data.common.provider.tags.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                                   
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Items;                                           
                                                                                         
/**                                                                                      
 * Mo'Creatures Redux&Redone Leads Tag's Items.                                       
 *                                                                                       
 * @version 0.0.29                                                                    
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                      
 */                                                                                      
public class RRMoCItemTagLeads extends RRMoCItemTagProvider                            
{                                                                                        
    /**                                                                                  
     * Using the parent constructor, creates the Leads tag.                             
     */                                                                                  
    public RRMoCItemTagLeads()                                                         
    {                                                                                    
        super(Tags.Items.LEADS);                                                          
    }                                                                                    
                                                                                         
    /**                                                                                  
     * <p>                                                                             
     * The setter sets the {@link Tags.Items#LEADS Leads item                            
     * tag} to the below items:                                                          
     * </p>                                                                            
     * <ul>                                                                            
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeLead Handmade Lead}</li>
     * <li>{@link net.minecraft.item.Items#LEAD Minecraft's Lead}</li>                                 
     * </ul>                                                                           
     */                                                                                  
    @Override                                                                            
    protected void setItemsToTag()                                                       
    {                                                                                    
        ITEMS.add(RegisterItem.HANDMADE_LEAD.returnAsItem());

        ITEMS.add(Items.LEAD);
    }                                                                                    
}                                                                                        
