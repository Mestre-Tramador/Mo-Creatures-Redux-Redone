package mestretramador.rrmocreatures.data.common.tags.block;                                
                                                                                            
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagAppendProvider;
import mestretramador.rrmocreatures.util.Tags;                                              
                                                                                            
import net.minecraft.tags.BlockTags;                                                        
                                                                                            
/**                                                                                         
 * Mo'Creatures Redux&Redone Ogre Lair's Logs Minecraft Tag Append's.                               
 *                                                                                          
 * @version 0.0.27                                                                       
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                         
 */                                                                                         
public class RRMoCBlockVanillaTagAppendOgreLairLogsThatBurn extends RRMoCBlockTagAppendProvider          
{                                                                                           
    /**                                                                                     
     * Using the parent constructor, appends the Ogre Lair's Logs tag.                                
     */                                                                                     
    public RRMoCBlockVanillaTagAppendOgreLairLogsThatBurn()                                              
    {                                                                                       
        super(BlockTags.LOGS_THAT_BURN, Tags.Blocks.OGRE_LAIR_LOGS);                                           
    }                                                                                       
}                                                                                           
