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
 * Paths commons to Minecraft's folders.
 */
public enum Path
{
    /** The {@code item} folder.*/
    ITEM("item");

    /** The current full path to the folder. */
    private final String path;

    /**
     * When creating the enumeration, a
     * {@code /} character is appended to
     * the given path.
     *
     * @param to The folder name or sequence
     *           without the final slash.
     */
    private Path(final String to)
    {
        this.path = to.concat("/");
    }

    /**
     * The Stringfication of the enum
     * provides the path as is.
     *
     * @return A String formed of the
     *         folder or sequence of
     *         with a final slash.
     */
    @Override
    public String toString()
    {
        return this.path;
    }

    /**
     * Stringfy the path, and adds
     * the {@code generated} subfolder.
     *
     * @return A String formed of the
     *         folder or sequence of
     *         with the final path
     *         leading to the
     *         {@code generated}
     *         subfolder.
     */
    public String generated()
    {
        return this.toString().concat("generated");
    }

    /**
     * Stringfy the path, and adds
     * the {@code template_spawn_egg}
     * subfolder.
     *
     * @return A String formed of the
     *         folder or sequence of
     *         with the final path
     *         leading to the
     *         {@code template_spawn_egg}
     *         subfolder.
     */
    public String spawnEgg()
    {
        return this.toString().concat("template_spawn_egg");
    }
}