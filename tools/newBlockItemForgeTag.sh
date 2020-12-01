################################################################################
# This shell script file creates a BlockItem Forge Tag Copy Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
################################################################################

# Gloval variables.
version="0.0.26"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/common/tags/block"


# Collect the blockitem forge tag new name.
set +v
echo "What will be the BlockItem Forge Tag class name?"
echo "The BlockItem Forge Tag class name must be in Pascal Case eg. \"NewBlockItemForgeTagClass\"."
read -p "Forge Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the forge tag constant.
echo
echo "What is the Block Forge Tag?"
echo "The Block Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"BLOCK_ITEM_FORGE_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the parent forge tag constant.
echo
echo "What is the BlockItem Parent Forge Tag?"
echo "The BlockItem Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"BLOCK_FORGE_TAG\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the blockitem forge tag name.
echo
echo "What is the BlockItem Forge Tag name?"
echo "The BlockItem Forge Tag name is generally the same as the class name but with spaces eg. \"BlockItem Forge Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the BlockItem Tag directory.
cd "$tagdir"

# Create the BlockItem Forge Tag.
touch "RRMoCBlockItemForgeTag$class.java"
chmod 744 "RRMoCBlockItemForgeTag$class.java"

echo "package mestretramador.rrmocreatures.data.common.tags.block;                              " >> "RRMoCBlockItemForgeTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemForgeTag$class.java"
echo "import mestretramador.rrmocreatures.data.common.provider.block.RRMoCBlockItemTagProvider; " >> "RRMoCBlockItemForgeTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemForgeTag$class.java"
echo "import net.minecraftforge.common.Tags;                                                    " >> "RRMoCBlockItemForgeTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemForgeTag$class.java"
echo "/**                                                                                       " >> "RRMoCBlockItemForgeTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Forge Tag's BlockItems.                                " >> "RRMoCBlockItemForgeTag$class.java"
echo " *                                                                                        " >> "RRMoCBlockItemForgeTag$class.java"
echo " * @version $version                                                                      " >> "RRMoCBlockItemForgeTag$class.java"
echo " * @author $author                                                                        " >> "RRMoCBlockItemForgeTag$class.java"
echo " */                                                                                       " >> "RRMoCBlockItemForgeTag$class.java"
echo "public class RRMoCBlockItemForgeTag$class extends RRMoCBlockItemTagProvider               " >> "RRMoCBlockItemForgeTag$class.java"
echo "{                                                                                         " >> "RRMoCBlockItemForgeTag$class.java"
echo "    /**                                                                                   " >> "RRMoCBlockItemForgeTag$class.java"
echo "     * Using the parent constructor, adds to $name Forge tag.                             " >> "RRMoCBlockItemForgeTag$class.java"
echo "     */                                                                                   " >> "RRMoCBlockItemForgeTag$class.java"
echo "    public RRMoCBlockItemForgeTag$class()                                                 " >> "RRMoCBlockItemForgeTag$class.java"
echo "    {                                                                                     " >> "RRMoCBlockItemForgeTag$class.java"
echo "        super(Tags.Blocks.$fid, Tags.Items.$id);                                          " >> "RRMoCBlockItemForgeTag$class.java"
echo "    }                                                                                     " >> "RRMoCBlockItemForgeTag$class.java"
echo "}                                                                                         " >> "RRMoCBlockItemForgeTag$class.java"

# Add the BlockItem Forge Tag in Git.
git add RRMoCBlockItemForgeTag$class.java


# Final message.
echo
echo "Created BlockItem Forge Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""