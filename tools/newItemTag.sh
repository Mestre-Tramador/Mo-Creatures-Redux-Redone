#################################################################
# This shell script file creates an Item Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
#################################################################

# Gloval variables.
version="0.0.26"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/common/tags/item"


# Collect the item tag new name.
set +v
echo "What will be the Item Tag class name?"
echo "The Item Tag class name must be in Pascal Case eg. \"NewItemTagClass\"."
read -p "Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the tag constant.
echo
echo "What is the Item Tag?"
echo "The Item Tag constant must be in Upper case and Underscores eg. \"ITEM_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the item tag name.
echo
echo "What is the Item Tag name?"
echo "The Item Tag name is generally the same as the class name but with spaces eg. \"Item Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Tag.
touch "RRMoCItemTag$class.java"
chmod 744 "RRMoCItemTag$class.java"

echo "package mestretramador.rrmocreatures.data.common.tags.item;                         " >> "RRMoCItemTag$class.java"
echo "                                                                                    " >> "RRMoCItemTag$class.java"
echo "import mestretramador.rrmocreatures.data.common.provider.item.RRMoCItemTagProvider; " >> "RRMoCItemTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterItem;                              " >> "RRMoCItemTag$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                      " >> "RRMoCItemTag$class.java"
echo "                                                                                    " >> "RRMoCItemTag$class.java"
echo "/**                                                                                 " >> "RRMoCItemTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Tag's Items.                                     " >> "RRMoCItemTag$class.java"
echo " *                                                                                  " >> "RRMoCItemTag$class.java"
echo " * @version $version                                                                " >> "RRMoCItemTag$class.java"
echo " * @author $author                                                                  " >> "RRMoCItemTag$class.java"
echo " */                                                                                 " >> "RRMoCItemTag$class.java"
echo "public class RRMoCItemTag$class extends RRMoCItemTagProvider                        " >> "RRMoCItemTag$class.java"
echo "{                                                                                   " >> "RRMoCItemTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemTag$class.java"
echo "     * Using the parent constructor, creates the $name tag.                         " >> "RRMoCItemTag$class.java"
echo "     */                                                                             " >> "RRMoCItemTag$class.java"
echo "    public RRMoCItemTag$class()                                                     " >> "RRMoCItemTag$class.java"
echo "    {                                                                               " >> "RRMoCItemTag$class.java"
echo "        super(Tags.Items.$id);                                                      " >> "RRMoCItemTag$class.java"
echo "    }                                                                               " >> "RRMoCItemTag$class.java"
echo "                                                                                    " >> "RRMoCItemTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemTag$class.java"
echo "     * <p>                                                                          " >> "RRMoCItemTag$class.java"
echo "     * The setter sets the {@link Tags.Items#$id $name item                         " >> "RRMoCItemTag$class.java"
echo "     * tag} to the below items:                                                     " >> "RRMoCItemTag$class.java"
echo "     * </p>                                                                         " >> "RRMoCItemTag$class.java"
echo "     * <ul>                                                                         " >> "RRMoCItemTag$class.java"
echo "     * <li>Link your items here.</li>                                               " >> "RRMoCItemTag$class.java"
echo "     * </ul>                                                                        " >> "RRMoCItemTag$class.java"
echo "     */                                                                             " >> "RRMoCItemTag$class.java"
echo "    @Override                                                                       " >> "RRMoCItemTag$class.java"
echo "    protected void setItemsToTag()                                                  " >> "RRMoCItemTag$class.java"
echo "    {                                                                               " >> "RRMoCItemTag$class.java"
echo "        // Add here your items to this tag.                                         " >> "RRMoCItemTag$class.java"
echo "        // Use ITEMS.add(item);                                                     " >> "RRMoCItemTag$class.java"
echo "    }                                                                               " >> "RRMoCItemTag$class.java"
echo "}                                                                                   " >> "RRMoCItemTag$class.java"

# Add the Item Tag in Git.
git add RRMoCItemTag$class.java


# Final message.
echo
echo "Created Item Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""