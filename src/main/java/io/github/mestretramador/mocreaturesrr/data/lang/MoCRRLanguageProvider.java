package io.github.mestretramador.mocreaturesrr.data.lang;

import java.util.HashMap;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRAnimal;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
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

    /** The map to hold the Entities translations. */
    protected final HashMap<EntityType<? extends MoCRRAnimal>, String> ENTITIES = new HashMap<EntityType<? extends MoCRRAnimal>, String>();

    /** The map to hold the Creative Mode Tabs translations. */
    protected final HashMap<CreativeModeTab, String> TABS = new HashMap<CreativeModeTab, String>();
    //#endregion

    //#region Constructor
    /**
     * The instantiation follows of the {@link LanguageProvider parent}
     * class, but the ID is already passed.
     *
     * @param generator      The JSON creator for the Langs.
     * @param locale         The Lang code. Currently supported
     *                       ones can be seen above.
     * @param spawnEggSuffix The suffix to {@link MoCRRLanguageProvider#translateSpawnEgg(String) append}
     *                       on Spawn Egg Items translations.
     * @see MoCRREnUsLanguageProvider Provider for US English (<i>en_us</i>)
    */
    public MoCRRLanguageProvider(DataGenerator generator, String locale, String spawnEggSuffix)
    {
        super(generator, MoCreaturesReduxRedone.ID, locale);

        this.spawnEggSuffix = spawnEggSuffix;

        addBlockTranslations();
        addItemTranslations();
        addEntityTranslations();
        addTabsTranslations();
    }
    //#endregion

    //#region Properties
    /** This suffix is appended on all Spawn Eggs Items. */
    private final String spawnEggSuffix;
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

    /**
     * Add to the {@link MoCRRLanguageProvider#ENTITIES Entities map} the translations.
     */
    protected abstract void addEntityTranslations();

    /**
     * Add to the {@link MoCRRLanguageProvider#TABS Tabs map} the translations.
     */
    protected abstract void addTabsTranslations();
    //#endregion

    //#region Generator
    /**
     * Iterating through the {@link MoCRRLanguageProvider#BLOCKS Blocks}, {@link MoCRRLanguageProvider#ITEMS Items},
     * {@link MoCRRLanguageProvider#ENTITIES Entities} and {@link MoCRRLanguageProvider#TABS Tabs} maps, all the
     * respective Lang entries are added.
     */
    @Override
    protected void addTranslations()
    {
        BLOCKS.forEach(this::add);
        ITEMS.forEach(this::add);
        ENTITIES.forEach(this::add);
        TABS.forEach(this::add);
    }
    //#endregion

    //#region Auxiliar Methods
    /**
     * Add a translation for a {@link CreativeModeTab Tab} using
     * its {@link CreativeModeTab#getDisplayName() Display Name}.
     *
     * @param tab         The Tab to be translated.
     * @param translation The translation on the current locale.
     */
    private final void add(CreativeModeTab tab, String translation)
    {
        add(tab.getDisplayName().getString(), translation);
    }

    /**
     * Append the Spawn Egg suffix to the Item by the Entity name.
     *
     * @param entity The name of a Entity.
     * @return A string following the Lang pattern.
     */
    protected final String translateSpawnEgg(String entity)
    {
        return entity.concat(spawnEggSuffix);
    }
    //#endregion
}