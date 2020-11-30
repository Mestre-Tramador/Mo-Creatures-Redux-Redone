package mestretramador.rrmocreatures.data.client.provider;

import java.util.HashMap;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.common.data.LanguageProvider;

/**
 * Mo'Creatures Redux&Redone Language Translator Provider base.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCLangProvider extends LanguageProvider
{
    /** A Mapping for Block translations. */
    protected final HashMap<Block, String> BLOCKS;

    /** A Mapping for Item translations. */
    protected final HashMap<Item, String> ITEMS;

    /** A Mapping for Music Discs Items and Translations. */
    protected final HashMap<Item, String> MUSIC_DISCS;

    /** A Mapping for Creative Menu Tabs. */
    protected final HashMap<ItemGroup, String> TABS;

    /**
     * To create a Translator, there is need to pass a Data Generator
     * and the choosen lang.
     * 
     * @param generator Minecraft {@link net.minecraft.data.DataGenerator
     *                  Data Generator}.
     * @param lang      The language code.
     */
    public RRMoCLangProvider(DataGenerator generator, String lang)
    {
        super(generator, Constants.MOD_ID, lang);

        BLOCKS = new HashMap<Block, String>();

        ITEMS = new HashMap<Item, String>();

        MUSIC_DISCS = new HashMap<Item, String>();

        TABS = new HashMap<ItemGroup, String>();

        setBlocks();
        setItems();
        setMusicDiscs();
        setTabs();
    }

    /**
     * Helper function to set the Blocks and lang entries on the Map.
     */
    protected abstract void setBlocks();
    
    /**
     * Helper function to set the Items and lang entries on the Map.
     */
    protected abstract void setItems();

    /**
     * Helper function to set the Music Discs Items and 
     * desc lang entries on the Map.
     */
    protected abstract void setMusicDiscs();

    /**
     * Helper function to set the Tabs and lang entries on the Map.
     */
    protected abstract void setTabs();

    /**
     * Create a translation key to the Music Discs special {@code .desc} entry.
     * 
     * @param item The Item translation key.
     * @return The translaton key String to the Data Generator.
     */
    protected String getMusicDiscTranslationKey(String item)
    {
        return (item + ".desc");
    }

    /**
     * Create a translation key to the Item Groups special entries.
     * 
     * @param path The Item Group Path (same as an ID).
     * @return The translation key String to the Data Generator.
     */
    protected String getItemGroupTranslationKey(String path)
    {
        return ("itemGroup." + path);
    }
}
