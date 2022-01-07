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

package io.github.mestretramador.mocreaturesrr.entity.horse;

import javax.annotation.Nullable;

import io.github.mestretramador.mocreaturesrr.util.FileNameConversor;
import io.github.mestretramador.mocreaturesrr.util.IntegerConversor;

/**
 * <p>
 * All MoC R&R {@link io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse Horses}
 * can be divided in four Tiers.
 * </p>
 * <p>
 * They implies on genetic aspects of the horse as their appearance,
 * and stats as health and speed.
 * </p>
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 */
public enum MoCRRHorseTier implements IntegerConversor, FileNameConversor
{
    //#region Tiers
    /**
     * Natural Horses are tiered as the easiest to find and averagely the most diverse.
     * Being found on the nature, these horses run free on vasts plains and grass fields
     * with majestic composure.
     *
     * @since 0.0.0.5
     */
    NATURAL(1),

    /**
     * Common Horses are tiered as the results of selected interbreed with Natural ones, and
     * so they tend to be a little better about physic status. From this Tier on, they are not seen in nature,
     * but still inherit most of the traits of their parents.
     *
     * @since 0.0.0.5
     */
    COMMON(2),

    /**
     * Rare Horses are tiered as one the bests of all horses because of their exclusiveness and performance
     * among the Common ones. This Tier is named as is because of the delicate and refined processes of interbreed
     * to obtain these Breeds.
     *
     * @since 0.0.0.5
     */
    RARE(3),

    /**
     * Finest Horses are tiered as the best of all horses solely for their unique traits among all horses, even
     * the Rare ones, for example being capable of befriend Zebras. This Tier is considered a recent success
     * on interbreed research, and so can be increased.
     *
     * @since 0.0.0.5
     */
    FINEST(4);
    //#endregion

    //#region Properties
    /** The index of the Tier. */
    private final int tier;

    /**
     * Hold all the indexes of the Breeds of each Tier.
     *
     * @see io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorseBreed The Breeds.
     */
    private static final int[][] breeds = new int[][] {
        {1, 2, 3, 4, 5},
        {1, 2, 3, 4},
        {1, 2, 3},
        {1, 2}
    };
    //#endregion

    //#region Constructors
    /**
     * When creating a Tier, only the index is needed.
     *
     * @param tier The greater the index, better the Tier.
     */
    private MoCRRHorseTier(int tier)
    {
        this.tier = tier;
    }

    /**
     * From a valid raw {@code int} value, a Tier can be instantiated.
     *
     * @param tier The value must be on the {@code 1..4} interval.
     * @return It returns {@code null} if the value is not valid.
     */
    public static final @Nullable MoCRRHorseTier fromInt(int tier)
    {
        switch(tier)
        {
            case 1: return NATURAL;
            case 2: return COMMON;
            case 3: return RARE;
            case 4: return FINEST;

            default: return null;
        }
    }
    //#endregion

    //#region Conversors
    /**
     * The Tier can be expressed as a raw {@code int} value.
     *
     * @return
     *         <p>
     *         The actual range fits the following table:
     *         <p>
     *         <table>
     *          <thead>
     *              <tr>
     *                  <th>
     *                      Tier
     *                  </th>
     *                  <th>
     *                      Integer
     *                  </th>
     *              </tr>
     *          <thead>
     *          <tbody>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@code 1}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#COMMON Common}
     *                  </td>
     *                  <td>
     *                      {@code 2}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#RARE Rare}
     *                  </td>
     *                  <td>
     *                      {@code 3}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#FINEST Finest}
     *                  </td>
     *                  <td>
     *                      {@code 4}
     *                  </td>
     *              </tr>
     *          </tbody>
     *         </table>
     */
    @Override
    public final int asInt()
    {
        return this.tier;
    }

    /**
     * The part of the file names from the Tier is its own index.
     *
     * @return The value is a {@code String} to use easily on concatenations.
     */
    @Override
    public String toFileNameString()
    {
        return String.valueOf(this.asInt());
    }
    //#endregion

    //#region Getters
    /**
     * The Breeds of the Tier can be directly accessed.
     *
     * @return The indexation follows the same indexes of the Tier's Breeds.
     */
    public final MoCRRHorseBreed[] getBreeds()
    {
        final int[] breeds = this.getBreedsAsInt();

        final MoCRRHorseBreed[] horseBreeds = new MoCRRHorseBreed[breeds.length];

        for(int i = 0; i < breeds.length; i++)
        {
            horseBreeds[i] = MoCRRHorseBreed.fromInt(this, breeds[i]);
        }

        return horseBreeds;
    }

    /**
     * The asserted accessor of the Breeds return just the indexes.
     *
     * @return The vector comes with raw {@code int} values.
     * @see MoCRRHorseTier#getBreeds() The enumerated method.
     */
    public final int[] getBreedsAsInt()
    {
        return breeds[this.tier - 1];
    }
    //#endregion
}