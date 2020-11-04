package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone BlockItem Provider base.
 * 
 * @version 0.0.7
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockItemProvider extends RRMoCBlockProvider
{
    /** Properties to assemble and provide to the BlockItem. */
    private static Item.Properties ITEM_PROPERTIES;

    /**
     * To create and BlockItem Provider, there is still need to pass a Material to
     * the block, but it now generates the Item Properties too.
     * 
     * @param material Material base to the Block.
     */
    protected RRMoCBlockItemProvider(Material material)
    {
        super(material);

        ITEM_PROPERTIES = new Item.Properties();
    }

    /**
     * Getter to the BlockItem Properties.
     * 
     * @return The BlockItem Properties in their current state.
     */
    protected Item.Properties ITEM_PROPERTIES()
    {
        return ITEM_PROPERTIES;
    }

    /**
     * Provide the BlockItem Properties for its creation.
     * 
     * @return The BlockItem Properties already setted.
     */
    protected abstract Item.Properties provideItemProperties();
}
