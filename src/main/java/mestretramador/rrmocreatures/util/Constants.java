package mestretramador.rrmocreatures.util;

/**
 * Constants class to use generally.
 * 
 * @version 0.0.16
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public final class Constants
{
    /** The mod ID. */
    public static final String MOD_ID = "rrmocreatures";

    /** Forge ID. */
    public static final String FORGE_ID = "forge";

    /** Path to Items resources. */
    public static final String ITEM_PATH = "item/";

    /** Path to Blocks resources. */
    public static final String BLOCK_PATH = "block/";

    /** Path to Sound Events resources. */
    public static final String SOUNDS_PATH = "sounds/";

    /** Path to music Sound Events resoureces. */
    public static final String MUSICS_PATH = SOUNDS_PATH + "music/";

    /** Supported Languages IDs. */
    public static class Langs
    {
        /** English (US). */
        public static final String EN_US = "en_us";
    }

    /** Items IDs. */
    public static class Items
    {
        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletBone Bone Amulet} item ID. */
        public static final String AMULET_BONE = Prefix.AMULET + "bone";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletBoneFilled Filled Bone Amulet} item ID. */
        public static final String AMULET_BONE_FILLED = AMULET_BONE + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletFairy Fairy Amulet} item ID. */
        public static final String AMULET_FAIRY = Prefix.AMULET + "fairy";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletFairyFilled Filled Fairy Amulet} item ID. */
        public static final String AMULET_FAIRY_FILLED = AMULET_FAIRY + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGhost Ghost Amulet} item ID. */
        public static final String AMULET_GHOST = Prefix.AMULET + "ghost";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGhostFilled Filled Ghost Amulet} item ID. */
        public static final String AMULET_GHOST_FILLED = AMULET_GHOST + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGuardian Guardian Amulet} item ID. */
        public static final String AMULET_GUARDIAN = Prefix.AMULET + "guardian";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletGuardianFilled Filled Guardian Amulet} item ID. */
        public static final String AMULET_GUARDIAN_FILLED = AMULET_GUARDIAN + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletSky Sky Amulet} item ID. */
        public static final String AMULET_SKY = Prefix.AMULET + "sky";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemAmuletSkyFilled Filled Sky Amulet} item ID. */
        public static final String AMULET_SKY_FILLED = AMULET_SKY + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemBigCatClaw BigCat Claw} item ID. */
        public static final String BIGCAT_CLAW = "bigcat_claw";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDark Dark Chitin} item ID. */
        public static final String CHITIN_DARK = Prefix.CHITIN + "dark";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDarkBoots Dark Chitin Boots} item ID. */
        public static final String CHITIN_DARK_BOOTS = CHITIN_DARK + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDarkChest Dark Chitin Chest} item ID. */
        public static final String CHITIN_DARK_CHEST = CHITIN_DARK + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDarkHelmet Dark Chitin Helmet} item ID. */
        public static final String CHITIN_DARK_HELMET = CHITIN_DARK + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDarkLegs Dark Chitin Legs} item ID. */
        public static final String CHITIN_DARK_LEGS = CHITIN_DARK + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirt Dirt Chitin} item ID. */
        public static final String CHITIN_DIRT = Prefix.CHITIN + "dirt";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirtBoots Dirt Chitin Boots} item ID. */
        public static final String CHITIN_DIRT_BOOTS = CHITIN_DIRT + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirtChest Dirt Chitin Chest} item ID. */
        public static final String CHITIN_DIRT_CHEST = CHITIN_DIRT + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirtHelmet Dirt Chitin Helmet} item ID. */
        public static final String CHITIN_DIRT_HELMET = CHITIN_DIRT + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinDirtLegs Dirt Chitin Legs} item ID. */
        public static final String CHITIN_DIRT_LEGS = CHITIN_DIRT + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrost Frost Chitin} item ID. */
        public static final String CHITIN_FROST = Prefix.CHITIN + "frost";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostBoots Frost Chitin Boots} item ID. */
        public static final String CHITIN_FROST_BOOTS = CHITIN_FROST + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostChest Frost Chitin Chest} item ID. */
        public static final String CHITIN_FROST_CHEST = CHITIN_FROST + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostHelmet Frost Chitin Helmet} item ID. */
        public static final String CHITIN_FROST_HELMET = CHITIN_FROST + Sufix.HELMET;        

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinFrostLegs Frost Chitin Legs} item ID. */
        public static final String CHITIN_FROST_LEGS = CHITIN_FROST + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNether Nether Chitin} item ID. */
        public static final String CHITIN_NETHER = Prefix.CHITIN + "nether";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherBoots Nether Chitin Boots} item ID. */
        public static final String CHITIN_NETHER_BOOTS = CHITIN_NETHER + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherChest Nether Chitin Chest} item ID. */
        public static final String CHITIN_NETHER_CHEST = CHITIN_NETHER + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherHelmet Nether Chitin Helmet} item ID. */
        public static final String CHITIN_NETHER_HELMET = CHITIN_NETHER + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemChitinNetherLegs Nether Chitin Legs} item ID. */
        public static final String CHITIN_NETHER_LEGS = CHITIN_NETHER + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemCrabCooked Cooked Crab} item ID. */
        public static final String CRAB_COOKED = "crab" + Sufix.COOKED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemCrabRaw Raw Crab} item ID. */
        public static final String CRAB_RAW = "crab" + Sufix.RAW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemCreaturePedia Creaturepedia} item ID. */
        public static final String CREATURE_PEDIA = "creature_pedia";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEggHatchable Hatchable Egg} item ID. */
        public static final String EGG_HATCHABLE = "egg_hatchable";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEggHatchableOmelet Omelet} item ID. */
        public static final String EGG_HATCHABLE_OMELET = EGG_HATCHABLE + "_omelet";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantChest Elephant Saddlebag} item ID. */
        public static final String ELEPHANT_CHEST = Prefix.ELEPHANT + "chest";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantHarness Elephant Harness} item ID. */
        public static final String ELEPHANT_HARNESS = Prefix.ELEPHANT + "harness";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantIndianGarment Indian Elephant Garment} item ID. */
        public static final String ELEPHANT_INDIAN_GARMENT = Prefix.ELEPHANT_INDIAN + "garment";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantIndianHowdah Indian Elephant Howdah} item ID. */
        public static final String ELEPHANT_INDIAN_HOWDAH = Prefix.ELEPHANT_INDIAN + "howdah";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantMammothPlatform Songhua River Mammoth Platform} item ID. */
        public static final String ELEPHANT_MAMMOTH_PLATFORM = Prefix.ELEPHANT_MAMMOTH + "platform";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksDiamond Diamond Elephant Tusk Sword} item ID. */
        public static final String ELEPHANT_TUSKS_DIAMOND = Prefix.ELEPHANT_TUSKS + "diamond";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksIron Iron Elephant Tusk Sword} item ID. */
        public static final String ELEPHANT_TUSKS_IRON = Prefix.ELEPHANT_TUSKS + "iron";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemElephantTusksWood Wood Elephant Tusk Sword} item ID. */
        public static final String ELEPHANT_TUSKS_WOOD = Prefix.ELEPHANT_TUSKS + "wood";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceDarkness Essence of Darkness} item ID. */
        public static final String ESSENCE_DARKNESS = Prefix.ESSENCE + "darkness";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceFire Essence of Fire} item ID. */
        public static final String ESSENCE_FIRE = Prefix.ESSENCE + "fire";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceLight Essence of Light} item ID. */
        public static final String ESSENCE_LIGHT = Prefix.ESSENCE + "light";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceUndead Essence of the Undead} item ID. */
        public static final String ESSENCE_UNDEAD = Prefix.ESSENCE + "undead";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFishNet Fish Net} item ID. */
        public static final String FISH_NET = "fish_net";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFishNetFilled Filled Fish Net} item ID. */
        public static final String FISH_NET_FILLED = FISH_NET + Sufix.FILLED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFur Fur} item ID. */
        public static final String FUR = "fur";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFurBoots Fur Boots} item ID. */
        public static final String FUR_BOOTS = FUR + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFurChest Fur Chest} item ID. */
        public static final String FUR_CHEST = FUR + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFurHelmet Fur Helmet} item ID. */
        public static final String FUR_HELMET = FUR + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemFurLegs Fur Legs} item ID. */
        public static final String FUR_LEGS = FUR + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeLead Handmade Lead} item ID. */
        public static final String HANDMADE_LEAD = Prefix.HANDMADE + "lead";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorCrystal Crystal Handmade Mount Armor} item ID. */
        public static final String HANDMADE_MOUNT_ARMOR_CRYSTAL = Prefix.HANDMADE_MOUNT_ARMOR + "crystal";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorDiamond Diamond Handmade Mount Armor} item ID. */
        public static final String HANDMADE_MOUNT_ARMOR_DIAMOND = Prefix.HANDMADE_MOUNT_ARMOR + "diamond";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorGold Gold Handmade Mount Armor} item ID. */
        public static final String HANDMADE_MOUNT_ARMOR_GOLD = Prefix.HANDMADE_MOUNT_ARMOR + "gold";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorIron Iron Handmade Mount Armor} item ID. */
        public static final String HANDMADE_MOUNT_ARMOR_IRON = Prefix.HANDMADE_MOUNT_ARMOR + "iron";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorLeather Leather Handmade Mount Armor} item ID. */
        public static final String HANDMADE_MOUNT_ARMOR_LEATHER = Prefix.HANDMADE_MOUNT_ARMOR + "leather";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddle Handmade Saddle} item ID. */
        public static final String HANDMADE_SADDLE = Prefix.HANDMADE + "saddle";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeSaddleChest Handmade Saddlebag} item ID. */
        public static final String HANDMADE_SADDLE_CHEST = HANDMADE_SADDLE + "_chest";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHeartDarkness Heart of Darkness} item ID. */
        public static final String HEART_DARKNESS = Prefix.HEART + "darkness";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHeartFire Heart of Fire} item ID. */
        public static final String HEART_FIRE = Prefix.HEART + "fire";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHeartUndead Heart of the Undead} item ID. */
        public static final String HEART_UNDEAD = Prefix.HEART + "undead";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHide Hide} item ID. */
        public static final String HIDE = "hide";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHideBoots Hide Boots} item ID. */
        public static final String HIDE_BOOTS = HIDE + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHideChest Hide Chest} item ID. */
        public static final String HIDE_CHEST = HIDE + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHideHelmet Hide Helmet} item ID. */
        public static final String HIDE_HELMET = HIDE + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemHideLegs Hide Legs} item ID. */
        public static final String HIDE_LEGS = HIDE + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKey Key} item ID. */
        public static final String KEY = "key";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBed Kitty Bed} item ID. */
        public static final String KITTY_BED = Prefix.KITTY + "bed";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedBlack Black Kitty Bed} item ID. */
        public static final String KITTY_BED_BLACK = KITTY_BED + Sufix.BLACK;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedBlue Blue Kitty Bed} item ID. */
        public static final String KITTY_BED_BLUE = KITTY_BED + Sufix.BLUE;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedBrown Brown Kitty Bed} item ID. */
        public static final String KITTY_BED_BROWN = KITTY_BED + Sufix.BROWN;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedCyan Cyan Kitty Bed} item ID. */
        public static final String KITTY_BED_CYAN = KITTY_BED + Sufix.CYAN;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedGray Gray Kitty Bed} item ID. */
        public static final String KITTY_BED_GRAY = KITTY_BED + Sufix.GRAY;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedGreen Green Kitty Bed} item ID. */
        public static final String KITTY_BED_GREEN = KITTY_BED + Sufix.GREEN;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedLightBlue Light Blue Kitty Bed} item ID. */
        public static final String KITTY_BED_LIGHT_BLUE = KITTY_BED + Sufix.LIGHT_BLUE;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedLightGray Light Gray Kitty Bed} item ID. */
        public static final String KITTY_BED_LIGHT_GRAY = KITTY_BED + Sufix.LIGHT_GRAY;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedLime Lime Kitty Bed} item ID. */
        public static final String KITTY_BED_LIME = KITTY_BED + Sufix.LIME;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedMagenta Magenta Kitty Bed} item ID. */
        public static final String KITTY_BED_MAGENTA = KITTY_BED + Sufix.MAGENTA;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedOrange Orange Kitty Bed} item ID. */
        public static final String KITTY_BED_ORANGE = KITTY_BED + Sufix.ORANGE;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedPink Pink Kitty Bed} item ID. */
        public static final String KITTY_BED_PINK = KITTY_BED + Sufix.PINK;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedPurple Purple Kitty Bed} item ID. */
        public static final String KITTY_BED_PURPLE = KITTY_BED + Sufix.PURPLE;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedRed Red Kitty Bed} item ID. */
        public static final String KITTY_BED_RED = KITTY_BED + Sufix.RED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedWhite White Kitty Bed} item ID. */
        public static final String KITTY_BED_WHITE = KITTY_BED + Sufix.WHITE;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyBedYellow Yellow Kitty Bed} item ID. */
        public static final String KITTY_BED_YELLOW = KITTY_BED + Sufix.YELLOW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyFood Kitty Food} item ID. */
        public static final String KITTY_FOOD = Prefix.KITTY + "food";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyLither Kitty Lither} item ID. */
        public static final String KITTY_LITTER = Prefix.KITTY + "litter";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemKittyWoolBall Kitty Wool Ball} item ID. */
        public static final String KITTY_WOOL_BALL = Prefix.KITTY + "wool_ball";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemMedallion Medallion} item ID. */
        public static final String MEDALLION = "medallion";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemOgreLairPrinceCannonFire Fire Cannon} item ID. */
        public static final String OGRE_LAIR_PRINCE_CANNON_FIRE = Prefix.OGRE_LAIR_PRINCE + "cannon_fire";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemOgreLairPrinceHammerBuilder Builder Hamer} item ID. */
        public static final String OGRE_LAIR_PRINCE_HAMMER_BUILDER = Prefix.OGRE_LAIR_PRINCE + "hammer_builder";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemOgreLairPrinceStaffTeleport Staff of Teleportation} item ID. */
        public static final String OGRE_LAIR_PRINCE_STAFF_TELEPORT = Prefix.OGRE_LAIR_PRINCE + "staff_teleport";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemOstrichCooked Cooked Ostrich} item ID. */
        public static final String OSTRICH_COOKED = "ostrich" + Sufix.COOKED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemOstrichRaw Raw Ostrich} item ID. */
        public static final String OSTRICH_RAW = "ostrich" + Sufix.RAW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemRatBurger Rat Burger} item ID. */
        public static final String RAT_BURGER = "rat_burger";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemRatCooked Cooked Rat} item ID. */
        public static final String RAT_COOKED = "rat" + Sufix.COOKED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemRatRaw Raw Rat} item ID. */
        public static final String RAT_RAW = "rat" + Sufix.RAW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemRecordZebra Music Disc - Zebra} item ID. */
        public static final String RECORD_ZEBRA = "record_zebra";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHide Reptile Hide} item ID. */
        public static final String REPTILE_HIDE = "reptile_hide";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHideBoots Reptile Hide Boots} item ID. */
        public static final String REPTILE_HIDE_BOOTS = REPTILE_HIDE + Sufix.BOOTS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHideChest Reptile Hide Chest} item ID. */
        public static final String REPTILE_HIDE_CHEST = REPTILE_HIDE + Sufix.CHEST;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHideHelmet Reptile Hide Helmet} item ID. */
        public static final String REPTILE_HIDE_HELMET = REPTILE_HIDE + Sufix.HELMET;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemReptileHideLegs Reptile Hide Legs} item ID. */
        public static final String REPTILE_HIDE_LEGS = REPTILE_HIDE + Sufix.LEGS;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemScrollBlank Blank Scroll} item ID. */
        public static final String SCROLL_BLANK = Prefix.SCROLL + "blank";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemScrollFreedom Scroll - Freedom} item ID. */
        public static final String SCROLL_FREEDOM = Prefix.SCROLL + "freedom";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemScrollOwner Scroll - Owner} item ID. */
        public static final String SCROLL_OWNER = Prefix.SCROLL + "owner";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemScrollSale Scroll - Sale} item ID. */
        public static final String SCROLL_SALE = Prefix.SCROLL + "sale";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeeth Shark Teeth} item ID. */
        public static final String SHARK_TEETH = "shark_teeth";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemSharkTeethSword Shark Teeth Sword} item ID. */
        public static final String SHARK_TEETH_SWORD = SHARK_TEETH + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemSilverSkeletonSword Silver Skeleton Sword} item ID. */
        public static final String SILVER_SKELETON_SWORD = "silver_skeleton" + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStaffBase Staff Base} item ID. */
        public static final String STAFF_BASE = Prefix.STAFF + "base";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStaffDiamond Staff - Diamond} item ID. */
        public static final String STAFF_DIAMOND = Prefix.STAFF + "diamond";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStaffEnder Staff - Ender} item ID. */
        public static final String STAFF_ENDER = Prefix.STAFF + "ender";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStaffLight Staff - Light} item ID. */
        public static final String STAFF_LIGHT = Prefix.STAFF + "light";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingDark Dark Sting} item ID. */
        public static final String STING_DARK = Prefix.STING + "dark";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingDarkSword Dark Sting Sword} item ID. */
        public static final String STING_DARK_SWORD = STING_DARK + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirt Dirt Sting} item ID. */
        public static final String STING_DIRT = Prefix.STING + "dirt";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingDirtSword Dirt Sting Sword} item ID. */
        public static final String STING_DIRT_SWORD = STING_DIRT + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingFrost Frost Sting} item ID. */
        public static final String STING_FROST = Prefix.STING + "frost";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingFrostSword Frost Sting Sword} item ID. */
        public static final String STING_FROST_SWORD = STING_FROST + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingNether Nether Sting} item ID. */
        public static final String STING_NETHER = Prefix.STING + "nether";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemStingNetherSword Nether Sting Sword} item ID. */
        public static final String STING_NETHER_SWORD = STING_NETHER + Sufix.SWORD;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemSugarLump Sugar Lumps} item ID. */
        public static final String SUGAR_LUMP = "sugar_lump";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTBo Bo} item ID. */
        public static final String TMNT_BO = Prefix.TMNT + "bo";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTKatana Katana} item ID. */
        public static final String TMNT_KATANA = Prefix.TMNT + "katana";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTNunchaku Nunchaku} item ID. */
        public static final String TMNT_NUNCHAKU = Prefix.TMNT + "nunchaku";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTMNTSai Sai} item ID. */
        public static final String TMNT_SAI = Prefix.TMNT + "sai";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTurkeyCooked Cooked Turkey} item ID. */
        public static final String TURKEY_COOKED = "turkey" + Sufix.COOKED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTurkeyRaw Raw Turkey} item ID. */
        public static final String TURKEY_RAW = "turkey" + Sufix.RAW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTurtleCooked Cooked Turtle} item ID. */
        public static final String TURTLE_COOKED = "turtle" + Sufix.COOKED;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTurtleCookedSoup Turtle Soup} item ID. */
        public static final String TURTLE_COOKED_SOUP = TURTLE_COOKED + "_soup";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemTurtleRaw Raw Turtle} item ID. */
        public static final String TURTLE_RAW = "turtle" + Sufix.RAW;

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemUnicornHorn Unicorn Horn} item ID. */
        public static final String UNICORN_HORN = "unicorn_horn";

        /** {@link mestretramador.rrmocreatures.item.RRMoCItemWhip Whip} item ID. */
        public static final String WHIP = "whip";
    }

    /** Blocks IDs. */
    public static class Blocks
    {
        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt Ogre Lair Dirt} block ID. */
        public static final String OGRE_LAIR_DIRT = Prefix.OGRE_LAIR + "dirt";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass Ogre Lair Grass} block ID. */
        public static final String OGRE_LAIR_GRASS = Prefix.OGRE_LAIR + "grass";

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateOgreLairGrass Ogre Lair Grass} side block state. */
        public static final String OGRE_LAIR_GRASS_SIDE = OGRE_LAIR_GRASS + Sufix.SIDE;

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateOgreLairGrass Ogre Lair Grass} top block state. */
        public static final String OGRE_LAIR_GRASS_TOP = OGRE_LAIR_GRASS + Sufix.TOP;

        /**  */
        public static final String OGRE_LAIR_LEAVES_SOLID = Prefix.OGRE_LAIR + "leaves_solid";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLeaves Ogre Lair Leaves} block ID. */
        public static final String OGRE_LAIR_LEAVES = Prefix.OGRE_LAIR + "leaves";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLog Ogre Lair Log} block ID. */
        public static final String OGRE_LAIR_LOG = Prefix.OGRE_LAIR + "log";

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateOgreLairLog Ogre Lair Log} top block state. */
        public static final String OGRE_LAIR_LOG_TOP = OGRE_LAIR_LOG + Sufix.TOP;

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairPlanks Ogre Lair Planks} block ID. */
        public static final String OGRE_LAIR_PLANKS = Prefix.OGRE_LAIR + "planks";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairStone Ogre Lair Stone} block ID. */
        public static final String OGRE_LAIR_STONE = Prefix.OGRE_LAIR + "stone";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairTallGrass Ogre Lair Tall Grass} block ID. */
        public static final String OGRE_LAIR_TALL_GRASS = Prefix.OGRE_LAIR + "tall_grass";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt Wyvern Lair Dirt} block ID. */
        public static final String WYVERN_LAIR_DIRT = Prefix.WYVERN_LAIR + "dirt";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass Wyvern Lair Grass} block ID. */
        public static final String WYVERN_LAIR_GRASS = Prefix.WYVERN_LAIR + "grass";

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateWyvernLairGrass Wyvern Lair Grass} side block state. */
        public static final String WYVERN_LAIR_GRASS_SIDE = WYVERN_LAIR_GRASS + Sufix.SIDE;

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateWyvernLairGrass Wyvern Lair Grass} top block state. */
        public static final String WYVERN_LAIR_GRASS_TOP = WYVERN_LAIR_GRASS + Sufix.TOP;

        /**  */
        public static final String WYVERN_LAIR_LEAVES_SOLID = Prefix.WYVERN_LAIR + "leaves_solid";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLeaves Wyvern Lair Leaves} block ID. */
        public static final String WYVERN_LAIR_LEAVES = Prefix.WYVERN_LAIR + "leaves";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLog Wyvern Lair Log} block ID. */
        public static final String WYVERN_LAIR_LOG = Prefix.WYVERN_LAIR + "log";

        /** {@link mestretramador.rrmocreatures.data.client.block.RRMoCBlockStateWyvernLairLog Wyvern Lair Log} top block state. */
        public static final String WYVERN_LAIR_LOG_TOP = WYVERN_LAIR_LOG + Sufix.TOP;

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks Wyvern Lair Planks} block ID. */
        public static final String WYVERN_LAIR_PLANKS = Prefix.WYVERN_LAIR + "planks";

		/** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone Wyvern Lair Stone} block ID. */
        public static final String WYVERN_LAIR_STONE = Prefix.WYVERN_LAIR + "stone";

        /** {@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass Wyvern Lair Tall Grass} block ID. */
		public static final String WYVERN_LAIR_TALL_GRASS = Prefix.WYVERN_LAIR + "tall_grass";
    }

    /** Sound Events IDs. */
    public static class Sounds
    {
        /** Music Sound Events IDs. */
        public static class Music
        {
            /** <i>{@link mestretramador.rrmocreatures.sound.RRMoCSoundEventZebra The Zebra Shuffling!}</i> music sound event ID. */
            public static final String ZEBRA = "zebra";
        }
    }

    /** Prefixes to use on Constant creation. */
    private static class Prefix
    {
        /** Amulet storager prefix. */
        private static final String AMULET = "amulet_";

        /** Chitin material prefix. */
        private static final String CHITIN = "chitin_";

        /** Elephant entity prefix. */
        private static final String ELEPHANT = "elephant_";

        /** Indian Elephant entity prefix. */
        private static final String ELEPHANT_INDIAN = ELEPHANT + "indian_";

        /** Mammoth Elephant entity prefix. */
        private static final String ELEPHANT_MAMMOTH = ELEPHANT + "mammoth_";

        /** Elephant Tusk Sword weapon prefix. */
        private static final String ELEPHANT_TUSKS = ELEPHANT + "tusks_";

        /** Essence potion prefix. */
        private static final String ESSENCE = "essence_";

        /** Handmade craftable prefix. */
        private static final String HANDMADE = "handmade_";

        /** Handmade Mount Armor craftable prefix. */
        private static final String HANDMADE_MOUNT_ARMOR = HANDMADE + "mount_armor_";

        /** Heart material prefix. */
        private static final String HEART = "heart_";

        /** Kitty entity prefix. */
        private static final String KITTY = "kitty_";

        /** Ogre Lair dimension prefix.*/
        private static final String OGRE_LAIR = "ogre_lair_";

        /** Ogre Lair Prince entity prefix. */
        private static final String OGRE_LAIR_PRINCE = OGRE_LAIR + "prince_";

        /** Scroll usable prefix. */
        private static final String SCROLL = "scroll_";

        /** Staff usable prefix. */
        private static final String STAFF = "staff_";

        /** Sting material prefix. */
        private static final String STING = "sting_";

        /** TMNT easter egg prefix. */
        private static final String TMNT = "tmnt_";

        /** Wyvern Lair dimension prefix. */
        private static final String WYVERN_LAIR = "wyvern_lair_";
    }

    /** Sufixes to use on Constant creation. */
    private static class Sufix
    {
        /** Black color sufix. */
        private static final String BLACK = "_black";

        /** Blue color sufix. */
        private static final String BLUE = "_blue";

        /** Boots armor sufix. */
        private static final String BOOTS = "_boots";

        /** Brown color sufix. */
        private static final String BROWN = "_brown";

        /** Chest armor sufix. */ 
        private static final String CHEST = "_chest";

        /** Cooked food sufix. */
        private static final String COOKED = "_cooked";

        /** Cyan color sufix. */
        private static final String CYAN = "_cyan";

        /** Filled storager sufix. */
        private static final String FILLED = "_filled";

        /** Gray color sufix. */
        private static final String GRAY = "_gray";

        /** Green color sufix. */
        private static final String GREEN = "_green";

        /** Helmet armor sufix. */
        private static final String HELMET = "_helmet";

        /** Legs armor sufix. */
        private static final String LEGS = "_legs";

        /** Light Blue color sufix. */
        private static final String LIGHT_BLUE = "_light" + BLUE;

        /** Light Gray color sufix. */
        private static final String LIGHT_GRAY = "_light" + GRAY;

        /** Lime color sufix. */
        private static final String LIME = "_lime";

        /** Magenta color sufix. */
        private static final String MAGENTA = "_magenta";

        /** Orange color sufix. */
        private static final String ORANGE = "_orange";

        /** Pink color sufix. */
        private static final String PINK = "_pink";

        /** Purple color sufix. */
        private static final String PURPLE = "_purple";

        /** Raw food sufix. */
        private static final String RAW = "_raw";

        /** Red color sufix. */
        private static final String RED = "_red";

        /** Side block sufix. */
        private static final String SIDE = "_side";

        /** Sword weapon sufix. */
        private static final String SWORD = "_sword";

        /** Top block sufix. */
        private static final String TOP = "_top";

        /** White color sufix. */
        private static final String WHITE = "_white";

        /** Yellow color sufix. */
        private static final String YELLOW = "_yellow";
    }
}
