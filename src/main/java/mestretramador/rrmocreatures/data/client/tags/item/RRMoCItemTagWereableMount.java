package mestretramador.rrmocreatures.data.client.tags.item;

import java.util.ArrayList;

import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider;
import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone Wereables Mount Tag's Items.
 * 
 * @version 0.0.7
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemTagWereableMount extends RRMoCItemTagProvider
{
    /**
     * The setter sets the {@link Tags.Items#WEARABLE_MOUNT Wereables Mount item
     * tag} to the {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle
     * handmade saddle}.
     */
    @Override
    protected void setItemsToTag()
    {
        final ArrayList<Item> wereablesToMount = new ArrayList<Item>();

        wereablesToMount.add(RegisterItem.HANDMADE_SADDLE.returnAsItem());

        itemsToTag.put(Tags.Items.WEARABLE_MOUNT, wereablesToMount);
    }
}
