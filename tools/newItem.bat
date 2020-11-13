@REM ###########################################################
@REM This batch file creates both Item and Provider classes.
@REM It does not create a Constant for the Item ID.
@REM Neither a lang file entry.
@REM
@REM Please be gentle with this code.
@REM ###########################################################

@REM Gloval variables.
@SET version=0.0.18
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET itemdir="..\..\item"
@SET providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\item"


@REM Collect the item new name.
@ECHO OFF
ECHO What will be the Item class name?
ECHO The Item class name must be in Pascal Case eg. "NewItemClass".
SET /p class=Item: 
IF [%class%] == [] EXIT 1

@REM Collect the item ID constant.
ECHO.
ECHO What is the Item ID constant?
ECHO The Item ID constant must be in Upper case and Underscores eg. "NEW_ITEM".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the item name.
ECHO.
ECHO What is the Item name?
ECHO The Item name is generally the same as the class name but with spaces eg. "New Item".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Provider directory.
CD %providerdir%

@REM Create the Provider.
ECHO package mestretramador.rrmocreatures.provider.item;             >> RRMoCItemProvider%class%.java
ECHO.                                                                >> RRMoCItemProvider%class%.java
ECHO import net.minecraft.item.Item.Properties;                      >> RRMoCItemProvider%class%.java
ECHO.                                                                >> RRMoCItemProvider%class%.java
ECHO /**                                                             >> RRMoCItemProvider%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% item provider.            >> RRMoCItemProvider%class%.java
ECHO  *                                                              >> RRMoCItemProvider%class%.java
ECHO  * @version %version%                                           >> RRMoCItemProvider%class%.java
ECHO  * @author %author%                                             >> RRMoCItemProvider%class%.java
ECHO  */                                                             >> RRMoCItemProvider%class%.java
ECHO public class RRMoCItemProvider%class% extends RRMoCItemProvider >> RRMoCItemProvider%class%.java
ECHO {                                                               >> RRMoCItemProvider%class%.java
ECHO    /**                                                          >> RRMoCItemProvider%class%.java
ECHO     * Return the properties of                                  >> RRMoCItemProvider%class%.java
ECHO     * {@link mestretramador.rrmocreatures.item.RRMoCItem%class% >> RRMoCItemProvider%class%.java
ECHO     * %name%}.                                                  >> RRMoCItemProvider%class%.java
ECHO     */                                                          >> RRMoCItemProvider%class%.java
ECHO    @Override                                                    >> RRMoCItemProvider%class%.java
ECHO    public Properties provideProperties()                        >> RRMoCItemProvider%class%.java
ECHO    {                                                            >> RRMoCItemProvider%class%.java
ECHO        // Add here the properties of %name%.                    >> RRMoCItemProvider%class%.java
ECHO.                                                                >> RRMoCItemProvider%class%.java
ECHO        return PROPERTIES();                                     >> RRMoCItemProvider%class%.java
ECHO    }                                                            >> RRMoCItemProvider%class%.java
ECHO }                                                               >> RRMoCItemProvider%class%.java

@REM Add the Provider in Git.
git add RRMoCItemProvider%class%.java


@REM Go to the Items directory to create an item class.
CD %itemdir%

@REM Create the Item.
ECHO package mestretramador.rrmocreatures.item;                                                     >> RRMoCItem%class%.java
ECHO.                                                                                               >> RRMoCItem%class%.java
ECHO import mestretramador.rrmocreatures.model.item.RRMoCItemModel;                                 >> RRMoCItem%class%.java
ECHO import mestretramador.rrmocreatures.provider.item.RRMoCItemProvider%class%;                    >> RRMoCItem%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                            >> RRMoCItem%class%.java
ECHO.                                                                                               >> RRMoCItem%class%.java
ECHO import net.minecraft.item.Item;                                                                >> RRMoCItem%class%.java
ECHO.                                                                                               >> RRMoCItem%class%.java
ECHO /**                                                                                            >> RRMoCItem%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% item.                                                    >> RRMoCItem%class%.java
ECHO  *                                                                                             >> RRMoCItem%class%.java
ECHO  * @version %version%                                                                          >> RRMoCItem%class%.java
ECHO  * @author %author%                                                                            >> RRMoCItem%class%.java
ECHO  */                                                                                            >> RRMoCItem%class%.java
ECHO public class RRMoCItem%class% extends RRMoCItem                                                >> RRMoCItem%class%.java
ECHO {                                                                                              >> RRMoCItem%class%.java
ECHO    /**                                                                                         >> RRMoCItem%class%.java
ECHO     * Using the parent base constructor, create a %name%.                                      >> RRMoCItem%class%.java
ECHO     */                                                                                         >> RRMoCItem%class%.java
ECHO    public RRMoCItem%class%()                                                                   >> RRMoCItem%class%.java
ECHO    {                                                                                           >> RRMoCItem%class%.java
ECHO        super(Constants.Items.%id%, new RRMoCItemProvider%class%());                            >> RRMoCItem%class%.java
ECHO    }                                                                                           >> RRMoCItem%class%.java
ECHO.                                                                                               >> RRMoCItem%class%.java
ECHO    /**                                                                                         >> RRMoCItem%class%.java
ECHO     * Return a %name% item in its current state.                                               >> RRMoCItem%class%.java
ECHO     */                                                                                         >> RRMoCItem%class%.java
ECHO    @Override                                                                                   >> RRMoCItem%class%.java
ECHO    public Item returnAsItem()                                                                  >> RRMoCItem%class%.java
ECHO    {                                                                                           >> RRMoCItem%class%.java
ECHO        return getItem();                                                                       >> RRMoCItem%class%.java
ECHO    }                                                                                           >> RRMoCItem%class%.java
ECHO.                                                                                               >> RRMoCItem%class%.java
ECHO    /**                                                                                         >> RRMoCItem%class%.java
ECHO     * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) ^set           >> RRMoCItem%class%.java
ECHO     * helper function}, the %name% is created.                                                 >> RRMoCItem%class%.java
ECHO     */                                                                                         >> RRMoCItem%class%.java
ECHO    @Override                                                                                   >> RRMoCItem%class%.java
ECHO    protected void createItem()                                                                 >> RRMoCItem%class%.java
ECHO    {                                                                                           >> RRMoCItem%class%.java
ECHO        setItem(new RRMoCItemModel(((RRMoCItemProvider%class%) provider).provideProperties())); >> RRMoCItem%class%.java
ECHO    }                                                                                           >> RRMoCItem%class%.java
ECHO }                                                                                              >> RRMoCItem%class%.java

@REM Add the Item in Git.
git add RRMoCItem%class%.java


@REM Final message.
ECHO.
ECHO Created Item and Provider for %name%!
ECHO Plase insert it on lang files.
PAUSE