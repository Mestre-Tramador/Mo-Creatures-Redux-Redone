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

package io.github.mestretramador.mocreaturesrr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

/**
 * A Mo'Creatures Redux&Redone Item follows
 * the Minecraft {@link Item base} structure.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public abstract class MoCRRItem extends Item
{
    /**
     * In order to create an Item on MoC R&R,
     * the {@link Item.Properties properties}
     * of it shall be passed.
     *
     * @param props The Item properties already created.
     */
    public MoCRRItem(Properties props)
    {
        super(props);
    }

    //#region Properties Builders (Protected Static Methods)
    /**
     * Default properties of all Items.
     *
     * @return The Properties with {@link Rarity#COMMON common} rarity and {@code 64} stack maximum.
     */
    protected static final Properties makeProperties()
    {
        return new Item.Properties().rarity(Rarity.COMMON).stacksTo(64);
    }

    /**
     * Default properties of all MoC R&R Items,
     * already setting its Tab.
     *
     * @param tab An instance of a MoC R&R
     *            {@link io.github.mestretramador.mocreaturesrr.init.MoCRRTabs Tab}.
     * @return    The Properties with {@link Rarity#COMMON common} rarity and {@code 64} stack maximum,
     *            but also with one of the {@link MoCRRCreativeModeTab tabs} set.
     */
    protected static final Properties makeProperties(MoCRRCreativeModeTab tab)
    {
        return makeProperties().tab(tab);
    }

    /**
     * Default Properties for non-breakable tools.
     *
     * @return Default Properties, but with just {@code 1} stack maximum.
     */
    protected static final Properties makeToolProperties()
    {
        return makeProperties().stacksTo(1);
    }

    /**
     * Default Properties for MoC R&R non-breakable tools,
     * already setting its Tab.
     *
     * @param tab An instance of a MoC R&R
     *            {@link io.github.mestretramador.mocreaturesrr.init.MoCRRTabs Tab}.
     * @return    Default Properties, but with just {@code 1} stack maximum,
     *            also with one of the {@link MoCRRCreativeModeTab tabs} set.
     */
    protected static final Properties makeToolProperties(MoCRRCreativeModeTab tab)
    {
        return makeProperties(tab).stacksTo(1);
    }
    //#endregion
}