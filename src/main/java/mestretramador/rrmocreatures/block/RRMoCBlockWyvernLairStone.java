package mestretramador.rrmocreatures.block;

import mestretramador.rrmocreatures.model.block.RRMoCBlockItemModel;
import mestretramador.rrmocreatures.model.block.RRMoCBlockModel;
import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProviderWyvernLairStone;
import mestretramador.rrmocreatures.util.Constants.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Stone block and block item.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockWyvernLairStone extends RRMoCBlock implements RRMoCBlockItem
{
    /**
     * Using the parent base constructor, create a Wyvern Lair Stone block.
     */
    public RRMoCBlockWyvernLairStone()
    {
        super(Blocks.WYVERN_LAIR_STONE, new RRMoCBlockItemProviderWyvernLairStone());
    }

    /**
     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)
     * set helper function}, the Wyvern Lair Stone block is created.
     */
    @Override
    protected void createBlock()
    {
        setBlock(new RRMoCBlockModel(((RRMoCBlockItemProviderWyvernLairStone) provider).provideBlockProperties()));
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
        return new RRMoCBlockItemModel(returnAsBlock(), ((RRMoCBlockItemProviderWyvernLairStone) provider).provideItemProperties());
    }
}
