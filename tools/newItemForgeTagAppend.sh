###############################################################################
# This shell script file creates an Item Forge Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
###############################################################################

# Gloval variables.
version="0.0.21"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/item"


# Collect the item forge tag append new name.
set +v
echo "What will be the Item Forge Tag Append class name?"
echo "The Item Forge Tag Append class name must be in Pascal Case eg. \"NewItemForgeTagAppendClass\"."
read -p "Forge Tag Append: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the tag constant.
echo
echo "What is the Item Tag?"
echo "The Item Tag constant must be in Upper case and Underscores eg. \"ITEM_TAG_APPEND\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the parent forge tag constant.
echo
echo " What is the Item Parent Forge Tag?"
echo " The Item Parent Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"ITEM_FORGE_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the forge tag append name.
echo
echo "What is the Item Forge Tag Append name?"
echo "The Item Forge Tag name is generally the same as the class name but with spaces eg. \"Item Forge Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Forge Tag Append.
touch "RRMoCItemForgeTagAppend$class.java"
chmod 744 "RRMoCItemForgeTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.item;                               " >> "RRMoCItemForgeTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemForgeTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; " >> "RRMoCItemForgeTagAppend$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                            " >> "RRMoCItemForgeTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemForgeTagAppend$class.java"
echo "/**                                                                                       " >> "RRMoCItemForgeTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Forge Tag Append's.                                    " >> "RRMoCItemForgeTagAppend$class.java"
echo " *                                                                                        " >> "RRMoCItemForgeTagAppend$class.java"
echo " * @version $version                                                                      " >> "RRMoCItemForgeTagAppend$class.java"
echo " * @author $author                                                                        " >> "RRMoCItemForgeTagAppend$class.java"
echo " */                                                                                       " >> "RRMoCItemForgeTagAppend$class.java"
echo "public class RRMoCItemForgeTagAppend$class extends RRMoCItemTagAppendProvider             " >> "RRMoCItemForgeTagAppend$class.java"
echo "{                                                                                         " >> "RRMoCItemForgeTagAppend$class.java"
echo "    /**                                                                                   " >> "RRMoCItemForgeTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                               " >> "RRMoCItemForgeTagAppend$class.java"
echo "     */                                                                                   " >> "RRMoCItemForgeTagAppend$class.java"
echo "    public RRMoCItemForgeTagAppend$class()                                                " >> "RRMoCItemForgeTagAppend$class.java"
echo "    {                                                                                     " >> "RRMoCItemForgeTagAppend$class.java"
echo "        super((net.minecraftforge.common.Tags.Items.$fid, Tags.Items.$id);                " >> "RRMoCItemForgeTagAppend$class.java"
echo "    }                                                                                     " >> "RRMoCItemForgeTagAppend$class.java"
echo "}                                                                                         " >> "RRMoCItemForgeTagAppend$class.java"

# Add the Item Forge Tag Append in Git.
git add RRMoCItemForgeTagAppend$class.java


# Final message.
echo
echo "Created Item Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""