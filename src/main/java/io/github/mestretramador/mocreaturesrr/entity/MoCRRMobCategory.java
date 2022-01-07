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

import javax.annotation.Nullable;

import io.github.mestretramador.mocreaturesrr.util.IntegerConversor;

/**
 * <p>
 * All MoC R&R mobs can be divided in three Categories.
 * </p>
 * <p>
 * Each one has its influence towards many behaviors of
 * the mob and its spawning.
 * </p>
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public enum MoCRRMobCategory implements IntegerConversor
{
    /**
     * Natural Mobs are creatures categorized by corresponding
     * to an existing animal in the real world. They spawn <i>naturally</i>
     * on a biome, follow their own lives as searching for food, walking or
     * finding a lair.
     *
     * @since 0.0.0.2
     */
    NATURAL(1),

    /**
     * Unnatural Mobs are creatures categorized by corresponding
     * to an existing animal in the real world, but actually being extinct
     * or influenced by humans, such as hybrids. They spawn <i>unnaturally</i>
     * based primarily on the actions of the Player, and then follow their
     * behaviors according to its species.
     *
     * @since 0.0.0.2
     */
    UNNATURAL(2),

    /**
     * Mythical Mobs are creatures categorized by corresponding
     * to a not existing animal in the real world. They may spawn <i>mythically</i>
     * on a biome and then follow their own lives, but most requires specific
     * rituals or steps to be encountered. Practically all monsters and alike
     * are Mythical Mobs.
     *
     * @since 0.0.0.2
     */
    MYTHICAL(3);

    /** An index value for the categories. */
    private final int index;

    /**
     * All MoC R&R Mob Categories have an index.
     *
     * @param category The index.
     */
    // TODO: Add more properties to the MoCRRMobCategories.
    private MoCRRMobCategory(int category)
    {
        this.index = category;
    }

    /**
     * From a valid raw {@code int} value, a Category can be instantiated.
     *
     * @param category The value must be on the {@code 1..3} interval.
     * @return It returns {@code null} if the value is not valid.
     */
    public static @Nullable MoCRRMobCategory fromInt(int category)
    {
        switch(category)
        {
            case 1: return NATURAL;
            case 2: return UNNATURAL;
            case 3: return MYTHICAL;

            default: return null;
        }
    }

    /**
     * The Category can be expressed as a raw {@code int} value.
     *
     * @return
     *         <p>
     *         The actual range fits the following table:
     *         <p>
     *         <table>
     *          <thead>
     *              <tr>
     *                  <th>
     *                      Category
     *                  </th>
     *                  <th>
     *                      Integer
     *                  </th>
     *              </tr>
     *          <thead>
     *          <tbody>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRMobCategory#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@code 1}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRMobCategory#UNNATURAL Unnatural}
     *                  </td>
     *                  <td>
     *                      {@code 2}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRMobCategory#MYTHICAL Mythical}
     *                  </td>
     *                  <td>
     *                      {@code 3}
     *                  </td>
     *              </tr>
     *          </tbody>
     *         </table>
     */
    @Override
    public int asInt()
    {
        return this.index;
    }
}