package mestretramador.rrmocreatures.data.client.provider.item;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Item Tag Append Provider base.
 * 
 * @version 0.0.13
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemTagAppendProvider
{
    /** The tag to append to. */
    private ITag.INamedTag<Item> PARENT;

    /** The tag to be appended. */
    private ITag.INamedTag<Item> CHILD;

    /**
     * When creating a Item Tag Append, both parent and child tags must be passed.
     * 
     * @param PARENT The tag to append to.
     * @param CHILD  The tag to be appended.
     */
    protected RRMoCItemTagAppendProvider(ITag.INamedTag<Item> PARENT, ITag.INamedTag<Item> CHILD)
    {
        this.PARENT = PARENT;
        this.CHILD = CHILD;
    }

    /**
     * Public getter to the parent tag.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} to append to.
     */
    public ITag.INamedTag<Item> provideParentTag()
    {
        return this.PARENT;
    }

    /**
     * Public getter to the child tag.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} to be appended.
     */
    public ITag.INamedTag<Item> provideChildTag()
    {
        return this.CHILD;
    }
}
