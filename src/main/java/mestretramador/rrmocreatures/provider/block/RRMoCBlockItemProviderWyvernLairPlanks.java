package mestretramador.rrmocreatures.provider.block;                                 
                                                                                     
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;                                        
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wyvern Lair Planks block item provider.                           
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderWyvernLairPlanks extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Wyvern Lair Planks with a                         
     * {@link net.minecraft.block.material.Material#WOOD WOOD material}. 
     */                                                                              
    public RRMoCBlockItemProviderWyvernLairPlanks()                                           
    {                                                                                
        super(Material.WOOD);                                                  
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the block properties of                                                
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks                   
     * Wyvern Lair Planks}.                                                                      
     */                                                                              
    @Override                                                                        
    public AbstractBlock.Properties provideBlockProperties()                         
    {                                                                                
        BLOCK_PROPERTIES().sound(SoundType.WOOD);
                                                                                     
        return BLOCK_PROPERTIES();                                                   
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the blockitem properties of                                            
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks                   
     * Wyvern Lair Planks}.                                                                      
     */                                                                              
    @Override                                                                        
    public Item.Properties provideItemProperties()                                   
    {                                                                                
        ITEM_PROPERTIES().group(ItemGroup.BUILDING_BLOCKS);
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
