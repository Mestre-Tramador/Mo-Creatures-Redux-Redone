@REM ################################################################
@REM This batch file creates an Item Vanilla Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.20
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item vanilla tag new name.
@ECHO OFF
ECHO What will be the Item Vanilla Tag class name?
ECHO The Item Vanilla Tag class name must be in Pascal Case eg. "NewItemVanillaTagClass".
SET /p class=Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the vanilla tag constant.
ECHO.
ECHO What is the Vanilla Item Tag?
ECHO The Vanilla Item Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. "ITEM_VANILLA_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the vanilla tag name.
ECHO.
ECHO What is the Item Vanilla Tag name?
ECHO The Item Vanilla Tag name is generally the same as the class name but with spaces eg. "Item Vanilla Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Vanilla Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                         >> RRMoCItemVanillaTag%class%.java
ECHO.                                                                                    >> RRMoCItemVanillaTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; >> RRMoCItemVanillaTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterItem;                              >> RRMoCItemVanillaTag%class%.java
ECHO.                                                                                    >> RRMoCItemVanillaTag%class%.java
ECHO import net.minecraft.tags.ItemTags;                                                 >> RRMoCItemVanillaTag%class%.java
ECHO.                                                                                    >> RRMoCItemVanillaTag%class%.java
ECHO /**                                                                                 >> RRMoCItemVanillaTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Minecraft Tag's Items.                        >> RRMoCItemVanillaTag%class%.java
ECHO  *                                                                                  >> RRMoCItemVanillaTag%class%.java
ECHO  * @version %version%                                                               >> RRMoCItemVanillaTag%class%.java
ECHO  * @author %author%                                                                 >> RRMoCItemVanillaTag%class%.java
ECHO  */                                                                                 >> RRMoCItemVanillaTag%class%.java
ECHO public class RRMoCItemVanillaTag%class% extends RRMoCItemTagProvider                >> RRMoCItemVanillaTag%class%.java
ECHO {                                                                                   >> RRMoCItemVanillaTag%class%.java
ECHO     /**                                                                             >> RRMoCItemVanillaTag%class%.java
ECHO      * Using the parent constructor, adds to %name% Minecraft tag.                  >> RRMoCItemVanillaTag%class%.java
ECHO      */                                                                             >> RRMoCItemVanillaTag%class%.java
ECHO     public RRMoCItemVanillaTag%class%()                                             >> RRMoCItemVanillaTag%class%.java
ECHO     {                                                                               >> RRMoCItemVanillaTag%class%.java
ECHO         super(ItemTags.%id%);                                                       >> RRMoCItemVanillaTag%class%.java
ECHO     }                                                                               >> RRMoCItemVanillaTag%class%.java
ECHO.                                                                                    >> RRMoCItemVanillaTag%class%.java
ECHO     /**                                                                             >> RRMoCItemVanillaTag%class%.java
ECHO      * ^<p^>                                                                        >> RRMoCItemVanillaTag%class%.java
ECHO      * The setter sets the {@link ItemTags#%id% %name% item                         >> RRMoCItemVanillaTag%class%.java
ECHO      * Minecraft tag} to the below items:                                           >> RRMoCItemVanillaTag%class%.java
ECHO      * ^</p^>                                                                       >> RRMoCItemVanillaTag%class%.java
ECHO      * ^<ul^>                                                                       >> RRMoCItemVanillaTag%class%.java
ECHO      * ^<li^>Link your items here.^</li^>                                           >> RRMoCItemVanillaTag%class%.java
ECHO      * ^</ul^>                                                                      >> RRMoCItemVanillaTag%class%.java
ECHO      */                                                                             >> RRMoCItemVanillaTag%class%.java
ECHO     @Override                                                                       >> RRMoCItemVanillaTag%class%.java
ECHO     protected void setItemsToTag()                                                  >> RRMoCItemVanillaTag%class%.java
ECHO     {                                                                               >> RRMoCItemVanillaTag%class%.java
ECHO         // Add here your items to this tag.                                         >> RRMoCItemVanillaTag%class%.java
ECHO         // Use ITEMS.add(item);                                                     >> RRMoCItemVanillaTag%class%.java
ECHO     }                                                                               >> RRMoCItemVanillaTag%class%.java
ECHO }                                                                                   >> RRMoCItemVanillaTag%class%.java

@REM Add the Item Vanilla Tag in Git.
git add RRMoCItemVanillaTag%class%.java


@REM Final message.
ECHO.
ECHO Created Item Vanilla Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE