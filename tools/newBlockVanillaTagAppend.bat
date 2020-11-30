@REM ##########################################################################
@REM This batch file creates a Block Vanilla Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ##########################################################################

@REM Gloval variables.
@SET version=0.0.25
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block vanilla tag append new name.
@ECHO OFF
ECHO What will be the Block Vanilla Tag Append class name?
ECHO The Block Vanilla Tag Append class name must be in Pascal Case eg. "NewBlockVanillaTagAppendClass".
SET /p class=Vanilla Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Block Tag?
ECHO The Block Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent vanilla tag constant.
ECHO.
ECHO What is the Block Parent Vanilla Tag?
ECHO The Block Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "BLOCK_VANILLA_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the vanilla tag append name.
ECHO.
ECHO What is the Block Vanilla Tag Append name?
ECHO The Block Vanilla Tag name is generally the same as the class name but with spaces eg. "Block Vanilla Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Append Vanilla Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                                >> RRMoCBlockVanillaTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockVanillaTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; >> RRMoCBlockVanillaTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                              >> RRMoCBlockVanillaTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockVanillaTagAppend%class%.java
ECHO import net.minecraft.tags.BlockTags;                                                        >> RRMoCBlockVanillaTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockVanillaTagAppend%class%.java
ECHO /**                                                                                         >> RRMoCBlockVanillaTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Minecraft Tag Append's.                               >> RRMoCBlockVanillaTagAppend%class%.java
ECHO  *                                                                                          >> RRMoCBlockVanillaTagAppend%class%.java
ECHO  * @version %version%                                                                       >> RRMoCBlockVanillaTagAppend%class%.java
ECHO  * @author %author%                                                                         >> RRMoCBlockVanillaTagAppend%class%.java
ECHO  */                                                                                         >> RRMoCBlockVanillaTagAppend%class%.java
ECHO public class RRMoCBlockVanillaTagAppend%class% extends RRMoCBlockTagAppendProvider          >> RRMoCBlockVanillaTagAppend%class%.java
ECHO {                                                                                           >> RRMoCBlockVanillaTagAppend%class%.java
ECHO     /**                                                                                     >> RRMoCBlockVanillaTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                                >> RRMoCBlockVanillaTagAppend%class%.java
ECHO      */                                                                                     >> RRMoCBlockVanillaTagAppend%class%.java
ECHO     public RRMoCBlockVanillaTagAppend%class%()                                              >> RRMoCBlockVanillaTagAppend%class%.java
ECHO     {                                                                                       >> RRMoCBlockVanillaTagAppend%class%.java
ECHO         super(BlockTags.%fid%, Tags.Blocks.%id%);                                           >> RRMoCBlockVanillaTagAppend%class%.java
ECHO     }                                                                                       >> RRMoCBlockVanillaTagAppend%class%.java
ECHO }                                                                                           >> RRMoCBlockVanillaTagAppend%class%.java

@REM Add the Block Vanilla Tag Append in Git.
git add RRMoCBlockVanillaTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Block Vanilla Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE