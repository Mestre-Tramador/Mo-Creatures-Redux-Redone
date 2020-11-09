package mestretramador.rrmocreatures.provider.block;                                 
                                                                                     
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wyvern Lair Leaves block item provider.                           
 *                                                                                   
 * @version 0.0.13                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderWyvernLairLeaves extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Wyvern Lair Leaves with a                         
     * {@link net.minecraft.block.material.Material#LEAVES LEAVES material}. 
     */                                                                              
    public RRMoCBlockItemProviderWyvernLairLeaves()                                           
    {                                                                                
        super(Material.LEAVES);                                                  
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the block properties of                                                
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLeaves                   
     * Wyvern Lair Leaves}.                                                                      
     */                                                                              
    @Override                                                                        
    public AbstractBlock.Properties provideBlockProperties()                         
    {                                                                                
        BLOCK_PROPERTIES().sound(SoundType.PLANT);
                                                                                     
        return BLOCK_PROPERTIES();                                                   
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the blockitem properties of                                            
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLeaves                   
     * Wyvern Lair Leaves}.                                                                      
     */                                                                              
    @Override                                                                        
    public Item.Properties provideItemProperties()                                   
    {                                                                                
        ITEM_PROPERTIES().group(ItemGroup.DECORATIONS);                                     
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
