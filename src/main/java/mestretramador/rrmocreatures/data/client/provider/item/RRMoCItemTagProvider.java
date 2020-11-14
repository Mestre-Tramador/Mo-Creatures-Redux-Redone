package mestretramador.rrmocreatures.data.client.provider.item;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Item Tag Provider base.
 * 
 * @version 0.0.20
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemTagProvider
{
    /** The key tag to the list of items. */
    private ITag.INamedTag<Item> KEY;

    /** An Array to define wich list of items will be tagged by a Minecraft of MoCR&R Tag. */
    protected ArrayList<Item> ITEMS;

    /**
     * When creating a Item Tag Provider, it already set the items to the tag.
     *
     * @param TAG There is need to pass the Key Tag.
     */
    protected RRMoCItemTagProvider(ITag.INamedTag<Item> TAG)
    {
        KEY = TAG;

        ITEMS = new ArrayList<Item>();

        setItemsToTag();
    }

    /**
     * Public getter to the key.
     * 
     * @return The {@link net.minecraft.tags.ITag Tag} wich corresponds to the list.
     */
    public ITag.INamedTag<Item> provideTagKey()
    {
        return KEY;
    }

    /**
     * Public getter to the data.
     * 
     * @return The {@link java.util.HashMap Map} with all the data.
     */
    public ArrayList<Item> provideItemsToTag()
    {
        return ITEMS;
    }

    /**
     * A method to each provider set its tags and items.
     */
    protected abstract void setItemsToTag();
}
