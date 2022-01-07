//#region License
/**
 *  Mo'Creatures Redux&Redone is an attempt to restore the original
 *  DrZharks' Mo'Creatures with redesign ideas.
 *  Copyright (C) 2022 Mestre Tramador
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
//#endregion

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