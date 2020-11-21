#################################################################################
# This shell script file creates a Block Vanilla Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
#################################################################################

# Gloval variables.
version="0.0.23"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block vanilla tag append new name.
set +v
echo "What will be the Block Vanilla Tag Append class name?"
echo "The Block Vanilla Tag Append class name must be in Pascal Case eg. \"NewBlockVanillaTagAppendClass\"."
read -p "Vanilla Tag Append: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the tag constant.
echo
echo "What is the Block Tag?"
echo "The Block Tag constant must be in Upper case and Underscores eg. \"BLOCK_TAG_APPEND\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the parent vanilla tag constant.
echo
echo " What is the Block Parent Vanilla Tag?"
echo " The Block Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"BLOCK_VANILLA_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the vanilla tag append name.
echo
echo "What is the Block Vanilla Tag Append name?"
echo "The Block Vanilla Tag name is generally the same as the class name but with spaces eg. \"Block Vanilla Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Vanilla Tag.
touch "RRMoCBlockVanillaTagAppend$class.java"
chmod 744 "RRMoCBlockVanillaTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                                " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                              " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "import net.minecraft.tags.BlockTags;                                                        " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "/**                                                                                         " >> "RRMoCBlockVanillaTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Minecraft Tag Append's.                                  " >> "RRMoCBlockVanillaTagAppend$class.java"
echo " *                                                                                          " >> "RRMoCBlockVanillaTagAppend$class.java"
echo " * @version $version                                                                        " >> "RRMoCBlockVanillaTagAppend$class.java"
echo " * @author $author                                                                          " >> "RRMoCBlockVanillaTagAppend$class.java"
echo " */                                                                                         " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "public class RRMoCBlockVanillaTagAppend$class extends RRMoCBlockTagAppendProvider           " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "{                                                                                           " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "    /**                                                                                     " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                                 " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "     */                                                                                     " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "    public RRMoCBlockVanillaTagAppend$class()                                               " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "    {                                                                                       " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "        super(BlockTags.$fid, Tags.Blocks.$id);                                             " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "    }                                                                                       " >> "RRMoCBlockVanillaTagAppend$class.java"
echo "}                                                                                           " >> "RRMoCBlockVanillaTagAppend$class.java"

# Add the Block Vanilla Tag Append in Git.
git add RRMoCBlockVanillaTagAppend$class.java


# Final message.
echo
echo "Created Block Vanilla Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""