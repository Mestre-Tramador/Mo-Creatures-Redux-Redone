package mestretramador.rrmocreatures.provider.block;                                 
                                                                                     
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;                                        
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

import net.minecraftforge.common.ToolType;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Ogre Lair Dirt block item provider.                           
 *                                                                                   
 * @version 0.0.24                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderOgreLairDirt extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Ogre Lair Dirt with a                         
     * {@link net.minecraft.block.material.Material#EARTH EARTH material}. 
     */                                                                              
    public RRMoCBlockItemProviderOgreLairDirt()                                           
    {                                                                                
        super(Material.EARTH);                                                  
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the block properties of                                                
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt                   
     * Ogre Lair Dirt}.                                                                      
     */                                                                              
    @Override                                                                        
    public AbstractBlock.Properties provideBlockProperties()                         
    {                                                                                
        BLOCK_PROPERTIES().sound(SoundType.GROUND);                                  
        BLOCK_PROPERTIES().harvestTool(ToolType.SHOVEL);
        BLOCK_PROPERTIES().harvestLevel(0);
        BLOCK_PROPERTIES().hardnessAndResistance(0.5F);
        BLOCK_PROPERTIES().tickRandomly();
                                                                                     
        return BLOCK_PROPERTIES();                                                   
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the blockitem properties of                                            
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt                   
     * Ogre Lair Dirt}.                                                                      
     */                                                                              
    @Override                                                                        
    public Item.Properties provideItemProperties()                                   
    {                                                                                
        ITEM_PROPERTIES().group(ItemGroup.BUILDING_BLOCKS);
        ITEM_PROPERTIES().rarity(Rarity.COMMON);
        ITEM_PROPERTIES().maxStackSize(64);
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
