package mestretramador.rrmocreatures.data.common.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Wyvern Lair Stone Tag's Blocks.                                   
 *                                                                                    
 * @version 0.0.29                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagWyvernLairStone extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Wyvern Lair Stone tag.                              
     */                                                                               
    public RRMoCBlockTagWyvernLairStone()                                                     
    {                                                                                 
        super(Tags.Blocks.WYVERN_LAIR_STONE);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#WYVERN_LAIR_STONE Wyvern Lair Stone block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone Wyvern Lair Stone}</li>                          
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                 
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock());                                                  
    }                                                                                 
}                                                                                     
