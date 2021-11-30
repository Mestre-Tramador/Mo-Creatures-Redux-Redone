package io.github.mestretramador.mocreaturesrr.data.lang;

import io.github.mestretramador.mocreaturesrr.init.MoCRRItems;

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
        super(generator, "en_us");
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
    }
}
