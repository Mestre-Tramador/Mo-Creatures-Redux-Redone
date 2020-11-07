package mestretramador.rrmocreatures.block;                                                                        
                                                                                                                   
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderOgreLairDirt;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Ogre Lair Dirt block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.11                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockOgreLairDirt extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Ogre Lair Dirt block.                                                        
     */                                                                                                            
    public RRMoCBlockOgreLairDirt()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.OGRE_LAIR_DIRT, new RRMoCBlockItemProviderOgreLairDirt());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Ogre Lair Dirt block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new Block(((RRMoCBlockItemProviderOgreLairDirt) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Ogre Lair Dirt block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Ogre Lair Dirt block item.                                                                
     *                                                                                                             
     * @return The Ogre Lair Dirt block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProviderOgreLairDirt) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
