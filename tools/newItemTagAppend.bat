@REM ########################################################################
@REM This batch file creates an Item Tag Append Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ########################################################################

@REM Gloval variables.
@SET version=0.0.21
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item tag append new name.
@ECHO OFF
ECHO What will be the Item Tag Append class name?
ECHO The Item Tag Append class name must be in Pascal Case eg. "NewItemTagAppendClass".
SET /p class=Tag Append: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Item Tag?
ECHO The Item Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent tag constant.
ECHO.
ECHO What is the Item Parent Tag?
ECHO The Item Parent Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG_APPEND".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the tag append name.
ECHO.
ECHO What is the Item Tag Append name?
ECHO The Item Tag name is generally the same as the class name but with spaces eg. "Item Tag Append".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1



@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Append Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                               >> RRMoCItemTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; >> RRMoCItemTagAppend%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                            >> RRMoCItemTagAppend%class%.java
ECHO.                                                                                          >> RRMoCItemTagAppend%class%.java
ECHO /**                                                                                       >> RRMoCItemTagAppend%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Tag Append's.                                       >> RRMoCItemTagAppend%class%.java
ECHO  *                                                                                        >> RRMoCItemTagAppend%class%.java
ECHO  * @version %version%                                                                     >> RRMoCItemTagAppend%class%.java
ECHO  * @author %author%                                                                       >> RRMoCItemTagAppend%class%.java
ECHO  */                                                                                       >> RRMoCItemTagAppend%class%.java
ECHO public class RRMoCItemTagAppend%class% extends RRMoCItemTagAppendProvider                 >> RRMoCItemTagAppend%class%.java
ECHO {                                                                                         >> RRMoCItemTagAppend%class%.java
ECHO     /**                                                                                   >> RRMoCItemTagAppend%class%.java
ECHO      * Using the parent constructor, appends the %name% tag.                              >> RRMoCItemTagAppend%class%.java
ECHO      */                                                                                   >> RRMoCItemTagAppend%class%.java
ECHO     public RRMoCItemTagAppend%class%()                                                    >> RRMoCItemTagAppend%class%.java
ECHO     {                                                                                     >> RRMoCItemTagAppend%class%.java
ECHO         super(Tags.Items.%fid%, Tags.Items.%id%);                                         >> RRMoCItemTagAppend%class%.java
ECHO     }                                                                                     >> RRMoCItemTagAppend%class%.java
ECHO }                                                                                         >> RRMoCItemTagAppend%class%.java

@REM Add the Item Tag Append in Git.
git add RRMoCItemTagAppend%class%.java


@REM Final message.
ECHO.
ECHO Created Item Tag Append for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE