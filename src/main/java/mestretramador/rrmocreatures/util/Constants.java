package mestretramador.rrmocreatures.util;

/**
 * Constants class to use generally.
 * @version 0.0.5
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public final class Constants
{
    /**
     * The mod ID.
     */
    public static final String MOD_ID = "rrmocreatures";

    /**
     * Path to Items resources.
     */
    public static final String ITEM_PATH = "item/";

    /**
     * Path to Blocks resources.
     */
    public static final String BLOCK_PATH = "block/";

    /**
     * Items IDs.
     */
    public static class Items
    {
        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade Saddle} item ID. */
        public static final String HANDMADE_SADDLE = "handmade_saddle";
    }

    /**
     * Blocks IDs.
     */
    public static class Blocks
    {
        /**
         * Wyvern Lair Blocks IDs.
         */
        public static class WyvernLair
        {
            /**
             * Prefix to all Wyvern Lair Blocks IDs.
             */
            private static final String PREFIX = "wyvern_lair_";

            /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone Wyvern Lair Stone} block ID.*/
            public static final String STONE = PREFIX+"stone";
        }
    }
}
