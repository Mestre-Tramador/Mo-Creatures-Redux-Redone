@REM ################################################################
@REM This batch file creates a Block State Data Generator class.
@REM It does not create a Register for the Block.
@REM Neither add it in the Data Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.8
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET statedir="..\src\main\java\mestretramador\rrmocreatures\data\client\block"


@REM Collect the block state new name.
@ECHO OFF
ECHO What will be the Block State class name?
ECHO The Block State class name must be in Pascal Case eg. "NewBlockStateClass".
SET /p class=State: 
IF [%class%] == [] EXIT 1

@REM Collect the block register constant.
ECHO.
ECHO What is the Block register constant?
ECHO The Block register constant can be found in the RegisterBlock class eg "init.RegisterBlock#BLOCK_STATE".
SET /p id=Register: 
IF [%id%] == [] EXIT 1

@REM Collect the block name.
ECHO.
ECHO What is the Block name?
ECHO The Block name is generally the same as the class name but with spaces eg. "Block State".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block State directory.
CD %statedir%

@REM Create the Block State.
ECHO package mestretramador.rrmocreatures.data.client.block;                                           >> RRMoCBlockState%class%.java
ECHO.                                                                                                  >> RRMoCBlockState%class%.java
ECHO import mestretramador.rrmocreatures.block.RRMoCBlock%class%;                                      >> RRMoCBlockState%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;           >> RRMoCBlockState%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterBlock;                                           >> RRMoCBlockState%class%.java
ECHO.                                                                                                  >> RRMoCBlockState%class%.java
ECHO import net.minecraft.data.DataGenerator;                                                          >> RRMoCBlockState%class%.java
ECHO.                                                                                                  >> RRMoCBlockState%class%.java
ECHO import net.minecraftforge.common.data.ExistingFileHelper;                                         >> RRMoCBlockState%class%.java
ECHO.                                                                                                  >> RRMoCBlockState%class%.java
ECHO /**                                                                                               >> RRMoCBlockState%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block state.                                                >> RRMoCBlockState%class%.java
ECHO  *                                                                                                >> RRMoCBlockState%class%.java
ECHO  * @version %version%                                                                             >> RRMoCBlockState%class%.java
ECHO  * @author %author%                                                                               >> RRMoCBlockState%class%.java
ECHO  */                                                                                               >> RRMoCBlockState%class%.java
ECHO public class RRMoCBlockState%class% extends RRMoCBlockStateProvider                               >> RRMoCBlockState%class%.java
ECHO {                                                                                                 >> RRMoCBlockState%class%.java
ECHO     /**                                                                                           >> RRMoCBlockState%class%.java
ECHO      * Using the parent constructor, create the blockstate from %name%.                           >> RRMoCBlockState%class%.java
ECHO      *                                                                                            >> RRMoCBlockState%class%.java
ECHO      * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                >> RRMoCBlockState%class%.java
ECHO      *                           Data Generator}.                                                 >> RRMoCBlockState%class%.java
ECHO      * @param existingFileHelper Forge                                                            >> RRMoCBlockState%class%.java
ECHO      *                           {@link net.minecraftforge.common.data.ExistingFileHelper         >> RRMoCBlockState%class%.java
ECHO      *                           Existing File Helper}.                                           >> RRMoCBlockState%class%.java
ECHO      */                                                                                           >> RRMoCBlockState%class%.java
ECHO     public RRMoCBlockState%class%(DataGenerator generator, ExistingFileHelper existingFileHelper) >> RRMoCBlockState%class%.java
ECHO     {                                                                                             >> RRMoCBlockState%class%.java
ECHO         super(generator, existingFileHelper, RegisterBlock.%id%);                                 >> RRMoCBlockState%class%.java
ECHO     }                                                                                             >> RRMoCBlockState%class%.java
ECHO.                                                                                                  >> RRMoCBlockState%class%.java
ECHO     /**                                                                                           >> RRMoCBlockState%class%.java
ECHO      * Register the block states by the given registered block.                                   >> RRMoCBlockState%class%.java
ECHO      */                                                                                           >> RRMoCBlockState%class%.java
ECHO     @Override                                                                                     >> RRMoCBlockState%class%.java
ECHO     protected void registerStatesAndModels()                                                      >> RRMoCBlockState%class%.java
ECHO     {                                                                                             >> RRMoCBlockState%class%.java
ECHO         // Add here the state of you block.                                                       >> RRMoCBlockState%class%.java
ECHO         // To retrieve it use ((RRMoCBlock%class%) this.registeredBlock).returnAsBlock();         >> RRMoCBlockState%class%.java
ECHO     }                                                                                             >> RRMoCBlockState%class%.java
ECHO }                                                                                                 >> RRMoCBlockState%class%.java

@REM Add the Block State in Git.
git add RRMoCBlockState%class%.java


@REM Final message.
ECHO.
ECHO Created Block State for %name%!
ECHO Plase insert it on and run Data Generation.
PAUSE