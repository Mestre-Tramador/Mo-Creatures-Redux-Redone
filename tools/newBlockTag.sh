###############################################################
# This shell script file creates a Block Tag Generator class.
# It does not create a Constant for the Tag.
# Neither add it in the Tag Generation class.
#
# Please be gentle with this code.
###############################################################

# Gloval variables.
version="0.0.23"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
tagdir="../src/main/java/mestretramador/rrmocreatures/data/client/tags/block"


# Collect the block tag new name.
set +v
echo "What will be the Block Tag class name?"
echo "The Block Tag class name must be in Pascal Case eg. \"NewBlockTagClass\"."
read -p "Tag: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the tag constant.
echo
echo "What is the Block Tag?"
echo "The Block Tag constant must be in Upper case and Underscores eg. \"BLOCK_TAG\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block tag name.
echo
echo "What is the Block Tag name?"
echo "The Block Tag name is generally the same as the class name but with spaces eg. \"Block Tag\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Block Tag directory.
cd "$tagdir"

# Create the Block Tag.
touch "RRMoCBlockTag$class.java"
chmod 744 "RRMoCBlockTag$class.java"

echo "package mestretramador.rrmocreatures.data.client.tags.block;                          " >> "RRMoCBlockTag$class.java"
echo "                                                                                      " >> "RRMoCBlockTag$class.java"
echo "import mestretramador.rrmocreatures.data.client.provider.block.RRMoCBlockTagProvider; " >> "RRMoCBlockTag$class.java"
echo "import mestretramador.rrmocreatures.init.RegisterBlock;                               " >> "RRMoCBlockTag$class.java"
echo "import mestretramador.rrmocreatures.util.Tags;                                        " >> "RRMoCBlockTag$class.java"
echo "                                                                                      " >> "RRMoCBlockTag$class.java"
echo "/**                                                                                   " >> "RRMoCBlockTag$class.java"
echo " * Mo'Creatures Redux&Redone $name Tag's Blocks.                                      " >> "RRMoCBlockTag$class.java"
echo " *                                                                                    " >> "RRMoCBlockTag$class.java"
echo " * @version $version                                                                  " >> "RRMoCBlockTag$class.java"
echo " * @author $author                                                                    " >> "RRMoCBlockTag$class.java"
echo " */                                                                                   " >> "RRMoCBlockTag$class.java"
echo "public class RRMoCBlockTag$class extends RRMoCBlockTagProvider                        " >> "RRMoCBlockTag$class.java"
echo "{                                                                                     " >> "RRMoCBlockTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockTag$class.java"
echo "     * Using the parent constructor, creates the $name tag.                           " >> "RRMoCBlockTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockTag$class.java"
echo "    public RRMoCBlockTag$class()                                                      " >> "RRMoCBlockTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockTag$class.java"
echo "        super(Tags.Block.$id);                                                        " >> "RRMoCBlockTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockTag$class.java"
echo "                                                                                      " >> "RRMoCBlockTag$class.java"
echo "    /**                                                                               " >> "RRMoCBlockTag$class.java"
echo "     * <p>                                                                            " >> "RRMoCBlockTag$class.java"
echo "     * The setter sets the {@link Tags.Blocks#$id $name block                         " >> "RRMoCBlockTag$class.java"
echo "     * tag} to the below blocks:                                                      " >> "RRMoCBlockTag$class.java"
echo "     * </p>                                                                           " >> "RRMoCBlockTag$class.java"
echo "     * <ul>                                                                           " >> "RRMoCBlockTag$class.java"
echo "     * <li>Link your blocks here.</li>                                                " >> "RRMoCBlockTag$class.java"
echo "     * </ul>                                                                          " >> "RRMoCBlockTag$class.java"
echo "     */                                                                               " >> "RRMoCBlockTag$class.java"
echo "    @Override                                                                         " >> "RRMoCBlockTag$class.java"
echo "    protected void setBlocksToTag()                                                   " >> "RRMoCBlockTag$class.java"
echo "    {                                                                                 " >> "RRMoCBlockTag$class.java"
echo "        // Add here your blocks to this tag.                                          " >> "RRMoCBlockTag$class.java"
echo "        // Use BLOCKS.add(block);                                                     " >> "RRMoCBlockTag$class.java"
echo "    }                                                                                 " >> "RRMoCBlockTag$class.java"
echo "}                                                                                     " >> "RRMoCBlockTag$class.java"

# Add the Block Tag in Git.
git add RRMoCBlockTag$class.java


# Final message.
echo
echo "Created Block Tag for $name!"
echo "Plase insert it on and run Tag Generation."
read -s -n 1 -p "Press any key to continue . . ."
echo ""