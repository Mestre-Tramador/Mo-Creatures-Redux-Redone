package mestretramador.rrmocreatures.provider.block;                                 
                                                                                     
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;                                        
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Ogre Lair Dirt block item provider.                           
 *                                                                                   
 * @version 0.0.11                                                                
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
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
