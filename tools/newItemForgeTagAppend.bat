@REM ########################################################################
@REM This batch file creates an Item Forge Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ########################################################################

@REM Gloval variables.
@SET version=0.0.17
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item forge tag append new name.
@ECHO OFF
ECHO What will be the Item Forge Tag Append class name?
ECHO The Item Forge Tag Append class name must be in Pascal Case eg. "NewItemForgeTagAppendClass".
SET /p class=Forge Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Item Tag?
ECHO The Item Tag constant must be in Upper case and Underscores eg. "ITEM_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent forge tag constant.
ECHO.
ECHO What is the Item Parent Forge Tag?
ECHO The Item Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. "ITEM_FORGE_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the forge tag append name.
ECHO.
ECHO What is the Item Forge Tag Append name?
ECHO The Item Forge Tag name is generally the same as the class name but with spaces eg. "Item Forge Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Append Forge Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                               >> RRMoCItemForgeTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemForgeTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; >> RRMoCItemForgeTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                            >> RRMoCItemForgeTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemForgeTagAppend%class%.java
ECHO /**                                                                                       >> RRMoCItemForgeTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Forge Tag Append's.                                 >> RRMoCItemForgeTagAppend%class%.java
ECHO  *                                                                                        >> RRMoCItemForgeTagAppend%class%.java
ECHO  * @version %version%                                                                     >> RRMoCItemForgeTagAppend%class%.java
ECHO  * @author %author%                                                                       >> RRMoCItemForgeTagAppend%class%.java
ECHO  */                                                                                       >> RRMoCItemForgeTagAppend%class%.java
ECHO public class RRMoCItemForgeTagAppend%class% extends RRMoCItemTagAppendProvider            >> RRMoCItemForgeTagAppend%class%.java
ECHO {                                                                                         >> RRMoCItemForgeTagAppend%class%.java
ECHO     /**                                                                                   >> RRMoCItemForgeTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                              >> RRMoCItemForgeTagAppend%class%.java
ECHO      */                                                                                   >> RRMoCItemForgeTagAppend%class%.java
ECHO     public RRMoCItemForgeTagAppend%class%()                                               >> RRMoCItemForgeTagAppend%class%.java
ECHO     {                                                                                     >> RRMoCItemForgeTagAppend%class%.java
ECHO         super(net.minecraftforge.common.Tags.Items.%fid%, Tags.Items.%id%);               >> RRMoCItemForgeTagAppend%class%.java
ECHO     }                                                                                     >> RRMoCItemForgeTagAppend%class%.java
ECHO }                                                                                         >> RRMoCItemForgeTagAppend%class%.java

@REM Add the Item Forge Tag Append in Git.
git add RRMoCItemForgeTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Item Forge Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE