@REM ################################################################
@REM This batch file creates a Block Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.14
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block tag new name.
@ECHO OFF
ECHO What will be the Block Tag class name?
ECHO The Block Tag class name must be in Pascal Case eg. "NewBlockTagClass".
SET /p class=Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Block Tag?
ECHO The Block Tag constant must be in Upper case and Underscores eg. "BLOCK_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the tag name.
ECHO.
ECHO What is the Block Tag name?
ECHO The Block Tag name is generally the same as the class name but with spaces eg. "Block Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                          >> RRMoCBlockTag%class%.java
ECHO.                                                                                      >> RRMoCBlockTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; >> RRMoCBlockTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterBlock;                               >> RRMoCBlockTag%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                        >> RRMoCBlockTag%class%.java
ECHO.                                                                                      >> RRMoCBlockTag%class%.java
ECHO /**                                                                                   >> RRMoCBlockTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Tag's Blocks.                                   >> RRMoCBlockTag%class%.java
ECHO  *                                                                                    >> RRMoCBlockTag%class%.java
ECHO  * @version %version%                                                                 >> RRMoCBlockTag%class%.java
ECHO  * @author %author%                                                                   >> RRMoCBlockTag%class%.java
ECHO  */                                                                                   >> RRMoCBlockTag%class%.java
ECHO public class RRMoCBlockTag%class% extends RRMoCBlockTagProvider                       >> RRMoCBlockTag%class%.java
ECHO {                                                                                     >> RRMoCBlockTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockTag%class%.java
ECHO      * Using the parent constructor, creates the %name% tag.                          >> RRMoCBlockTag%class%.java
ECHO      */                                                                               >> RRMoCBlockTag%class%.java
ECHO     public RRMoCBlockTag%class%()                                                     >> RRMoCBlockTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockTag%class%.java
ECHO         super(Tags.Blocks.%id%);                                                      >> RRMoCBlockTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockTag%class%.java
ECHO.                                                                                      >> RRMoCBlockTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockTag%class%.java
ECHO      * ^<p^>                                                                          >> RRMoCBlockTag%class%.java
ECHO      * The setter sets the {@link Tags.Blocks#%id% %name% block                       >> RRMoCBlockTag%class%.java
ECHO      * tag} to the below blocks:                                                      >> RRMoCBlockTag%class%.java
ECHO      * ^</p^>                                                                         >> RRMoCBlockTag%class%.java
ECHO      * ^<ul^>                                                                         >> RRMoCBlockTag%class%.java
ECHO      * ^<li^>Link your blocks here.^</li^>                                            >> RRMoCBlockTag%class%.java
ECHO      * ^</ul^>                                                                        >> RRMoCBlockTag%class%.java
ECHO      */                                                                               >> RRMoCBlockTag%class%.java
ECHO     @Override                                                                         >> RRMoCBlockTag%class%.java
ECHO     protected void setBlocksToTag()                                                   >> RRMoCBlockTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockTag%class%.java
ECHO         // Add here your blocks to this tag.                                          >> RRMoCBlockTag%class%.java
ECHO         // Use BLOCKS.add(block);                                                     >> RRMoCBlockTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockTag%class%.java
ECHO }                                                                                     >> RRMoCBlockTag%class%.java

@REM Add the Block Tag in Git.
git add RRMoCBlockTag%class%.java


@REM Final message.
ECHO.
ECHO Created Block Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE