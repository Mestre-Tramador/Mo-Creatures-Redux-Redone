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

package io.github.mestretramador.mocreaturesrr.util;

/**
 * Item Models' Layers to use on data generation.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public enum Layer
{
    /** The <i>layer0</i>. */
    ZERO(0),

    /** The <i>layer1</i>. */
    ONE(1);

    /**
     * All Layers have the
     * word {@code "layer"} prefixed.
     */
    private final String prefix = "layer";

    /** The current layer builded. */
    private final String layer;

    /**
     * All Layers must be indexed
     * by an integer value.
     *
     * @param index The number which
     *              sufixes the Layer.
     */
    private Layer(final int index)
    {
        this.layer = prefix + index;
    }

    /**
     * The Stringfication of the enum
     * provides with the full name of
     * the entry.
     *
     * @return A String formed of the
     *         word {@code "layer"} and
     *         the integer value index.
     */
    @Override
    public String toString()
    {
        return this.layer;
    }
}