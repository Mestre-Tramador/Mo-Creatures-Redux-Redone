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
}