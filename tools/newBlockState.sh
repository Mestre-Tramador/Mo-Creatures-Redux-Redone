########################################################################
# This shell script file creates a Block State Data Generator class.
# It does not create a Register for the Block.
# Neither add it in the Data Generation class.
#
# Please be gentle with this code.
########################################################################

# Gloval variables.
version="0.0.27"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
statedir="../src/main/java/mestretramador/rrmocreatures/data/client/block"


# Collect the block state new name.
set +v
echo "What will be the Block State class name?"
echo "The Block State class name must be in Pascal Case eg. \"NewBlockStateClass\"."
read -p "State: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the block register constant.
echo
echo "What is the Block register constant?"
echo "The Block register constant can be found in the RegisterBlock class eg \"init.RegisterBlock#BLOCK_STATE\"."
read -p "Register: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block name.
echo
echo "What is the Block name?"
echo "The Block name is generally the same as the class name but with spaces eg. \"Block State\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block State directory.
cd "$statedir"

# Create the Block State.
touch "RRMoCBlockState$class.java"
chmod 744 "RRMoCBlockState$class.java"

echo "package mestretramador.rrmocreatures.data.client.block;                                          " >> "RRMoCBlockState$class.java"
echo "                                                                                                 " >> "RRMoCBlockState$class.java"
echo "import mestretramador.rrmocreatures.block.RRMoCBlock$class;          " >> "RRMoCBlockState$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockStateProvider;          " >> "RRMoCBlockState$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterBlock;                                              " >> "RRMoCBlockState$class.java"
echo "                                                                                                 " >> "RRMoCBlockState$class.java"
echo "import net.minecraft.data.DataGenerator;                                                         " >> "RRMoCBlockState$class.java"
echo "                                                                                                 " >> "RRMoCBlockState$class.java"
echo "import net.minecraftforge.common.data.ExistingFileHelper;                                        " >> "RRMoCBlockState$class.java"
echo "                                                                                                 " >> "RRMoCBlockState$class.java"
echo "/**                                                                                              " >> "RRMoCBlockState$class.java"
echo " * Mo'Creatures Redux&Redone $name block model.                                                  " >> "RRMoCBlockState$class.java"
echo " *                                                                                               " >> "RRMoCBlockState$class.java"
echo " * @version $version                                                                             " >> "RRMoCBlockState$class.java"
echo " * @author $author                                                                               " >> "RRMoCBlockState$class.java"
echo " */                                                                                              " >> "RRMoCBlockState$class.java"
echo "public class RRMoCBlockState$class extends RRMoCBlockStateProvider                               " >> "RRMoCBlockState$class.java"
echo "{                                                                                                " >> "RRMoCBlockState$class.java"
echo "    /**                                                                                          " >> "RRMoCBlockState$class.java"
echo "     * Using the parent constructor, create the blockstate from $name.                           " >> "RRMoCBlockState$class.java"
echo "     *                                                                                           " >> "RRMoCBlockState$class.java"
echo "     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator               " >> "RRMoCBlockState$class.java"
echo "     *                           Data Generator}.                                                " >> "RRMoCBlockState$class.java"
echo "     * @param existingFileHelper Forge                                                           " >> "RRMoCBlockState$class.java"
echo "     *                           {@link net.minecraftforge.common.data.ExistingFileHelper        " >> "RRMoCBlockState$class.java"
echo "     *                           Existing File Helper}.                                          " >> "RRMoCBlockState$class.java"
echo "     */                                                                                          " >> "RRMoCBlockState$class.java"
echo "    public RRMoCBlockState$class(DataGenerator generator, ExistingFileHelper existingFileHelper) " >> "RRMoCBlockState$class.java"
echo "    {                                                                                            " >> "RRMoCBlockState$class.java"
echo "        super(generator, existingFileHelper, RegisterBlock.$id);                                 " >> "RRMoCBlockState$class.java"
echo "    }                                                                                            " >> "RRMoCBlockState$class.java"
echo "                                                                                                 " >> "RRMoCBlockState$class.java"
echo "    /**                                                                                          " >> "RRMoCBlockState$class.java"
echo "     * Register the block states by the given registered block.                                  " >> "RRMoCBlockState$class.java"
echo "     */                                                                                          " >> "RRMoCBlockState$class.java"
echo "    @Override                                                                                    " >> "RRMoCBlockState$class.java"
echo "    protected void registerStatesAndModels()                                                     " >> "RRMoCBlockState$class.java"
echo "    {                                                                                            " >> "RRMoCBlockState$class.java"
echo "        // Add here the state of you block.                                                      " >> "RRMoCBlockState$class.java"
echo "        // To retrieve it use ((RRMoCBlock$class) this.registeredBlock).returnAsBlock();         " >> "RRMoCBlockState$class.java"
echo "    }                                                                                            " >> "RRMoCBlockState$class.java"
echo "}                                                                                                " >> "RRMoCBlockState$class.java"

# Add the Block State in Git.
git add RRMoCBlockState$class.java


# Final message.
echo
echo "Created Block State for $name!"
echo "Plase insert it on and run Data Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""