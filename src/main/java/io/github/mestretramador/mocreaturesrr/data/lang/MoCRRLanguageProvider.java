package io.github.mestretramador.mocreaturesrr.data.lang;

import java.util.HashMap;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.common.data.LanguageProvider;

/**
 * The Provider to generate the data of the Mo'Creatures Redux&Redone Langs,
 * serving as a base to all other ones.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public abstract class MoCRRLanguageProvider extends LanguageProvider
{
    //#region Maps
    /** The map to hold the Blocks translations. <b>Currently without use</b>. */
    protected final HashMap<Block, String> BLOCKS = new HashMap<Block, String>();

    /** The map to hold the Items translations. */
    protected final HashMap<Item, String> ITEMS = new HashMap<Item, String>();
    //#endregion

    //#region Constructor
    /**
     * The instantiation follows of the {@link LanguageProvider parent}
     * class, but the ID is already passed.
     *
     * @param generator The JSON creator for the Langs.
     * @param locale    The Lang code. Currently supported
     *                  ones can be seen above.
     * @see MoCRREnUsLanguageProvider Provider for US English (<i>en_us</i>)
    */
    public MoCRRLanguageProvider(DataGenerator generator, String locale)
    {
        super(generator, MoCreaturesReduxRedone.ID, locale);

        addBlockTranslations();
        addItemTranslations();
    }
    //#endregion

    //#region Translators
    /**
     * Add to the {@link MoCRRLanguageProvider#BLOCKS Blocks map} the translations.
     */
    protected abstract void addBlockTranslations();

    /**
     * Add to the {@link MoCRRLanguageProvider#ITEMS Items map} the translations.
     */
    protected abstract void addItemTranslations();
    //#endregion

    //#region Generator
    /**
     * Iterating through the {@link MoCRRLanguageProvider#BLOCKS Blocks},
     * and {@link MoCRRLanguageProvider#ITEMS Items} maps, all the respective
     * Lang entries are added.
     */
    @Override
    protected void addTranslations()
    {
        BLOCKS.forEach(this::add);
        ITEMS.forEach(this::add);
    }
    //#endregion
}
