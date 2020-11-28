######################################################################
# This shell script file creates an Item Forge Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
######################################################################

# Gloval variables.
version="0.0.24"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/item"


# Collect the item forge tag new name.
set +v
echo "What will be the Item Forge Tag class name?"
echo "The Item Forge Tag class name must be in Pascal Case eg. \"NewItemForgeTagClass\"."
read -p "Forge Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the forge tag constant.
echo
echo "What is the Item Forge Tag?"
echo "The Item Forge Tag constant must exist in Forge, also be in Upper case and Underscores eg. \"ITEM_FORGE_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the item forge tag name.
echo
echo "What is the Item Forge Tag name?"
echo "The Item Forge Tag name is generally the same as the class name but with spaces eg. \"Item Forge Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Forge Tag.
touch "RRMoCItemForgeTag$class.java"
chmod 744 "RRMoCItemForgeTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.item;                         " >> "RRMoCItemForgeTag$class.java"
echo "                                                                                    " >> "RRMoCItemForgeTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; " >> "RRMoCItemForgeTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterItem;                              " >> "RRMoCItemForgeTag$class.java"
echo "                                                                                    " >> "RRMoCItemForgeTag$class.java"
echo "import net.minecraftforge.common.Tags;                                              " >> "RRMoCItemForgeTag$class.java"
echo "                                                                                    " >> "RRMoCItemForgeTag$class.java"
echo "/**                                                                                 " >> "RRMoCItemForgeTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Forge Tag's Items.                               " >> "RRMoCItemForgeTag$class.java"
echo " *                                                                                  " >> "RRMoCItemForgeTag$class.java"
echo " * @version $version                                                                " >> "RRMoCItemForgeTag$class.java"
echo " * @author $author                                                                  " >> "RRMoCItemForgeTag$class.java"
echo " */                                                                                 " >> "RRMoCItemForgeTag$class.java"
echo "public class RRMoCItemForgeTag$class extends RRMoCItemTagProvider                   " >> "RRMoCItemForgeTag$class.java"
echo "{                                                                                   " >> "RRMoCItemForgeTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemForgeTag$class.java"
echo "     * Using the parent constructor, adds to $name Forge tag.                       " >> "RRMoCItemForgeTag$class.java"
echo "     */                                                                             " >> "RRMoCItemForgeTag$class.java"
echo "    public RRMoCItemForgeTag$class()                                                " >> "RRMoCItemForgeTag$class.java"
echo "    {                                                                               " >> "RRMoCItemForgeTag$class.java"
echo "        super(Tags.Items.$id);                                                      " >> "RRMoCItemForgeTag$class.java"
echo "    }                                                                               " >> "RRMoCItemForgeTag$class.java"
echo "                                                                                    " >> "RRMoCItemForgeTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemForgeTag$class.java"
echo "     * <p>                                                                          " >> "RRMoCItemForgeTag$class.java"
echo "     * The setter sets the {@link Tags.Items#$id $name item                         " >> "RRMoCItemForgeTag$class.java"
echo "     * Forge tag} to the below items:                                               " >> "RRMoCItemForgeTag$class.java"
echo "     * </p>                                                                         " >> "RRMoCItemForgeTag$class.java"
echo "     * <ul>                                                                         " >> "RRMoCItemForgeTag$class.java"
echo "     * <li>Link your items here.</li>                                               " >> "RRMoCItemForgeTag$class.java"
echo "     * </ul>                                                                        " >> "RRMoCItemForgeTag$class.java"
echo "     */                                                                             " >> "RRMoCItemForgeTag$class.java"
echo "    @Override                                                                       " >> "RRMoCItemForgeTag$class.java"
echo "    protected void setItemsToTag()                                                  " >> "RRMoCItemForgeTag$class.java"
echo "    {                                                                               " >> "RRMoCItemForgeTag$class.java"
echo "        // Add here your items to this tag.                                         " >> "RRMoCItemForgeTag$class.java"
echo "        // Use ITEMS.add(item);                                                     " >> "RRMoCItemForgeTag$class.java"
echo "    }                                                                               " >> "RRMoCItemForgeTag$class.java"
echo "}                                                                                   " >> "RRMoCItemForgeTag$class.java"

# Add the Item Tag in Git.
git add RRMoCItemForgeTag$class.java


# Final message.
echo
echo "Created Item Forge Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""