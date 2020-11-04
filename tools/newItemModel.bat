@REM ################################################################
@REM This batch file creates an Item Model Data Generator class.
@REM It does not create a Constant for the Item ID.
@REM Neither add it in the Data Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.8
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET modeldir="..\src\main\java\mestretramador\rrmocreatures\data\client\item"


@REM Collect the item model new name.
@ECHO OFF
ECHO What will be the Item Model class name?
ECHO The Item Model class name must be in Pascal Case eg. "NewItemModelClass".
SET /p class=Model: 
IF [%class%] == [] EXIT 1

@REM Collect the item ID constant.
ECHO.
ECHO What is the Item ID constant?
ECHO The Item ID constant must be in Upper case and Underscores eg. "ITEM_MODEL".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the item layer.
ECHO.
ECHO What is the item layer?
ECHO The layer must exists in Minecraft eg. "layer0".
SET /p layer=Layer: 
IF [%layer%] == [] EXIT 1

@REM Collect the item name.
ECHO.
ECHO What is the Item name?
ECHO The Item name is generally the same as the class name but with spaces eg. "Item Model".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1



@REM Go to the Item Model directory.
CD %modeldir%

@REM Create the Item Model.
ECHO package mestretramador.rrmocreatures.data.client.item;                                                   >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemModelProvider;                    >> RRMoCItemModel%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                                      >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO import net.minecraft.data.DataGenerator;                                                                 >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO import net.minecraftforge.client.model.generators.ItemModelBuilder;                                      >> RRMoCItemModel%class%.java
ECHO import net.minecraftforge.client.model.generators.ModelFile;                                             >> RRMoCItemModel%class%.java
ECHO import net.minecraftforge.common.data.ExistingFileHelper;                                                >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO /**                                                                                                      >> RRMoCItemModel%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% item model.                                                        >> RRMoCItemModel%class%.java
ECHO  *                                                                                                       >> RRMoCItemModel%class%.java
ECHO  * @version %version%                                                                                    >> RRMoCItemModel%class%.java
ECHO  * @author %author%                                                                                      >> RRMoCItemModel%class%.java
ECHO  */                                                                                                      >> RRMoCItemModel%class%.java
ECHO public class RRMoCItemModel%class% extends RRMoCItemModelProvider                                        >> RRMoCItemModel%class%.java
ECHO {                                                                                                        >> RRMoCItemModel%class%.java
ECHO     /**                                                                                                  >> RRMoCItemModel%class%.java
ECHO      * Using the parent constructor, create a %name%.                                                    >> RRMoCItemModel%class%.java
ECHO      *                                                                                                   >> RRMoCItemModel%class%.java
ECHO      * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                       >> RRMoCItemModel%class%.java
ECHO      *                           Data Generator}.                                                        >> RRMoCItemModel%class%.java
ECHO      * @param existingFileHelper Forge                                                                   >> RRMoCItemModel%class%.java
ECHO      *                           {@link net.minecraftforge.common.data.ExistingFileHelper                >> RRMoCItemModel%class%.java
ECHO      *                           Existing File Helper}.                                                  >> RRMoCItemModel%class%.java
ECHO      */                                                                                                  >> RRMoCItemModel%class%.java
ECHO     public RRMoCItemModel%class%(DataGenerator generator, ExistingFileHelper existingFileHelper)         >> RRMoCItemModel%class%.java
ECHO     {                                                                                                    >> RRMoCItemModel%class%.java
ECHO         super(generator, existingFileHelper, Constants.Items.%id%, Constants.ITEM_PATH, "%layer%");      >> RRMoCItemModel%class%.java
ECHO     }                                                                                                    >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO     /**                                                                                                  >> RRMoCItemModel%class%.java
ECHO      * Register the Model with the defined constants.                                                    >> RRMoCItemModel%class%.java
ECHO      */                                                                                                  >> RRMoCItemModel%class%.java
ECHO     @Override                                                                                            >> RRMoCItemModel%class%.java
ECHO     protected void registerModels()                                                                      >> RRMoCItemModel%class%.java
ECHO     {                                                                                                    >> RRMoCItemModel%class%.java
ECHO         final ModelFile itemModelFileGenerated = getExistingFile(LOCATION);                              >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO         buildModelRegistered(itemModelFileGenerated);                                                    >> RRMoCItemModel%class%.java
ECHO     }                                                                                                    >> RRMoCItemModel%class%.java
ECHO.                                                                                                         >> RRMoCItemModel%class%.java
ECHO     /**                                                                                                  >> RRMoCItemModel%class%.java
ECHO      * Helper function to build based on a generated file.                                               >> RRMoCItemModel%class%.java
ECHO      *                                                                                                   >> RRMoCItemModel%class%.java
ECHO      * @param itemModelFile The Item Model File.                                                         >> RRMoCItemModel%class%.java
ECHO      * @return The builder with the texture provided by the constants.                                   >> RRMoCItemModel%class%.java
ECHO      */                                                                                                  >> RRMoCItemModel%class%.java
ECHO     private ItemModelBuilder buildModelRegistered(ModelFile itemModelFile)                               >> RRMoCItemModel%class%.java
ECHO     {                                                                                                    >> RRMoCItemModel%class%.java
ECHO         return getBuilder(this.model).parent(itemModelFile).texture(this.layer, this.path + this.model); >> RRMoCItemModel%class%.java
ECHO     }                                                                                                    >> RRMoCItemModel%class%.java
ECHO }                                                                                                        >> RRMoCItemModel%class%.java

@REM Add the Item Model in Git.
git add RRMoCItemModel%class%.java


@REM Final message.
ECHO.
ECHO Created Item Model for %name%!
ECHO Plase insert it on and run Data Generation.
PAUSE