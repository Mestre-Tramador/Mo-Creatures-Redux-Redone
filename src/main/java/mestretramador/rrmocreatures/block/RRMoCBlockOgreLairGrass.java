package mestretramador.rrmocreatures.block;                                                                        
                                                                                                                   
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderOgreLairGrass;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Ogre Lair Grass block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.14                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockOgreLairGrass extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Ogre Lair Grass block.                                                        
     */                                                                                                            
    public RRMoCBlockOgreLairGrass()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.OGRE_LAIR_GRASS, new RRMoCBlockItemProviderOgreLairGrass());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Ogre Lair Grass block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new Block(((RRMoCBlockItemProviderOgreLairGrass) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Ogre Lair Grass block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Ogre Lair Grass block item.                                                                
     *                                                                                                             
     * @return The Ogre Lair Grass block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProviderOgreLairGrass) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
