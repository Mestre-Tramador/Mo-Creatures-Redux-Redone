################################################################################
# This shell script file creates creates a BlockItem Tag Copy Generator class.
# It does not create a Constant for the Tags.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
################################################################################

# Gloval variables.
version="0.0.10"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the blockitem tag new name.
set +v
echo "What will be the BlockItem Tag class name?"
echo "The BlockItem Tag class name must be in Pascal Case eg. \"NewBlockItemTagClass\"."
read -p "Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the tag constant.
echo
echo "What is the Block Tag?"
echo "The Block Tag constant must be in Upper case and Underscores eg. \"BLOCK_ITEM_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the parent tag constant.
echo
echo "What is the BlockItem Parent Tag?"
echo "The BlockItem Parent Tag constant must be in Upper case and Underscores eg. \"BLOCK_TAG\"."
read -p "ID: " fid
if [ -z "$fid" ]
then
    exit
fi

# Collect the blockitem tag name.
echo
echo "What is the BlockItem Tag name?"
echo "The BlockItem Tag name is generally the same as the class name but with spaces eg. \"BlockItem Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the BlockItem Tag directory.
cd "$tagdir"

# Create the BlockItem Tag.
touch "RRMoCBlockItemTag$class.java"
chmod 744 "RRMoCBlockItemTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                              " >> "RRMoCBlockItemTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockItemTagProvider; " >> "RRMoCBlockItemTag$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                            " >> "RRMoCBlockItemTag$class.java"
echo "                                                                                          " >> "RRMoCBlockItemTag$class.java"
echo "/**                                                                                       " >> "RRMoCBlockItemTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Tag's BlockItems.                                      " >> "RRMoCBlockItemTag$class.java"
echo " *                                                                                        " >> "RRMoCBlockItemTag$class.java"
echo " * @version $version                                                                      " >> "RRMoCBlockItemTag$class.java"
echo " * @author $author                                                                        " >> "RRMoCBlockItemTag$class.java"
echo " */                                                                                       " >> "RRMoCBlockItemTag$class.java"
echo "public class RRMoCBlockItemTag$class extends RRMoCBlockItemTagProvider                    " >> "RRMoCBlockItemTag$class.java"
echo "{                                                                                         " >> "RRMoCBlockItemTag$class.java"
echo "    /**                                                                                   " >> "RRMoCBlockItemTag$class.java"
echo "     * The setter copies the {@link Tags.Blocks#$fid $name Blocks                         " >> "RRMoCBlockItemTag$class.java"
echo "     * blocks tag} to the                                                                 " >> "RRMoCBlockItemTag$class.java"
echo "     * {@link Tags.Items.BlockItems#$id $name BlockItems                                  " >> "RRMoCBlockItemTag$class.java"
echo "     * blockitems tag}.                                                                   " >> "RRMoCBlockItemTag$class.java"
echo "     */                                                                                   " >> "RRMoCBlockItemTag$class.java"
echo "    @Override                                                                             " >> "RRMoCBlockItemTag$class.java"
echo "    protected void setBlocksToCopy()                                                      " >> "RRMoCBlockItemTag$class.java"
echo "    {                                                                                     " >> "RRMoCBlockItemTag$class.java"
echo "        blocksToCopy.put(Tags.Blocks.$fid, Tags.Items.BlockItems.$id);                    " >> "RRMoCBlockItemTag$class.java"
echo "    }                                                                                     " >> "RRMoCBlockItemTag$class.java"
echo "}                                                                                         " >> "RRMoCBlockItemTag$class.java"

# Add the BlockItem Tag in Git.
git add RRMoCBlockItemTag$class.java


# Final message.
echo
echo "Created BlockItem Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""