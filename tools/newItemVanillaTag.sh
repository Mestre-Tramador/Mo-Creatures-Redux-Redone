######################################################################
# This shell script file creates an Item Vanilla Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
######################################################################

# Gloval variables.
version="0.0.14"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/item"


# Collect the item vanilla tag new name.
set +v
echo "What will be the Item Vanilla Tag class name?"
echo "The Item Vanilla Tag class name must be in Pascal Case eg. \"NewItemVanillaTagClass\"."
read -p "Vanilla Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the vanilla tag constant.
echo
echo "What is the Item Vanilla Tag?"
echo "The Item Vanilla Tag constant must exist in Minecraft, also be in Upper case and Underscores eg. \"ITEM_VANILLA_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the item vanilla tag name.
echo
echo "What is the Item Vanilla Tag name?"
echo "The Item Vanilla Tag name is generally the same as the class name but with spaces eg. \"Item Vanilla Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Item Tag directory.
cd "$tagdir"

# Create the Item Vanilla Tag.
touch "RRMoCItemVanillaTag$class.java"
chmod 744 "RRMoCItemVanillaTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.item;                         " >> "RRMoCItemVanillaTag$class.java"
echo "                                                                                    " >> "RRMoCItemVanillaTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; " >> "RRMoCItemVanillaTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterItem;                              " >> "RRMoCItemVanillaTag$class.java"
echo "                                                                                    " >> "RRMoCItemVanillaTag$class.java"
echo "import net.minecraft.tags.ItemTags;                                                 " >> "RRMoCItemVanillaTag$class.java"
echo "                                                                                    " >> "RRMoCItemVanillaTag$class.java"
echo "/**                                                                                 " >> "RRMoCItemVanillaTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Minecraft Tag's Items.                           " >> "RRMoCItemVanillaTag$class.java"
echo " *                                                                                  " >> "RRMoCItemVanillaTag$class.java"
echo " * @version $version                                                                " >> "RRMoCItemVanillaTag$class.java"
echo " * @author $author                                                                  " >> "RRMoCItemVanillaTag$class.java"
echo " */                                                                                 " >> "RRMoCItemVanillaTag$class.java"
echo "public class RRMoCItemVanillaTag$class extends RRMoCItemTagProvider                 " >> "RRMoCItemVanillaTag$class.java"
echo "{                                                                                   " >> "RRMoCItemVanillaTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemVanillaTag$class.java"
echo "     * Using the parent constructor, adds to $name Minecraft tag.                   " >> "RRMoCItemVanillaTag$class.java"
echo "     */                                                                             " >> "RRMoCItemVanillaTag$class.java"
echo "    public RRMoCItemVanillaTag$class()                                              " >> "RRMoCItemVanillaTag$class.java"
echo "    {                                                                               " >> "RRMoCItemVanillaTag$class.java"
echo "        super(ItemTags.$id);                                                        " >> "RRMoCItemVanillaTag$class.java"
echo "    }                                                                               " >> "RRMoCItemVanillaTag$class.java"
echo "                                                                                    " >> "RRMoCItemVanillaTag$class.java"
echo "    /**                                                                             " >> "RRMoCItemVanillaTag$class.java"
echo "     * <p>                                                                          " >> "RRMoCItemVanillaTag$class.java"
echo "     * The setter sets the {@link ItemTags#$id $name item                           " >> "RRMoCItemVanillaTag$class.java"
echo "     * tag} to the below items:                                                     " >> "RRMoCItemVanillaTag$class.java"
echo "     * </p>                                                                         " >> "RRMoCItemVanillaTag$class.java"
echo "     * <ul>                                                                         " >> "RRMoCItemVanillaTag$class.java"
echo "     * <li>Link your items here.</li>                                               " >> "RRMoCItemVanillaTag$class.java"
echo "     * </ul>                                                                        " >> "RRMoCItemVanillaTag$class.java"
echo "     */                                                                             " >> "RRMoCItemVanillaTag$class.java"
echo "    @Override                                                                       " >> "RRMoCItemVanillaTag$class.java"
echo "    protected void setItemsToTag()                                                  " >> "RRMoCItemVanillaTag$class.java"
echo "    {                                                                               " >> "RRMoCItemVanillaTag$class.java"
echo "        // Add here your items to this tag.                                         " >> "RRMoCItemVanillaTag$class.java"
echo "        // Use ITEMS.add(item);                                                     " >> "RRMoCItemVanillaTag$class.java"
echo "    }                                                                               " >> "RRMoCItemVanillaTag$class.java"
echo "}                                                                                   " >> "RRMoCItemVanillaTag$class.java"

# Add the Item Vanilla Tag in Git.
git add RRMoCItemVanillaTag$class.java


# Final message.
echo
echo "Created Item Vanilla Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""