package mestretramador.rrmocreatures.data.common.tags.block;                               
                                                                                           
import mestretramador.rrmocreatures.data.common.provider.tags.block.RRMoCBlockTagProvider; 
import mestretramador.rrmocreatures.init.RegisterBlock;                                    
import mestretramador.rrmocreatures.util.Tags;                                             
                                                                                           
/**                                                                                        
 * Mo'Creatures Redux&Redone Wyvern Lair Planks Tag's Blocks.                                        
 *                                                                                         
 * @version 0.0.29                                                                      
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                        
 */                                                                                        
public class RRMoCBlockTagWyvernLairPlanks extends RRMoCBlockTagProvider                            
{                                                                                          
    /**                                                                                    
     * Using the parent constructor, creates the Wyvern Lair Planks tag.                               
     */                                                                                    
    public RRMoCBlockTagWyvernLairPlanks()                                                          
    {                                                                                      
        super(Tags.Blocks.WYVERN_LAIR_PLANKS);                                                           
    }                                                                                      
                                                                                           
    /**                                                                                    
     * <p>                                                                               
     * The setter sets the {@link Tags.Blocks#WYVERN_LAIR_PLANKS Wyvern Lair Planks block                            
     * tag} to the below blocks:                                                           
     * </p>                                                                              
     * <ul>                                                                              
     * <li>Link your blocks here.</li>                                                 
     * </ul>                                                                             
     */                                                                                    
    @Override                                                                              
    protected void setBlocksToTag()                                                        
    {                                                                                      
        BLOCKS.add(RegisterBlock.WYVERN_LAIR_PLANKS.returnAsBlock());
    }                                                                                      
}                                                                                          
