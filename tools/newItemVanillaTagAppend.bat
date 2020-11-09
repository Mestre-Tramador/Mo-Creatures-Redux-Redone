@REM ##########################################################################
@REM This batch file creates a Item Vanilla Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ##########################################################################

@REM Gloval variables.
@SET version=0.0.12
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item vanilla tag append new name.
@ECHO OFF
ECHO What will be the Item Vanilla Tag Append class name?
ECHO The Item Vanilla Tag Append class name must be in Pascal Case eg. "NewItemVanillaTagAppendClass".
SET /p class=Vanilla Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Item Tag?
ECHO The Item Tag constant must be in Upper case and Underscores eg. "ITEM_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent vanilla tag constant.
ECHO.
ECHO What is the Item Parent Vanilla Tag?
ECHO The Item Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "ITEM_VANILLA_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the vanilla tag append name.
ECHO.
ECHO What is the Item Vanilla Tag Append name?
ECHO The Item Vanilla Tag name is generally the same as the class name but with spaces eg. "Item Vanilla Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Vanilla Tag Append.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                               >> RRMoCItemVanillaTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemVanillaTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; >> RRMoCItemVanillaTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                            >> RRMoCItemVanillaTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemVanillaTagAppend%class%.java
ECHO import net.minecraft.tags.ItemTags;                                                       >> RRMoCItemVanillaTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemVanillaTagAppend%class%.java
ECHO /**                                                                                       >> RRMoCItemVanillaTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Minecraft Tag Append's.                             >> RRMoCItemVanillaTagAppend%class%.java
ECHO  *                                                                                        >> RRMoCItemVanillaTagAppend%class%.java
ECHO  * @version %version%                                                                     >> RRMoCItemVanillaTagAppend%class%.java
ECHO  * @author %author%                                                                       >> RRMoCItemVanillaTagAppend%class%.java
ECHO  */                                                                                       >> RRMoCItemVanillaTagAppend%class%.java
ECHO public class RRMoCItemVanillaTagAppend%class% extends RRMoCItemTagAppendProvider          >> RRMoCItemVanillaTagAppend%class%.java
ECHO {                                                                                         >> RRMoCItemVanillaTagAppend%class%.java
ECHO     /**                                                                                   >> RRMoCItemVanillaTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                              >> RRMoCItemVanillaTagAppend%class%.java
ECHO      */                                                                                   >> RRMoCItemVanillaTagAppend%class%.java
ECHO     public RRMoCItemVanillaTagAppend%class%()                                             >> RRMoCItemVanillaTagAppend%class%.java
ECHO     {                                                                                     >> RRMoCItemVanillaTagAppend%class%.java
ECHO         super(ItemTags.%fid%, Tags.Items.%id%);                                           >> RRMoCItemVanillaTagAppend%class%.java
ECHO     }                                                                                     >> RRMoCItemVanillaTagAppend%class%.java
ECHO }                                                                                         >> RRMoCItemVanillaTagAppend%class%.java

@REM Add the Item Vanilla Tag Append in Git.
git add RRMoCItemVanillaTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Item Vanilla Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE