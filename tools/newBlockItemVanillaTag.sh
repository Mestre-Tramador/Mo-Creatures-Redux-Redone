####################################################################################
# This shell script file creates a BlockItem Vanilla Tag Copy Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
####################################################################################

# Gloval variables.
version="0.0.15"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the blockitem vanilla tag new name.
set +v
echo "What will be the BlockItem Vanilla Tag class name?"
echo "The BlockItem Vanilla Tag class name must be in Pascal Case eg. \"NewBlockItemVanillaTagClass\"."
read -p "Vanilla Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the vanilla tag constant.
echo
echo "What is the Block Vanilla Tag?"
echo "The Block Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"BLOCK_ITEM_VANILLA_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the parent vanilla tag constant.
echo
echo "What is the BlockItem Parent Vanilla Tag?"
echo "The BlockItem Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"BLOCK_VANILLA_TAG\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the blockitem vanilla tag name.
echo
echo "What is the BlockItem Vanilla Tag name?"
echo "The BlockItem Vanilla Tag name is generally the same as the class name but with spaces eg. \"BlockItem Vanilla Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the BlockItem Tag directory.
cd "$tagdir"

# Create the BlockItem Vanilla Tag.
touch "RRMoCBlockItemVanillaTag$class.java"
chmod 744 "RRMoCBlockItemVanillaTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                              " >> "RRMoCBlockItemVanillaTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemVanillaTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider; " >> "RRMoCBlockItemVanillaTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemVanillaTag$class.java"
echo "import net.minecraft.tags.BlockTags;                                                      " >> "RRMoCBlockItemVanillaTag$class.java"
echo "import net.minecraft.tags.ItemTags;                                                       " >> "RRMoCBlockItemVanillaTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemVanillaTag$class.java"
echo "/**                                                                                       " >> "RRMoCBlockItemVanillaTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Minecraft Tag's BlockItems.                            " >> "RRMoCBlockItemVanillaTag$class.java"
echo " *                                                                                        " >> "RRMoCBlockItemVanillaTag$class.java"
echo " * @version $version                                                                      " >> "RRMoCBlockItemVanillaTag$class.java"
echo " * @author $author                                                                        " >> "RRMoCBlockItemVanillaTag$class.java"
echo " */                                                                                       " >> "RRMoCBlockItemVanillaTag$class.java"
echo "public class RRMoCBlockItemVanillaTag$class extends RRMoCBlockItemTagProvider             " >> "RRMoCBlockItemVanillaTag$class.java"
echo "{                                                                                         " >> "RRMoCBlockItemVanillaTag$class.java"
echo "    /**                                                                                   " >> "RRMoCBlockItemVanillaTag$class.java"
echo "     * Using the parent constructor, adds to $name Minecraft tag.                         " >> "RRMoCBlockItemVanillaTag$class.java"
echo "     */                                                                                   " >> "RRMoCBlockItemVanillaTag$class.java"
echo "    public RRMoCBlockItemVanillaTag$class()                                               " >> "RRMoCBlockItemVanillaTag$class.java"
echo "    {                                                                                     " >> "RRMoCBlockItemVanillaTag$class.java"
echo "        super(BlockTags.$fid, ItemTags.$id);                                              " >> "RRMoCBlockItemVanillaTag$class.java"
echo "    }                                                                                     " >> "RRMoCBlockItemVanillaTag$class.java"
echo "}                                                                                         " >> "RRMoCBlockItemVanillaTag$class.java"

# Add the BlockItem Vanilla Tag in Git.
git add RRMoCBlockItemVanillaTag$class.java


# Final message.
echo
echo "Created BlockItem Vanilla Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""