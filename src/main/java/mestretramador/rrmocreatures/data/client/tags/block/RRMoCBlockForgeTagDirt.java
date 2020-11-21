package mestretramador.rrmocreatures.data.client.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; 
import mestretramador.rrmocreatures.init.RegisterBlock;                               
                                                                                      
import net.minecraftforge.common.Tags;                                                
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Dirt Forge Tag's Blocks.                             
 *                                                                                    
 * @version 0.0.23                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockForgeTagDirt extends RRMoCBlockTagProvider                  
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Dirt tag.                              
     */                                                                               
    public RRMoCBlockForgeTagDirt()                                                
    {                                                                                 
        super(Tags.Blocks.DIRT);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#DIRT Dirt block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt Ogre Lair Dirt}</li>                                            
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass Ogre Lair Grass}</li>                                            
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt Wyvern Lair Dirt}</li>                                            
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass Wyvern Lair Grass}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock());                                                     
        BLOCKS.add(RegisterBlock.OGRE_LAIR_GRASS.returnAsBlock());
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock());
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock());
    }                                                                                 
}                                                                                     
