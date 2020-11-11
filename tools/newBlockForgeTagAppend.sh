###############################################################################
# This shell script file creates a Block Forge Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
###############################################################################

# Gloval variables.
version="0.0.16"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block forge tag append new name.
set +v
echo "What will be the Block Forge Tag Append class name?"
echo "The Block Forge Tag Append class name must be in Pascal Case eg. \"NewBlockForgeTagAppendClass\"."
read -p "Forge Tag Append: " class
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

# Collect the parent forge tag constant.
echo
echo " What is the Block Parent Forge Tag?"
echo " The Block Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"BLOCK_FORGE_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the forge tag append name.
echo
echo "What is the Block Forge Tag Append name?"
echo "The Block Forge Tag name is generally the same as the class name but with spaces eg. \"Block Forge Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Forge Tag Append.
touch "RRMoCBlockForgeTagAppend$class.java"
chmod 744 "RRMoCBlockForgeTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                                " >> "RRMoCBlockForgeTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockForgeTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; " >> "RRMoCBlockForgeTagAppend$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                              " >> "RRMoCBlockForgeTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockForgeTagAppend$class.java"
echo "/**                                                                                         " >> "RRMoCBlockForgeTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Forge Tag Append's.                                      " >> "RRMoCBlockForgeTagAppend$class.java"
echo " *                                                                                          " >> "RRMoCBlockForgeTagAppend$class.java"
echo " * @version $version                                                                        " >> "RRMoCBlockForgeTagAppend$class.java"
echo " * @author $author                                                                          " >> "RRMoCBlockForgeTagAppend$class.java"
echo " */                                                                                         " >> "RRMoCBlockForgeTagAppend$class.java"
echo "public class RRMoCBlockForgeTagAppend$class extends RRMoCBlockTagAppendProvider             " >> "RRMoCBlockForgeTagAppend$class.java"
echo "{                                                                                           " >> "RRMoCBlockForgeTagAppend$class.java"
echo "    /**                                                                                     " >> "RRMoCBlockForgeTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                                 " >> "RRMoCBlockForgeTagAppend$class.java"
echo "     */                                                                                     " >> "RRMoCBlockForgeTagAppend$class.java"
echo "    public RRMoCBlockForgeTagAppend$class()                                                 " >> "RRMoCBlockForgeTagAppend$class.java"
echo "    {                                                                                       " >> "RRMoCBlockForgeTagAppend$class.java"
echo "        super(net.minecraftforge.common.Tags.Blocks.$fid, Tags.Blocks.$id);                 " >> "RRMoCBlockForgeTagAppend$class.java"
echo "    }                                                                                       " >> "RRMoCBlockForgeTagAppend$class.java"
echo "}                                                                                           " >> "RRMoCBlockForgeTagAppend$class.java"

# Add the Block Forge Tag Append in Git.
git add RRMoCBlockForgeTagAppend$class.java


# Final message.
echo
echo "Created Block Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""