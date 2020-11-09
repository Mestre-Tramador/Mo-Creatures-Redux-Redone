############################################################################
# This shell script file creates a Item Tag Append Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
############################################################################

# Gloval variables.
version="0.0.12"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/item"


# Collect the item tag append new name.
set +v
echo "What will be the Item Tag Append class name?"
echo "The Item Tag Append class name must be in Pascal Case eg. \"NewItemTagAppendClass\"."
read -p "Tag Append: " class
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

# Collect the parent tag constant.
echo
echo " What is the Item Parent Tag?"
echo " The Item Parent Tag constant must be in Upper case and Underscores eg. \"ITEM_TAG_APPEND\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the tag append name.
echo
echo "What is the Item Tag Append name?"
echo "The Item Tag name is generally the same as the class name but with spaces eg. \"Item Tag Append\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Tag Append.
touch "RRMoCItemTagAppend$class.java"
chmod 744 "RRMoCItemTagAppend$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.item;                               " >> "RRMoCItemTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemTagAppend$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagAppendProvider; " >> "RRMoCItemTagAppend$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                            " >> "RRMoCItemTagAppend$class.java"
echo "                                                                                          " >> "RRMoCItemTagAppend$class.java"
echo "/**                                                                                       " >> "RRMoCItemTagAppend$class.java"
echo " * Mo'Creatures Redux&Redone $name Tag Append's.                                          " >> "RRMoCItemTagAppend$class.java"
echo " *                                                                                        " >> "RRMoCItemTagAppend$class.java"
echo " * @version $version                                                                      " >> "RRMoCItemTagAppend$class.java"
echo " * @author $author                                                                        " >> "RRMoCItemTagAppend$class.java"
echo " */                                                                                       " >> "RRMoCItemTagAppend$class.java"
echo "public class RRMoCItemTagAppend$class extends RRMoCItemTagAppendProvider                  " >> "RRMoCItemTagAppend$class.java"
echo "{                                                                                         " >> "RRMoCItemTagAppend$class.java"
echo "    /**                                                                                   " >> "RRMoCItemTagAppend$class.java"
echo "     * Using the parent constructor, appends the $name tag.                               " >> "RRMoCItemTagAppend$class.java"
echo "     */                                                                                   " >> "RRMoCItemTagAppend$class.java"
echo "    public RRMoCItemTagAppend$class()                                                     " >> "RRMoCItemTagAppend$class.java"
echo "    {                                                                                     " >> "RRMoCItemTagAppend$class.java"
echo "        super(Tags.Items.$fid, Tags.Items.$id);                                           " >> "RRMoCItemTagAppend$class.java"
echo "    }                                                                                     " >> "RRMoCItemTagAppend$class.java"
echo "}                                                                                         " >> "RRMoCItemTagAppend$class.java"

# Add the Item Tag Append in Git.
git add RRMoCItemTagAppend$class.java


# Final message.
echo
echo "Created Item Tag Append for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""