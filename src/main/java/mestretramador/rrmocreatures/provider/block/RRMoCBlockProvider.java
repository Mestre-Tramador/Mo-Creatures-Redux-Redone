package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;

/**
 * Mo'Creatures Redux&Redone Block Provider base.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockProvider
{
    /** Properties to assemble and provide to the Block. */
    private static AbstractBlock.Properties BLOCK_PROPERTIES;

    /**
     * To create and Block Provider, there is need to pass a Material to the block.
     * 
     * @param material Material base to the Block.
     */
    protected RRMoCBlockProvider(Material material)
    {
        BLOCK_PROPERTIES = AbstractBlock.Properties.create(material);
    }

    /**
     * Getter to the Block Properties.
     * 
     * @return The Block Properties in their current state.
     */
    protected AbstractBlock.Properties BLOCK_PROPERTIES()
    {
        return BLOCK_PROPERTIES;
    }

    /**
     * Provide the Block Properties for its creation.
     * 
     * @return The Block Properties already setted.
     */
    protected abstract AbstractBlock.Properties provideBlockProperties();
}
