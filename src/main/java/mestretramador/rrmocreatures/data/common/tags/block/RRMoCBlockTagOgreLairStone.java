package mestretramador.rrmocreatures.data.common.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Ogre Lair Stone Tag's Blocks.                                   
 *                                                                                    
 * @version 0.028                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagOgreLairStone extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Ogre Lair Stone tag.                          
     */                                                                               
    public RRMoCBlockTagOgreLairStone()                                                     
    {                                                                                 
        super(Tags.Blocks.OGRE_LAIR_STONE);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#OGRE_LAIR_STONE Ogre Lair Stone block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairStone Ogre Lair Stone}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.OGRE_LAIR_STONE.returnAsBlock());                                                     
    }                                                                                 
}                                                                                     
