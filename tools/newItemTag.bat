@REM ################################################################
@REM This batch file creates an Item Tag Generator class.
@REM It does not create a Constant for the Tag.
@REM Neither add it in the Tag Generation class.
@REM
@REM Please be gentle with this code.
@REM ################################################################

@REM Gloval variables.
@SET version=0.0.8
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET tagdir="..\src\main\java\mestretramador\rrmocreatures\data\client\tags\item"


@REM Collect the item tag new name.
@ECHO OFF
ECHO What will be the Item Tag class name?
ECHO The Item Tag class name must be in Pascal Case eg. "NewItemTagClass".
SET /p class=Tag: 
IF [%class%] == [] EXIT 1

@REM Collect the tag constant.
ECHO.
ECHO What is the Item Tag?
ECHO The Item Tag constant must be in Upper case and Underscores eg. "ITEM_TAG".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the tag name.
ECHO.
ECHO What is the Item Tag name?
ECHO The Item Tag name is generally the same as the class name but with spaces eg. "Item Tag".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1



@REM Go to the Item Tag directory.
CD %tagdir%

@REM Create the Item Tag.
ECHO package mestretramador.rrmocreatures.data.client.tags.item;                         >> RRMoCItemTag%class%.java
ECHO.                                                                                    >> RRMoCItemTag%class%.java
ECHO import java.util.ArrayList;                                                         >> RRMoCItemTag%class%.java
ECHO.                                                                                    >> RRMoCItemTag%class%.java
ECHO import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; >> RRMoCItemTag%class%.java
ECHO import mestretramador.rrmocreatures.init.RegisterItem;                              >> RRMoCItemTag%class%.java
ECHO import mestretramador.rrmocreatures.util.Tags;                                      >> RRMoCItemTag%class%.java
ECHO.                                                                                    >> RRMoCItemTag%class%.java
ECHO import net.minecraft.item.Item;                                                     >> RRMoCItemTag%class%.java
ECHO /**                                                                                 >> RRMoCItemTag%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% Tag's Items.                                  >> RRMoCItemTag%class%.java
ECHO  *                                                                                  >> RRMoCItemTag%class%.java
ECHO  * @version %version%                                                               >> RRMoCItemTag%class%.java
ECHO  * @author %author%                                                                 >> RRMoCItemTag%class%.java
ECHO  */                                                                                 >> RRMoCItemTag%class%.java
ECHO public class RRMoCItemTag%class% extends RRMoCItemTagProvider                       >> RRMoCItemTag%class%.java
ECHO {                                                                                   >> RRMoCItemTag%class%.java
ECHO     /**                                                                             >> RRMoCItemTag%class%.java
ECHO      * ^<p^>                                                                        >> RRMoCItemTag%class%.java
ECHO      * The setter sets the {@link Tags.Items#%id% %name% item                       >> RRMoCItemTag%class%.java
ECHO      * tag} to the below items:                                                     >> RRMoCItemTag%class%.java
ECHO      * ^</p^>                                                                       >> RRMoCItemTag%class%.java
ECHO      * ^<ul^>                                                                       >> RRMoCItemTag%class%.java
ECHO      * ^<li^>Link your items here.^</li^>                                           >> RRMoCItemTag%class%.java
ECHO      * ^</ul^>                                                                      >> RRMoCItemTag%class%.java
ECHO      */                                                                             >> RRMoCItemTag%class%.java
ECHO     @Override                                                                       >> RRMoCItemTag%class%.java
ECHO     protected void setItemsToTag()                                                  >> RRMoCItemTag%class%.java
ECHO     {                                                                               >> RRMoCItemTag%class%.java
ECHO         final ArrayList^<Item^> %class% = new ArrayList^<Item^>();                  >> RRMoCItemTag%class%.java
ECHO.                                                                                    >> RRMoCItemTag%class%.java
ECHO         // Add here your items to this tag.                                         >> RRMoCItemTag%class%.java
ECHO.                                                                                    >> RRMoCItemTag%class%.java
ECHO         itemsToTag.put(Tags.Items.%id%, %class%);                                   >> RRMoCItemTag%class%.java
ECHO     }                                                                               >> RRMoCItemTag%class%.java
ECHO }                                                                                   >> RRMoCItemTag%class%.java

@REM Add the Item Tag in Git.
git add RRMoCItemTag%class%.java


@REM Final message.
ECHO.
ECHO Created Item Tag for %name%!
ECHO Plase insert it on and run Tag Generation.
PAUSE