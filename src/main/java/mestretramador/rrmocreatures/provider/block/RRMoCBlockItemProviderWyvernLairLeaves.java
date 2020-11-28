package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

import net.minecraftforge.common.ToolType;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wyvern Lair Leaves block item provider.                           
 *                                                                                   
 * @version 0.0.24                                                                
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
        
        // TODO: Add transparency.                                                  
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
        BLOCK_PROPERTIES().harvestTool(ToolType.HOE);
        BLOCK_PROPERTIES().harvestLevel(0);
        BLOCK_PROPERTIES().hardnessAndResistance(0.2F);
        BLOCK_PROPERTIES().tickRandomly();
                                                                                     
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
        ITEM_PROPERTIES().rarity(Rarity.COMMON);
        ITEM_PROPERTIES().maxStackSize(64);                                     
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
