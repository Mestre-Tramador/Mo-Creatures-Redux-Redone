############################################################################
# This shell script file creates a Block Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
############################################################################

# Gloval variables.
version="0.0.21"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block tag append new name.
set +v
echo "What will be the Block Tag Append class name?"
echo "The Block Tag Append class name must be in Pascal Case eg. \"NewBlockTagAppendClass\"."
read -p "Tag Append: " class
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

# Collect the parent tag constant.
echo
echo " What is the Block Parent Tag?"
echo " The Block Parent Tag constant must be in Upper case and Underscores eg. \"BLOCK_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the tag append name.
echo
echo "What is the Block Tag Append name?"
echo "The Block Tag name is generally the same as the class name but with spaces eg. \"Block Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Tag Append.
touch "RRMoCBlockTagAppend$class.java"
chmod 744 "RRMoCBlockTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                                " >> "RRMoCBlockTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagAppendProvider; " >> "RRMoCBlockTagAppend$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                              " >> "RRMoCBlockTagAppend$class.java"
echo "                                                                                            " >> "RRMoCBlockTagAppend$class.java"
echo "/**                                                                                         " >> "RRMoCBlockTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Tag Append's.                                            " >> "RRMoCBlockTagAppend$class.java"
echo " *                                                                                          " >> "RRMoCBlockTagAppend$class.java"
echo " * @version $version                                                                        " >> "RRMoCBlockTagAppend$class.java"
echo " * @author $author                                                                          " >> "RRMoCBlockTagAppend$class.java"
echo " */                                                                                         " >> "RRMoCBlockTagAppend$class.java"
echo "public class RRMoCBlockTagAppend$class extends RRMoCBlockTagAppendProvider                  " >> "RRMoCBlockTagAppend$class.java"
echo "{                                                                                           " >> "RRMoCBlockTagAppend$class.java"
echo "    /**                                                                                     " >> "RRMoCBlockTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                                 " >> "RRMoCBlockTagAppend$class.java"
echo "     */                                                                                     " >> "RRMoCBlockTagAppend$class.java"
echo "    public RRMoCBlockTagAppend$class()                                                      " >> "RRMoCBlockTagAppend$class.java"
echo "    {                                                                                       " >> "RRMoCBlockTagAppend$class.java"
echo "        super(Tags.Blocks.$fid, Tags.Blocks.$id);                                           " >> "RRMoCBlockTagAppend$class.java"
echo "    }                                                                                       " >> "RRMoCBlockTagAppend$class.java"
echo "}                                                                                           " >> "RRMoCBlockTagAppend$class.java"

# Add the Block Tag Append in Git.
git add RRMoCBlockTagAppend$class.java


# Final message.
echo
echo "Created Block Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""