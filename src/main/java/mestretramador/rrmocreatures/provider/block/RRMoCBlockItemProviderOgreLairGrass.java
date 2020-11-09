package mestretramador.rrmocreatures.provider.block;                                 
                                                                                     
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;                                        
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Ogre Lair Grass block item provider.                           
 *                                                                                   
 * @version 0.0.12                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderOgreLairGrass extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Ogre Lair Grass with a                         
     * {@link net.minecraft.block.material.Material#PLANTS PLANTS material}. 
     */                                                                              
    public RRMoCBlockItemProviderOgreLairGrass()                                           
    {                                                                                
        super(Material.PLANTS);
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the block properties of                                                
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass                   
     * Ogre Lair Grass}.                                                                      
     */                                                                              
    @Override                                                                        
    public AbstractBlock.Properties provideBlockProperties()                         
    {                                                                                
        BLOCK_PROPERTIES().sound(SoundType.PLANT);
                                                                                     
        return BLOCK_PROPERTIES();                                                   
    }                                                                                
                                                                                     
    /**                                                                              
     * Return the blockitem properties of                                            
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass                   
     * Ogre Lair Grass}.                                                                      
     */                                                                              
    @Override                                                                        
    public Item.Properties provideItemProperties()                                   
    {                                                                                
        ITEM_PROPERTIES().group(ItemGroup.BUILDING_BLOCKS);
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
