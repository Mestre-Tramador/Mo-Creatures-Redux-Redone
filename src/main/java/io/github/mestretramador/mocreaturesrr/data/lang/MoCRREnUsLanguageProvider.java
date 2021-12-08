package io.github.mestretramador.mocreaturesrr.data.lang;

import io.github.mestretramador.mocreaturesrr.init.MoCRREntities;
import io.github.mestretramador.mocreaturesrr.init.MoCRRItems;
import io.github.mestretramador.mocreaturesrr.init.MoCRRTabs;

import net.minecraft.data.DataGenerator;

/**
 * The Provider to generate the data of the Mo'Creatures Redux&Redone
 * US English entries.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public class MoCRREnUsLanguageProvider extends MoCRRLanguageProvider
{
    /**
     * Only the Data Generator is needed, as the Language is already set.
     *
     * @param generator The JSON creator for the US English Lang.
     */
    public MoCRREnUsLanguageProvider(DataGenerator generator)
    {
        super(generator, "en_us", " Spawn Egg");
    }

    /** {@inheritDoc} */
    @Override
    protected void addBlockTranslations()
    {
        // TODO: Implement Blocks!
    }

    /** {@inheritDoc} */
    @Override
    protected void addItemTranslations()
    {
        ITEMS.put(MoCRRItems.CREATUREPEDIA.get(), "Creaturepedia");

        ITEMS.put(MoCRRItems.HORSE_SPAWN_EGG.get(), super.translateSpawnEgg("Horse"));
    }

    /** {@inheritDoc} */
    @Override
    protected void addEntityTranslations()
    {
        ENTITIES.put(MoCRREntities.HORSE.get(), "Horse");
    }

    /** {@inheritDoc} */
    @Override
    protected void addTabsTranslations()
    {
        TABS.put(MoCRRTabs.MOCRR, "Mo'Creatures Redux&Redone");
    }
}