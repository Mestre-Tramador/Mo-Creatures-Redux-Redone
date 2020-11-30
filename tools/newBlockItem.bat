@REM ################################################################
@REM This batch file creates both BlockItem and Provider classes.
@REM It does not create a Constant for the Block ID.
@REM Neither a lang file entry.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.25
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET blockdir="..\..\block"
@SET providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\block"


@REM Collect the block item new name.
@ECHO OFF
ECHO What will be the BlockItem class name?
ECHO The BlockItem class name must be in Pascal Case eg. "NewBlockItemClass".
SET /p class=Block: 
IF [%class%] == [] EXIT 1

@REM Collect the block item ID constant.
ECHO.
ECHO What is the BlockItem ID constant?
ECHO The BlockItem ID constant must be in Upper case and Underscores eg. "NEW_BLOCK_ITEM".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the block item base Material.
ECHO.
ECHO What is the BlockItem base Material?
ECHO The BlockItem base Material must be in Upper case and Underscores, also exists in Minecraft eg. "ROCK".
SET /p material=Material: 
IF [%material%] == [] EXIT 1

@REM Collect the block item name.
ECHO.
ECHO What is the BlockItem name?
ECHO The BlockItem name is generally the same as the class name but with spaces eg. "New Block Item".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Provider directory.
CD %providerdir%

@REM Create the Provider.
ECHO package mestretramador.rrmocreatures.provider.block;                                 >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO import net.minecraft.block.AbstractBlock;                                            >> RRMoCBlockItemProvider%class%.java
ECHO import net.minecraft.block.material.Material;                                        >> RRMoCBlockItemProvider%class%.java
ECHO import net.minecraft.item.Item;                                                      >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO /**                                                                                  >> RRMoCBlockItemProvider%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block item provider.                           >> RRMoCBlockItemProvider%class%.java
ECHO  *                                                                                   >> RRMoCBlockItemProvider%class%.java
ECHO  * @version %version%                                                                >> RRMoCBlockItemProvider%class%.java
ECHO  * @author %author%                                                                  >> RRMoCBlockItemProvider%class%.java
ECHO  */                                                                                  >> RRMoCBlockItemProvider%class%.java
ECHO public class RRMoCBlockItemProvider%class% extends RRMoCBlockItemProvider            >> RRMoCBlockItemProvider%class%.java
ECHO {                                                                                    >> RRMoCBlockItemProvider%class%.java
ECHO     /**                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO      * Using the parent constructor, start the %name% with a                         >> RRMoCBlockItemProvider%class%.java
ECHO      * {@link net.minecraft.block.material.Material#%material% %material% material}. >> RRMoCBlockItemProvider%class%.java
ECHO      */                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO     public RRMoCBlockItemProvider%class%()                                           >> RRMoCBlockItemProvider%class%.java
ECHO     {                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO         super(Material.%material%);                                                  >> RRMoCBlockItemProvider%class%.java
ECHO     }                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO     /**                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO      * Return the block properties of                                                >> RRMoCBlockItemProvider%class%.java
ECHO      * {@link mestretramador.rrmocreatures.block.RRMoCBlock%class%                   >> RRMoCBlockItemProvider%class%.java
ECHO      * %name%}.                                                                      >> RRMoCBlockItemProvider%class%.java
ECHO      */                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO     @Override                                                                        >> RRMoCBlockItemProvider%class%.java
ECHO     public AbstractBlock.Properties provideBlockProperties()                         >> RRMoCBlockItemProvider%class%.java
ECHO     {                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO         // Add here the properties of %name%.                                        >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO         return BLOCK_PROPERTIES();                                                   >> RRMoCBlockItemProvider%class%.java
ECHO     }                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO     /**                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO      * Return the blockitem properties of                                            >> RRMoCBlockItemProvider%class%.java
ECHO      * {@link mestretramador.rrmocreatures.block.RRMoCBlock%class%                   >> RRMoCBlockItemProvider%class%.java
ECHO      * %name%}.                                                                      >> RRMoCBlockItemProvider%class%.java
ECHO      */                                                                              >> RRMoCBlockItemProvider%class%.java
ECHO     @Override                                                                        >> RRMoCBlockItemProvider%class%.java
ECHO     public Item.Properties provideItemProperties()                                   >> RRMoCBlockItemProvider%class%.java
ECHO     {                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO         // Add here the properties of %name%.                                        >> RRMoCBlockItemProvider%class%.java
ECHO.                                                                                     >> RRMoCBlockItemProvider%class%.java
ECHO         return ITEM_PROPERTIES();                                                    >> RRMoCBlockItemProvider%class%.java
ECHO     }                                                                                >> RRMoCBlockItemProvider%class%.java
ECHO }                                                                                    >> RRMoCBlockItemProvider%class%.java

@REM Add the Provider in Git.
git add RRMoCBlockItemProvider%class%.java


@REM Go to the Blocks directory to create an block item class.
CD %blockdir%

@REM Create the Block Item.
ECHO package mestretramador.rrmocreatures.block;                                                                                  >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO mestretramador.rrmocreatures.model.block.RRMoCBlockItemModel;                                                                >> RRMoCBlock%class%.java
ECHO mestretramador.rrmocreatures.model.block.RRMoCBlockModel;                                                                    >> RRMoCBlock%class%.java
ECHO import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProvider%class%;                                            >> RRMoCBlock%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                                                          >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO import net.minecraft.block.Block;                                                                                            >> RRMoCBlock%class%.java
ECHO import net.minecraft.item.BlockItem;                                                                                         >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO /**                                                                                                                          >> RRMoCBlock%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% block and block item.                                                                  >> RRMoCBlock%class%.java
ECHO  *                                                                                                                           >> RRMoCBlock%class%.java
ECHO  * @version %version%                                                                                                        >> RRMoCBlock%class%.java
ECHO  * @author %author%                                                                                                          >> RRMoCBlock%class%.java
ECHO  */                                                                                                                          >> RRMoCBlock%class%.java
ECHO public class RRMoCBlock%class% extends RRMoCBlock implements RRMoCBlockItem                                                  >> RRMoCBlock%class%.java
ECHO {                                                                                                                            >> RRMoCBlock%class%.java
ECHO     /**                                                                                                                      >> RRMoCBlock%class%.java
ECHO      * Using the parent constructor, create a %name% block.                                                                  >> RRMoCBlock%class%.java
ECHO      */                                                                                                                      >> RRMoCBlock%class%.java
ECHO     public RRMoCBlock%class%()                                                                                               >> RRMoCBlock%class%.java
ECHO     {                                                                                                                        >> RRMoCBlock%class%.java
ECHO         super(Constants.Blocks.%id%, new RRMoCBlockItemProvider%class%());                                                   >> RRMoCBlock%class%.java
ECHO     }                                                                                                                        >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO     /**                                                                                                                      >> RRMoCBlock%class%.java
ECHO      * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                                         >> RRMoCBlock%class%.java
ECHO      * ^set helper function}, the %name% block is created.                                                                   >> RRMoCBlock%class%.java
ECHO      */                                                                                                                      >> RRMoCBlock%class%.java
ECHO     @Override                                                                                                                >> RRMoCBlock%class%.java
ECHO     protected void createBlock()                                                                                             >> RRMoCBlock%class%.java
ECHO     {                                                                                                                        >> RRMoCBlock%class%.java
ECHO         setBlock(new RRMoCBlockModel(((RRMoCBlockItemProvider%class%) provider).provideBlockProperties()));                  >> RRMoCBlock%class%.java
ECHO     }                                                                                                                        >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO     /**                                                                                                                      >> RRMoCBlock%class%.java
ECHO      * Return the %name% block in its current state.                                                                         >> RRMoCBlock%class%.java
ECHO      */                                                                                                                      >> RRMoCBlock%class%.java
ECHO     @Override                                                                                                                >> RRMoCBlock%class%.java
ECHO     public Block returnAsBlock()                                                                                             >> RRMoCBlock%class%.java
ECHO     {                                                                                                                        >> RRMoCBlock%class%.java
ECHO         return getBlock();                                                                                                   >> RRMoCBlock%class%.java
ECHO     }                                                                                                                        >> RRMoCBlock%class%.java
ECHO.                                                                                                                             >> RRMoCBlock%class%.java
ECHO     /**                                                                                                                      >> RRMoCBlock%class%.java
ECHO      * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                                         >> RRMoCBlock%class%.java
ECHO      * also can be generated the %name% block item.                                                                          >> RRMoCBlock%class%.java
ECHO      *                                                                                                                       >> RRMoCBlock%class%.java
ECHO      * @return The %name% block item with the                                                                                >> RRMoCBlock%class%.java
ECHO      *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                           >> RRMoCBlock%class%.java
ECHO      *         by the provider.                                                                                              >> RRMoCBlock%class%.java
ECHO      */                                                                                                                      >> RRMoCBlock%class%.java
ECHO     @Override                                                                                                                >> RRMoCBlock%class%.java
ECHO     public BlockItem returnAsBlockItem()                                                                                     >> RRMoCBlock%class%.java
ECHO     {                                                                                                                        >> RRMoCBlock%class%.java
ECHO         return new RRMoCBlockItemModel(returnAsBlock(), ((RRMoCBlockItemProvider%class%) provider).provideItemProperties()); >> RRMoCBlock%class%.java
ECHO     }                                                                                                                        >> RRMoCBlock%class%.java
ECHO }                                                                                                                            >> RRMoCBlock%class%.java

@REM Add the Block Item in Git.
git add RRMoCBlock%class%.java


@REM Final message.
ECHO.
ECHO Created BlockItem and Provider for %name%!
ECHO Plase insert it on lang files.
PAUSE