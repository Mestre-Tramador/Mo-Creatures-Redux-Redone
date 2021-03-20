package mestretramador.rrmocreatures.data.common.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Wyvern Lair Dirt Tag's Blocks.                                   
 *                                                                                    
 * @version 0.028                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagWyvernLairDirt extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Wyvern Lair Dirt tag.                              
     */                                                                               
    public RRMoCBlockTagWyvernLairDirt()                                                     
    {                                                                                 
        super(Tags.Blocks.WYVERN_LAIR_DIRT);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#WYVERN_LAIR_DIRT Wyvern Lair Dirt block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt Wyvern Lair Dirt}</li>                                            
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass Wyvern Lair Grass}</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock());                                                    
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock());                                                    
    }                                                                                 
}                                                                                     
