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
 * All MoC R&R {@link io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorseTier Horse Tiers}
 * are divided in a range of Breeds.
 * </p>
 * <p>
 * They implies on genetic aspects of the horse as their appearance,
 * and stats as health and speed.
 * </p>
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 */
public enum MoCRRHorseBreed implements IntegerConversor, FileNameConversor
{
    //#region Breeds
    /**
     * The White Horses are a majestic breed very easy to spot by
     * its natural niveous coat, but rare to see for the same
     * recessive motive.
     *
     * @since 0.0.0.5
     */
    WHITE(MoCRRHorseTier.NATURAL, 1),

    /**
     * The Buckskin Horses are a light breed which compensate the lack
     * of a heavy resistance on its speed, making them naturally wilder
     * and hard to tame.
     *
     * @since 0.0.0.5
     */
    BUCKSKIN(MoCRRHorseTier.NATURAL, 2),

    /**
     * The Blood Bay Horses are a famous breed for their moderate resistance
     * and speed, which rended the fame of being one of the bests mounts found
     * on the nature.
     *
     * @since 0.0.0.5
     */
    BLOOD_BAY(MoCRRHorseTier.NATURAL, 3),

    /**
     * The Mahogany Horses are a docile breed of large animals acknowledged by
     * resistance and endurance, even on unfavorable terrain, which combined
     * became the choose for various mounted knights.
     *
     * @since 0.0.0.5
     */
    MAHOGANY(MoCRRHorseTier.NATURAL, 4),

    /**
     * The Black Horses are a rare breed difficultly seen because of their
     * recessive traits and the obvious black coat, and for that they became
     * much appreciated for interbreeds and alike.
     *
     * @since 0.0.0.5
     */
    BLACK(MoCRRHorseTier.NATURAL, 5),


    /**
     * The Palomino Snowflake Horses are a gentle breed which become searched
     * and bred for their appearance, as they have a soft cream coat and long
     * silky manes.
     *
     * @since 0.0.0.5
     */
    PALOMINO_SNOWFLAKE(MoCRRHorseTier.COMMON, 1),

    /**
     * The Grulla Overo Horses are a trusty breed that was created to sustain
     * hard climates while maintaining a good speed, what made them very
     * popular on their first appears.
     *
     * @since 0.0.0.5
     */
    GRULLA_OVERO(MoCRRHorseTier.COMMON, 2),

    /**
     * The Bay Horses are a relatively common breed considered an excellent
     * average choose for a mount that provides good results on almost all
     * ambients and activities.
     *
     * @since 0.0.0.5
     */
    BAY(MoCRRHorseTier.COMMON, 3),

    /**
     * The Dappled Grey Horses are a breed that was created searching for
     * the best recessive traits of its parents, but the result was not
     * of that promising and the breed exist more for exhibits.
     *
     * @since 0.0.0.5
     */
    DAPPLED_GREY(MoCRRHorseTier.COMMON, 4),


    /**
     * The Bay Tovero Horses are a breed with one of the best mixes acknowledged,
     * thus creating a strong animal with a majestic multicolored coat, fast, strong,
     * and resistant to different ambients.
     *
     * @since 0.0.0.5
     */
    BAY_TOVERO(MoCRRHorseTier.RARE, 1),

    /**
     * The Palomino Tovero Horses are a breed refined even among its Tier, mostly because
     * the reuse of traits of relatives breeds, but in no way theses horses are viewed
     * as weak or fragile.
     *
     * @since 0.0.0.5
     */
    PALOMINO_TOVERO(MoCRRHorseTier.RARE, 2),

    /**
     * The Grullo Tovero Horses are a temperamental breed considered one of the most beautiful
     * and slim, remarked for its lean coat, which contributes for its high velocity on runnings,
     * specially on plains or sand.
     *
     * @since 0.0.0.5
     */
    GRULLO_TOVERO(MoCRRHorseTier.RARE, 3),


    /**
     * The Black Leopard Horses are a swift and smart breed considered one of the bests in all
     * horse breeds, it is also the fastest and imperative, relieving the fame of a competitive
     * runner.
     *
     * @since 0.0.0.5
     */
    BLACK_LEOPARD(MoCRRHorseTier.FINEST, 1),

    /**
     * The Black Tovero Horses are a strong and genuine breed considered one of the bests in all
     * horse breeds, it has some recessive trait that make them uniquely capable of befriending
     * wild Zebras.
     *
     * @since 0.0.0.5
     */
    BLACK_TOVERO(MoCRRHorseTier.FINEST, 2);
    //#endregion

    //#region Properties
    /** The Tier which includes the Breed. */
    private final MoCRRHorseTier tier;

    /** The index of the Breed. */
    private final int breed;
    //#endregion

    //#region Constructors
    /**
     * When creating a Breed, the Tier is mandatory alongside
     * the index.
     *
     * @param tier  The instantiated Tier to include the Breed.
     * @param breed The index only enumerates the Breed and does
     *              not alter any aspect.
     */
    private MoCRRHorseBreed(MoCRRHorseTier tier, int breed)
    {
        this.tier = tier;
        this.breed = breed;
    }

    /**
     * From a valid {@link io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorseTier Tier} and
     * a raw {@code int} value, a Breed can be instantiated.
     *
     * @param tier  One of the existing Tiers.
     * @param breed The value must be on a specific range depending on the Tier,
     *              namely {@code 1:1..5}, {@code 2:1..4}, {@code 3:1..3} and {@code 4:1-2}.
     * @return It returns {@code null} if the values do not match.
     */
    public static final @Nullable MoCRRHorseBreed fromInt(MoCRRHorseTier tier, int breed)
    {
        switch(tier)
        {
            case NATURAL: switch(breed) {
                case 1: return WHITE;
                case 2: return BUCKSKIN;
                case 3: return BLOOD_BAY;
                case 4: return MAHOGANY;
                case 5: return BLACK;

                default: return null;
            }

            case COMMON: switch(breed) {
                case 1: return PALOMINO_SNOWFLAKE;
                case 2: return GRULLA_OVERO;
                case 3: return BAY;
                case 4: return DAPPLED_GREY;

                default: return null;
            }

            case RARE: switch(breed) {
                case 1: return BAY_TOVERO;
                case 2: return PALOMINO_TOVERO;
                case 3: return GRULLO_TOVERO;

                default: return null;
            }

            case FINEST: switch(breed) {
                case 1: return BLACK_LEOPARD;
                case 2: return BLACK_TOVERO;

                default: return null;
            }

            default: return null;
        }
    }

    /**
     * From two valid raw {@code int} values, one for the Tier and other
     * for the itself, a Breed can be instantiated.
     *
     * @param tier  The value must be on the {@code 1..4} interval.
     * @param breed The value must be on a specific range depending on the Tier,
     *              namely {@code 1:1..5}, {@code 2:1..4}, {@code 3:1..3} and {@code 4:1-2}.
     * @return It returns {@code null} if the values do not match.
     */
    public static final @Nullable MoCRRHorseBreed fromInt(int tier, int breed)
    {
        return MoCRRHorseBreed.fromInt(MoCRRHorseTier.fromInt(tier), breed);
    }
    //#endregion

    //#region Conversors
    /**
     * The Breed can be expressed as a raw {@code int} value.
     *
     * @return
     *         <p>
     *         The actual ranges fits the following table:
     *         <p>
     *         <table>
     *          <thead>
     *              <tr>
     *                  <th>
     *                      Tier
     *                  </th>
     *                  <th>
     *                      Breed
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
     *                      {@link MoCRRHorseBreed#WHITE White}
     *                  </td>
     *                  <td>
     *                      {@code 1}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BUCKSKIN Buckskin}
     *                  </td>
     *                  <td>
     *                      {@code 2}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BLOOD_BAY Blood Bay}
     *                  </td>
     *                  <td>
     *                      {@code 3}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#MAHOGANY Mahogany}
     *                  </td>
     *                  <td>
     *                      {@code 4}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#NATURAL Natural}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BLACK Black}
     *                  </td>
     *                  <td>
     *                      {@code 5}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#COMMON Common}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#PALOMINO_SNOWFLAKE Palomino Snowflake}
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
     *                      {@link MoCRRHorseBreed#GRULLA_OVERO Grulla Overo}
     *                  </td>
     *                  <td>
     *                      {@code 2}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#COMMON Common}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BAY Blood Bay}
     *                  </td>
     *                  <td>
     *                      {@code 3}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#COMMON Common}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#DAPPLED_GREY Mahogany}
     *                  </td>
     *                  <td>
     *                      {@code 4}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#RARE Rare}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BAY_TOVERO Bay Tovero}
     *                  </td>
     *                  <td>
     *                      {@code 1}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#RARE Rare}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#PALOMINO_TOVERO Palomino Tovero}
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
     *                      {@link MoCRRHorseBreed#GRULLO_TOVERO Grullo Tovero}
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
     *                      {@link MoCRRHorseBreed#BLACK_LEOPARD Black Leopard}
     *                  </td>
     *                  <td>
     *                      {@code 1}
     *                  </td>
     *              </tr>
     *              <tr>
     *                  <td>
     *                      {@link MoCRRHorseTier#FINEST Finest}
     *                  </td>
     *                  <td>
     *                      {@link MoCRRHorseBreed#BLACK_TOVERO Black Tovero}
     *                  </td>
     *                  <td>
     *                      {@code 2}
     *                  </td>
     *              </tr>
     *          </tbody>
     *         </table>
     */
    @Override
    public int asInt()
    {
        return this.breed;
    }

    /**
     * The part of the file names from the Breed is its own index, even
     * if it exist among different Tiers.
     *
     * @return The value is a {@code String} to use easily on concatenations.
     */
    @Override
    public String toFileNameString()
    {
        return String.valueOf(this.breed);
    }
    //#endregion

    //#region Getters
    /**
     * The Tier of the Breed can be directly accessed.
     *
     * @return The Breed's Tier is cannot be changed by any means.
     */
    public MoCRRHorseTier getTier()
    {
        return this.tier;
    }

    /**
     * The asserted accessor of the Tier return just its index.
     *
     * @return It is the raw {@code int} value of the Tier's index.
     * @see MoCRRHorseBreed#getTier() The enumerated method.
     */
    public int getTierAsInt()
    {
        return this.tier.asInt();
    }
    //#endregion
}