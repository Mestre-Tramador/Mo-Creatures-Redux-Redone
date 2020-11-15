package mestretramador.rrmocreatures.data.client.provider.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Block Tag Provider base.
 * 
 * @version 0.0.21
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockTagProvider
{
    /** The key tag to the list of blocks */
    private ITag.INamedTag<Block> KEY;

    /** An Array to define wich list of blocks will be tagged by a Minecraft of MoCR&R Tag. */
    protected ArrayList<Block> BLOCKS;

    /**
     * When creating a Block Tag Provider, it already set the blocks to the tag.
     * 
     * @param TAG There is need to pass the Key Tag.
     */
    protected RRMoCBlockTagProvider(ITag.INamedTag<Block> TAG)
    {
        KEY = TAG;

        BLOCKS = new ArrayList<Block>();

        setBlocksToTag();
    }

    /**
     * Public getter to the key.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} wich corresponds to the list.
     */
    public ITag.INamedTag<Block> provideTagKey()
    {
        return KEY;
    }

    /**
     * Public getter to the values.
     * 
     * @return The {@link java.util.ArrayList Array} with all the values.
     */
    public ArrayList<Block> provideBlocksToTag()
    {
        return BLOCKS;
    }

    /**
     * A method to each provider set its tags and blocks.
     */
    protected abstract void setBlocksToTag();
}
