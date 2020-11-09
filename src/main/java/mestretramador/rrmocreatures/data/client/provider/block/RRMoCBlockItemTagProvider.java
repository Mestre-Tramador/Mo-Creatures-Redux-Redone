package mestretramador.rrmocreatures.data.client.provider.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone BlockItem Tag Provider base.
 * 
 * @version 0.0.13
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockItemTagProvider
{
    /** The key tag to be copied. */
    private ITag.INamedTag<Block> KEY;

    /** The value tag to receive the copied key. */
    private ITag.INamedTag<Item> VALUE;

    /**
     * When creating a BlockItem Tag Provider, it already set the blocks tags to the item tags.
     * 
     * @param BLOCKS The Block Tag to be copied.
     * @param ITEMS  The Item Tag to receive the copy.
     */
    protected RRMoCBlockItemTagProvider(ITag.INamedTag<Block> BLOCKS, ITag.INamedTag<Item> ITEMS)
    {
        KEY = BLOCKS;

        VALUE = ITEMS;
    }

    /**
     * Public getter to the key.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} wich corresponds to the copied.
     */
    public ITag.INamedTag<Block> provideKeyTag()
    {
        return KEY;
    }

    /**
     * Public getter to the value.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} wich corresponds to the reciever of the copy.
     */
    public ITag.INamedTag<Item> provideValueTag()
    {
        return VALUE;
    }
}
