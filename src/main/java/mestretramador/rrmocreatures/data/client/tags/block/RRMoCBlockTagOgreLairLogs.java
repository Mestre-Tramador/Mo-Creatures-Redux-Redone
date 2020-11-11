package mestretramador.rrmocreatures.data.client.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; 
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Ogre Lair's Logs Tag's Blocks.                                   
 *                                                                                    
 * @version 0.0.15                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagOgreLairLogs extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Ogre Lair's Logs tag.                          
     */                                                                               
    public RRMoCBlockTagOgreLairLogs()                                                     
    {                                                                                 
        super(Tags.Blocks.OGRE_LAIR_LOGS);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#OGRE_LAIR_LOGS Ogre Lair's Logs block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLog Ogre Lair Log}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.OGRE_LAIR_LOG.returnAsBlock());                                                     
    }                                                                                 
}                                                                                     
