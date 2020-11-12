package mestretramador.rrmocreatures.block;

import mestretramador.rrmocreatures.model.block.RRMoCBlockItemModel;
import mestretramador.rrmocreatures.model.block.RRMoCBushBlockModel;
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderWyvernLairTallGrass;                                  
import mestretramador.rrmocreatures.util.Constants;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Wyvern Lair Tall Grass block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.17                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockWyvernLairTallGrass extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Wyvern Lair Tall Grass block.                                                        
     */                                                                                                            
    public RRMoCBlockWyvernLairTallGrass()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.WYVERN_LAIR_TALL_GRASS, new RRMoCBlockItemProviderWyvernLairTallGrass());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Wyvern Lair Tall Grass block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new RRMoCBushBlockModel(((RRMoCBlockItemProviderWyvernLairTallGrass) provider).provideBlockProperties(), Tags.Blocks.WYVERN_LAIR_DIRT));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Wyvern Lair Tall Grass block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Wyvern Lair Tall Grass block item.                                                                
     *                                                                                                             
     * @return The Wyvern Lair Tall Grass block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new RRMoCBlockItemModel(returnAsBlock(), ((RRMoCBlockItemProviderWyvernLairTallGrass) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
