package mestretramador.rrmocreatures.provider.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

import net.minecraftforge.common.ToolType;

/**
 * Mo'Creatures Redux&Redone Wyvern Lair Stone block item provider.
 * 
 * @version 0.0.16
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
        BLOCK_PROPERTIES().harvestTool(ToolType.PICKAXE);
        BLOCK_PROPERTIES().harvestLevel(1);
        BLOCK_PROPERTIES().hardnessAndResistance(1.5F, 6.0F);
        BLOCK_PROPERTIES().tickRandomly();

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
        ITEM_PROPERTIES().rarity(Rarity.COMMON);
        ITEM_PROPERTIES().maxStackSize(64);

        return ITEM_PROPERTIES();
    }
}
