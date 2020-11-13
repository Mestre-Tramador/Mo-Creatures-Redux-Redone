########################################################################
# This shell script file creates a Block Forge Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
########################################################################

# Gloval variables.
version="0.0.18"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block forge tag new name.
set +v
echo "What will be the Block Forge Tag class name?"
echo "The Block Forge Tag class name must be in Pascal Case eg. \"NewBlockForgeTagClass\"."
read -p "Forge Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the forge tag constant.
echo
echo "What is the Block Forge Tag?"
echo "The Block Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"BLOCK_FORGE_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block forge tag name.
echo
echo "What is the Block Forge Tag name?"
echo "The Block Forge Tag name is generally the same as the class name but with spaces eg. \"Block Forge Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Forge Tag.
touch "RRMoCBlockForgeTag$class.java"
chmod 744 "RRMoCBlockForgeTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                          " >> "RRMoCBlockForgeTag$class.java"
echo "                                                                                      " >> "RRMoCBlockForgeTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; " >> "RRMoCBlockForgeTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterBlock;                               " >> "RRMoCBlockForgeTag$class.java"
echo "                                                                                      " >> "RRMoCBlockForgeTag$class.java"
echo "import net.minecraftforge.common.Tags;                                                " >> "RRMoCBlockForgeTag$class.java"
echo "                                                                                      " >> "RRMoCBlockForgeTag$class.java"
echo "/**                                                                                   " >> "RRMoCBlockForgeTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Forge Tag's Blocks.                                " >> "RRMoCBlockForgeTag$class.java"
echo " *                                                                                    " >> "RRMoCBlockForgeTag$class.java"
echo " * @version $version                                                                  " >> "RRMoCBlockForgeTag$class.java"
echo " * @author $author                                                                    " >> "RRMoCBlockForgeTag$class.java"
echo " */                                                                                   " >> "RRMoCBlockForgeTag$class.java"
echo "public class RRMoCBlockForgeTag$class extends RRMoCBlockTagProvider                   " >> "RRMoCBlockForgeTag$class.java"
echo "{                                                                                     " >> "RRMoCBlockForgeTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockForgeTag$class.java"
echo "     * Using the parent constructor, adds to $name Forge tag.                         " >> "RRMoCBlockForgeTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockForgeTag$class.java"
echo "    public RRMoCBlockForgeTag$class()                                                 " >> "RRMoCBlockForgeTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockForgeTag$class.java"
echo "        super(Tags.Block.$id);                                                        " >> "RRMoCBlockForgeTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockForgeTag$class.java"
echo "                                                                                      " >> "RRMoCBlockForgeTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockForgeTag$class.java"
echo "     * <p>                                                                            " >> "RRMoCBlockForgeTag$class.java"
echo "     * The setter sets the {@link Tags.Blocks#$id $name block                         " >> "RRMoCBlockForgeTag$class.java"
echo "     * Forge tag} to the below blocks:                                                " >> "RRMoCBlockForgeTag$class.java"
echo "     * </p>                                                                           " >> "RRMoCBlockForgeTag$class.java"
echo "     * <ul>                                                                           " >> "RRMoCBlockForgeTag$class.java"
echo "     * <li>Link your blocks here.</li>                                                " >> "RRMoCBlockForgeTag$class.java"
echo "     * </ul>                                                                          " >> "RRMoCBlockForgeTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockForgeTag$class.java"
echo "    @Override                                                                         " >> "RRMoCBlockForgeTag$class.java"
echo "    protected void setBlocksToTag()                                                   " >> "RRMoCBlockForgeTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockForgeTag$class.java"
echo "        // Add here your blocks to this tag.                                          " >> "RRMoCBlockForgeTag$class.java"
echo "        // Use BLOCKS.add(block);                                                     " >> "RRMoCBlockForgeTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockForgeTag$class.java"
echo "}                                                                                     " >> "RRMoCBlockForgeTag$class.java"

# Add the Block Forge Tag in Git.
git add RRMoCBlockForgeTag$class.java


# Final message.
echo
echo "Created Block Forge Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""