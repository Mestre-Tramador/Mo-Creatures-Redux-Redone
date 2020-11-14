@REM ########################################################################
@REM This batch file creates a BlockItem Forge Tag Copy Generator class.
@REM It does not create a Constant for the Tags.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ########################################################################

@REM Gloval variables.
@SET version=0.0.19
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the blockitem forge tag new name.
@ECHO OFF
ECHO What will be the BlockItem Forge Tag class name?
ECHO The BlockItem Forge Tag class name must be in Pascal Case eg. "NewBlockItemForgeTagClass".
SET /p class=Forge Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the forge tag constant.
ECHO.
ECHO What is the BlockItem Forge Tag?
ECHO The BlockItem Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. "BLOCK_ITEM_FORGE_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the parent forge tag constant.
ECHO.
ECHO What is the BlockItem Parent Forge Tag?
ECHO The BlockItem Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. "BLOCK_FORGE_TAG".
SET /p fid=ID: 
IF [%fid%] == [] EXIT 1

@REM Collect the forge tag name.
ECHO.
ECHO What is the BlockItem Forge Tag name?
ECHO The BlockItem Forge Tag name is generally the same as the class name but with spaces eg. "BlockItem Forge Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the BlockItem Tag directory.
CD %tagdir%

@REM Create the BlockItem Forge Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                              >> RRMoCBlockItemForgeTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemForgeTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider; >> RRMoCBlockItemForgeTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemForgeTag%class%.java
ECHO import net.minecraftforge.common.Tags;                                                    >> RRMoCBlockItemForgeTag%class%.java
ECHO.                                                                                          >> RRMoCBlockItemForgeTag%class%.java
ECHO /**                                                                                       >> RRMoCBlockItemForgeTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Forge Tag's BlockItems.                             >> RRMoCBlockItemForgeTag%class%.java
ECHO  *                                                                                        >> RRMoCBlockItemForgeTag%class%.java
ECHO  * @version %version%                                                                     >> RRMoCBlockItemForgeTag%class%.java
ECHO  * @author %author%                                                                       >> RRMoCBlockItemForgeTag%class%.java
ECHO  */                                                                                       >> RRMoCBlockItemForgeTag%class%.java
ECHO public class RRMoCBlockItemForgeTag%class% extends RRMoCBlockItemTagProvider              >> RRMoCBlockItemForgeTag%class%.java
ECHO {                                                                                         >> RRMoCBlockItemForgeTag%class%.java
ECHO     /**                                                                                   >> RRMoCBlockItemForgeTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Forge tag.                            >> RRMoCBlockItemForgeTag%class%.java
ECHO      */                                                                                   >> RRMoCBlockItemForgeTag%class%.java
ECHO     public RRMoCBlockItemForgeTag%class%()                                                >> RRMoCBlockItemForgeTag%class%.java
ECHO     {                                                                                     >> RRMoCBlockItemForgeTag%class%.java
ECHO         super(Tags.Blocks.%fid%, Tags.Items.%id%);                                        >> RRMoCBlockItemForgeTag%class%.java
ECHO     }                                                                                     >> RRMoCBlockItemForgeTag%class%.java
ECHO }                                                                                         >> RRMoCBlockItemForgeTag%class%.java

@REM Add the BlockItem Forge Tag in Git.
git add RRMoCBlockItemForgeTag%class%.java


@REM Final message.
ECHO.
ECHO Created BlockItem Forge Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE