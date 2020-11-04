package mestretramador.rrmocreatures.data.client.provider.item;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

/**
 * Mo'Creatures Redux&Redone Item Tag Provider base.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemTagProvider
{
    /**
     * A Map to define wich list of item will be tagged by a Minecraft of MoCR&R
     * Tag.
     */
    protected static final HashMap<ITag.INamedTag<Item>, ArrayList<Item>> itemsToTag = new HashMap<ITag.INamedTag<Item>, ArrayList<Item>>();

    /**
     * When creating a Item Tag Provider, it already set the items to the tags.
     */
    protected RRMoCItemTagProvider()
    {
        setItemsToTag();
    }

    /**
     * Public getter to the data.
     * 
     * @return The {@link java.util.HashMap Map} with all the data.
     */
    public HashMap<ITag.INamedTag<Item>, ArrayList<Item>> getItemsToTag()
    {
        return itemsToTag;
    }

    /**
     * A method to each provider set its tags and items.
     */
    protected abstract void setItemsToTag();
}
