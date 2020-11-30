package mestretramador.rrmocreatures.provider.block;

import java.util.function.ToIntFunction;

import mestretramador.rrmocreatures.util.Tabs;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wyvern Lair Tall Grass block item provider.                           
 *                                                                                   
 * @version 0.0.25                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderWyvernLairTallGrass extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Wyvern Lair Tall Grass with a                         
     * {@link net.minecraft.block.material.Material#TALL_PLANTS TALL_PLANTS material}. 
     */                                                                              
    public RRMoCBlockItemProviderWyvernLairTallGrass()                                           
    {                                                                                
        super(Material.TALL_PLANTS); 
        
        // TODO: Add transparency.                                                 
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the block properties of                                                
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass                   
     * Wyvern Lair Tall Grass}.                                                                      
     */                                                                              
    @Override                                                                        
    public AbstractBlock.Properties provideBlockProperties()                         
    {                                                                                
        BLOCK_PROPERTIES().sound(SoundType.PLANT);
        BLOCK_PROPERTIES().doesNotBlockMovement();
        BLOCK_PROPERTIES().zeroHardnessAndResistance();
        BLOCK_PROPERTIES().setLightLevel(getLightLevel()); 
                                                                                     
        return BLOCK_PROPERTIES();                                                   
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the blockitem properties of                                            
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass                   
     * Wyvern Lair Tall Grass}.                                                                      
     */                                                                              
    @Override                                                                        
    public Item.Properties provideItemProperties()                                   
    {                                                                                
        ITEM_PROPERTIES().group(Tabs.BLOCKS);
        ITEM_PROPERTIES().rarity(Rarity.COMMON);
        ITEM_PROPERTIES().maxStackSize(64);
                                                                                     
        return ITEM_PROPERTIES();                                                    
    } 
    
    /**
     * A helper getter to the {@link AbstractBlock.Properties#setLightLevel(ToIntFunction) Light Level Setter}.
     * The BlockState is irrelevant to the value.
     * 
     * @return An int returnable function wich returns <b>1</b>.
     */
    private ToIntFunction<BlockState> getLightLevel()
    {
        return (state) -> {
            return 1;
        };
    }
}                                                                                    
