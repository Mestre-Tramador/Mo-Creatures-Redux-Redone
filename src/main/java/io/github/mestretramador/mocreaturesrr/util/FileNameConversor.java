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
 * A simple conversor for a {@code String} value
 * to use as a file name, very useful for certain
 * enumerations and classes that export values.
 *
 * @since 0.0.0.5
 * @author Mestre Tramador
 */
public interface FileNameConversor
{
    /**
     * Mandatorily convert the object or value to a {@code String}
     * which will serve as the file name or part of.
     *
     * @return The conversion method is exclusive of the implementation
     *         and may change the creation of the value, thus not having
     *         a default body.
     */
    public String toFileNameString();
}