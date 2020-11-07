package mestretramador.rrmocreatures.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

/**
 * Tags class to use generally and in the Data Generation.
 * 
 * @version 0.0.7
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public final class Tags
{
    /** Item Tags. */
    public static class Items
    {
        /** Werables Mount tag. */
        public static final ITag.INamedTag<Item> WEARABLE_MOUNT = forge(TagsConstants.WEARABLE_MOUNT);

        /** BlockItem Tags to copy. */
        public static class BlockItems
        {
            /** Wyvern Lair BlockItem Tags. */
            public static class WyvernLair
            {
                /** Wyvern Lair BlockItem tag. */
                public static final ITag.INamedTag<Item> WYVERN_LAIR_BLOCK_ITEMS = forge(TagsConstants.WyvernLair.WYVERN_LAIR_BLOCKS);
            }
        }

        /**
         * Helper method to create a tag for Forge.
         * 
         * @param path The path to the Tag.
         * @return The Item Tag.
         */
        private static ITag.INamedTag<Item> forge(String path)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(Constants.FORGE_ID, path).toString());
        }

        /**
         * Helper to create a tag for Mo'Creatures Redux&Redone.
         * 
         * @param path The path to the Tag.
         * @return The Item Tag.
         */
        @SuppressWarnings("unused")
        private static ITag.INamedTag<Item> rrmocreatures(String path)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(Constants.MOD_ID, path).toString());
        }
    }

    /** Block Tags. */
    public static class Blocks
    {
        /** Wyvern Lair Block Tags. */
        public static class WyvernLair
        {
            public static final ITag.INamedTag<Block> WYVERN_LAIR_BLOCKS = forge(TagsConstants.WyvernLair.WYVERN_LAIR_BLOCKS);
        }

        /**
         * Helper method to create a tag for Forge.
         * 
         * @param path The path to the Tag.
         * @return The Block Tag.
         */
        private static ITag.INamedTag<Block> forge(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(Constants.FORGE_ID, path).toString());
        }

        /**
         * Helper to create a tag for Mo'Creatures Redux&Redone.
         * 
         * @param path The path to the Tag.
         * @return The Block Tag.
         */
        @SuppressWarnings("unused")
        private static ITag.INamedTag<Block> rrmocreatures(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(Constants.MOD_ID, path).toString());
        }
    }

    /** Constants to Tags Paths. */
    private static class TagsConstants
    {
        /** Path to {@link Tags.Items#WEARABLE_MOUNT Wereables Mount} tag. */
        private static final String WEARABLE_MOUNT = "wearable/mount";

        /** Paths to Wyvern Lair Tags. */
        private class WyvernLair
        {
            /** Wyvern Lair Path Prefix. */
            private static final String PREFIX = "wyvern_lair/";

            /**
             * Path to {@link Tags.Blocks.WyvernLair#WYVERN_LAIR_BLOCKS Wyvern Lair Blocks}
             * tag.
             */
            private static final String WYVERN_LAIR_BLOCKS = PREFIX + "blocks";
        }
    }
}
