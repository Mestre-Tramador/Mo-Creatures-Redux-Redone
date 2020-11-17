package mestretramador.rrmocreatures.data.client.tags;

import java.util.ArrayList;
import java.util.HashMap;

import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemForgeTagStone;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagOgreLairDirt;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagOgreLairLogs;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagOgreLairStone;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagWyvernLairDirt;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagWyvernLairLogs;
import mestretramador.rrmocreatures.data.client.tags.block.RRMoCBlockItemTagWyvernLairStone;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagMaterialsSting;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagMaterialsTMNT;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagMaterialsTusk;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagWeaponsTMNT;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagWereablesAttack;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagWereablesProtect;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagWereablesRide;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemTagWereablesStorage;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemVanillaTagAppendOgreLairLogsThatBurn;
import mestretramador.rrmocreatures.data.client.tags.item.RRMoCItemVanillaTagAppendWyvernLairLogsThatBurn;
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
 * @version 0.0.22
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemTagsGeneration extends ItemTagsProvider
{
    /** A Map for the Items List to tag. */
    private static final HashMap<ITag.INamedTag<Item>, ArrayList<Item>> TAGS_ITEMS = new HashMap<ITag.INamedTag<Item>, ArrayList<Item>>();

    /** A Map for tags to Append. */
    private static final HashMap<ITag.INamedTag<Item>,ITag.INamedTag<Item>> TAGS_APPEND = new HashMap<ITag.INamedTag<Item>, ITag.INamedTag<Item>>();

    /** A Map for the BlockItem tags to copy. */
    private static final HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>> TAGS_COPIES = new HashMap<ITag.INamedTag<Block>, ITag.INamedTag<Item>>();

    /**
     * When creating the Item and BlockItem Tags Generator, the tags are already
     * loaded.
     * 
     * @param generator          The actual Data Generator.
     * @param blockTagProvider   The actual instance of
     *                           {@link mestretramador.rrmocreatures.data.client.tags.RRMoCBlockTagsGeneration
     *                           Block Tag Generator}.
     * @param existingFileHelper The actual Existing File Helper.
     */
    public RRMoCItemTagsGeneration(DataGenerator generator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(generator, blockTagProvider, Constants.MOD_ID, existingFileHelper);

        setItems();
        setAppends();
        setCopies();
    }

    /**
     * Register and copies all tags at once with the
     * {@link java.util.HashMap#forEach(java.util.function.BiConsumer) repetition
     * methods}.
     */
    @Override
    protected void registerTags()
    {
        TAGS_ITEMS.forEach((tag, items) -> {
            items.forEach((item) -> {
                getOrCreateBuilder(tag).add(item);
            });
        });

        TAGS_APPEND.forEach((parentTag, childTag) -> {
            getOrCreateBuilder(parentTag).addTag(childTag);
        });

        TAGS_COPIES.forEach((blockTag, itemTag) -> {
            copy(blockTag, itemTag);
        });
    }

    /**
     * Helper function to fill the {@link #TAGS_ITEMS Items to Tag Map}.
     */
    private static void setItems()
    {
        final RRMoCItemTagMaterialsSting materialsSting = new RRMoCItemTagMaterialsSting();
        final RRMoCItemTagMaterialsTusk materialsTusk = new RRMoCItemTagMaterialsTusk();
        final RRMoCItemTagMaterialsTMNT materialsTMNT = new RRMoCItemTagMaterialsTMNT();
        final RRMoCItemTagWeaponsTMNT weaponsTMNT = new RRMoCItemTagWeaponsTMNT();
        final RRMoCItemTagWereablesAttack wereablesAttack = new RRMoCItemTagWereablesAttack();
        final RRMoCItemTagWereablesProtect wereablesProtect = new RRMoCItemTagWereablesProtect();
        final RRMoCItemTagWereablesRide wereablesRide = new RRMoCItemTagWereablesRide();
        final RRMoCItemTagWereablesStorage wereablesStorage = new RRMoCItemTagWereablesStorage();

        TAGS_ITEMS.put(materialsSting.provideTagKey(), materialsSting.provideItemsToTag());
        TAGS_ITEMS.put(materialsTusk.provideTagKey(), materialsTusk.provideItemsToTag());
        TAGS_ITEMS.put(materialsTMNT.provideTagKey(), materialsTMNT.provideItemsToTag());
        TAGS_ITEMS.put(weaponsTMNT.provideTagKey(), weaponsTMNT.provideItemsToTag());
        TAGS_ITEMS.put(wereablesAttack.provideTagKey(), wereablesAttack.provideItemsToTag());
        TAGS_ITEMS.put(wereablesProtect.provideTagKey(), wereablesProtect.provideItemsToTag());
        TAGS_ITEMS.put(wereablesRide.provideTagKey(), wereablesRide.provideItemsToTag());
        TAGS_ITEMS.put(wereablesStorage.provideTagKey(), wereablesStorage.provideItemsToTag());

        // TODO: Add more Item Tags.
    }

    /**
     * Helper function to fill the {@link #TAGS_APPEND Append Tags Map}.
     */
    private static void setAppends()
    {
        final RRMoCItemVanillaTagAppendOgreLairLogsThatBurn ogreLairLogsThatBurn = new RRMoCItemVanillaTagAppendOgreLairLogsThatBurn();
        final RRMoCItemVanillaTagAppendWyvernLairLogsThatBurn wyvernLairLogsThatBurn = new RRMoCItemVanillaTagAppendWyvernLairLogsThatBurn();

        TAGS_APPEND.put(ogreLairLogsThatBurn.provideParentTag(), ogreLairLogsThatBurn.provideChildTag());
        TAGS_APPEND.put(wyvernLairLogsThatBurn.provideParentTag(), wyvernLairLogsThatBurn.provideChildTag());

        // TODO: Append more Tags.
    }

    /**
     * Helper function to fill the {@link #TAGS_COPIES Tags to Copy Map}.
     */
    private static void setCopies()
    {
        final RRMoCBlockItemTagOgreLairDirt ogreLairDirt = new RRMoCBlockItemTagOgreLairDirt();
        final RRMoCBlockItemTagOgreLairLogs ogreLairLogs = new RRMoCBlockItemTagOgreLairLogs();
        final RRMoCBlockItemTagOgreLairStone ogreLairStone = new RRMoCBlockItemTagOgreLairStone();
        final RRMoCBlockItemTagWyvernLairDirt wyvernLairDirt = new RRMoCBlockItemTagWyvernLairDirt();
        final RRMoCBlockItemTagWyvernLairLogs wyvernLairLogs = new RRMoCBlockItemTagWyvernLairLogs();
        final RRMoCBlockItemTagWyvernLairStone wyvernLairStone = new RRMoCBlockItemTagWyvernLairStone();
        final RRMoCBlockItemForgeTagStone forgeStone = new RRMoCBlockItemForgeTagStone();

        TAGS_COPIES.put(ogreLairDirt.provideKeyTag(), ogreLairDirt.provideValueTag());
        TAGS_COPIES.put(ogreLairLogs.provideKeyTag(), ogreLairLogs.provideValueTag());
        TAGS_COPIES.put(ogreLairStone.provideKeyTag(), ogreLairStone.provideValueTag());
        TAGS_COPIES.put(wyvernLairDirt.provideKeyTag(), wyvernLairDirt.provideValueTag());
        TAGS_COPIES.put(wyvernLairLogs.provideKeyTag(), wyvernLairLogs.provideValueTag());
        TAGS_COPIES.put(wyvernLairStone.provideKeyTag(), wyvernLairStone.provideValueTag());
        TAGS_COPIES.put(forgeStone.provideKeyTag(), forgeStone.provideValueTag());

        // TODO: Add more BlockItem Tags.
    }
}
