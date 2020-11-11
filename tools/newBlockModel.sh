########################################################################
# This shell script file creates a Block Model Data Generator class.
# It does not create a Constant for the Block ID.
# Neither add it in the Data Generation class.
#
# Please be gentle with this code.
########################################################################

# Gloval variables.
version="0.0.16"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
modeldir="../src/main/java/mestretramador/rrmocreatures/data/client/block"


# Collect the block model new name.
set +v
echo "What will be the Block Model class name?"
echo "The Block Model class name must be in Pascal Case eg. \"NewBlockModelClass\"."
read -p "Model: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the block ID constant.
echo
echo "What is the Block ID constant?"
echo "The Block ID constant must be in Upper case and Underscores eg. \"BLOCK_MODEL\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block name.
echo
echo "What is the Block name?"
echo "The Block name is generally the same as the class name but with spaces eg. \"Block Model\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Model directory.
cd "$modeldir"

# Create the Block Model.
touch "RRMoCBlockModel$class.java"
chmod 744 "RRMoCBlockModel$class.java"

echo "package mestretramador.rrmocreatures.data.client.block;                                          " >> "RRMoCBlockModel$class.java"
echo "                                                                                                 " >> "RRMoCBlockModel$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockModelProvider;          " >> "RRMoCBlockModel$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                              " >> "RRMoCBlockModel$class.java"
echo "                                                                                                 " >> "RRMoCBlockModel$class.java"
echo "import net.minecraft.data.DataGenerator;                                                         " >> "RRMoCBlockModel$class.java"
echo "                                                                                                 " >> "RRMoCBlockModel$class.java"
echo "import net.minecraftforge.common.data.ExistingFileHelper;                                        " >> "RRMoCBlockModel$class.java"
echo "                                                                                                 " >> "RRMoCBlockModel$class.java"
echo "/**                                                                                              " >> "RRMoCBlockModel$class.java"
echo " * Mo'Creatures Redux&Redone $name block model.                                                  " >> "RRMoCBlockModel$class.java"
echo " *                                                                                               " >> "RRMoCBlockModel$class.java"
echo " * @version $version                                                                             " >> "RRMoCBlockModel$class.java"
echo " * @author $author                                                                               " >> "RRMoCBlockModel$class.java"
echo " */                                                                                              " >> "RRMoCBlockModel$class.java"
echo "public class RRMoCBlockModel$class extends RRMoCBlockModelProvider                               " >> "RRMoCBlockModel$class.java"
echo "{                                                                                                " >> "RRMoCBlockModel$class.java"
echo "    /**                                                                                          " >> "RRMoCBlockModel$class.java"
echo "     * Using the parent constructor, create a $name.                                             " >> "RRMoCBlockModel$class.java"
echo "     *                                                                                           " >> "RRMoCBlockModel$class.java"
echo "     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator               " >> "RRMoCBlockModel$class.java"
echo "     *                           Data Generator}.                                                " >> "RRMoCBlockModel$class.java"
echo "     * @param existingFileHelper Forge                                                           " >> "RRMoCBlockModel$class.java"
echo "     *                           {@link net.minecraftforge.common.data.ExistingFileHelper        " >> "RRMoCBlockModel$class.java"
echo "     *                           Existing File Helper}.                                          " >> "RRMoCBlockModel$class.java"
echo "     */                                                                                          " >> "RRMoCBlockModel$class.java"
echo "    public RRMoCBlockModel$class(DataGenerator generator, ExistingFileHelper existingFileHelper) " >> "RRMoCBlockModel$class.java"
echo "    {                                                                                            " >> "RRMoCBlockModel$class.java"
echo "        super(generator, existingFileHelper, Constants.Blocks.$id, Constants.BLOCK_PATH);        " >> "RRMoCBlockModel$class.java"
echo "    }                                                                                            " >> "RRMoCBlockModel$class.java"
echo "                                                                                                 " >> "RRMoCBlockModel$class.java"
echo "    /**                                                                                          " >> "RRMoCBlockModel$class.java"
echo "     * Register the Model with the defined constants.                                            " >> "RRMoCBlockModel$class.java"
echo "     */                                                                                          " >> "RRMoCBlockModel$class.java"
echo "    @Override                                                                                    " >> "RRMoCBlockModel$class.java"
echo "    protected void registerModels()                                                              " >> "RRMoCBlockModel$class.java"
echo "    {                                                                                            " >> "RRMoCBlockModel$class.java"
echo "        withExistingParent(this.model, modLoc(this.path + this.model));                          " >> "RRMoCBlockModel$class.java"
echo "    }                                                                                            " >> "RRMoCBlockModel$class.java"
echo "}                                                                                                " >> "RRMoCBlockModel$class.java"

# Add the Block Model in Git.
git add RRMoCBlockModel$class.java


# Final message.
echo
echo "Created Block Model for $name!"
echo "Plase insert it on and run Data Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""