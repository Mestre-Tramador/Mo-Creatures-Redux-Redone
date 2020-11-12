@REM ########################################################################
@REM This batch file creates a Block Forge Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ########################################################################

@REM Gloval variables.
@SET version=0.0.17
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block forge tag append new name.
@ECHO OFF
ECHO What will be the Block Forge Tag Append class name?
ECHO The Block Forge Tag Append class name must be in Pascal Case eg. "NewBlockForgeTagAppendClass".
SET /p class=Forge Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Block Tag?
ECHO The Block Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent forge tag constant.
ECHO.
ECHO What is the Block Parent Forge Tag?
ECHO The Block Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. "BLOCK_FORGE_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the forge tag append name.
ECHO.
ECHO What is the Block Forge Tag Append name?
ECHO The Block Forge Tag name is generally the same as the class name but with spaces eg. "Block Forge Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Append Forge Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                                >> RRMoCBlockForgeTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockForgeTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; >> RRMoCBlockForgeTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                              >> RRMoCBlockForgeTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockForgeTagAppend%class%.java
ECHO /**                                                                                         >> RRMoCBlockForgeTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Forge Tag Append's.                                   >> RRMoCBlockForgeTagAppend%class%.java
ECHO  *                                                                                          >> RRMoCBlockForgeTagAppend%class%.java
ECHO  * @version %version%                                                                       >> RRMoCBlockForgeTagAppend%class%.java
ECHO  * @author %author%                                                                         >> RRMoCBlockForgeTagAppend%class%.java
ECHO  */                                                                                         >> RRMoCBlockForgeTagAppend%class%.java
ECHO public class RRMoCBlockForgeTagAppend%class% extends RRMoCBlockTagAppendProvider            >> RRMoCBlockForgeTagAppend%class%.java
ECHO {                                                                                           >> RRMoCBlockForgeTagAppend%class%.java
ECHO     /**                                                                                     >> RRMoCBlockForgeTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                                >> RRMoCBlockForgeTagAppend%class%.java
ECHO      */                                                                                     >> RRMoCBlockForgeTagAppend%class%.java
ECHO     public RRMoCBlockForgeTagAppend%class%()                                                >> RRMoCBlockForgeTagAppend%class%.java
ECHO     {                                                                                       >> RRMoCBlockForgeTagAppend%class%.java
ECHO         super(net.minecraftforge.common.Tags.Blocks.%fid%, Tags.Blocks.%id%);               >> RRMoCBlockForgeTagAppend%class%.java
ECHO     }                                                                                       >> RRMoCBlockForgeTagAppend%class%.java
ECHO }                                                                                           >> RRMoCBlockForgeTagAppend%class%.java

@REM Add the Block Forge Tag Append in Git.
git add RRMoCBlockForgeTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Block Forge Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE