package mestretramador.rrmocreatures.block;

import mestretramador.rrmocreatures.model.block.RRMoCBlockItemModel;
import mestretramador.rrmocreatures.model.block.RRMoCBlockModel;
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderWyvernLairPlanks;                                  
import mestretramador.rrmocreatures.util.Constants;                                                                
                                                                                                                   
import net.minecraft.block.Block;                                                                                  
import net.minecraft.item.BlockItem;                                                                               
                                                                                                                   
/**                                                                                                                
 * Mo'Creatures Redux&Redone Wyvern Lair Planks block and block item.                                                        
 *                                                                                                                 
 * @version 0.0.21                                                                                              
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                                
 */                                                                                                                
public class RRMoCBlockWyvernLairPlanks extends RRMoCBlock implements RRMoCBlockItem                                        
{                                                                                                                  
    /**                                                                                                            
     * Using the parent constructor, create a Wyvern Lair Planks block.                                                        
     */                                                                                                            
    public RRMoCBlockWyvernLairPlanks()                                                                                     
    {                                                                                                              
        super(Constants.Blocks.WYVERN_LAIR_PLANKS, new RRMoCBlockItemProviderWyvernLairPlanks());                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                               
     * set helper function}, the Wyvern Lair Planks block is created.                                                         
     */                                                                                                            
    @Override                                                                                                      
    protected void createBlock()                                                                                   
    {                                                                                                              
        setBlock(new RRMoCBlockModel(((RRMoCBlockItemProviderWyvernLairPlanks) provider).provideBlockProperties()));                  
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * Return the Wyvern Lair Planks block in its current state.                                                               
     */                                                                                                            
    @Override                                                                                                      
    public Block returnAsBlock()                                                                                   
    {                                                                                                              
        return getBlock();                                                                                         
    }                                                                                                              
                                                                                                                   
    /**                                                                                                            
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               
     * also can be generated the Wyvern Lair Planks block item.                                                                
     *                                                                                                             
     * @return The Wyvern Lair Planks block item with the                                                                      
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 
     *         by the provider.                                                                                    
     */                                                                                                            
    @Override                                                                                                      
    public BlockItem returnAsBlockItem()                                                                           
    {                                                                                                              
        return new RRMoCBlockItemModel(returnAsBlock(), ((RRMoCBlockItemProviderWyvernLairPlanks) provider).provideItemProperties()); 
    }                                                                                                              
}                                                                                                                  
