package mestretramador.rrmocreatures.data.client.provider.block;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Block Tag Provider base.
 * 
 * @version 0.0.11
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockTagProvider
{
    /**
     * A Map to define wich list of block will be tagged by a Minecraft of MoCR&R
     * Tag.
     */
    protected static final HashMap<ITag.INamedTag<Block>, ArrayList<Block>> blocksToTag = new HashMap<ITag.INamedTag<Block>, ArrayList<Block>>();

    /**
     * When creating a Block Tag Provider, it already set the blocks to the tags.
     */
    protected RRMoCBlockTagProvider()
    {
        setBlocksToTag();
    }

    /**
     * Public getter to the data.
     * 
     * @return The {@link java.util.HashMap Map} with all the data.
     */
    public HashMap<ITag.INamedTag<Block>, ArrayList<Block>> provideBlocksToTag()
    {
        return blocksToTag;
    }

    /**
     * A method to each provider set its tags and blocks.
     */
    protected abstract void setBlocksToTag();
}
