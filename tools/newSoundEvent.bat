@REM ###########################################################
@REM This batch file creates both Sound Event and Provider classes.
@REM It does not create a Constant for the Sound Event ID.
@REM Neither an entry on sounds.json file.
@REM
@REM Please be gentle with this code.
@REM ###########################################################

@REM Gloval variables.
@SET version=0.0.27
@SET author=Eduardo de Oliveira Rosa, Mestre Tramador.


@REM Get all the directories to save the files.
@SET sounddir="..\..\sound"
@SET providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\sound"


@REM Collect the sound event new name.
@ECHO OFF
ECHO What will be the Sound Event class name?
ECHO The Sound Event class name must be in Pascal Case eg. "NewSoundEventClass".
SET /p class=Sound Event: 
IF [%class%] == [] EXIT 1

@REM Collect the sound event ID constant.
ECHO.
ECHO What is the Sound Event ID constant?
ECHO The Sound Event ID constant must be in Upper case and Underscores eg. "SOUND_EVENT".
SET /p id=ID: 
IF [%id%] == [] EXIT 1

@REM Collect the sound event name.
ECHO.
ECHO What is the Sound Event name?
ECHO The Sound Event name is generally the same as the class name but with spaces eg. "Sound Event".
SET /p name=Name: 
IF ["%name%"] == [] EXIT 1


@REM Go to the Provider directory.
CD %providerdir%

@REM Create the Provider.
ECHO package mestretramador.rrmocreatures.provider.sound;                         >> RRMoCSoundEventProvider%class%.java
ECHO.                                                                             >> RRMoCSoundEventProvider%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                          >> RRMoCSoundEventProvider%class%.java
ECHO.                                                                             >> RRMoCSoundEventProvider%class%.java
ECHO import net.minecraft.util.ResourceLocation;                                  >> RRMoCSoundEventProvider%class%.java
ECHO.                                                                             >> RRMoCSoundEventProvider%class%.java
ECHO /**                                                                          >> RRMoCSoundEventProvider%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% sound event provider.                  >> RRMoCSoundEventProvider%class%.java
ECHO  *                                                                           >> RRMoCSoundEventProvider%class%.java
ECHO  * @version %version%                                                        >> RRMoCSoundEventProvider%class%.java
ECHO  * @author %author%                                                          >> RRMoCSoundEventProvider%class%.java
ECHO  */                                                                          >> RRMoCSoundEventProvider%class%.java
ECHO public class RRMoCSoundEventProvider%class% extends RRMoCSoundEventProvider  >> RRMoCSoundEventProvider%class%.java
ECHO {                                                                            >> RRMoCSoundEventProvider%class%.java
ECHO    /**                                                                       >> RRMoCSoundEventProvider%class%.java
ECHO     * Using the parent constructor, start %name% with the                    >> RRMoCSoundEventProvider%class%.java
ECHO     * {@link mestretramador.rrmocreatures.util.Constants.Sounds#%id% %id%}   >> RRMoCSoundEventProvider%class%.java
ECHO     * constant path.                                                         >> RRMoCSoundEventProvider%class%.java
ECHO     */                                                                       >> RRMoCSoundEventProvider%class%.java
ECHO    public RRMoCSoundEventProvider%class%()                                   >> RRMoCSoundEventProvider%class%.java
ECHO    {                                                                         >> RRMoCSoundEventProvider%class%.java
ECHO        super(Constants.Sounds.%id%);                                         >> RRMoCSoundEventProvider%class%.java
ECHO    }                                                                         >> RRMoCSoundEventProvider%class%.java
ECHO.                                                                             >> RRMoCSoundEventProvider%class%.java
ECHO    /**                                                                       >> RRMoCSoundEventProvider%class%.java
ECHO     * Return sound event properties of                                       >> RRMoCSoundEventProvider%class%.java
ECHO     * {@link mestretramador.rrmocreatures.sound.RRMoCSoundEvent%class%       >> RRMoCSoundEventProvider%class%.java
ECHO     * %name%}.                                                               >> RRMoCSoundEventProvider%class%.java
ECHO     */                                                                       >> RRMoCSoundEventProvider%class%.java
ECHO    @Override                                                                 >> RRMoCSoundEventProvider%class%.java
ECHO    public ResourceLocation provideProperties()                               >> RRMoCSoundEventProvider%class%.java
ECHO    {                                                                         >> RRMoCSoundEventProvider%class%.java
ECHO        return PROPERTIES();                                                  >> RRMoCSoundEventProvider%class%.java
ECHO    }                                                                         >> RRMoCSoundEventProvider%class%.java
ECHO }                                                                            >> RRMoCSoundEventProvider%class%.java

@REM Add the Provider in Git.
git add RRMoCSoundEventProvider%class%.java


@REM Go to the SoundEvents directory to create an item class.
CD %sounddir%

@REM Create the SoundEvent.
ECHO package mestretramador.rrmocreatures.sound;                                                                      >> RRMoCSoundEvent%class%.java
ECHO.                                                                                                                 >> RRMoCSoundEvent%class%.java
ECHO import mestretramador.rrmocreatures.model.sound.RRMoCSoundEventModel;                                            >> RRMoCSoundEvent%class%.java
ECHO import mestretramador.rrmocreatures.provider.sound.RRMoCSoundEventProvider%class%;                               >> RRMoCSoundEvent%class%.java
ECHO import mestretramador.rrmocreatures.util.Constants;                                                              >> RRMoCSoundEvent%class%.java
ECHO.                                                                                                                 >> RRMoCSoundEvent%class%.java
ECHO import net.minecraft.util.SoundEvent;                                                                            >> RRMoCSoundEvent%class%.java
ECHO.                                                                                                                 >> RRMoCSoundEvent%class%.java
ECHO /**                                                                                                              >> RRMoCSoundEvent%class%.java
ECHO  * Mo^'Creatures Redux^&Redone %name% sound event.                                                               >> RRMoCSoundEvent%class%.java
ECHO  *                                                                                                               >> RRMoCSoundEvent%class%.java
ECHO  * @version %version%                                                                                            >> RRMoCSoundEvent%class%.java
ECHO  * @author %author%                                                                                              >> RRMoCSoundEvent%class%.java
ECHO  */                                                                                                              >> RRMoCSoundEvent%class%.java
ECHO public class RRMoCSoundEvent%class% extends RRMoCSoundEvent                                                      >> RRMoCSoundEvent%class%.java
ECHO {                                                                                                                >> RRMoCSoundEvent%class%.java
ECHO    /**                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO     * Using the parent base constructor, create a %name% sound event.                                            >> RRMoCSoundEvent%class%.java
ECHO     */                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO    public RRMoCSoundEvent%class%()                                                                               >> RRMoCSoundEvent%class%.java
ECHO    {                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO        super(Constants.Sounds.%id%, new RRMoCSoundEventProvider%class%());                                       >> RRMoCSoundEvent%class%.java
ECHO    }                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO.                                                                                                                 >> RRMoCSoundEvent%class%.java
ECHO    /**                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO     * With the mestretramador.rrmocreatures.sound.RRMoCSoundEvent#setSoundEvent(SoundEvent) ^set                 >> RRMoCSoundEvent%class%.java
ECHO     * helper function}, the %name% sound event is created.                                                       >> RRMoCSoundEvent%class%.java
ECHO     */                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO    @Override                                                                                                     >> RRMoCSoundEvent%class%.java
ECHO    protected void createSoundEvent()                                                                             >> RRMoCSoundEvent%class%.java
ECHO    {                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO        setSoundEvent(new RRMoCSoundEventModel(((RRMoCSoundEventProvider%class%) provider).provideProperties())); >> RRMoCSoundEvent%class%.java
ECHO    }                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO.                                                                                                                 >> RRMoCSoundEvent%class%.java
ECHO    /**                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO     * Return the %name% sound event in its current state.                                                        >> RRMoCSoundEvent%class%.java
ECHO     */                                                                                                           >> RRMoCSoundEvent%class%.java
ECHO    @Override                                                                                                     >> RRMoCSoundEvent%class%.java
ECHO    public SoundEvent returnAsSoundEvent()                                                                        >> RRMoCSoundEvent%class%.java
ECHO    {                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO        return getSoundEvent();                                                                                   >> RRMoCSoundEvent%class%.java
ECHO    }                                                                                                             >> RRMoCSoundEvent%class%.java
ECHO }                                                                                                                >> RRMoCSoundEvent%class%.java

@REM Add the SoundEvent in Git.
git add RRMoCSoundEvent%class%.java


@REM Final message.
ECHO.
ECHO Created Sound Event and Provider for %name%!
ECHO Plase insert it on sounds.json file.
PAUSE