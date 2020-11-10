package mestretramador.rrmocreatures.block;                                                                        
                                                                                                                   
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderWyvernLairLeaves;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Wyvern Lair Leaves block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.14                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockWyvernLairLeaves extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Wyvern Lair Leaves block.                                                        
     */                                                                                                            
    public RRMoCBlockWyvernLairLeaves()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.WYVERN_LAIR_LEAVES, new RRMoCBlockItemProviderWyvernLairLeaves());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Wyvern Lair Leaves block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new Block(((RRMoCBlockItemProviderWyvernLairLeaves) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Wyvern Lair Leaves block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Wyvern Lair Leaves block item.                                                                
     *                                                                                                             
     * @return The Wyvern Lair Leaves block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProviderWyvernLairLeaves) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
