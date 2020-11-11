#############################################################################
# This shell script file creates both Sound Event and Provider classes.
# It does not create a Constant for the Sound Event ID.
# Neither an entry on sounds.json file.
#
# Please be gentle with this code.
#############################################################################

# Gloval variables.
version="0.0.16"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
sounddir="../../sound"
providerdir="../src/main/java/mestretramador/rrmocreatures/provider/sound"


# Collect the sound event new name.
set +v
echo "What will be the Sound Event class name?"
echo "The Sound Event class name must be in Pascal Case eg. \"NewSoundEventClass\"."
read -p "Sound Event: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the sound event ID constant.
echo
echo "What is the Sound Event ID constant?"
echo "The Sound Event ID constant must be in Upper case and Underscores eg. \"SOUND_EVENT\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the sound event name.
echo
echo "What is the Sound Event name?"
echo "The Sound Event name is generally the same as the class name but with spaces eg. \"Sound Event\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Provider directory.
cd "$providerdir"

# Create the Provider.
touch "RRMoCSoundEventProvider$class.java"
chmod 744 "RRMoCSoundEventProvider$class.java"

echo "package mestretramador.rrmocreatures.provider.sound;                        " >> "RRMoCSoundEventProvider$class.java"
echo "                                                                            " >> "RRMoCSoundEventProvider$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                         " >> "RRMoCSoundEventProvider$class.java"
echo "                                                                            " >> "RRMoCSoundEventProvider$class.java"
echo "import net.minecraft.util.ResourceLocation;                                 " >> "RRMoCSoundEventProvider$class.java"
echo "                                                                            " >> "RRMoCSoundEventProvider$class.java"
echo "/**                                                                         " >> "RRMoCSoundEventProvider$class.java"
echo " * Mo'Creatures Redux&Redone $name sound event provider.                    " >> "RRMoCSoundEventProvider$class.java"
echo " *                                                                          " >> "RRMoCSoundEventProvider$class.java"
echo " * @version $version                                                        " >> "RRMoCSoundEventProvider$class.java"
echo " * @author $author                                                          " >> "RRMoCSoundEventProvider$class.java"
echo " */                                                                         " >> "RRMoCSoundEventProvider$class.java"
echo "public class RRMoCSoundEventProvider$class extends RRMoCSoundEventProvider  " >> "RRMoCSoundEventProvider$class.java"
echo "{                                                                           " >> "RRMoCSoundEventProvider$class.java"
echo "   /**                                                                      " >> "RRMoCSoundEventProvider$class.java"
echo "    * Using the parent constructor, start $name with the                    " >> "RRMoCSoundEventProvider$class.java"
echo "    * {@link mestretramador.rrmocreatures.util.Constants.Sounds#$id $id}    " >> "RRMoCSoundEventProvider$class.java"
echo "    * constant path.                                                        " >> "RRMoCSoundEventProvider$class.java"
echo "    */                                                                      " >> "RRMoCSoundEventProvider$class.java"
echo "   public RRMoCSoundEventProvider$class()                                   " >> "RRMoCSoundEventProvider$class.java"
echo "   {                                                                        " >> "RRMoCSoundEventProvider$class.java"
echo "       super(Constants.Sounds.$id);                                         " >> "RRMoCSoundEventProvider$class.java"
echo "   }                                                                        " >> "RRMoCSoundEventProvider$class.java"
echo "                                                                            " >> "RRMoCSoundEventProvider$class.java"
echo "   /**                                                                      " >> "RRMoCSoundEventProvider$class.java"
echo "    * Return sound event properties of                                      " >> "RRMoCSoundEventProvider$class.java"
echo "    * @link mestretramador.rrmocreatures.sound.RRMoCSoundEvent$class        " >> "RRMoCSoundEventProvider$class.java"
echo "    * $name}.                                                               " >> "RRMoCSoundEventProvider$class.java"
echo "    */                                                                      " >> "RRMoCSoundEventProvider$class.java"
echo "   @Override                                                                " >> "RRMoCSoundEventProvider$class.java"
echo "   public ResourceLocation provideProperties()                              " >> "RRMoCSoundEventProvider$class.java"
echo "   {                                                                        " >> "RRMoCSoundEventProvider$class.java"
echo "       return PROPERTIES();                                                 " >> "RRMoCSoundEventProvider$class.java"
echo "   }                                                                        " >> "RRMoCSoundEventProvider$class.java"
echo "}                                                                           " >> "RRMoCSoundEventProvider$class.java"

# Add the Provider in Git.
git add RRMoCSoundEventProvider$class.java


# Go to the Sound Events directory to create an item class.
cd "$sounddir"

# Create the Sound Event.
touch "RRMoCSoundEvent$class.java"
chmod 744 "RRMoCSoundEvent$class.java"

echo "package mestretramador.rrmocreatures.sound;                                                                      " >> "RRMoCSoundEvent$class.java"
echo "                                                                                                                 " >> "RRMoCSoundEvent$class.java"
echo "import mestretramador.rrmocreatures.model.sound.RRMoCSoundEventModel;                                            " >> "RRMoCSoundEvent$class.java"
echo "import mestretramador.rrmocreatures.provider.sound.RRMoCSoundEventProvider$class;                                " >> "RRMoCSoundEvent$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                                              " >> "RRMoCSoundEvent$class.java"
echo "                                                                                                                 " >> "RRMoCSoundEvent$class.java"
echo "import net.minecraft.util.SoundEvent;                                                                            " >> "RRMoCSoundEvent$class.java"
echo "                                                                                                                 " >> "RRMoCSoundEvent$class.java"
echo "/**                                                                                                              " >> "RRMoCSoundEvent$class.java"
echo " * Mo'Creatures Redux&Redone $name sound event.                                                                  " >> "RRMoCSoundEvent$class.java"
echo " *                                                                                                               " >> "RRMoCSoundEvent$class.java"
echo " * @version $version                                                                                             " >> "RRMoCSoundEvent$class.java"
echo " * @author $author                                                                                               " >> "RRMoCSoundEvent$class.java"
echo " */                                                                                                              " >> "RRMoCSoundEvent$class.java"
echo "public class RRMoCSoundEvent$class extends RRMoCSoundEvent                                                       " >> "RRMoCSoundEvent$class.java"
echo "{                                                                                                                " >> "RRMoCSoundEvent$class.java"
echo "   /**                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "    * Using the parent base constructor, create a $name sound event.                                             " >> "RRMoCSoundEvent$class.java"
echo "    */                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "   public RRMoCSoundEvent$class()                                                                                " >> "RRMoCSoundEvent$class.java"
echo "   {                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "       super(Constants.Sounds.$id, new RRMoCSoundEventProvider$class());                                         " >> "RRMoCSoundEvent$class.java"
echo "   }                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "                                                                                                                 " >> "RRMoCSoundEvent$class.java"
echo "   /**                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "    * With the mestretramador.rrmocreatures.sound.RRMoCSoundEvent#setSoundEvent(SoundEvent) set                  " >> "RRMoCSoundEvent$class.java"
echo "    * helper function}, the $name sound event is created.                                                        " >> "RRMoCSoundEvent$class.java"
echo "    */                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "   @Override                                                                                                     " >> "RRMoCSoundEvent$class.java"
echo "   protected void createSoundEvent()                                                                             " >> "RRMoCSoundEvent$class.java"
echo "   {                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "       setSoundEvent(new RRMoCSoundEventModel(((RRMoCSoundEventProvider$class) provider).provideProperties()));  " >> "RRMoCSoundEvent$class.java"
echo "   }                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "                                                                                                                 " >> "RRMoCSoundEvent$class.java"
echo "   /**                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "    * Return the $name sound event in its current state.                                                         " >> "RRMoCSoundEvent$class.java"
echo "    */                                                                                                           " >> "RRMoCSoundEvent$class.java"
echo "   @Override                                                                                                     " >> "RRMoCSoundEvent$class.java"
echo "   public SoundEvent returnAsSoundEvent()                                                                        " >> "RRMoCSoundEvent$class.java"
echo "   {                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "       return getSoundEvent();                                                                                   " >> "RRMoCSoundEvent$class.java"
echo "   }                                                                                                             " >> "RRMoCSoundEvent$class.java"
echo "}                                                                                                                " >> "RRMoCSoundEvent$class.java"
           
# Add the Sound Event in Git.           
git add RRMoCSoundEvent$class.java


# Final message.
echo
echo "Created Sound Event and Provider for $name!"
echo "Plase insert it on sounds.json file."
read -s -n 1 -p "Press any key to continue . . ."
echo ""