package mestretramador.rrmocreatures.data.client.tags.item;

import java.util.ArrayList;

import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider;
import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone Wereables Mount Tag's Items.
 * 
 * @version 0.0.11
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemTagWereablesToMount extends RRMoCItemTagProvider
{
    /**
     * <p>
     * The setter sets the {@link Tags.Items#WEARABLE_MOUNT Wereables To Mount item
     * tag} to the below items:
     * </p>
     * <ul>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade
     * saddle}.</li>
     * </ul>
     */
    @Override
    protected void setItemsToTag()
    {
        final ArrayList<Item> WereablesToMount = new ArrayList<Item>();

        WereablesToMount.add(RegisterItem.HANDMADE_SADDLE.returnAsItem());

        itemsToTag.put(Tags.Items.WEARABLE_MOUNT, WereablesToMount);
    }
}
