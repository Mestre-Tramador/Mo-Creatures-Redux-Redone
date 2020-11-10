package mestretramador.rrmocreatures.block;                                                                        
                                                                                                                   
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderOgreLairTallGrass;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Ogre Lair Tall Grass block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.14                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockOgreLairTallGrass extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Ogre Lair Tall Grass block.                                                        
     */                                                                                                            
    public RRMoCBlockOgreLairTallGrass()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.OGRE_LAIR_TALL_GRASS, new RRMoCBlockItemProviderOgreLairTallGrass());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Ogre Lair Tall Grass block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new Block(((RRMoCBlockItemProviderOgreLairTallGrass) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Ogre Lair Tall Grass block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Ogre Lair Tall Grass block item.                                                                
     *                                                                                                             
     * @return The Ogre Lair Tall Grass block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProviderOgreLairTallGrass) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
