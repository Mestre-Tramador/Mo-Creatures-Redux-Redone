package mestretramador.rrmocreatures.data.client.tags.block;

import java.util.ArrayList;

import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.block.Block;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Blocks Tag's Blocks.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockTagWyvernLairBlocks extends RRMoCBlockTagProvider
{
    /**
     * <p>
     * The setter sets the {@link Tags.Blocks.WyvernLair#WYVERN_LAIR_BLOCKS Wyvern
     * Lair Blocks block tag} to the below blocks:
     * </p>
     * <ul>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone
     * Wyvern Lair Stone}.</li>
     * </ul>
     */
    @Override
    protected void setBlocksToTag()
    {
        final ArrayList<Block> WyvernLairBlocks = new ArrayList<Block>();

        WyvernLairBlocks.add(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock());

        blocksToTag.put(Tags.Blocks.WyvernLair.WYVERN_LAIR_BLOCKS, WyvernLairBlocks);
    }
}
