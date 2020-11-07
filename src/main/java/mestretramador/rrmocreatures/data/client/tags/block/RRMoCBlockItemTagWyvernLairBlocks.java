package mestretramador.rrmocreatures.data.client.tags.block;

import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider;
import mestretramador.rrmocreatures.util.Tags;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Blocks Tag's BlockItems.
 * 
 * @version 0.0.10
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockItemTagWyvernLairBlocks extends RRMoCBlockItemTagProvider
{
    /**
     * The setter copies the {@link Tags.Blocks.WyvernLair#WYVERN_LAIR_BLOCKS Wyvern
     * Lair Blocks blocks tag} to the
     * {@link Tags.Items.BlockItems.WyvernLair#WYVERN_LAIR_BLOCK_ITEMS Wyvern Lair
     * BlockItems blockitems tag}.
     */
    @Override
    protected void setBlocksToCopy()
    {
        blocksToCopy.put(Tags.Blocks.WyvernLair.WYVERN_LAIR_BLOCKS, Tags.Items.BlockItems.WyvernLair.WYVERN_LAIR_BLOCK_ITEMS);
    }
}
