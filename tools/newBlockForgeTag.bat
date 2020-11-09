@REM ################################################################
@REM This batch file creates a Block Forge Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.13
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block forge tag new name.
@ECHO OFF
ECHO What will be the Block Forge Tag class name?
ECHO The Block Forge Tag class name must be in Pascal Case eg. "NewBlockForgeTagClass".
SET /p class=Forge Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the forge tag constant.
ECHO.
ECHO What is the Block Forge Tag?
ECHO The Block Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. "BLOCK_FORGE_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the forge tag name.
ECHO.
ECHO What is the Block Tag name?
ECHO The Block Forge Tag name is generally the same as the class name but with spaces eg. "Block Forge Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Forge Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                          >> RRMoCBlockForgeTag%class%.java
ECHO.                                                                                      >> RRMoCBlockForgeTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; >> RRMoCBlockForgeTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterBlock;                               >> RRMoCBlockForgeTag%class%.java
ECHO.                                                                                      >> RRMoCBlockForgeTag%class%.java
ECHO import net.minecraftforge.common.Tags;                                                >> RRMoCBlockForgeTag%class%.java
ECHO.                                                                                      >> RRMoCBlockForgeTag%class%.java
ECHO /**                                                                                   >> RRMoCBlockForgeTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Forge Tag's Blocks.                             >> RRMoCBlockForgeTag%class%.java
ECHO  *                                                                                    >> RRMoCBlockForgeTag%class%.java
ECHO  * @version %version%                                                                 >> RRMoCBlockForgeTag%class%.java
ECHO  * @author %author%                                                                   >> RRMoCBlockForgeTag%class%.java
ECHO  */                                                                                   >> RRMoCBlockForgeTag%class%.java
ECHO public class RRMoCBlockForgeTag%class% extends RRMoCBlockTagProvider                  >> RRMoCBlockForgeTag%class%.java
ECHO {                                                                                     >> RRMoCBlockForgeTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockForgeTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Forge tag.                        >> RRMoCBlockForgeTag%class%.java
ECHO      */                                                                               >> RRMoCBlockForgeTag%class%.java
ECHO     public RRMoCBlockForgeTag%class%()                                                >> RRMoCBlockForgeTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockForgeTag%class%.java
ECHO         super(Tags.Blocks.%id%);                                                      >> RRMoCBlockForgeTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockForgeTag%class%.java
ECHO.                                                                                      >> RRMoCBlockForgeTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockForgeTag%class%.java
ECHO      * ^<p^>                                                                          >> RRMoCBlockForgeTag%class%.java
ECHO      * The setter sets the {@link Tags.Blocks#%id% %name% block                       >> RRMoCBlockForgeTag%class%.java
ECHO      * Forge tag} to the below blocks:                                                >> RRMoCBlockForgeTag%class%.java
ECHO      * ^</p^>                                                                         >> RRMoCBlockForgeTag%class%.java
ECHO      * ^<ul^>                                                                         >> RRMoCBlockForgeTag%class%.java
ECHO      * ^<li^>Link your blocks here.^</li^>                                            >> RRMoCBlockForgeTag%class%.java
ECHO      * ^</ul^>                                                                        >> RRMoCBlockForgeTag%class%.java
ECHO      */                                                                               >> RRMoCBlockForgeTag%class%.java
ECHO     @Override                                                                         >> RRMoCBlockForgeTag%class%.java
ECHO     protected void setBlocksToTag()                                                   >> RRMoCBlockForgeTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockForgeTag%class%.java
ECHO         // Add here your blocks to this tag.                                          >> RRMoCBlockForgeTag%class%.java
ECHO         // Use BLOCKS.add(block);                                                     >> RRMoCBlockForgeTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockForgeTag%class%.java
ECHO }                                                                                     >> RRMoCBlockForgeTag%class%.java

@REM Add the Block Forge Tag in Git.
git add RRMoCBlockForgeTag%class%.java


@REM Final message.
ECHO.
ECHO Created Block Forge Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE