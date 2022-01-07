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

package io.github.mestretramador.mocreaturesrr.entity;

import java.util.function.Supplier;

import io.github.mestretramador.mocreaturesrr.init.MoCRRTabs;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import net.minecraftforge.common.ForgeSpawnEggItem;

/**
 * Marks a Mob as Spawnable, namely, capable of generate
 * a Spawn Egg and be affected by Spawning rules.
 *
 * @since 0.0.0.4
 * @author Mestre Tramador
 */
public interface MoCRRSpawnableMob
{
    /**
     * A Mo'Creatures Redux&Redone Spawn Egg Item follows
     * the Forge {@link ForgeSpawnEggItem base} structure.
     *
     * @since 0.0.0.4
     * @author Mestre Tramador
     */
    public final class MoCRRSpawnEggItem extends ForgeSpawnEggItem
    {
        /**
         * <p>
         * In order to create a Spawn Egg Item, the {@link MoCRRAnimal Entity}
         * shall be passed alongside both colors on <b>Hexadecimal</b> values.
         * </p>
         * <p>
         * The {@link Properties Properties} are auto generated.
         * </p>
         *
         * @param entity    The spawnable Entity.
         * @param bgColor   The color of the Egg's Background. Must be a <b>Hexadecimal</b>.
         * @param dotsColor The color of the Egg's Dots. Must be a <b>Hexadecimal</b>.
         */
        public MoCRRSpawnEggItem(
            Supplier<? extends EntityType<? extends MoCRRAnimal>> entity,
            int bgColor,
            int dotsColor
        )
        {
            super(
                entity,
                bgColor,
                dotsColor,
                makeProperties()
            );
        }

        /**
         * The specific Properties of a Spawn Egg Item.
         *
         * @return The Properties with {@link Rarity#COMMON common} rarity and {@code 64} stack maximum,
         *         but also with the {@link MoCRRTabs#MOCRR default tab} set.
         */
        private static Properties makeProperties()
        {
            return new Item
            .Properties()
            .rarity(Rarity.COMMON)
            .stacksTo(64)
            .tab(MoCRRTabs.MOCRR);
        }
    }
}