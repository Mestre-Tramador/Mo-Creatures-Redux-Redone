package mestretramador.rrmocreatures.data.common.tags.block;                          
                                                                                      
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;                               
import mestretramador.rrmocreatures.util.Tags;                                        
                                                                                      
/**                                                                                   
 * Mo'Creatures Redux&Redone Ogre Lair Planks Tag's Blocks.                                   
 *                                                                                    
 * @version 0.028                                                                 
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                   
 */                                                                                   
public class RRMoCBlockTagOgreLairPlanks extends RRMoCBlockTagProvider                       
{                                                                                     
    /**                                                                               
     * Using the parent constructor, creates the Ogre Lair Planks tag.                          
     */                                                                               
    public RRMoCBlockTagOgreLairPlanks()                                                     
    {                                                                                 
        super(Tags.Blocks.OGRE_LAIR_PLANKS);                                                      
    }                                                                                 
                                                                                      
    /**                                                                               
     * <p>                                                                          
     * The setter sets the {@link Tags.Blocks#OGRE_LAIR_PLANKS Ogre Lair Planks block                       
     * tag} to the below blocks:                                                      
     * </p>                                                                         
     * <ul>                                                                         
     * <li>Link your blocks here.</li>                                            
     * </ul>                                                                        
     */                                                                               
    @Override                                                                         
    protected void setBlocksToTag()                                                   
    {                                                                                                                               
        BLOCKS.add(RegisterBlock.OGRE_LAIR_PLANKS.returnAsBlock());
    }                                                                                 
}                                                                                     
