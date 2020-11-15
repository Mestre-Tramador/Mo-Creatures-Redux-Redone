package mestretramador.rrmocreatures.data.client.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; 
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Ogre Lair's Dirt Tag's Blocks.                                   
 *                                                                                    
 * @version 0.0.21                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagOgreLairDirt extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Ogre Lair's Dirt tag.                          
     */                                                                               
    public RRMoCBlockTagOgreLairDirt()                                                     
    {                                                                                 
        super(Tags.Blocks.OGRE_LAIR_DIRT);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#OGRE_LAIR_DIRT Ogre Lair's Dirt block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt Ogre Lair Dirt}</li>                                            
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass Ogre Lair Grass}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock());                                                     
        BLOCKS.add(RegisterBlock.OGRE_LAIR_GRASS.returnAsBlock());
    }                                                                                 
}                                                                                     
