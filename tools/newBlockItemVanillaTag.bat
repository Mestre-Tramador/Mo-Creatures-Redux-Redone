@REM ############################################################################
@REM This batch file creates a BlockItem Vanilla Tag Copy Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ############################################################################

@REM Gloval variables.
@SET version=0.0.21
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the blockitem vanilla tag new name.
@ECHO OFF
ECHO What will be the BlockItem Vanilla Tag class name?
ECHO The BlockItem Vanilla Tag class name must be in Pascal Case eg. "NewBlockItemVanillaTagClass".
SET /p class=Vanilla Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the vanilla tag constant.
ECHO.
ECHO What is the BlockItem Vanilla Tag?
ECHO The BlockItem Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "BLOCK_ITEM_VANILLA_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent vanilla tag constant.
ECHO.
ECHO What is the BlockItem Parent Vanilla Tag?
ECHO The BlockItem Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "BLOCK_VANILLA_TAG".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the vanilla tag name.
ECHO.
ECHO What is the BlockItem Vanilla Tag name?
ECHO The BlockItem Vanilla Tag name is generally the same as the class name but with spaces eg. "BlockItem Vanilla Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the BlockItem Tag directory.
CD %tagdir%

@REM Create the BlockItem Vanilla Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                              >> RRMoCBlockItemVanillaTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemVanillaTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider; >> RRMoCBlockItemVanillaTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemVanillaTag%class%.java
ECHO import net.minecraft.tags.BlockTags;                                                      >> RRMoCBlockItemVanillaTag%class%.java
ECHO import net.minecraft.tags.ItemTags;                                                       >> RRMoCBlockItemVanillaTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemVanillaTag%class%.java
ECHO /**                                                                                       >> RRMoCBlockItemVanillaTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Minecraft Tag's BlockItems.                         >> RRMoCBlockItemVanillaTag%class%.java
ECHO  *                                                                                        >> RRMoCBlockItemVanillaTag%class%.java
ECHO  * @version %version%                                                                     >> RRMoCBlockItemVanillaTag%class%.java
ECHO  * @author %author%                                                                       >> RRMoCBlockItemVanillaTag%class%.java
ECHO  */                                                                                       >> RRMoCBlockItemVanillaTag%class%.java
ECHO public class RRMoCBlockItemVanillaTag%class% extends RRMoCBlockItemTagProvider            >> RRMoCBlockItemVanillaTag%class%.java
ECHO {                                                                                         >> RRMoCBlockItemVanillaTag%class%.java
ECHO     /**                                                                                   >> RRMoCBlockItemVanillaTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Minecraft tag.                        >> RRMoCBlockItemVanillaTag%class%.java
ECHO      */                                                                                   >> RRMoCBlockItemVanillaTag%class%.java
ECHO     public RRMoCBlockItemVanillaTag%class%()                                              >> RRMoCBlockItemVanillaTag%class%.java
ECHO     {                                                                                     >> RRMoCBlockItemVanillaTag%class%.java
ECHO         super(BlockTags.%fid%, ItemTags.%id%);                                            >> RRMoCBlockItemVanillaTag%class%.java
ECHO     }                                                                                     >> RRMoCBlockItemVanillaTag%class%.java
ECHO }                                                                                         >> RRMoCBlockItemVanillaTag%class%.java

@REM Add the BlockItem Vanilla Tag in Git.
git add RRMoCBlockItemVanillaTag%class%.java


@REM Final message.
ECHO.
ECHO Created BlockItem Vanilla Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE