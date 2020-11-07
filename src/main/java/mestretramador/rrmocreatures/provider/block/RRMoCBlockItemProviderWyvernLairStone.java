package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Stone block item provider.
 * 
 * @version 0.0.11
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockItemProviderWyvernLairStone extends RRMoCBlockItemProvider
{
    /**
     * Using the parent constructor, start the Wyvern Lair Stone with a
     * {@link net.minecraft.block.material.Material#ROCK ROCK material}.
     */
    public RRMoCBlockItemProviderWyvernLairStone()
    {
        super(Material.ROCK);
    }

    /**
     * Return the block properties of
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockItemWyvernLairStone
     * Wyvern Lair Stone}.
     */
    @Override
    public AbstractBlock.Properties provideBlockProperties()
    {
        BLOCK_PROPERTIES().sound(SoundType.STONE);

        return BLOCK_PROPERTIES();
    }

    /**
     * Return the blockitem properties of
     * {@link mestretramador.rrmocreatures.block.RRMoCBlockItemWyvernLairStone
     * Wyvern Lair Stone}.
     */
    @Override
    public Item.Properties provideItemProperties()
    {
        ITEM_PROPERTIES().group(ItemGroup.BUILDING_BLOCKS);

        return ITEM_PROPERTIES();
    }
}
