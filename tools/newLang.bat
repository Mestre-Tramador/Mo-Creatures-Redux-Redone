@REM ################################################################
@REM This batch file creates a Lang Data Generator class.
@REM It does not create a Constant for the Lang ID.
@REM Neither add it in the Data Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.16
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET langdir="..\src\main\java\mestretramador\rrmocreatures\data\client\lang"


@REM Collect the lang new name.
@ECHO OFF
ECHO What will be the Lang class name?
ECHO The Lang class name must be in Pascal Case eg. "NewLangClass".
SET /p class=Lang: 
IF [%class%] == [] EXIT 1

@REM Collect the lang ID constant.
ECHO.
ECHO What is the Lang ID constant?
ECHO The Lang ID constant must be in Upper case and Underscores eg. "LOCAL_E".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the lang name.
ECHO.
ECHO What is the Lang name?
ECHO The Lang name is generally the same as the class name but with spaces eg. "Local (E)".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1



@REM Go to the Lang directory.
CD %langdir%

@REM Create the Lang.
ECHO package mestretramador.rrmocreatures.data.client.lang;                              >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.RRMoCLangProvider;         >> RRMoCLang%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterBlock;                             >> RRMoCLang%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterItem;                              >> RRMoCLang%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                 >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO import net.minecraft.data.DataGenerator;                                            >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO /**                                                                                 >> RRMoCLang%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% translator.                                   >> RRMoCLang%class%.java
ECHO  *                                                                                  >> RRMoCLang%class%.java
ECHO  * @version %version%                                                               >> RRMoCLang%class%.java
ECHO  * @author %author%                                                                 >> RRMoCLang%class%.java
ECHO  */                                                                                 >> RRMoCLang%class%.java
ECHO public class RRMoCLang%class% extends RRMoCLangProvider                             >> RRMoCLang%class%.java
ECHO {                                                                                   >> RRMoCLang%class%.java
ECHO     /**                                                                             >> RRMoCLang%class%.java
ECHO      * Using the parent constructor to provide %name% support,                      >> RRMoCLang%class%.java
ECHO      * just pass a Data Generator.                                                  >> RRMoCLang%class%.java
ECHO      *                                                                              >> RRMoCLang%class%.java
ECHO      * @param generator Minecraft {@link net.minecraft.data.DataGenerator           >> RRMoCLang%class%.java
ECHO      *                  Data Generator}.                                            >> RRMoCLang%class%.java
ECHO      */                                                                             >> RRMoCLang%class%.java
ECHO     public RRMoCLang%class%(DataGenerator generator)                                >> RRMoCLang%class%.java
ECHO     {                                                                               >> RRMoCLang%class%.java
ECHO         super(generator, Constants.Langs.%id%);                                     >> RRMoCLang%class%.java
ECHO     }                                                                               >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO     /**                                                                             >> RRMoCLang%class%.java
ECHO      * Register all lang entries.                                                   >> RRMoCLang%class%.java
ECHO      */                                                                             >> RRMoCLang%class%.java
ECHO     @Override                                                                       >> RRMoCLang%class%.java
ECHO     protected void addTranslations()                                                >> RRMoCLang%class%.java
ECHO     {                                                                               >> RRMoCLang%class%.java
ECHO         BLOCKS.forEach((block, translation) -^> {                                   >> RRMoCLang%class%.java
ECHO             add(block, translation);                                                >> RRMoCLang%class%.java
ECHO         });                                                                         >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO         ITEMS.forEach((item, translation) -^> {                                     >> RRMoCLang%class%.java
ECHO             add(item, translation);                                                 >> RRMoCLang%class%.java
ECHO         });                                                                         >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO         MUSIC_DISCS.forEach((item, translation) -^> {                               >> RRMoCLang%class%.java
ECHO             add((item.getTranslationKey() + ".desc"), translation);                 >> RRMoCLang%class%.java
ECHO         });                                                                         >> RRMoCLang%class%.java
ECHO     }                                                                               >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO     /**                                                                             >> RRMoCLang%class%.java
ECHO      * Translate all Blocks to %name%.                                              >> RRMoCLang%class%.java
ECHO      */                                                                             >> RRMoCLang%class%.java
ECHO     @Override                                                                       >> RRMoCLang%class%.java
ECHO     protected void setBlocks()                                                      >> RRMoCLang%class%.java
ECHO     {                                                                               >> RRMoCLang%class%.java
ECHO         // * Last actualization in 09/11/2020                                       >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock(), "");               >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_GRASS.returnAsBlock(), "");              >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_LEAVES.returnAsBlock(), "");             >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_LOG.returnAsBlock(), "");                >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_PLANKS.returnAsBlock(), "");             >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_STONE.returnAsBlock(), "");              >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.OGRE_LAIR_TALL_GRASS.returnAsBlock(), "");         >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock(), "");             >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock(), "");            >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_LEAVES.returnAsBlock(), "");           >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_LOG.returnAsBlock(), "");              >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_PLANKS.returnAsBlock(), "");           >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock(), "");            >> RRMoCLang%class%.java
ECHO         BLOCKS.put(RegisterBlock.WYVERN_LAIR_TALL_GRASS.returnAsBlock(), "");       >> RRMoCLang%class%.java
ECHO     }                                                                               >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO     /**                                                                             >> RRMoCLang%class%.java
ECHO      * Translate all Items to %name%.                                               >> RRMoCLang%class%.java
ECHO      */                                                                             >> RRMoCLang%class%.java
ECHO     @Override                                                                       >> RRMoCLang%class%.java
ECHO     protected void setItems()                                                       >> RRMoCLang%class%.java
ECHO     {                                                                               >> RRMoCLang%class%.java
ECHO         // * Last actualization in 09/11/2020                                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_BONE.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_BONE_FILLED.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_FAIRY.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_FAIRY_FILLED.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_GHOST.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_GHOST_FILLED.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_GUARDIAN.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_GUARDIAN_FILLED.returnAsItem(), "");          >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_SKY.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.AMULET_SKY_FILLED.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.BIGCAT_CLAW.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DARK.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DARK_BOOTS.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DARK_CHEST.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DARK_HELMET.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DARK_LEGS.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DIRT.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DIRT_BOOTS.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DIRT_CHEST.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DIRT_HELMET.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_DIRT_LEGS.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_FROST.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_FROST_BOOTS.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_FROST_CHEST.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_FROST_HELMET.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_FROST_LEGS.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_NETHER.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_NETHER_BOOTS.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_NETHER_CHEST.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_NETHER_HELMET.returnAsItem(), "");            >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CHITIN_NETHER_LEGS.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CRAB_COOKED.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CRAB_RAW.returnAsItem(), "");                        >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.CREATURE_PEDIA.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.EGG_HATCHABLE.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.EGG_HATCHABLE_OMELET.returnAsItem(), "");            >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_CHEST.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_HARNESS.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_INDIAN_GARMENT.returnAsItem(), "");         >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_INDIAN_HOWDAH.returnAsItem(), "");          >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_MAMMOTH_PLATFORM.returnAsItem(), "");       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_TUSKS_DIAMOND.returnAsItem(), "");          >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_TUSKS_IRON.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ELEPHANT_TUSKS_WOOD.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ESSENCE_DARKNESS.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ESSENCE_FIRE.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ESSENCE_LIGHT.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.ESSENCE_UNDEAD.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FISH_NET.returnAsItem(), "");                        >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FISH_NET_FILLED.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FUR.returnAsItem(), "");                             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FUR_BOOTS.returnAsItem(), "");                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FUR_CHEST.returnAsItem(), "");                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FUR_HELMET.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.FUR_LEGS.returnAsItem(), "");                        >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_LEAD.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_CRYSTAL.returnAsItem(), "");    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_DIAMOND.returnAsItem(), "");    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_GOLD.returnAsItem(), "");       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_IRON.returnAsItem(), "");       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_MOUNT_ARMOR_LEATHER.returnAsItem(), "");    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_SADDLE.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HANDMADE_SADDLE_CHEST.returnAsItem(), "");           >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HEART_DARKNESS.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HEART_FIRE.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HEART_UNDEAD.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HIDE.returnAsItem(), "");                            >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HIDE_BOOTS.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HIDE_CHEST.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HIDE_HELMET.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.HIDE_LEGS.returnAsItem(), "");                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KEY.returnAsItem(), "");                             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED.returnAsItem(), "");                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_BLACK.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_BLUE.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_BROWN.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_CYAN.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_GRAY.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_GREEN.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_LIGHT_BLUE.returnAsItem(), "");            >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_LIGHT_GRAY.returnAsItem(), "");            >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_LIME.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_MAGENTA.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_ORANGE.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_PINK.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_PURPLE.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_RED.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_WHITE.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_BED_YELLOW.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_FOOD.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_LITTER.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.KITTY_WOOL_BALL.returnAsItem(), "");                 >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.MEDALLION.returnAsItem(), "");                       >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_CANNON_FIRE.returnAsItem(), "");    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_HAMMER_BUILDER.returnAsItem(), ""); >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.OGRE_LAIR_PRINCE_STAFF_TELEPORT.returnAsItem(), ""); >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.OSTRICH_COOKED.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.OSTRICH_RAW.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.RAT_BURGER.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.RAT_COOKED.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.RAT_RAW.returnAsItem(), "");                         >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.RECORD_ZEBRA.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.REPTILE_HIDE.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.REPTILE_HIDE_BOOTS.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.REPTILE_HIDE_CHEST.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.REPTILE_HIDE_HELMET.returnAsItem(), "");             >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.REPTILE_HIDE_LEGS.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SCROLL_BLANK.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SCROLL_FREEDOM.returnAsItem(), "");                  >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SCROLL_OWNER.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SCROLL_SALE.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SHARK_TEETH.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SHARK_TEETH_SWORD.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SILVER_SKELETON_SWORD.returnAsItem(), "");           >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STAFF_BASE.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STAFF_DIAMOND.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STAFF_ENDER.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STAFF_LIGHT.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_DARK.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_DARK_SWORD.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_DIRT.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_DIRT_SWORD.returnAsItem(), "");                >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_FROST.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_FROST_SWORD.returnAsItem(), "");               >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_NETHER.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.STING_NETHER_SWORD.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.SUGAR_LUMP.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TMNT_BO.returnAsItem(), "");                         >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TMNT_KATANA.returnAsItem(), "");                     >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TMNT_NUNCHAKU.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TMNT_SAI.returnAsItem(), "");                        >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TURKEY_COOKED.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TURKEY_RAW.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TURTLE_COOKED.returnAsItem(), "");                   >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TURTLE_COOKED_SOUP.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.TURTLE_RAW.returnAsItem(), "");                      >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.UNICORN_HORN.returnAsItem(), "");                    >> RRMoCLang%class%.java
ECHO         ITEMS.put(RegisterItem.WHIP.returnAsItem(), "");                            >> RRMoCLang%class%.java
ECHO     }                                                                               >> RRMoCLang%class%.java
ECHO.                                                                                    >> RRMoCLang%class%.java
ECHO     /**                                                                             >> RRMoCLang%class%.java
ECHO      * Translate all Music Discs to %name%.                                         >> RRMoCLang%class%.java
ECHO      */                                                                             >> RRMoCLang%class%.java
ECHO     @Override                                                                       >> RRMoCLang%class%.java
ECHO     protected void setMusicDiscs()                                                  >> RRMoCLang%class%.java
ECHO     {                                                                               >> RRMoCLang%class%.java
ECHO         // * Last actualization in 11/11/2020                                       >> RRMoCLang%class%.java
ECHO         MUSIC_DISCS.put(RegisterItem.RECORD_ZEBRA.returnAsItem(), "");              >> RRMoCLang%class%.java
ECHO     }                                                                               >> RRMoCLang%class%.java
ECHO }                                                                                   >> RRMoCLang%class%.java

@REM Add the Lang in Git.
git add RRMoCLang%class%.java


@REM Final message.
ECHO.
ECHO Created Lang for %name%!
ECHO Plase insert it on and run Data Generation.
PAUSE