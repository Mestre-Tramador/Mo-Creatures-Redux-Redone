#################################################################################
# This shell script file creates an Item Vanilla Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
#################################################################################

# Gloval variables.
version="0.0.27"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/common/tags/item"


# Collect the item vanilla tag append new name.
set +v
echo "What will be the Item Vanilla Tag Append class name?"
echo "The Item Vanilla Tag Append class name must be in Pascal Case eg. \"NewItemVanillaTagAppendClass\"."
read -p "Vanilla Tag Append: " class
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

# Collect the parent vanilla tag constant.
echo
echo " What is the Item Parent Vanilla Tag?"
echo " The Item Parent Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"ITEM_VANILLA_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the vanilla tag append name.
echo
echo "What is the Item Vanilla Tag Append name?"
echo "The Item Vanilla Tag name is generally the same as the class name but with spaces eg. \"Item Vanilla Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Vanilla Tag Append.
touch "RRMoCItemVanillaTagAppend$class.java"
chmod 744 "RRMoCItemVanillaTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.common.tags.item;                               " >> "RRMoCItemVanillaTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemVanillaTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.common.provider.item.RRMoCItemTagAppendProvider; " >> "RRMoCItemVanillaTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemVanillaTagAppend$class.java"
echo "import net.minecraft.tags.ItemTags;                                                       " >> "RRMoCItemVanillaTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemVanillaTagAppend$class.java"
echo "/**                                                                                       " >> "RRMoCItemVanillaTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Minecraft Tag Append's.                                " >> "RRMoCItemVanillaTagAppend$class.java"
echo " *                                                                                        " >> "RRMoCItemVanillaTagAppend$class.java"
echo " * @version $version                                                                      " >> "RRMoCItemVanillaTagAppend$class.java"
echo " * @author $author                                                                        " >> "RRMoCItemVanillaTagAppend$class.java"
echo " */                                                                                       " >> "RRMoCItemVanillaTagAppend$class.java"
echo "public class RRMoCItemVanillaTagAppend$class extends RRMoCItemTagAppendProvider           " >> "RRMoCItemVanillaTagAppend$class.java"
echo "{                                                                                         " >> "RRMoCItemVanillaTagAppend$class.java"
echo "    /**                                                                                   " >> "RRMoCItemVanillaTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                               " >> "RRMoCItemVanillaTagAppend$class.java"
echo "     */                                                                                   " >> "RRMoCItemVanillaTagAppend$class.java"
echo "    public RRMoCItemVanillaTagAppend$class()                                              " >> "RRMoCItemVanillaTagAppend$class.java"
echo "    {                                                                                     " >> "RRMoCItemVanillaTagAppend$class.java"
echo "        super(Tags.Items.$fid, Tags.Items.$id);                                           " >> "RRMoCItemVanillaTagAppend$class.java"
echo "    }                                                                                     " >> "RRMoCItemVanillaTagAppend$class.java"
echo "}                                                                                         " >> "RRMoCItemVanillaTagAppend$class.java"

# Add the Item Vanilla Tag Append in Git.
git add RRMoCItemVanillaTagAppend$class.java


# Final message.
echo
echo "Created Item Vanilla Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""