@REM ################################################################
@REM This batch file creates an Item Forge Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.22
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item forge tag new name.
@ECHO OFF
ECHO What will be the Item Forge Tag class name?
ECHO The Item Forge Tag class name must be in Pascal Case eg. "NewItemForgeTagClass".
SET /p class=Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the forge tag constant.
ECHO.
ECHO What is the Forge Item Tag?
ECHO The Forge Item Tag constant must exist in Forge, also be in Upper case and Underscores eg. "ITEM_FORGE_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the forge tag name.
ECHO.
ECHO What is the Item Forge Tag name?
ECHO The Item Forge Tag name is generally the same as the class name but with spaces eg. "Item Forge Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Forge Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                         >> RRMoCItemForgeTag%class%.java
ECHO.                                                                                    >> RRMoCItemForgeTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; >> RRMoCItemForgeTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterItem;                              >> RRMoCItemForgeTag%class%.java
ECHO.                                                                                    >> RRMoCItemForgeTag%class%.java
ECHO import net.minecraftforge.common.Tags;                                              >> RRMoCItemForgeTag%class%.java
ECHO.                                                                                    >> RRMoCItemForgeTag%class%.java
ECHO /**                                                                                 >> RRMoCItemForgeTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Forge Tag's Items.                            >> RRMoCItemForgeTag%class%.java
ECHO  *                                                                                  >> RRMoCItemForgeTag%class%.java
ECHO  * @version %version%                                                               >> RRMoCItemForgeTag%class%.java
ECHO  * @author %author%                                                                 >> RRMoCItemForgeTag%class%.java
ECHO  */                                                                                 >> RRMoCItemForgeTag%class%.java
ECHO public class RRMoCItemForgeTag%class% extends RRMoCItemTagProvider                  >> RRMoCItemForgeTag%class%.java
ECHO {                                                                                   >> RRMoCItemForgeTag%class%.java
ECHO     /**                                                                             >> RRMoCItemForgeTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Forge tag.                      >> RRMoCItemForgeTag%class%.java
ECHO      */                                                                             >> RRMoCItemForgeTag%class%.java
ECHO     public RRMoCItemForgeTag%class%()                                               >> RRMoCItemForgeTag%class%.java
ECHO     {                                                                               >> RRMoCItemForgeTag%class%.java
ECHO         super(Tags.Items.%id%);                                                     >> RRMoCItemForgeTag%class%.java
ECHO     }                                                                               >> RRMoCItemForgeTag%class%.java
ECHO.                                                                                    >> RRMoCItemForgeTag%class%.java
ECHO     /**                                                                             >> RRMoCItemForgeTag%class%.java
ECHO      * ^<p^>                                                                        >> RRMoCItemForgeTag%class%.java
ECHO      * The setter sets the {@link Tags.Items#%id% %name% item                       >> RRMoCItemForgeTag%class%.java
ECHO      * Forge tag} to the below items:                                               >> RRMoCItemForgeTag%class%.java
ECHO      * ^</p^>                                                                       >> RRMoCItemForgeTag%class%.java
ECHO      * ^<ul^>                                                                       >> RRMoCItemForgeTag%class%.java
ECHO      * ^<li^>Link your items here.^</li^>                                           >> RRMoCItemForgeTag%class%.java
ECHO      * ^</ul^>                                                                      >> RRMoCItemForgeTag%class%.java
ECHO      */                                                                             >> RRMoCItemForgeTag%class%.java
ECHO     @Override                                                                       >> RRMoCItemForgeTag%class%.java
ECHO     protected void setItemsToTag()                                                  >> RRMoCItemForgeTag%class%.java
ECHO     {                                                                               >> RRMoCItemForgeTag%class%.java
ECHO         // Add here your items to this tag.                                         >> RRMoCItemForgeTag%class%.java
ECHO         // Use ITEMS.add(item);                                                     >> RRMoCItemForgeTag%class%.java
ECHO     }                                                                               >> RRMoCItemForgeTag%class%.java
ECHO }                                                                                   >> RRMoCItemForgeTag%class%.java

@REM Add the Item Forge Tag in Git.
git add RRMoCItemForgeTag%class%.java


@REM Final message.
ECHO.
ECHO Created Item Forge Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE