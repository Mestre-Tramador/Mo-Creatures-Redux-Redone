@REM ################################################################
@REM This batch file creates a Block Model Data Generator class.
@REM It does not create a Constant for the Block ID.
@REM Neither add it in the Data Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.14
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET modeldir="..\src\main\java\mestretramador\rrmocreatures\data\client\block"


@REM Collect the block model new name.
@ECHO OFF
ECHO What will be the Block Model class name?
ECHO The Block Model class name must be in Pascal Case eg. "NewBlockModelClass".
SET /p class=Model: 
IF [%class%] == [] EXIT 1

@REM Collect the block ID constant.
ECHO.
ECHO What is the Block ID constant?
ECHO The Block ID constant must be in Upper case and Underscores eg. "BLOCK_MODEL".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the block name.
ECHO.
ECHO What is the Block name?
ECHO The Block name is generally the same as the class name but with spaces eg. "Block Model".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Block Model directory.
CD %modeldir%

@REM Create the Block Model.
ECHO package mestretramador.rrmocreatures.data.client.block;                                           >> RRMoCBlockModel%class%.java
ECHO.                                                                                                  >> RRMoCBlockModel%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockModelProvider;           >> RRMoCBlockModel%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                               >> RRMoCBlockModel%class%.java
ECHO.                                                                                                  >> RRMoCBlockModel%class%.java
ECHO import net.minecraft.data.DataGenerator;                                                          >> RRMoCBlockModel%class%.java
ECHO.                                                                                                  >> RRMoCBlockModel%class%.java
ECHO import net.minecraftforge.common.data.ExistingFileHelper;                                         >> RRMoCBlockModel%class%.java
ECHO.                                                                                                  >> RRMoCBlockModel%class%.java
ECHO /**                                                                                               >> RRMoCBlockModel%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block model.                                                >> RRMoCBlockModel%class%.java
ECHO  *                                                                                                >> RRMoCBlockModel%class%.java
ECHO  * @version %version%                                                                             >> RRMoCBlockModel%class%.java
ECHO  * @author %author%                                                                               >> RRMoCBlockModel%class%.java
ECHO  */                                                                                               >> RRMoCBlockModel%class%.java
ECHO public class RRMoCBlockModel%class% extends RRMoCBlockModelProvider                               >> RRMoCBlockModel%class%.java
ECHO {                                                                                                 >> RRMoCBlockModel%class%.java
ECHO     /**                                                                                           >> RRMoCBlockModel%class%.java
ECHO      * Using the parent constructor, create a %name%.                                             >> RRMoCBlockModel%class%.java
ECHO      *                                                                                            >> RRMoCBlockModel%class%.java
ECHO      * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                >> RRMoCBlockModel%class%.java
ECHO      *                           Data Generator}.                                                 >> RRMoCBlockModel%class%.java
ECHO      * @param existingFileHelper Forge                                                            >> RRMoCBlockModel%class%.java
ECHO      *                           {@link net.minecraftforge.common.data.ExistingFileHelper         >> RRMoCBlockModel%class%.java
ECHO      *                           Existing File Helper}.                                           >> RRMoCBlockModel%class%.java
ECHO      */                                                                                           >> RRMoCBlockModel%class%.java
ECHO     public RRMoCBlockModel%class%(DataGenerator generator, ExistingFileHelper existingFileHelper) >> RRMoCBlockModel%class%.java
ECHO     {                                                                                             >> RRMoCBlockModel%class%.java
ECHO         super(generator, existingFileHelper, Constants.Blocks.%id%, Constants.BLOCK_PATH);        >> RRMoCBlockModel%class%.java
ECHO     }                                                                                             >> RRMoCBlockModel%class%.java
ECHO.                                                                                                  >> RRMoCBlockModel%class%.java
ECHO     /**                                                                                           >> RRMoCBlockModel%class%.java
ECHO      * Register the Model with the defined constants.                                             >> RRMoCBlockModel%class%.java
ECHO      */                                                                                           >> RRMoCBlockModel%class%.java
ECHO     @Override                                                                                     >> RRMoCBlockModel%class%.java
ECHO     protected void registerModels()                                                               >> RRMoCBlockModel%class%.java
ECHO     {                                                                                             >> RRMoCBlockModel%class%.java
ECHO         withExistingParent(this.model, modLoc(this.path + this.model));                           >> RRMoCBlockModel%class%.java
ECHO     }                                                                                             >> RRMoCBlockModel%class%.java
ECHO }                                                                                                 >> RRMoCBlockModel%class%.java

@REM Add the Block Model in Git.
git add RRMoCBlockModel%class%.java


@REM Final message.
ECHO.
ECHO Created Block Model for %name%!
ECHO Plase insert it on and run Data Generation.
PAUSE