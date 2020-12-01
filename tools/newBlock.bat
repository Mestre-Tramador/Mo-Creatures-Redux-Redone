@REM ################################################################
@REM This batch file creates both Block and Provider classes.
@REM It does not create a Constant for the Block ID.
@REM Neither a lang file entry.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.26
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET blockdir="..\..\block"
@SET providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\block"


@REM Collect the block new name.
@ECHO OFF
ECHO What will be the Block class name?
ECHO The Block class name must be in Pascal Case eg. "NewBlockClass".
SET /p class=Block: 
IF [%class%] == [] EXIT 1

@REM Collect the block ID constant.
ECHO.
ECHO What is the Block ID constant?
ECHO The Block ID constant must be in Upper case and Underscores eg. "NEW_BLOCK".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the block base Material.
ECHO.
ECHO What is the Block base Material?
ECHO The Block base Material must be in Upper case and Underscores, also exists in Minecraft eg. "ROCK".
SET /p material=Material: 
IF [%material%] == [] EXIT 1

@REM Collect the block name.
ECHO.
ECHO What is the Block name?
ECHO The Block name is generally the same as the class name but with spaces eg. "New Block".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Provider directory.
CD %providerdir%

@REM Create the Provider.
ECHO package mestretramador.rrmocreatures.provider.block;                                 >> RRMoCBlockProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockProvider%class%.java
ECHO import net.minecraft.block.AbstractBlock;                                            >> RRMoCBlockProvider%class%.java
ECHO import net.minecraft.block.material.Material;                                        >> RRMoCBlockProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockProvider%class%.java
ECHO /**                                                                                  >> RRMoCBlockProvider%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block provider.                                >> RRMoCBlockProvider%class%.java
ECHO  *                                                                                   >> RRMoCBlockProvider%class%.java
ECHO  * @version %version%                                                                >> RRMoCBlockProvider%class%.java
ECHO  * @author %author%                                                                  >> RRMoCBlockProvider%class%.java
ECHO  */                                                                                  >> RRMoCBlockProvider%class%.java
ECHO public class RRMoCBlockProvider%class% extends RRMoCBlockProvider                    >> RRMoCBlockProvider%class%.java
ECHO {                                                                                    >> RRMoCBlockProvider%class%.java
ECHO     /**                                                                              >> RRMoCBlockProvider%class%.java
ECHO      * Using the parent constructor, start the %name% with a                         >> RRMoCBlockProvider%class%.java
ECHO      * {@link net.minecraft.block.material.Material#%material% %material% material}. >> RRMoCBlockProvider%class%.java
ECHO      */                                                                              >> RRMoCBlockProvider%class%.java
ECHO     public RRMoCBlockProvider%class%()                                               >> RRMoCBlockProvider%class%.java
ECHO     {                                                                                >> RRMoCBlockProvider%class%.java
ECHO         super(Material.%material%);                                                  >> RRMoCBlockProvider%class%.java
ECHO     }                                                                                >> RRMoCBlockProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockProvider%class%.java
ECHO     /**                                                                              >> RRMoCBlockProvider%class%.java
ECHO      * Return the block properties of                                                >> RRMoCBlockProvider%class%.java
ECHO      * {@link mestretramador.rrmocreatures.block.RRMoCBlock%class%                   >> RRMoCBlockProvider%class%.java
ECHO      * %name%}.                                                                      >> RRMoCBlockProvider%class%.java
ECHO      */                                                                              >> RRMoCBlockProvider%class%.java
ECHO     @Override                                                                        >> RRMoCBlockProvider%class%.java
ECHO     public AbstractBlock.Properties provideBlockProperties()                         >> RRMoCBlockProvider%class%.java
ECHO     {                                                                                >> RRMoCBlockProvider%class%.java
ECHO         // Add here the properties of %name%.                                        >> RRMoCBlockProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockProvider%class%.java
ECHO         return BLOCK_PROPERTIES();                                                   >> RRMoCBlockProvider%class%.java
ECHO     }                                                                                >> RRMoCBlockProvider%class%.java
ECHO }                                                                                    >> RRMoCBlockProvider%class%.java

@REM Add the Provider in Git.
git add RRMoCBlockProvider%class%.java


@REM Go to the Blocks directory to create an block class.
CD %blockdir%

@REM Create the Block.
ECHO package mestretramador.rrmocreatures.block;                                                             >> RRMoCBlock%class%.java
ECHO.                                                                                                        >> RRMoCBlock%class%.java
ECHO import mestretramador.rrmocreatures.model.block.RRMoCBlockModel;                                        >> RRMoCBlock%class%.java
ECHO import mestretramador.rrmocreatures.provider.block.RRMoCBlockProvider%class%;                           >> RRMoCBlock%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                                     >> RRMoCBlock%class%.java
ECHO.                                                                                                        >> RRMoCBlock%class%.java
ECHO import net.minecraft.block.Block;                                                                       >> RRMoCBlock%class%.java
ECHO.                                                                                                        >> RRMoCBlock%class%.java
ECHO /**                                                                                                     >> RRMoCBlock%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block.                                                            >> RRMoCBlock%class%.java
ECHO  *                                                                                                      >> RRMoCBlock%class%.java
ECHO  * @version %version%                                                                                   >> RRMoCBlock%class%.java
ECHO  * @author %author%                                                                                     >> RRMoCBlock%class%.java
ECHO  */                                                                                                     >> RRMoCBlock%class%.java
ECHO public class RRMoCBlock%class% extends RRMoCBlock                                                       >> RRMoCBlock%class%.java
ECHO {                                                                                                       >> RRMoCBlock%class%.java
ECHO     /**                                                                                                 >> RRMoCBlock%class%.java
ECHO      * Using the parent constructor, create a %name% block.                                             >> RRMoCBlock%class%.java
ECHO      */                                                                                                 >> RRMoCBlock%class%.java
ECHO     public RRMoCBlock%class%()                                                                          >> RRMoCBlock%class%.java
ECHO     {                                                                                                   >> RRMoCBlock%class%.java
ECHO         super(Constants.Blocks.%id%, new RRMoCBlockProvider%class%());                                  >> RRMoCBlock%class%.java
ECHO     }                                                                                                   >> RRMoCBlock%class%.java
ECHO.                                                                                                        >> RRMoCBlock%class%.java
ECHO     /**                                                                                                 >> RRMoCBlock%class%.java
ECHO      * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                    >> RRMoCBlock%class%.java
ECHO      * ^set helper function}, the %name% block is created.                                              >> RRMoCBlock%class%.java
ECHO      */                                                                                                 >> RRMoCBlock%class%.java
ECHO     @Override                                                                                           >> RRMoCBlock%class%.java
ECHO     protected void createBlock()                                                                        >> RRMoCBlock%class%.java
ECHO     {                                                                                                   >> RRMoCBlock%class%.java
ECHO         setBlock(new RRMoCBlockModel(((RRMoCBlockProvider%class%) provider).provideBlockProperties())); >> RRMoCBlock%class%.java
ECHO     }                                                                                                   >> RRMoCBlock%class%.java
ECHO.                                                                                                        >> RRMoCBlock%class%.java
ECHO     /**                                                                                                 >> RRMoCBlock%class%.java
ECHO      * Return the %name% block in its current state.                                                    >> RRMoCBlock%class%.java
ECHO      */                                                                                                 >> RRMoCBlock%class%.java
ECHO     @Override                                                                                           >> RRMoCBlock%class%.java
ECHO     public Block returnAsBlock()                                                                        >> RRMoCBlock%class%.java
ECHO     {                                                                                                   >> RRMoCBlock%class%.java
ECHO         return getBlock();                                                                              >> RRMoCBlock%class%.java
ECHO     }                                                                                                   >> RRMoCBlock%class%.java
ECHO }                                                                                                       >> RRMoCBlock%class%.java

@REM Add the Block in Git.
git add RRMoCBlock%class%.java


@REM Final message.
ECHO.
ECHO Created Block and Provider for %name%!
ECHO Plase insert it on lang files.
PAUSE