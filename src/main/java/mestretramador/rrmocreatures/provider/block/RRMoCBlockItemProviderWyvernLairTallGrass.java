package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Wyvern Lair Tall Grass block item provider.                           
 *                                                                                   
 * @version 0.0.11                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCBlockItemProviderWyvernLairTallGrass extends RRMoCBlockItemProvider            
{                                                                                    
    /**                                                                              
     * Using the parent constructor, start the Wyvern Lair Tall Grass with a                         
     * {@link net.minecraft.block.material.Material#PLANTS PLANTS material}. 
     */                                                                              
    public RRMoCBlockItemProviderWyvernLairTallGrass()                                           
    {                                                                                
        super(Material.PLANTS);                                                  
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
        ITEM_PROPERTIES().group(ItemGroup.DECORATIONS);
                                                                                     
        return ITEM_PROPERTIES();                                                    
    }                                                                                
}                                                                                    
