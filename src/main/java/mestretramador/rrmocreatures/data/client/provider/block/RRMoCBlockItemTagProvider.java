package mestretramador.rrmocreatures.data.client.provider.block;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone BlockItem Tag Provider base.
 * 
 * @version 0.0.10
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockItemTagProvider
{
    /**
     * A Map to define wich item block tags will be copied by a
     * item tag.
     */
    protected static final HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>> blocksToCopy = new HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>>();

    /**
     * When creating a BlockItem Tag Provider, it already set the blocks tags to the item tags.
     */
    protected RRMoCBlockItemTagProvider()
    {
        setBlocksToCopy();
    }

    /**
     * Public getter to the data.
     * 
     * @return The {@link java.util.HashMap Map} with all the data.
     */
    public HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>> getBlocksToCopy()
    {
        return blocksToCopy;
    }

    /**
     * A method to each provider set its blocks tags and item tags.
     */
    protected abstract void setBlocksToCopy();
}
