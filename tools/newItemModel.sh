########################################################################
# This shell script file creates an Item Model Data Generator class.
# It does not create a Constant for the Item ID.
# Neither add it in the Data Generation class.
#
# Please be gentle with this code.
########################################################################

# Gloval variables.
version="0.0.29"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
modeldir="../src/main/java/mestretramador/rrmocreatures/data/client/item"


# Collect the item model new name.
set +v
echo "What will be the Item Model class name?"
echo "The Item Model class name must be in Pascal Case eg. \"NewItemModelClass\"."
read -p "Model: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the item ID constant.
echo
echo "What is the Item ID constant?"
echo "The Item ID constant must be in Upper case and Underscores eg. \"ITEM_MODEL\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the item layer.
echo
echo "What is the item layer?"
echo "The layer must exists in Minecraft eg. \"layer0\"."
read -p "Layer: " layer
if [ -z "$layer" ]
then
    exit
fi

# Collect the item name.
echo
echo "What is the Item name?"
echo "The Item name is generally the same as the class name but with spaces eg. \"Item Model\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Model directory.
cd "$modeldir"

# Create the Item Model.
touch "RRMoCItemModel$class.java"
chmod 744 "RRMoCItemModel$class.java"

echo "package mestretramador.rrmocreatures.data.client.item;                                                  " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemModelProvider;                   " >> "RRMoCItemModel$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                                     " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "import net.minecraft.data.DataGenerator;                                                                " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "import net.minecraftforge.client.model.generators.ItemModelBuilder;                                     " >> "RRMoCItemModel$class.java"
echo "import net.minecraftforge.client.model.generators.ModelFile;                                            " >> "RRMoCItemModel$class.java"
echo "import net.minecraftforge.common.data.ExistingFileHelper;                                               " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "/**                                                                                                     " >> "RRMoCItemModel$class.java"
echo " * Mo'Creatures Redux&Redone $name item model.                                                          " >> "RRMoCItemModel$class.java"
echo " *                                                                                                      " >> "RRMoCItemModel$class.java"
echo " * @version $version                                                                                    " >> "RRMoCItemModel$class.java"
echo " * @author $author                                                                                      " >> "RRMoCItemModel$class.java"
echo " */                                                                                                     " >> "RRMoCItemModel$class.java"
echo "public class RRMoCItemModel$class extends RRMoCItemModelProvider                                        " >> "RRMoCItemModel$class.java"
echo "{                                                                                                       " >> "RRMoCItemModel$class.java"
echo "    /**                                                                                                 " >> "RRMoCItemModel$class.java"
echo "     * Using the parent constructor, create a $name.                                                    " >> "RRMoCItemModel$class.java"
echo "     *                                                                                                  " >> "RRMoCItemModel$class.java"
echo "     * @param generator          Minecraft {@link net.minecraft.data.DataGenerator                      " >> "RRMoCItemModel$class.java"
echo "     *                           Data Generator}.                                                       " >> "RRMoCItemModel$class.java"
echo "     * @param existingFileHelper Forge                                                                  " >> "RRMoCItemModel$class.java"
echo "     *                           {@link net.minecraftforge.common.data.ExistingFileHelper               " >> "RRMoCItemModel$class.java"
echo "     *                           Existing File Helper}.                                                 " >> "RRMoCItemModel$class.java"
echo "     */                                                                                                 " >> "RRMoCItemModel$class.java"
echo "    public RRMoCItemModel$class(DataGenerator generator, ExistingFileHelper existingFileHelper)         " >> "RRMoCItemModel$class.java"
echo "    {                                                                                                   " >> "RRMoCItemModel$class.java"
echo "        super(generator, existingFileHelper, Constants.Items.$id, Constants.ITEM_PATH, \"$layer\");     " >> "RRMoCItemModel$class.java"
echo "    }                                                                                                   " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "    /**                                                                                                 " >> "RRMoCItemModel$class.java"
echo "     * Register the Model with the defined constants.                                                   " >> "RRMoCItemModel$class.java"
echo "     */                                                                                                 " >> "RRMoCItemModel$class.java"
echo "    @Override                                                                                           " >> "RRMoCItemModel$class.java"
echo "    protected void registerModels()                                                                     " >> "RRMoCItemModel$class.java"
echo "    {                                                                                                   " >> "RRMoCItemModel$class.java"
echo "        final ModelFile itemModelFileGenerated = getExistingFile(LOCATION);                             " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "        buildModelRegistered(itemModelFileGenerated);                                                   " >> "RRMoCItemModel$class.java"
echo "    }                                                                                                   " >> "RRMoCItemModel$class.java"
echo "                                                                                                        " >> "RRMoCItemModel$class.java"
echo "   /**                                                                                                  " >> "RRMoCItemModel$class.java"
echo "    * Helper function to build based on a generated file.                                               " >> "RRMoCItemModel$class.java"
echo "    *                                                                                                   " >> "RRMoCItemModel$class.java"
echo "    * @param itemModelFile The Item Model File.                                                         " >> "RRMoCItemModel$class.java"
echo "    * @return The builder with the texture provided by the constants.                                   " >> "RRMoCItemModel$class.java"
echo "    */                                                                                                  " >> "RRMoCItemModel$class.java"
echo "   private ItemModelBuilder buildModelRegistered(ModelFile itemModelFile)                               " >> "RRMoCItemModel$class.java"
echo "   {                                                                                                    " >> "RRMoCItemModel$class.java"
echo "       return getBuilder(this.model).parent(itemModelFile).texture(this.layer, this.path + this.model); " >> "RRMoCItemModel$class.java"
echo "   }                                                                                                    " >> "RRMoCItemModel$class.java"
echo "}                                                                                                       " >> "RRMoCItemModel$class.java"

# Add the Item Model in Git.
git add RRMoCItemModel$class.java


# Final message.
echo
echo "Created Item Model for $name!"
echo "Plase insert it on and run Data Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""