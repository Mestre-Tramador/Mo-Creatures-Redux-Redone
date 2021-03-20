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
 * @version 0.028
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public final class Tags
{
    /** Item Tags. */
    public static final class Items
    {
        /**
         * <p> <b>Chitin Materials</b> Tag. </p>
         * <p> This tag groups Chitins as materials. </p>
         * @see Group#MATERIALS Materials Group
         * @see SubGroup#CHITIN Chitin SubGroup
         */
        public static final ITag.INamedTag<Item> MATERIALS_CHITIN = rrmocreatures(Group.MATERIALS + SubGroup.CHITIN);

        /**
         * <p> <b>Sting Materials</b> Tag. </p>
         * <p> This tag groups Stings as materials. </p>
         * @see Group#MATERIALS Materials Group
         * @see SubGroup#STING Sting SubGroup
         */
        public static final ITag.INamedTag<Item> MATERIALS_STING = rrmocreatures(Group.MATERIALS + SubGroup.STING);

        /**
         * <p> <b>TMNT Materials</b> Tag. </p>
         * <p> This tag groups all materials of TMNT Weapons. </p>
         * @see Group#MATERIALS Materials Group
         * @see SubGroup#TMNT TMNT SubGroup
         */
        public static final ITag.INamedTag<Item> MATERIALS_TMNT = rrmocreatures(Group.MATERIALS + SubGroup.TMNT);

        /**
         * <p> <b>Tusk Materials</b> Tag. </p>
         * <p> This tag groups all materials of Tusk Swords. </p>
         * @see Group#MATERIALS Materials Group
         * @see SubGroup#TUSK Tusk SubGroup
         */
        public static final ITag.INamedTag<Item> MATERIALS_TUSK = rrmocreatures(Group.MATERIALS + SubGroup.TUSK);

        /**
         * <p> <b>Ogre Lair Dirt</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair dirt block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#DIRT Dirt SubGroup
         */
        public static final ITag.INamedTag<Item> OGRE_LAIR_DIRT = rrmocreatures(Group.OGRE_LAIR + SubGroup.DIRT);

        /**
         * <p> <b>Ogre Lair Logs</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair unique logs block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#LOGS Logs SubGroup
         */
        public static final ITag.INamedTag<Item> OGRE_LAIR_LOGS = rrmocreatures(Group.OGRE_LAIR + SubGroup.LOGS);

        /**
         * <p> <b>Ogre Lair Planks</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair unique planks block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#PLANKS Planks SubGroup
         */
        public static final ITag.INamedTag<Item> OGRE_LAIR_PLANKS = rrmocreatures(Group.OGRE_LAIR + SubGroup.PLANKS);

        /**
         * <p> <b>Ogre Lair Stone</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair stone block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#STONE Stone SubGroup
         */
        public static final ITag.INamedTag<Item> OGRE_LAIR_STONE = rrmocreatures(Group.OGRE_LAIR + SubGroup.STONE);

        /**
         * <p> <b>TMNT Weapons</b> Tag. </p>
         * <p> This tag groups Teenage Mutant Ninja Turtles easter egg weapons. </p>
         * @see Group#WEAPONS Weapons Group
         * @see SubGroup#TMNT TMNT SubGroup
         */
        public static final ITag.INamedTag<Item> WEAPONS_TMNT = rrmocreatures(Group.WEAPONS + SubGroup.TMNT);

        /**
         * <p> <b>Wereables to Attack</b> Tag. </p>
         * <p> This tag groups wereables items used for attack and general damage. </p>
         * @see Group#WEREABLES Wereables Group
         * @see SubGroup#ATTACK Attack SubGroup
         */
        public static final ITag.INamedTag<Item> WEREABLES_ATTACK = rrmocreatures(Group.WEREABLES + SubGroup.ATTACK);
        
        /**
         * <p> <b>Wereables to Protect</b> Tag. </p>
         * <p> This tag groups wereables items used for protection and general defense. </p>
         * @see Group#WEREABLES Wereables Group
         * @see SubGroup#PROTECT Protect SubGroup
         */
        public static final ITag.INamedTag<Item> WEREABLES_PROTECT = rrmocreatures(Group.WEREABLES + SubGroup.PROTECT);
        
        /**
         * <p> <b>Wereables to Ride</b> Tag. </p>
         * <p> This tag groups wereables items used for riding. </p>
         * @see Group#WEREABLES Wereables Group
         * @see SubGroup#RIDE Ride SubGroup
         */
        public static final ITag.INamedTag<Item> WEREABLES_RIDE = rrmocreatures(Group.WEREABLES + SubGroup.RIDE);
        
        /**
         * <p> <b>Wereables for Storage</b> Tag. </p>
         * <p> This tag groups wereables items used for storaging. </p>
         * @see Group#WEREABLES Wereables Group
         * @see SubGroup#STORAGE Storage SubGroup
         */
        public static final ITag.INamedTag<Item> WEREABLES_STORAGE = rrmocreatures(Group.WEREABLES + SubGroup.STORAGE);

        /**
         * <p> <b>Wyvern Lair Dirt</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair dirt block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#DIRT Dirt SubGroup
         */
        public static final ITag.INamedTag<Item> WYVERN_LAIR_DIRT = rrmocreatures(Group.WYVERN_LAIR + SubGroup.DIRT);

        /**
         * <p> <b>Wyvern Lair Logs</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair unique logs block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#LOGS Logs SubGroup
         */
        public static final ITag.INamedTag<Item> WYVERN_LAIR_LOGS = rrmocreatures(Group.WYVERN_LAIR + SubGroup.LOGS);

        /**
         * <p> <b>Wyvern Lair Planks</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair unique planks block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#PLANKS Planks SubGroup
         */
        public static final ITag.INamedTag<Item> WYVERN_LAIR_PLANKS = rrmocreatures(Group.WYVERN_LAIR + SubGroup.PLANKS);

        /**
         * <p> <b>Wyvern Lair Stone</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair stone block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#STONE Stone SubGroup
         */
        public static final ITag.INamedTag<Item> WYVERN_LAIR_STONE = rrmocreatures(Group.WYVERN_LAIR + SubGroup.STONE);

        /**
         * Helper method to create a tag for Forge.
         * 
         * @param path The path to the Tag.
         * @return The Item Tag.
         */
        @SuppressWarnings("unused")
        private static final ITag.INamedTag<Item> forge(String path)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(Constants.FORGE_ID, path).toString());
        }

        /**
         * Helper to create a tag for Mo'Creatures Redux&Redone.
         * 
         * @param path The path to the Tag.
         * @return The Item Tag.
         */
        private static final ITag.INamedTag<Item> rrmocreatures(String path)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(Constants.MOD_ID, path).toString());
        }
    }

    /** Block Tags. */
    public static final class Blocks
    {
        /**
         * <p> <b>Ogre Lair Dirt</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair dirt blocks. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#DIRT Dirt SubGroup
         */
        public static final ITag.INamedTag<Block> OGRE_LAIR_DIRT = rrmocreatures(Group.OGRE_LAIR + SubGroup.DIRT);

        /**
         * <p> <b>Ogre Lair Logs</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair unique logs block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#LOGS Logs SubGroup
         */
        public static final ITag.INamedTag<Block> OGRE_LAIR_LOGS = rrmocreatures(Group.OGRE_LAIR + SubGroup.LOGS);

        /**
         * <p> <b>Ogre Lair Planks</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair unique planks block items. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#PLANKS Planks SubGroup
         */
        public static final ITag.INamedTag<Block> OGRE_LAIR_PLANKS = rrmocreatures(Group.OGRE_LAIR + SubGroup.PLANKS);

        /**
         * <p> <b>Ogre Lair Stone</b> Tag. </p>
         * <p> This tag groups all accept Ogre Lair stone blocks. </p>
         * @see Group#OGRE_LAIR Ogre Lair Group
         * @see SubGroup#STONE Stone SubGroup
         */
        public static final ITag.INamedTag<Block> OGRE_LAIR_STONE = rrmocreatures(Group.OGRE_LAIR + SubGroup.STONE);        

        /**
         * <p> <b>Wyvern Lair Dirt</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair dirt blocks. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#DIRT Dirt SubGroup
         */
        public static final ITag.INamedTag<Block> WYVERN_LAIR_DIRT = rrmocreatures(Group.WYVERN_LAIR + SubGroup.DIRT);

        /**
         * <p> <b>Wyvern Lair Logs</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair unique logs block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#LOGS Logs SubGroup
         */
        public static final ITag.INamedTag<Block> WYVERN_LAIR_LOGS = rrmocreatures(Group.WYVERN_LAIR + SubGroup.LOGS);

        /**
         * <p> <b>Wyvern Lair Planks</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair unique planks block items. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#PLANKS Planks SubGroup
         */
        public static final ITag.INamedTag<Block> WYVERN_LAIR_PLANKS = rrmocreatures(Group.WYVERN_LAIR + SubGroup.PLANKS);
        
        /**
         * <p> <b>Wyvern Lair Stone</b> Tag. </p>
         * <p> This tag groups all accept Wyvern Lair stone blocks. </p>
         * @see Group#WYVERN_LAIR Wyvern Lair Group
         * @see SubGroup#STONE Stone SubGroup
         */
        public static final ITag.INamedTag<Block> WYVERN_LAIR_STONE = rrmocreatures(Group.WYVERN_LAIR + SubGroup.STONE);

        /**
         * Helper method to create a tag for Forge.
         * 
         * @param path The path to the Tag.
         * @return The Block Tag.
         */
        @SuppressWarnings("unused")
        private static final ITag.INamedTag<Block> forge(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(Constants.FORGE_ID, path).toString());
        }

        /**
         * Helper to create a tag for Mo'Creatures Redux&Redone.
         * 
         * @param path The path to the Tag.
         * @return The Block Tag.
         */
        private static final ITag.INamedTag<Block> rrmocreatures(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(Constants.MOD_ID, path).toString());
        }
    }

    /** Constants to Tags Groups. */
    private static final class Group
    {
        /**
         * <p> <b>Materials</b> Group. </p>
         * <p> This group defines MoCRR material items. </p>
         * <ul>
         * <li> A amterial item is an itme used majoritarily to craft others. </li>
         * </ul>
         */
        private static final String MATERIALS = "materials";

        /**
         * <p> <b>Ogre Lair</b> Group. </p>
         * <p> This group defines if a item or a block is related to the Ogre Lair Dimension. </p>
         * <ul>
         * <li> The Ogre Lair is a special dimension like the Nether. </li>
         * </ul>
         */
        private static final String OGRE_LAIR = "ogre_lair";

        /**
         * <p> <b>Weapons</b> Group. </p>
         * <p> This group defines MoCRR weapons items. </p>
         * <ul>
         * <li> A weapon item is an item used majoritarily to inflict damage on any entity. </li>
         * </ul>
         */
        private static final String WEAPONS = "weapons";

        /**
         * <p> <b>Wereables</b> Group. </p>
         * <p> This group defines if a item is wereable by a MoCRR entity. </p>
         * <ul>
         * <li> A wereable item is an item given by the player to the entity. </li>
         * <li> The wereable item stays with the entity until it dies or the item is removed. </li>
         * </ul>
         */
        private static final String WEREABLES = "wearables";

        /**
         * <p> <b>Wyvern Lair</b> Group. </p>
         * <p> This group defines if a item or a block is related to the Wyvern Lair Dimension. </p>
         * <ul>
         * <li> The Wyvern Lair is a special dimension like the Nether. </li>
         * </ul>
         */
        private static final String WYVERN_LAIR = "wyvern_lair";
    }

    /** Constants to Tags SubGroups. */
    private static final class SubGroup
    {
        /**
         * <p> <b>Attack</b> SubGroup. </p>
         * <p> This subgroup defines if a item is by a MoCRR entity to inflict damage. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WEREABLES Wereables}</b> group. </li>
         * </ul>
         */
        private static final String ATTACK = "/attack";

        /**
         * <p> <b>Chitin</b> SubGroup. </p>
         * <p> This subgroup defines if a item is a Chitin from a Scorpion of entity like. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#MATERIALS Materials}</b> group. </li>
         * </ul>
         */
        private static final String CHITIN = "/chitin";

        /**
         * <p> <b>Dirt</b> SubGroup. </p>
         * <p> This subgroup defines if a block corresponds or is related to general earth types. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#OGRE_LAIR Ogre Lair}</b> group. </li>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WYVERN_LAIR Wyvern Lair}</b> group. </li>
         * </ul>
         */
        private static final String DIRT = "/dirt";

        /**
         * <p> <b>Logs</b> SubGroup. </p>
         * <p> This subgroup defines if a block corresponds or is related to general wood logs types. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#OGRE_LAIR Ogre Lair}</b> group. </li>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WYVERN_LAIR Wyvern Lair}</b> group. </li>
         * </ul>
         */
        private static final String LOGS = "/logs";

        /**
         * <p> <b>Planks</b> SubGroup. </p>
         * <p> This subgroup defines if a block corresponds or is related to general wood planks types. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#OGRE_LAIR Ogre Lair}</b> group. </li>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WYVERN_LAIR Wyvern Lair}</b> group. </li>
         * </ul>
         */
        private static final String PLANKS = "/planks";

        /**
         * <p> <b>Protect</b> SubGroup. </p>
         * <p> This subgroup defines if a item is used to protect a MoCRR entity when on it. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WEREABLES Wereables}</b> group. </li>
         * </ul>
         */
        private static final String PROTECT = "/protect";

        /**
         * <p> <b>Ride</b> SubGroup. </p>
         * <p> This subgroup defines if a item is used to ride a MoCRR entity. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WEREABLES Wereables}</b> group. </li>
         * </ul>
         */
        private static final String RIDE = "/ride";

        /**
         * <p> <b>Sting Sword</b> SubGroup. </p>
         * <p> This subgroup defines if a item is a Sting from a Scorpion of entity like. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#MATERIALS Materials}</b> group. </li>
         * </ul>
         */
        private static final String STING = "/sting";

        /**
         * <p> <b>Stone</b> SubGroup. </p>
         * <p> This subgroup defines if a block corresponds or is related to general rock types. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#OGRE_LAIR Ogre Lair}</b> group. </li>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WYVERN_LAIR Wyvern Lair}</b> group. </li>
         * </ul>
         */
        private static final String STONE = "/stone";

        /**
         * <p> <b>Storage</b> SubGroup. </p>
         * <p> This subgroup defines if a item is used for storage when on a MoCRR entity. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WEREABLES Wereables}</b> group. </li>
         * </ul>
         */
        private static final String STORAGE = "/storage";

        /**
         * <p> <b>TMNT</b> SubGroup. </p>
         * <p> This subgroup defines if a item is a Teenage Mutant Ninja Turtles easter egg. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#WEAPONS Weapons}</b> group. </li>
         * </ul>
         */
        private static final String TMNT = "/tmnt";

        /**
         * <p> <b>Tusk</b> SubGroup. </p>
         * <p> This subgroup defines if a item is a Tusk Sword for Elephants of Mammoths. </p>
         * <ul>
         * <li> This subgroup is appended to the <b>{@link mestretramador.rrmocreatures.util.Tags.Group#MATERIALS Materials}</b> group. </li>
         * </ul>
         */
        private static final String TUSK = "/tusk";
    }
}
