package mestretramador.rrmocreatures.data.client.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; 
import mestretramador.rrmocreatures.init.RegisterBlock;                               
                                                                                      
import net.minecraftforge.common.Tags;                                                
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Stone Forge Tag's Blocks.                             
 *                                                                                    
 * @version 0.0.14                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockForgeTagStone extends RRMoCBlockTagProvider                  
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Stone tag.                              
     */                                                                               
    public RRMoCBlockForgeTagStone()                                                
    {                                                                                 
        super(Tags.Blocks.STONE);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#STONE Stone block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairStone Ogre Lair Stone}</li>       
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone Wyvern Lair Stone}</li>       
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.OGRE_LAIR_STONE.returnAsBlock());
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock());                                                     
    }                                                                                 
}                                                                                     
