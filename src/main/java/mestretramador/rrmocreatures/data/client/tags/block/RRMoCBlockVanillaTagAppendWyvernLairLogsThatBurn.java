package mestretramador.rrmocreatures.data.client.tags.block;                                
                                                                                            
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; 
import mestretramador.rrmocreatures.util.Tags;                                              
                                                                                            
import net.minecraft.tags.BlockTags;                                                        
                                                                                            
/**                                                                                         
 * Mo'Creatures Redux&Redone Wyvern Lair's Logs Minecraft Tag Append's.                               
 *                                                                                          
 * @version 0.0.15                                                                       
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                         
 */                                                                                         
public class RRMoCBlockVanillaTagAppendWyvernLairLogsThatBurn extends RRMoCBlockTagAppendProvider          
{                                                                                           
    /**                                                                                     
     * Using the parent constructor, appends the Wyvern Lair's Logs tag.                                
     */                                                                                     
    public RRMoCBlockVanillaTagAppendWyvernLairLogsThatBurn()                                              
    {                                                                                       
        super(BlockTags.LOGS_THAT_BURN, Tags.Blocks.WYVERN_LAIR_LOGS);                                           
    }                                                                                       
}                                                                                           
