package mestretramador.rrmocreatures.block;

import mestretramador.rrmocreatures.model.block.RRMoCBlockItemModel;
import mestretramador.rrmocreatures.model.block.RRMoCBlockModel;
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderOgreLairLeaves;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Ogre Lair Leaves block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.29                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockOgreLairLeaves extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Ogre Lair Leaves block.                                                        
     */                                                                                                            
    public RRMoCBlockOgreLairLeaves()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.OGRE_LAIR_LEAVES, new RRMoCBlockItemProviderOgreLairLeaves());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Ogre Lair Leaves block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new RRMoCBlockModel(((RRMoCBlockItemProviderOgreLairLeaves) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Ogre Lair Leaves block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Ogre Lair Leaves block item.                                                                
     *                                                                                                             
     * @return The Ogre Lair Leaves block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new RRMoCBlockItemModel(returnAsBlock(), ((RRMoCBlockItemProviderOgreLairLeaves) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
