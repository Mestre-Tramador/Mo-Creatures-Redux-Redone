package mestretramador.rrmocreatures.block;

import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderWyvernLairStone;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Stone block and block item.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockWyvernLairStone extends RRMoCBlock implements RRMoCBlockItem
{
    /**
     * Using the parent base constructor, create a Wyvern Lair Stone block.
     */
    public RRMoCBlockWyvernLairStone()
    {
        super(Constants.Blocks.WyvernLair.STONE, new RRMoCBlockItemProviderWyvernLairStone());
    }

    /**
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)
     * set helper function}, the Wyvern Lair Stone block is created.
     */
    @Override
    protected void createBlock()
    {
        setBlock(new Block(((RRMoCBlockItemProviderWyvernLairStone) provider).provideBlockProperties()));
    }

    /**
     * Return the Wyvern Lair Stone block in its current state.
     */
    @Override
    public Block returnAsBlock()
    {
        return getBlock();
    }

    /**
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},
     * also can be generated the Wyvern Lair Stone block item.
     * 
     * @return The Wyvern Lair Stone block item with the
     *         {@link net.minecraft.item.Item.Properties Item Properties} provided
     *         by the provider.
     */
    @Override
    public BlockItem returnAsBlockItem()
    {
        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProviderWyvernLairStone) provider).provideItemProperties());
    }
}
