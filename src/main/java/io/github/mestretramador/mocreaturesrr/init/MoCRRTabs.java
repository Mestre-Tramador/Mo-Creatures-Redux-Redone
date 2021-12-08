package io.github.mestretramador.mocreaturesrr.init;

import io.github.mestretramador.mocreaturesrr.item.MoCRRCreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Aggregation of the Mo'Creatures R&R
 * registered {@link net.minecraft.world.item.CreativeModeTab Tabs}.
 *
 * @since 0.0.0.3
 * @author Mestre Tramador
 */
public final class MoCRRTabs
{
    /**
     * This is the main Tab.
     * @deprecated In a future version it will be removed.
     */
    public static final MoCRRCreativeModeTab MOCRR = new MoCRRCreativeModeTab("mocrr") {
        /**
         * {@inheritDoc}
         *
         * @return The icon is the {@link MoCRRItems#CREATUREPEDIA Creaturepedia} item.
         */
        @Override
        public ItemStack makeIcon()
        {
            return MoCRRItems.CREATUREPEDIA.get().getDefaultInstance();
        }

    };
}