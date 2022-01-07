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

/**
 * Marks a Mob as Tierable, which implies in having a Tier and a Breed,
 * that may infer on the Mob status, attributes and breeding.
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 */
public interface MoCRRTierableAnimal
{
    /**
     * The Tier must at least be represented by a raw {@code int} value.
     *
     * @return The index of the Tier.
     */
    public int getTier();

    /**
     * The Tier's Breed must at least be represented by a raw {@code int} value.
     *
     * @return The index of the Tier's Breed.
     */
    public int getBreed();

    /**
     * The Breeds of the Tier must at least be accessed by theirs raw {@code int} value.
     *
     * @return The index of each of the Breeds of the Tier.
     */
    public int[] getTierBreeds();
}