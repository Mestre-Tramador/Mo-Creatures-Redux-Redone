package mestretramador.rrmocreatures.data.client.tags.block;

import java.util.ArrayList;
import java.util.HashMap;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.ITag;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Block Tags Generator.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockTagsGeneration extends BlockTagsProvider
{
    /**
     * The complete list of maps of tags to the respectively blocks list.
     */
    private static final ArrayList<HashMap<ITag.INamedTag<Block>, ArrayList<Block>>> TAGS = new ArrayList<HashMap<ITag.INamedTag<Block>, ArrayList<Block>>>();

    /**
     * When creating the Block Tags Generator, the tags are already loaded.
     * 
     * @param generator          The actual Data Generator.
     * @param existingFileHelper The actual Existing File Helper.
     */
    public RRMoCBlockTagsGeneration(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Constants.MOD_ID, existingFileHelper);

        TAGS.add(new RRMoCBlockTagWyvernLairBlocks().provideBlocksToTag());
    }

    /**
     * Register all tags at once with the
     * {@link java.util.ArrayList#forEach(java.util.function.Consumer) repetition
     * methods}.
     */
    @Override
    protected void registerTags()
    {
        TAGS.forEach((tagsForBlocks) -> {
            tagsForBlocks.forEach((tag, blocks) -> {
                blocks.forEach((block) -> {
                    getOrCreateBuilder(tag).add(block);
                });
            });
        });
    }
}
