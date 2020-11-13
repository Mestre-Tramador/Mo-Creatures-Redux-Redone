@REM ################################################################
@REM This batch file creates a Block Vanilla Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.18
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\block"


@REM Collect the block vanilla tag new name.
@ECHO OFF
ECHO What will be the Block Vanilla Tag class name?
ECHO The Block Vanilla Tag class name must be in Pascal Case eg. "NewBlockVanillaTagClass".
SET /p class=Vanilla Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the vanilla tag constant.
ECHO.
ECHO What is the Block Tag?
ECHO The Block Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "BLOCK_VANILLA_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the vanilla tag name.
ECHO.
ECHO What is the Block Tag name?
ECHO The Block Vanilla Tag name is generally the same as the class name but with spaces eg. "Block Vanilla Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Tag directory.
CD %tagdir%

@REM Create the Block Vanilla Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.block;                          >> RRMoCBlockVanillaTag%class%.java
ECHO.                                                                                      >> RRMoCBlockVanillaTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; >> RRMoCBlockVanillaTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterBlock;                               >> RRMoCBlockVanillaTag%class%.java
ECHO.                                                                                      >> RRMoCBlockVanillaTag%class%.java
ECHO import net.minecraft.tags.BlockTags;                                                  >> RRMoCBlockVanillaTag%class%.java
ECHO.                                                                                      >> RRMoCBlockVanillaTag%class%.java
ECHO /**                                                                                   >> RRMoCBlockVanillaTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Minecraft Tag's Blocks.                         >> RRMoCBlockVanillaTag%class%.java
ECHO  *                                                                                    >> RRMoCBlockVanillaTag%class%.java
ECHO  * @version %version%                                                                 >> RRMoCBlockVanillaTag%class%.java
ECHO  * @author %author%                                                                   >> RRMoCBlockVanillaTag%class%.java
ECHO  */                                                                                   >> RRMoCBlockVanillaTag%class%.java
ECHO public class RRMoCBlockVanillaTag%class% extends RRMoCBlockTagProvider                >> RRMoCBlockVanillaTag%class%.java
ECHO {                                                                                     >> RRMoCBlockVanillaTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockVanillaTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Minecraft tag.                    >> RRMoCBlockVanillaTag%class%.java
ECHO      */                                                                               >> RRMoCBlockVanillaTag%class%.java
ECHO     public RRMoCBlockVanillaTag%class%()                                              >> RRMoCBlockVanillaTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockVanillaTag%class%.java
ECHO         super(BlockTags.%id%);                                                        >> RRMoCBlockVanillaTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockVanillaTag%class%.java
ECHO.                                                                                      >> RRMoCBlockVanillaTag%class%.java
ECHO     /**                                                                               >> RRMoCBlockVanillaTag%class%.java
ECHO      * ^<p^>                                                                          >> RRMoCBlockVanillaTag%class%.java
ECHO      * The setter sets the {@link BlockTags#%id% %name% block                         >> RRMoCBlockVanillaTag%class%.java
ECHO      * Minecraft tag} to the below blocks:                                            >> RRMoCBlockVanillaTag%class%.java
ECHO      * ^</p^>                                                                         >> RRMoCBlockVanillaTag%class%.java
ECHO      * ^<ul^>                                                                         >> RRMoCBlockVanillaTag%class%.java
ECHO      * ^<li^>Link your blocks here.^</li^>                                            >> RRMoCBlockVanillaTag%class%.java
ECHO      * ^</ul^>                                                                        >> RRMoCBlockVanillaTag%class%.java
ECHO      */                                                                               >> RRMoCBlockVanillaTag%class%.java
ECHO     @Override                                                                         >> RRMoCBlockVanillaTag%class%.java
ECHO     protected void setBlocksToTag()                                                   >> RRMoCBlockVanillaTag%class%.java
ECHO     {                                                                                 >> RRMoCBlockVanillaTag%class%.java
ECHO         // Add here your blocks to this tag.                                          >> RRMoCBlockVanillaTag%class%.java
ECHO         // Use BLOCKS.add(block);                                                     >> RRMoCBlockVanillaTag%class%.java
ECHO     }                                                                                 >> RRMoCBlockVanillaTag%class%.java
ECHO }                                                                                     >> RRMoCBlockVanillaTag%class%.java

@REM Add the Block Vanilla Tag in Git.
git add RRMoCBlockVanillaTag%class%.java


@REM Final message.
ECHO.
ECHO Created Block Vanilla Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE