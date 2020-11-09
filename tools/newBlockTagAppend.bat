@REM ########################################################################
@REM This batch file creates a Block Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ########################################################################

@REM Gloval variables.
@SET version=0.0.13
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block tag append new name.
@ECHO OFF
ECHO What will be the Block Tag Append class name?
ECHO The Block Tag Append class name must be in Pascal Case eg. "NewBlockTagAppendClass".
SET /p class=Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Block Tag?
ECHO The Block Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent tag constant.
ECHO.
ECHO What is the Block Parent Tag?
ECHO The Block Parent Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the tag append name.
ECHO.
ECHO What is the Block Tag Append name?
ECHO The Block Tag name is generally the same as the class name but with spaces eg. "Block Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Append Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                                >> RRMoCBlockTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; >> RRMoCBlockTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                              >> RRMoCBlockTagAppend%class%.java
ECHO.                                                                                            >> RRMoCBlockTagAppend%class%.java
ECHO /**                                                                                         >> RRMoCBlockTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Tag Append's.                                         >> RRMoCBlockTagAppend%class%.java
ECHO  *                                                                                          >> RRMoCBlockTagAppend%class%.java
ECHO  * @version %version%                                                                       >> RRMoCBlockTagAppend%class%.java
ECHO  * @author %author%                                                                         >> RRMoCBlockTagAppend%class%.java
ECHO  */                                                                                         >> RRMoCBlockTagAppend%class%.java
ECHO public class RRMoCBlockTagAppend%class% extends RRMoCBlockTagAppendProvider                 >> RRMoCBlockTagAppend%class%.java
ECHO {                                                                                           >> RRMoCBlockTagAppend%class%.java
ECHO     /**                                                                                     >> RRMoCBlockTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                                >> RRMoCBlockTagAppend%class%.java
ECHO      */                                                                                     >> RRMoCBlockTagAppend%class%.java
ECHO     public RRMoCBlockTagAppend%class%()                                                     >> RRMoCBlockTagAppend%class%.java
ECHO     {                                                                                       >> RRMoCBlockTagAppend%class%.java
ECHO         super(Tags.Blocks.%fid%, Tags.Blocks.%id%);                                         >> RRMoCBlockTagAppend%class%.java
ECHO     }                                                                                       >> RRMoCBlockTagAppend%class%.java
ECHO }                                                                                           >> RRMoCBlockTagAppend%class%.java

@REM Add the Block Tag Append in Git.
git add RRMoCBlockTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Block Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE