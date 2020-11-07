package mestretramador.rrmocreatures.data.client.tags.item;

import java.util.ArrayList;
import java.util.HashMap;

import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagWyvernLairBlocks;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Item and BlockItem Tags Generator.
 * 
 * @version 0.0.10
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemTagsGeneration extends ItemTagsProvider
{
    /**
     * The complete list of maps of tags to the respectively item list.
     */
    private static final ArrayList<HashMap<ITag.INamedTag<Item>, ArrayList<Item>>> TAGS = new ArrayList<HashMap<ITag.INamedTag<Item>, ArrayList<Item>>>();

    /**
     * The complete list of maps of block tags to copy to the respectively item
     * tags.
     */
    private static final ArrayList<HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>>> COPY = new ArrayList<HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>>>();

    /**
     * When creating the Item and BlockItem Tags Generator, the tags are already
     * loaded.
     * 
     * @param generator          The actual Data Generator.
     * @param blockTagProvider   The actual instance of
     *                           {@link mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagsGeneration
     *                           Block Tag Generator}.
     * @param existingFileHelper The actual Existing File Helper.
     */
    public RRMoCItemTagsGeneration(DataGenerator generator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(generator, blockTagProvider, Constants.MOD_ID, existingFileHelper);

        TAGS.add(new RRMoCItemTagWereablesToMount().getItemsToTag());

        COPY.add(new RRMoCBlockItemTagWyvernLairBlocks().getBlocksToCopy());
    }

    /**
     * Register and copies all tags at once with the
     * {@link java.util.ArrayList#forEach(java.util.function.Consumer) repetition
     * methods}.
     */
    @Override
    protected void registerTags()
    {
        TAGS.forEach((tagsForItems) -> {
            tagsForItems.forEach((tag, items) -> {
                items.forEach((item) -> {
                    getOrCreateBuilder(tag).add(item);
                });
            });
        });

        COPY.forEach((copyBlocksToItems) -> {
            copyBlocksToItems.forEach((blockTag, itemTag) -> {
                copy(blockTag, itemTag);
            });
        });
    }
}
