package mestretramador.rrmocreatures.data.client.tags;

import java.util.ArrayList;
import java.util.HashMap;

import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockForgeTagDirt;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockForgeTagStone;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagOgreLairDirt;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagOgreLairLogs;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagOgreLairStone;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagWyvernLairDirt;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagWyvernLairLogs;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockTagWyvernLairStone;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockVanillaTagAppendOgreLairLogsThatBurn;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockVanillaTagAppendWyvernLairLogsThatBurn;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.ITag;

import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Mo'Creatures Redux&Redone Block Tags Generator.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockTagsGeneration extends BlockTagsProvider
{
    /** A Map for the Blocks List to tag. */
    private static final HashMap<ITag.INamedTag<Block>, ArrayList<Block>> TAGS_BLOCKS = new HashMap<ITag.INamedTag<Block>, ArrayList<Block>>();

    /** A Map for tags to Append. */
    private static final HashMap<ITag.INamedTag<Block>,  ITag.INamedTag<Block>> TAGS_APPEND = new HashMap<ITag.INamedTag<Block>,  ITag.INamedTag<Block>>();

    /**
     * When creating the Block Tags Generator, the tags are already loaded.
     * 
     * @param generator          The actual Data Generator.
     * @param existingFileHelper The actual Existing File Helper.
     */
    public RRMoCBlockTagsGeneration(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Constants.MOD_ID, existingFileHelper);

        setBlocks();
        setAppends();
    }

    /**
     * Register all tags at once with the
     * {@link java.util.HashMap#forEach(java.util.function.BiConsumer) repetition
     * methods}.
     */
    @Override
    protected void registerTags()
    {
        TAGS_BLOCKS.forEach((tag, blocks) -> {
            blocks.forEach((block) -> {
                getOrCreateBuilder(tag).add(block);
            });
        });

        TAGS_APPEND.forEach((parentTag, childTag) -> {
            getOrCreateBuilder(parentTag).addTag(childTag);
        });
    }

    /**
     * Helper function to fill the {@link #TAGS_BLOCKS Blocks Map}.
     */
    private static void setBlocks()
    {
        final RRMoCBlockTagOgreLairDirt ogreLairDirt = new RRMoCBlockTagOgreLairDirt();
        final RRMoCBlockTagOgreLairLogs ogreLairLogs = new RRMoCBlockTagOgreLairLogs();
        final RRMoCBlockTagOgreLairStone ogreLairStone = new RRMoCBlockTagOgreLairStone();
        final RRMoCBlockTagWyvernLairDirt wyvernLairDirt = new RRMoCBlockTagWyvernLairDirt();
        final RRMoCBlockTagWyvernLairLogs wyvernLairLogs = new RRMoCBlockTagWyvernLairLogs();
        final RRMoCBlockTagWyvernLairStone wyvernLairStone = new RRMoCBlockTagWyvernLairStone();
        final RRMoCBlockForgeTagDirt forgeDirt = new RRMoCBlockForgeTagDirt();
        final RRMoCBlockForgeTagStone forgeStone = new RRMoCBlockForgeTagStone();

        TAGS_BLOCKS.put(ogreLairDirt.provideTagKey(), ogreLairDirt.provideBlocksToTag());
        TAGS_BLOCKS.put(ogreLairLogs.provideTagKey(), ogreLairLogs.provideBlocksToTag());
        TAGS_BLOCKS.put(ogreLairStone.provideTagKey(), ogreLairStone.provideBlocksToTag());
        TAGS_BLOCKS.put(wyvernLairDirt.provideTagKey(), wyvernLairDirt.provideBlocksToTag());
        TAGS_BLOCKS.put(wyvernLairLogs.provideTagKey(), wyvernLairLogs.provideBlocksToTag());
        TAGS_BLOCKS.put(wyvernLairStone.provideTagKey(), wyvernLairStone.provideBlocksToTag());
        TAGS_BLOCKS.put(forgeDirt.provideTagKey(), forgeDirt.provideBlocksToTag());
        TAGS_BLOCKS.put(forgeStone.provideTagKey(), forgeStone.provideBlocksToTag());

        // TODO: Add more Block tags.
    }
    
    /**
     * Helper function to fill the {@link #TAGS_APPEND Append Tags Map}.
     */
    private static void setAppends()
    {
        final RRMoCBlockVanillaTagAppendOgreLairLogsThatBurn ogreLairLogsThatBurn = new RRMoCBlockVanillaTagAppendOgreLairLogsThatBurn();
        final RRMoCBlockVanillaTagAppendWyvernLairLogsThatBurn wyvernLairLogsThatBurn = new RRMoCBlockVanillaTagAppendWyvernLairLogsThatBurn();

        TAGS_APPEND.put(ogreLairLogsThatBurn.provideParentTag(), ogreLairLogsThatBurn.provideChildTag());
        TAGS_APPEND.put(wyvernLairLogsThatBurn.provideParentTag(), wyvernLairLogsThatBurn.provideChildTag());
        
        // TODO: Append more Tags.
    }
}
