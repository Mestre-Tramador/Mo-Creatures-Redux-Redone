@REM ################################################################
@REM This batch file creates a BlockItem Tag Copy Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.25
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the blockitem tag new name.
@ECHO OFF
ECHO What will be the BlockItem Tag class name?
ECHO The BlockItem Tag class name must be in Pascal Case eg. "NewBlockItemTagClass".
SET /p class=Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the BlockItem Tag?
ECHO The BlockItem Tag constant must be in Upper case and Underscores eg. "BLOCK_ITEM_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent tag constant.
ECHO.
ECHO What is the BlockItem Parent Tag?
ECHO The BlockItem Parent Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the tag name.
ECHO.
ECHO What is the BlockItem Tag name?
ECHO The BlockItem Tag name is generally the same as the class name but with spaces eg. "BlockItem Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the BlockItem Tag directory.
CD %tagdir%

@REM Create the BlockItem Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                              >> RRMoCBlockItemTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider; >> RRMoCBlockItemTag%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                            >> RRMoCBlockItemTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemTag%class%.java
ECHO /**                                                                                       >> RRMoCBlockItemTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Tag's BlockItems.                                   >> RRMoCBlockItemTag%class%.java
ECHO  *                                                                                        >> RRMoCBlockItemTag%class%.java
ECHO  * @version %version%                                                                     >> RRMoCBlockItemTag%class%.java
ECHO  * @author %author%                                                                       >> RRMoCBlockItemTag%class%.java
ECHO  */                                                                                       >> RRMoCBlockItemTag%class%.java
ECHO public class RRMoCBlockItemTag%class% extends RRMoCBlockItemTagProvider                   >> RRMoCBlockItemTag%class%.java
ECHO {                                                                                         >> RRMoCBlockItemTag%class%.java
ECHO     /**                                                                                   >> RRMoCBlockItemTag%class%.java
ECHO      * Using the parent constructor, creates the %name% tag.                              >> RRMoCBlockItemTag%class%.java
ECHO      */                                                                                   >> RRMoCBlockItemTag%class%.java
ECHO     public RRMoCBlockItemTag%class%()                                                     >> RRMoCBlockItemTag%class%.java
ECHO     {                                                                                     >> RRMoCBlockItemTag%class%.java
ECHO         super(Tags.Blocks.%fid%, Tags.Items.%id%);                                        >> RRMoCBlockItemTag%class%.java
ECHO     }                                                                                     >> RRMoCBlockItemTag%class%.java
ECHO }                                                                                         >> RRMoCBlockItemTag%class%.java

@REM Add the BlockItem Tag in Git.
git add RRMoCBlockItemTag%class%.java


@REM Final message.
ECHO.
ECHO Created BlockItem Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE