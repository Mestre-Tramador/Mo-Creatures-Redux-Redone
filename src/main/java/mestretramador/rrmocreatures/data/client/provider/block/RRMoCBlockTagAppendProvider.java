package mestretramador.rrmocreatures.data.client.provider.block;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Block Tag Append Provider base.
 * 
 * @version 0.0.23
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlockTagAppendProvider
{
    /** The tag to append to. */
    private ITag.INamedTag<Block> PARENT;

    /** The tag to be appended. */
    private ITag.INamedTag<Block> CHILD;

    /**
     * When creating a Block Tag Append, both parent and child tags must be passed.
     * 
     * @param PARENT The tag to append to.
     * @param CHILD  The tag to be appended.
     */
    protected RRMoCBlockTagAppendProvider(ITag.INamedTag<Block> PARENT, ITag.INamedTag<Block> CHILD)
    {
        this.PARENT = PARENT;
        this.CHILD = CHILD;
    }

    /**
     * Public getter to the parent tag.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} to append to.
     */
    public ITag.INamedTag<Block> provideParentTag()
    {
        return this.PARENT;
    }

    /**
     * Public getter to the child tag.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} to be appended.
     */
    public ITag.INamedTag<Block> provideChildTag()
    {
        return this.CHILD;
    }
}
