package mestretramador.rrmocreatures.data.client.tags.item;                               
                                                                                          
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; 
import mestretramador.rrmocreatures.util.Tags;                                            
                                                                                          
import net.minecraft.tags.ItemTags;                                                       
                                                                                          
/**                                                                                       
 * Mo'Creatures Redux&Redone Ogre Lair's Logs Minecraft Tag Append's.                             
 *                                                                                        
 * @version 0.0.20                                                                     
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                       
 */                                                                                       
public class RRMoCItemVanillaTagAppendOgreLairLogsThatBurn extends RRMoCItemTagAppendProvider          
{                                                                                         
    /**                                                                                   
     * Using the parent constructor, appends the Ogre Lair's Logs tag.                              
     */                                                                                   
    public RRMoCItemVanillaTagAppendOgreLairLogsThatBurn()                                             
    {                                                                                     
        super(ItemTags.LOGS_THAT_BURN, Tags.Items.OGRE_LAIR_LOGS);                                           
    }                                                                                     
}                                                                                         
