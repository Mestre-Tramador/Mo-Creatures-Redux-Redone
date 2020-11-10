#####################################################################
# This shell script file creates both Item and Provider classes.
# It does not create a Constant for the Item ID.
# Neither a lang file entry.
#
# Please be gentle with this code.
#####################################################################

# Gloval variables.
version="0.0.14"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
itemdir="../../item"
providerdir="../src/main/java/mestretramador/rrmocreatures/provider/item"


# Collect the item new name.
set +v
echo "What will be the Item class name?"
echo "The Item class name must be in Pascal Case eg. \"NewItemClass\"."
read -p "Item: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the item ID constant.
echo
echo "What is the Item ID constant?"
echo "The Item ID constant must be in Upper case and Underscores eg. \"NEW_ITEM\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the item name.
echo
echo "What is the Item name?"
echo "The Item name is generally the same as the class name but with spaces eg. \"New Item\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Provider directory.
cd "$providerdir"

# Create the Provider.
touch "RRMoCItemProvider$class.java"
chmod 744 "RRMoCItemProvider$class.java"

echo "package mestretramador.rrmocreatures.provider.item;            " >> "RRMoCItemProvider$class.java"
echo "                                                               " >> "RRMoCItemProvider$class.java"
echo "import net.minecraft.item.Item.Properties;                     " >> "RRMoCItemProvider$class.java"
echo "                                                               " >> "RRMoCItemProvider$class.java"
echo "/**                                                            " >> "RRMoCItemProvider$class.java"
echo " * Mo'Creatures Redux&Redone $name item provider.              " >> "RRMoCItemProvider$class.java"
echo " *                                                             " >> "RRMoCItemProvider$class.java"
echo " * @version $version                                           " >> "RRMoCItemProvider$class.java"
echo " * @author $author                                             " >> "RRMoCItemProvider$class.java"
echo " */                                                            " >> "RRMoCItemProvider$class.java"
echo "public class RRMoCItemProvider$class extends RRMoCItemProvider " >> "RRMoCItemProvider$class.java"
echo "{                                                              " >> "RRMoCItemProvider$class.java"
echo "   /**                                                         " >> "RRMoCItemProvider$class.java"
echo "    * Return the properties of                                 " >> "RRMoCItemProvider$class.java"
echo "    * {@link mestretramador.rrmocreatures.item.RRMoCItem$class " >> "RRMoCItemProvider$class.java"
echo "    * $name}.                                                  " >> "RRMoCItemProvider$class.java"
echo "    */                                                         " >> "RRMoCItemProvider$class.java"
echo "   @Override                                                   " >> "RRMoCItemProvider$class.java"
echo "   public Properties provideProperties()                       " >> "RRMoCItemProvider$class.java"
echo "   {                                                           " >> "RRMoCItemProvider$class.java"
echo "       // Add here the properties of $name.                    " >> "RRMoCItemProvider$class.java"
echo "                                                               " >> "RRMoCItemProvider$class.java"
echo "       return PROPERTIES();                                      " >> "RRMoCItemProvider$class.java"
echo "   }                                                           " >> "RRMoCItemProvider$class.java"
echo "}                                                              " >> "RRMoCItemProvider$class.java"

# Add the Provider in Git.
git add RRMoCItemProvider$class.java


# Go to the Items directory to create an item class.
cd "$itemdir"

# Create the Item.
touch "RRMoCItem$class.java"
chmod 744 "RRMoCItem$class.java"

echo "package mestretramador.rrmocreatures.item;                                          " >> "RRMoCItem$class.java"
echo "                                                                                    " >> "RRMoCItem$class.java"
echo "import mestretramador.rrmocreatures.provider.item.RRMoCItemProvider$class;          " >> "RRMoCItem$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                 " >> "RRMoCItem$class.java"
echo "                                                                                    " >> "RRMoCItem$class.java"
echo "import net.minecraft.item.Item;                                                     " >> "RRMoCItem$class.java"
echo "                                                                                    " >> "RRMoCItem$class.java"
echo "/**                                                                                 " >> "RRMoCItem$class.java"
echo " * Mo'Creatures Redux&Redone $name item.                                            " >> "RRMoCItem$class.java"
echo " *                                                                                  " >> "RRMoCItem$class.java"
echo " * @version $version                                                                " >> "RRMoCItem$class.java"
echo " * @author $author                                                                  " >> "RRMoCItem$class.java"
echo " */                                                                                 " >> "RRMoCItem$class.java"
echo "public class RRMoCItem$class extends RRMoCItem                                      " >> "RRMoCItem$class.java"
echo "{                                                                                   " >> "RRMoCItem$class.java"
echo "   /**                                                                              " >> "RRMoCItem$class.java"
echo "    * Using the parent base constructor, create a $name.                            " >> "RRMoCItem$class.java"
echo "    */                                                                              " >> "RRMoCItem$class.java"
echo "   public RRMoCItem$class()                                                         " >> "RRMoCItem$class.java"
echo "   {                                                                                " >> "RRMoCItem$class.java"
echo "       super(Constants.Items.$id, new RRMoCItemProvider$class());                   " >> "RRMoCItem$class.java"
echo "   }                                                                                " >> "RRMoCItem$class.java"
echo "                                                                                    " >> "RRMoCItem$class.java"
echo "   /**                                                                              " >> "RRMoCItem$class.java"
echo "    * Return a $name item in its current state.                                     " >> "RRMoCItem$class.java"
echo "    */                                                                              " >> "RRMoCItem$class.java"
echo "   @Override                                                                        " >> "RRMoCItem$class.java"
echo "   public Item returnAsItem()                                                       " >> "RRMoCItem$class.java"
echo "   {                                                                                " >> "RRMoCItem$class.java"
echo "       return getItem();                                                            " >> "RRMoCItem$class.java"
echo "   }                                                                                " >> "RRMoCItem$class.java"
echo "                                                                                    " >> "RRMoCItem$class.java"
echo "   /**                                                                              " >> "RRMoCItem$class.java"
echo "    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set " >> "RRMoCItem$class.java"
echo "    * helper function}, the $name is created.                                       " >> "RRMoCItem$class.java"
echo "    */                                                                              " >> "RRMoCItem$class.java"
echo "   @Override                                                                        " >> "RRMoCItem$class.java"
echo "   protected void createItem()                                                      " >> "RRMoCItem$class.java"
echo "   {                                                                                " >> "RRMoCItem$class.java"
echo "       setItem(new Item(((RRMoCItemProvider$class) provider).provideProperties())); " >> "RRMoCItem$class.java"
echo "   }                                                                                " >> "RRMoCItem$class.java"
echo "}                                                                                   " >> "RRMoCItem$class.java"

# Add the Item in Git.
git add RRMoCItem$class.java


# Final message.
echo
echo "Created Item and Provider for $name!"
echo "Plase insert it on lang files."
read -s -n 1 -p "Press any key to continue . . ."
echo ""