####################################################################
# This shell script file creates both Block and Provider classes.
# It does not create a Constant for the Block ID.
# Neither a lang file entry.
#
# Please be gentle with this code.
####################################################################

# Gloval variables.
version="0.0.24"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
blockdir="..\..\block"
providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\block"


# Collect the block new name.
set +v
echo "What will be the Block class name?"
echo "The Block class name must be in Pascal Case eg. \"NewBlockClass\"."
read -p "Block: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the block ID constant.
echo
echo "What is the Block ID constant?"
echo "The Block ID constant must be in Upper case and Underscores eg. \"NEW_BLOCK\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block base Material.
echo
echo "What is the Block base Material?"
echo "The Block base Material must be in Upper case and Underscores, also exists in Minecraft eg. \"ROCK\"."
read -p "Material: " material
if [ -z "$material" ]
then
    exit
fi

# Collect the block name.
echo
echo "What is the Block name?"
echo "The Block name is generally the same as the class name but with spaces eg. \"New Block\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Provider directory.
cd "$providerdir"

# Create the Provider.
touch "RRMoCBlockProvider$class.java"
chmod 744 "RRMoCBlockProvider$class.java"

echo "package mestretramador.rrmocreatures.provider.block;                               " >> "RRMoCBlockProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockProvider$class.java"
echo "import net.minecraft.block.AbstractBlock;                                          " >> "RRMoCBlockProvider$class.java"
echo "import net.minecraft.block.material.Material;                                      " >> "RRMoCBlockProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockProvider$class.java"
echo "/**                                                                                " >> "RRMoCBlockProvider$class.java"
echo " * Mo'Creatures Redux&Redone $name block provider.                                 " >> "RRMoCBlockProvider$class.java"
echo " *                                                                                 " >> "RRMoCBlockProvider$class.java"
echo " * @version $version                                                               " >> "RRMoCBlockProvider$class.java"
echo " * @author $author                                                                 " >> "RRMoCBlockProvider$class.java"
echo " */                                                                                " >> "RRMoCBlockProvider$class.java"
echo "public class RRMoCBlockProvider$class extends RRMoCBlockProvider                   " >> "RRMoCBlockProvider$class.java"
echo "{                                                                                  " >> "RRMoCBlockProvider$class.java"
echo "    /**                                                                            " >> "RRMoCBlockProvider$class.java"
echo "     * Using the parent constructor, start the $name with a                        " >> "RRMoCBlockProvider$class.java"
echo "     * {@link net.minecraft.block.material.Material#$material $material material}. " >> "RRMoCBlockProvider$class.java"
echo "     */                                                                            " >> "RRMoCBlockProvider$class.java"
echo "    public RRMoCBlockProvider$class()                                              " >> "RRMoCBlockProvider$class.java"
echo "    {                                                                              " >> "RRMoCBlockProvider$class.java"
echo "        super(Material.$material);                                                 " >> "RRMoCBlockProvider$class.java"
echo "    }                                                                              " >> "RRMoCBlockProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockProvider$class.java"
echo "    /**                                                                            " >> "RRMoCBlockProvider$class.java"
echo "     * Return the block properties of                                              " >> "RRMoCBlockProvider$class.java"
echo "     * {@link mestretramador.rrmocreatures.block.RRMoCBlockItem$class              " >> "RRMoCBlockProvider$class.java"
echo "     * $name}.                                                                     " >> "RRMoCBlockProvider$class.java"
echo "     */                                                                            " >> "RRMoCBlockProvider$class.java"
echo "    @Override                                                                      " >> "RRMoCBlockProvider$class.java"
echo "    public AbstractBlock.Properties provideBlockProperties()                       " >> "RRMoCBlockProvider$class.java"
echo "    {                                                                              " >> "RRMoCBlockProvider$class.java"
echo "        // Add here the properties of $name.                                       " >> "RRMoCBlockProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockProvider$class.java"
echo "        return BLOCK_PROPERTIES();                                                 " >> "RRMoCBlockProvider$class.java"
echo "    }                                                                              " >> "RRMoCBlockProvider$class.java"
echo "}                                                                                  " >> "RRMoCBlockProvider$class.java"

# Add the Provider in Git.
git add RRMoCBlockProvider$class.java


# Go to the Blocks directory to create an block class.
cd $blockdir

# Create the Block.
touch "RRMoCBlock$class.java"
chmod 744 "RRMoCBlock$class.java"

echo "package mestretramador.rrmocreatures.block;                                                            " >> "RRMoCBlock$class.java"
echo "                                                                                                       " >> "RRMoCBlock$class.java"
echo "import mestretramador.rrmocreatures.model.block.RRMoCBlockModel;                                       " >> "RRMoCBlock$class.java"
echo "import mestretramador.rrmocreatures.provider.block.RRMoCBlockProvider$class;                           " >> "RRMoCBlock$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                                    " >> "RRMoCBlock$class.java"
echo "                                                                                                       " >> "RRMoCBlock$class.java"
echo "import net.minecraft.block.Block;                                                                      " >> "RRMoCBlock$class.java"
echo "                                                                                                       " >> "RRMoCBlock$class.java"
echo "/**                                                                                                    " >> "RRMoCBlock$class.java"
echo " * Mo'Creatures Redux&Redone $name block.                                                              " >> "RRMoCBlock$class.java"
echo " *                                                                                                     " >> "RRMoCBlock$class.java"
echo " * @version $version                                                                                   " >> "RRMoCBlock$class.java"
echo " * @author $author                                                                                     " >> "RRMoCBlock$class.java"
echo " */                                                                                                    " >> "RRMoCBlock$class.java"
echo "public class RRMoCBlock$class extends RRMoCBlock                                                       " >> "RRMoCBlock$class.java"
echo "{                                                                                                      " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                " >> "RRMoCBlock$class.java"
echo "     * Using the parent constructor, create a $name block.                                             " >> "RRMoCBlock$class.java"
echo "     * Also {@link #createBlock() generates} the block directly.                                       " >> "RRMoCBlock$class.java"
echo "     */                                                                                                " >> "RRMoCBlock$class.java"
echo "    public RRMoCBlock$class()                                                                          " >> "RRMoCBlock$class.java"
echo "    {                                                                                                  " >> "RRMoCBlock$class.java"
echo "        super(Constants.Blocks.$id, new RRMoCBlockProvider$class());                                   " >> "RRMoCBlock$class.java"
echo "    }                                                                                                  " >> "RRMoCBlock$class.java"
echo "                                                                                                       " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                " >> "RRMoCBlock$class.java"
echo "     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                   " >> "RRMoCBlock$class.java"
echo "     * set helper function}, the $name block is created.                                               " >> "RRMoCBlock$class.java"
echo "     */                                                                                                " >> "RRMoCBlock$class.java"
echo "    @Override                                                                                          " >> "RRMoCBlock$class.java"
echo "    protected void createBlock()                                                                       " >> "RRMoCBlock$class.java"
echo "    {                                                                                                  " >> "RRMoCBlock$class.java"
echo "        setBlock(new RRMoCBlockModel(((RRMoCBlockProvider$class) provider).provideBlockProperties())); " >> "RRMoCBlock$class.java"
echo "    }                                                                                                  " >> "RRMoCBlock$class.java"
echo "                                                                                                       " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                " >> "RRMoCBlock$class.java"
echo "     * Return the $name block in its current state.                                                    " >> "RRMoCBlock$class.java"
echo "     */                                                                                                " >> "RRMoCBlock$class.java"
echo "    @Override                                                                                          " >> "RRMoCBlock$class.java"
echo "    public Block returnAsBlock()                                                                       " >> "RRMoCBlock$class.java"
echo "    {                                                                                                  " >> "RRMoCBlock$class.java"
echo "        return getBlock();                                                                             " >> "RRMoCBlock$class.java"
echo "    }                                                                                                  " >> "RRMoCBlock$class.java"
echo "}                                                                                                      " >> "RRMoCBlock$class.java"

# Add the Block in Git.
git add RRMoCBlock$class.java


# Final message.
echo
echo "Created Block and Provider for $name!"
echo "Plase insert it on lang files."
read -s -n 1 -p "Press any key to continue . . ."
echo ""