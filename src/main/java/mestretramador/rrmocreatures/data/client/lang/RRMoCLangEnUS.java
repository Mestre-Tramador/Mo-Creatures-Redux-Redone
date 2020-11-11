package mestretramador.rrmocreatures.data.client.lang;

import mestretramador.rrmocreatures.data.client.provider.RRMoCLangProvider;
import mestretramador.rrmocreatures.init.RegisterBlock;
import mestretramador.rrmocreatures.init.RegisterItem;
import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.data.DataGenerator;

/**
 * Mo'Creatures Redux&Redone English (US) translator.
 * 
 * @version 0.0.16
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCLangEnUS extends RRMoCLangProvider
{
    /**
     * Using the parent constructor to provide English (US) support, just pass a
     * Data Generator.
     * 
     * @param generator Minecraft {@link net.minecraft.data.DataGenerator Data
     *                  Generator}.
     */
    public RRMoCLangEnUS(DataGenerator generator)
    {
        super(generator, Constants.Langs.EN_US);
    }

    /**
     * Register all lang entries.
     */
    @Override
    protected void addTranslations()
    {
        BLOCKS.forEach((block, translation) -> {
            add(block, translation);
        });

        ITEMS.forEach((item, translation) -> {
            add(item, translation);
        });

        MUSIC_DISCS.forEach((item, translation) -> {
            add((item.getTranslationKey() + ".desc"), translation);
        });
    }

    /**
     * Translate all Blocks to English (US).
     */
    @Override
    protected void setBlocks()
    {
        BLOCKS.put(RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock(), "Ogre Lair Dirt");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_GRASS.returnAsBlock(), "Ogre Lair Grass");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_LEAVES.returnAsBlock(), "Ogre Lair Leaves");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_LOG.returnAsBlock(), "Ogre Lair Log");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_PLANKS.returnAsBlock(), "Ogre Lair Planks");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_STONE.returnAsBlock(), "Ogre Lair Stone");
        BLOCKS.put(RegisterBlock.OGRE_LAIR_TALL_GRASS.returnAsBlock(), "Ogre Lair Tall Grass");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock(), "Wyvern Lair Dirt");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock(), "Wyvern Lair Grass");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_LEAVES.returnAsBlock(), "Wyvern Lair Leaves");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_LOG.returnAsBlock(), "Wyvern Lair Log");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_PLANKS.returnAsBlock(), "Wyvern Lair Planks");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock(), "Wyvern Lair Stone");
        BLOCKS.put(RegisterBlock.WYVERN_LAIR_TALL_GRASS.returnAsBlock(), "Wyvern Lair Tall Grass");
    }

    /**
     * Translate all Items to English (US).
     */
    @Override
    protected void setItems()
    {
        ITEMS.put(RegisterItem.AMULET_BONE.returnAsItem(), "Bone Amulet");
        ITEMS.put(RegisterItem.AMULET_BONE_FILLED.returnAsItem(), "Bone Amulet");
        ITEMS.put(RegisterItem.AMULET_FAIRY.returnAsItem(), "Fairy Amulet");
        ITEMS.put(RegisterItem.AMULET_FAIRY_FILLED.returnAsItem(), "Fairy Amulet");
        ITEMS.put(RegisterItem.AMULET_GHOST.returnAsItem(), "Ghost Amulet");
        ITEMS.put(RegisterItem.AMULET_GHOST_FILLED.returnAsItem(), "Ghost Amulet");
        ITEMS.put(RegisterItem.AMULET_GUARDIAN.returnAsItem(), "Bone Amulet");
        ITEMS.put(RegisterItem.AMULET_GUARDIAN_FILLED.returnAsItem(), "Bone Amulet");
        ITEMS.put(RegisterItem.AMULET_SKY.returnAsItem(), "Sky Amulet");
        ITEMS.put(RegisterItem.AMULET_SKY_FILLED.returnAsItem(), "Sky Amulet");
        ITEMS.put(RegisterItem.BIGCAT_CLAW.returnAsItem(), "BigCat Claw");
        ITEMS.put(RegisterItem.CHITIN_DARK.returnAsItem(), "Dark Chitin");
        ITEMS.put(RegisterItem.CHITIN_DARK_BOOTS.returnAsItem(), "Dark Chitin Boots");
        ITEMS.put(RegisterItem.CHITIN_DARK_CHEST.returnAsItem(), "Dark Chitin Chest");
        ITEMS.put(RegisterItem.CHITIN_DARK_HELMET.returnAsItem(), "Dark Chitin Helmet");
        ITEMS.put(RegisterItem.CHITIN_DARK_LEGS.returnAsItem(), "Dark Chitin Legs");
        ITEMS.put(RegisterItem.CHITIN_DIRT.returnAsItem(), "Dirt Chitin");
        ITEMS.put(RegisterItem.CHITIN_DIRT_BOOTS.returnAsItem(), "Dirt Chitin Boots");
        ITEMS.put(RegisterItem.CHITIN_DIRT_CHEST.returnAsItem(), "Dirt Chitin Chest");
        ITEMS.put(RegisterItem.CHITIN_DIRT_HELMET.returnAsItem(), "Dirt Chitin Helmet");
        ITEMS.put(RegisterItem.CHITIN_DIRT_LEGS.returnAsItem(), "Dirt Chitin Legs");
        ITEMS.put(RegisterItem.CHITIN_FROST.returnAsItem(), "Frost Chitin");
        ITEMS.put(RegisterItem.CHITIN_FROST_BOOTS.returnAsItem(), "Frost Chitin Boots");
        ITEMS.put(RegisterItem.CHITIN_FROST_CHEST.returnAsItem(), "Frost Chitin Chest");
        ITEMS.put(RegisterItem.CHITIN_FROST_HELMET.returnAsItem(), "Frost Chitin Helmet");
        ITEMS.put(RegisterItem.CHITIN_FROST_LEGS.returnAsItem(), "Frost Chitin Legs");
        ITEMS.put(RegisterItem.CHITIN_NETHER.returnAsItem(), "Nether Chitin");
        ITEMS.put(RegisterItem.CHITIN_NETHER_BOOTS.returnAsItem(), "Nether Chitin Boots");
        ITEMS.put(RegisterItem.CHITIN_NETHER_CHEST.returnAsItem(), "Nether Chitin Chest");
        ITEMS.put(RegisterItem.CHITIN_NETHER_HELMET.returnAsItem(), "Nether Chitin Helmet");
        ITEMS.put(RegisterItem.CHITIN_NETHER_LEGS.returnAsItem(), "Nether Chitin Legs");
        ITEMS.put(RegisterItem.CRAB_COOKED.returnAsItem(), "Cooked Crab");
        ITEMS.put(RegisterItem.CRAB_RAW.returnAsItem(), "Raw Crab");
        ITEMS.put(RegisterItem.CREATURE_PEDIA.returnAsItem(), "Craturepedia");
        ITEMS.put(RegisterItem.EGG_HATCHABLE.returnAsItem(), "Hatchable Egg");
        ITEMS.put(RegisterItem.EGG_HATCHABLE_OMELET.returnAsItem(), "Omelet");
        ITEMS.put(RegisterItem.ELEPHANT_CHEST.returnAsItem(), "Elephant Saddlebag");
        ITEMS.put(RegisterItem.ELEPHANT_HARNESS.returnAsItem(), "Elephant Harness");
        ITEMS.put(RegisterItem.ELEPHANT_INDIAN_GARMENT.returnAsItem(), "Indian Elephant Garment");
        ITEMS.put(RegisterItem.ELEPHANT_INDIAN_HOWDAH.returnAsItem(), "Indian Elephant Howdah");
        ITEMS.put(RegisterItem.ELEPHANT_MAMMOTH_PLATFORM.returnAsItem(), "Songhua River Mammoth Platform");
        ITEMS.put(RegisterItem.ELEPHANT_TUSKS_DIAMOND.returnAsItem(), "Diamond Elephant Tusk Sword");
        ITEMS.put(RegisterItem.ELEPHANT_TUSKS_IRON.returnAsItem(), "Iron Elephant Tusk Sword");
        ITEMS.put(RegisterItem.ELEPHANT_TUSKS_WOOD.returnAsItem(), "Wood Elephant Tusk Sword");
        ITEMS.put(RegisterItem.ESSENCE_DARKNESS.returnAsItem(), "Essence of Darkness");
        ITEMS.put(RegisterItem.ESSENCE_FIRE.returnAsItem(), "Essence of Fire");
        ITEMS.put(RegisterItem.ESSENCE_LIGHT.returnAsItem(), "Essence of Light");
        ITEMS.put(RegisterItem.ESSENCE_UNDEAD.returnAsItem(), "Essence of the Undead");
        ITEMS.put(RegisterItem.FISH_NET.returnAsItem(), "Fish Net");
        ITEMS.put(RegisterItem.FISH_NET_FILLED.returnAsItem(), "Fish Net");
        ITEMS.put(RegisterItem.FUR.returnAsItem(), "Fur");
        ITEMS.put(RegisterItem.FUR_BOOTS.returnAsItem(), "Fur Boots");
        ITEMS.put(RegisterItem.FUR_CHEST.returnAsItem(), "Fur Chest");
        ITEMS.put(RegisterItem.FUR_HELMET.returnAsItem(), "Fur Helmet");
        ITEMS.put(RegisterItem.FUR_LEGS.returnAsItem(), "Fur Legs");
        ITEMS.put(RegisterItem.HANDMADE_LEAD.returnAsItem(), "Handmade Lead");
        ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_CRYSTAL.returnAsItem(), "Handmade Crystal Mount Armor");
        ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_DIAMOND.returnAsItem(), "Handmade Diamond Mount Armor");
        ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_GOLD.returnAsItem(), "Handmade Gold Mount Armor");
        ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_IRON.returnAsItem(), "Handmade Iron Mount Armor");
        ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_LEATHER.returnAsItem(), "Handmade Leather Mount Armor");
        ITEMS.put(RegisterItem.HANDMADE_SADDLE.returnAsItem(), "Handmade Saddle");
        ITEMS.put(RegisterItem.HANDMADE_SADDLE_CHEST.returnAsItem(), "Handmade Saddlebag");
        ITEMS.put(RegisterItem.HEART_DARKNESS.returnAsItem(), "Heart of Darkness");
        ITEMS.put(RegisterItem.HEART_FIRE.returnAsItem(), "Heart of Fire");
        ITEMS.put(RegisterItem.HEART_UNDEAD.returnAsItem(), "Heart of the Undead");
        ITEMS.put(RegisterItem.HIDE.returnAsItem(), "Hide");
        ITEMS.put(RegisterItem.HIDE_BOOTS.returnAsItem(), "Hide Boots");
        ITEMS.put(RegisterItem.HIDE_CHEST.returnAsItem(), "Hide Chest");
        ITEMS.put(RegisterItem.HIDE_HELMET.returnAsItem(), "Hide Helmet");
        ITEMS.put(RegisterItem.HIDE_LEGS.returnAsItem(), "Hide Legs");
        ITEMS.put(RegisterItem.KEY.returnAsItem(), "Key");
        ITEMS.put(RegisterItem.KITTY_BED.returnAsItem(), "Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_BLACK.returnAsItem(), "Black Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_BLUE.returnAsItem(), "Blue Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_BROWN.returnAsItem(), "Brown Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_CYAN.returnAsItem(), "Cyan Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_GRAY.returnAsItem(), "Gray Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_GREEN.returnAsItem(), "Green Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_LIGHT_BLUE.returnAsItem(), "Light Blue Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_LIGHT_GRAY.returnAsItem(), "Light Gray Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_LIME.returnAsItem(), "Lime Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_MAGENTA.returnAsItem(), "Magenta Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_ORANGE.returnAsItem(), "Orange Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_PINK.returnAsItem(), "Pink Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_PURPLE.returnAsItem(), "Purple Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_RED.returnAsItem(), "Red Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_WHITE.returnAsItem(), "White Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_BED_YELLOW.returnAsItem(), "Yellow Kitty Bed");
        ITEMS.put(RegisterItem.KITTY_FOOD.returnAsItem(), "Kitty Food");
        ITEMS.put(RegisterItem.KITTY_LITTER.returnAsItem(), "Kitty Litter");
        ITEMS.put(RegisterItem.KITTY_WOOL_BALL.returnAsItem(), "Kitty Wool Ball");
        ITEMS.put(RegisterItem.MEDALLION.returnAsItem(), "Medallion");
        ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_CANNON_FIRE.returnAsItem(), "Fire Cannon");
        ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_HAMMER_BUILDER.returnAsItem(), "Builder Hammer");
        ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_STAFF_TELEPORT.returnAsItem(), "Staff of Teleportation");
        ITEMS.put(RegisterItem.OSTRICH_COOKED.returnAsItem(), "Cooked Ostrich");
        ITEMS.put(RegisterItem.OSTRICH_RAW.returnAsItem(), "Raw Ostrich");
        ITEMS.put(RegisterItem.RAT_BURGER.returnAsItem(), "Rat Burger");
        ITEMS.put(RegisterItem.RAT_COOKED.returnAsItem(), "Cooked Rat");
        ITEMS.put(RegisterItem.RAT_RAW.returnAsItem(), "Raw Rat");
        ITEMS.put(RegisterItem.RECORD_ZEBRA.returnAsItem(), "Music Disc");
        ITEMS.put(RegisterItem.REPTILE_HIDE.returnAsItem(), "Reptile Hide");
        ITEMS.put(RegisterItem.REPTILE_HIDE_BOOTS.returnAsItem(), "Reptile Hide Boots");
        ITEMS.put(RegisterItem.REPTILE_HIDE_CHEST.returnAsItem(), "Reptile Hide Chest");
        ITEMS.put(RegisterItem.REPTILE_HIDE_HELMET.returnAsItem(), "Reptile Hide Helmet");
        ITEMS.put(RegisterItem.REPTILE_HIDE_LEGS.returnAsItem(), "Reptile Hide Legs");
        ITEMS.put(RegisterItem.SCROLL_BLANK.returnAsItem(), "Blank Scroll");
        ITEMS.put(RegisterItem.SCROLL_FREEDOM.returnAsItem(), "Scroll");
        ITEMS.put(RegisterItem.SCROLL_OWNER.returnAsItem(), "Scroll");
        ITEMS.put(RegisterItem.SCROLL_SALE.returnAsItem(), "Scroll");
        ITEMS.put(RegisterItem.SHARK_TEETH.returnAsItem(), "Shark Teeth");
        ITEMS.put(RegisterItem.SHARK_TEETH_SWORD.returnAsItem(), "Shark Teeth Sword");
        ITEMS.put(RegisterItem.SILVER_SKELETON_SWORD.returnAsItem(), "Silver Skeleton Sword");
        ITEMS.put(RegisterItem.STAFF_BASE.returnAsItem(), "Staff Base");
        ITEMS.put(RegisterItem.STAFF_DIAMOND.returnAsItem(), "Staff");
        ITEMS.put(RegisterItem.STAFF_ENDER.returnAsItem(), "Staff");
        ITEMS.put(RegisterItem.STAFF_LIGHT.returnAsItem(), "Staff");
        ITEMS.put(RegisterItem.STING_DARK.returnAsItem(), "Dark Sting");
        ITEMS.put(RegisterItem.STING_DARK_SWORD.returnAsItem(), "Dark Sting Sword");
        ITEMS.put(RegisterItem.STING_DIRT.returnAsItem(), "Dirt Sting");
        ITEMS.put(RegisterItem.STING_DIRT_SWORD.returnAsItem(), "Dirt Sting Sword");
        ITEMS.put(RegisterItem.STING_FROST.returnAsItem(), "Frost Sting");
        ITEMS.put(RegisterItem.STING_FROST_SWORD.returnAsItem(), "Frost Sting Sword");
        ITEMS.put(RegisterItem.STING_NETHER.returnAsItem(), "Nether Sting");
        ITEMS.put(RegisterItem.STING_NETHER_SWORD.returnAsItem(), "Nether Sting Sword");
        ITEMS.put(RegisterItem.SUGAR_LUMP.returnAsItem(), "Sugar Lumps");
        ITEMS.put(RegisterItem.TMNT_BO.returnAsItem(), "Bo");
        ITEMS.put(RegisterItem.TMNT_KATANA.returnAsItem(), "Katana");
        ITEMS.put(RegisterItem.TMNT_NUNCHAKU.returnAsItem(), "Nunchaku");
        ITEMS.put(RegisterItem.TMNT_SAI.returnAsItem(), "Sai");
        ITEMS.put(RegisterItem.TURKEY_COOKED.returnAsItem(), "Cooked Turkey");
        ITEMS.put(RegisterItem.TURKEY_RAW.returnAsItem(), "Raw Turkey");
        ITEMS.put(RegisterItem.TURTLE_COOKED.returnAsItem(), "Cooked Turtle");
        ITEMS.put(RegisterItem.TURTLE_COOKED_SOUP.returnAsItem(), "Turtle Soup");
        ITEMS.put(RegisterItem.TURTLE_RAW.returnAsItem(), "Raw Turtle");
        ITEMS.put(RegisterItem.UNICORN_HORN.returnAsItem(), "Unicorn Horn");
        ITEMS.put(RegisterItem.WHIP.returnAsItem(), "Whip");
    }

    /**
     * Translate all Music Discs to English (US).
     */
    @Override
    protected void setMusicDiscs()
    {
        MUSIC_DISCS.put(RegisterItem.RECORD_ZEBRA.returnAsItem(), "Zebra");
    }
}
