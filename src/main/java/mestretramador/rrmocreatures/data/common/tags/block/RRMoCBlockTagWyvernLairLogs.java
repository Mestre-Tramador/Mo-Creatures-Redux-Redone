package mestretramador.rrmocreatures.data.common.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Wyvern Lair Logs Tag's Blocks.                                   
 *                                                                                    
 * @version 0.0.29                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagWyvernLairLogs extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Wyvern Lair Logs tag.                          
     */                                                                               
    public RRMoCBlockTagWyvernLairLogs()                                                     
    {                                                                                 
        super(Tags.Blocks.WYVERN_LAIR_LOGS);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#WYVERN_LAIR_LOGS Wyvern Lair Logs block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLog Wyvern Lair Log}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_LOG.returnAsBlock());                                                     
    }                                                                                 
}                                                                                     
