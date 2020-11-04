package mestretramador.rrmocreatures.data.client.tags.block;

import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider;
import mestretramador.rrmocreatures.util.Tags;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Blocks Tag's itemblocks.
 * 
 * @version 0.0.7
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockItemTagWyvernLairBlock extends RRMoCBlockItemTagProvider
{
    /**
     * The setter copies the {@link Tags.Blocks.WyvernLair#WYVERN_LAIR_BLOCKS block
     * tags} to the {@link Tags.Items.BlockItems.WyvernLair#WYVERN_LAIR_BLOCK_ITEMS
     * blockitem tags}.
     */
    @Override
    protected void setBlocksToCopy()
    {
        blocksToCopy.put(
            Tags.Blocks.WyvernLair.WYVERN_LAIR_BLOCKS,
            Tags.Items.BlockItems.WyvernLair.WYVERN_LAIR_BLOCK_ITEMS
        );
    }
}
