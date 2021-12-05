package io.github.mestretramador.mocreaturesrr.entity;

/**
 * <p>
 * All MoC R&R mobs can be divided in three Categories.
 * </p>
 * <br />
 * <p>
 * Each one has its influence towards many behaviors of
 * the mob and its spawning.
 * </p>
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public enum MoCRRMobCategory
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
    @SuppressWarnings("unused")
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
}