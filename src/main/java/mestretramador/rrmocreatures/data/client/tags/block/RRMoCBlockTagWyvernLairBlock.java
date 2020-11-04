package mestretramador.rrmocreatures.data.client.tags.block;

import java.util.ArrayList;

import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.block.Block;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Blocks Tag's blocks.
 * 
 * @version 0.0.7
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockTagWyvernLairBlock extends RRMoCBlockTagProvider
{
    /**
     * The setter sets the {@link Tags.Blocks.WyvernLair#WYVERN_LAIR_BLOCKS Wyvern
     * Lair blocks tag} to the
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone stone
     * block}.
     */
    @Override
    protected void setBlocksToTag()
    {
        final ArrayList<Block> wyvernLairBlocks = new ArrayList<Block>();

        wyvernLairBlocks.add(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock());

        blocksToTag.put(Tags.Blocks.WyvernLair.WYVERN_LAIR_BLOCKS, wyvernLairBlocks);
    }
}
