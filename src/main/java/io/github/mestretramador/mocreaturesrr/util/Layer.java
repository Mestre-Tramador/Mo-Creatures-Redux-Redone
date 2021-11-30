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
