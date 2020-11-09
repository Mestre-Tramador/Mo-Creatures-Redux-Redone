########################################################################
# This shell script file creates a Block Vanilla Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
########################################################################

# Gloval variables.
version="0.0.13"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block vanilla tag new name.
set +v
echo "What will be the Block Vanilla Tag class name?"
echo "The Block Vanilla Tag class name must be in Pascal Case eg. \"NewBlockVanillaTagClass\"."
read -p "Vanilla Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the vanilla tag constant.
echo
echo "What is the Block Vanilla Tag?"
echo "The Block Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"ITEM_VANILLA_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block vanilla tag name.
echo
echo "What is the Block Vanilla Tag name?"
echo "The Block Vanilla Tag name is generally the same as the class name but with spaces eg. \"Block Vanilla Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Vanilla Tag.
touch "RRMoCBlockVanillaTag$class.java"
chmod 744 "RRMoCBlockVanillaTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                          " >> "RRMoCBlockVanillaTag$class.java"
echo "                                                                                      " >> "RRMoCBlockVanillaTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; " >> "RRMoCBlockVanillaTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterBlock;                               " >> "RRMoCBlockVanillaTag$class.java"
echo "                                                                                      " >> "RRMoCBlockVanillaTag$class.java"
echo "import net.minecraft.tags.BlockTags;                                                  " >> "RRMoCBlockVanillaTag$class.java"
echo "                                                                                      " >> "RRMoCBlockVanillaTag$class.java"
echo "/**                                                                                   " >> "RRMoCBlockVanillaTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Minecraft Tag's Blocks.                            " >> "RRMoCBlockVanillaTag$class.java"
echo " *                                                                                    " >> "RRMoCBlockVanillaTag$class.java"
echo " * @version $version                                                                  " >> "RRMoCBlockVanillaTag$class.java"
echo " * @author $author                                                                    " >> "RRMoCBlockVanillaTag$class.java"
echo " */                                                                                   " >> "RRMoCBlockVanillaTag$class.java"
echo "public class RRMoCBlockVanillaTag$class extends RRMoCBlockTagProvider                 " >> "RRMoCBlockVanillaTag$class.java"
echo "{                                                                                     " >> "RRMoCBlockVanillaTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockVanillaTag$class.java"
echo "     * Using the parent constructor, adds to $name Minecraft tag.                     " >> "RRMoCBlockVanillaTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockVanillaTag$class.java"
echo "    public RRMoCBlockVanillaTag$class()                                               " >> "RRMoCBlockVanillaTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockVanillaTag$class.java"
echo "        super(BlockTags.$id);                                                         " >> "RRMoCBlockVanillaTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockVanillaTag$class.java"
echo "                                                                                      " >> "RRMoCBlockVanillaTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockVanillaTag$class.java"
echo "     * <p>                                                                            " >> "RRMoCBlockVanillaTag$class.java"
echo "     * The setter sets the {@link BlockTags#$id $name block                           " >> "RRMoCBlockVanillaTag$class.java"
echo "     * Minecraft tag} to the below blocks:                                            " >> "RRMoCBlockVanillaTag$class.java"
echo "     * </p>                                                                           " >> "RRMoCBlockVanillaTag$class.java"
echo "     * <ul>                                                                           " >> "RRMoCBlockVanillaTag$class.java"
echo "     * <li>Link your blocks here.</li>                                                " >> "RRMoCBlockVanillaTag$class.java"
echo "     * </ul>                                                                          " >> "RRMoCBlockVanillaTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockVanillaTag$class.java"
echo "    @Override                                                                         " >> "RRMoCBlockVanillaTag$class.java"
echo "    protected void setBlocksToTag()                                                   " >> "RRMoCBlockVanillaTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockVanillaTag$class.java"
echo "        // Add here your blocks to this tag.                                          " >> "RRMoCBlockVanillaTag$class.java"
echo "        // Use BLOCKS.add(block);                                                     " >> "RRMoCBlockVanillaTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockVanillaTag$class.java"
echo "}                                                                                     " >> "RRMoCBlockVanillaTag$class.java"

# Add the Block Vanilla Tag in Git.
git add RRMoCBlockVanillaTag$class.java


# Final message.
echo
echo "Created Block Vanilla Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""