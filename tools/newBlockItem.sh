#########################################################################
# This schell script file creates both BlockItem and Provider classes.
# It does not create a Constant for the Block ID.
# Neither a lang file entry.
#
# Please be gentle with this code.
#########################################################################

# Gloval variables.
version="0.0.10"
author="Eduardo de Oliveira Rosa, Mestre Tramador."


# Get all the directories to save the files.
blockdir="..\..\block"
providerdir="..\src\main\java\mestretramador\rrmocreatures\provider\block"


# Collect the block item new name.
set +v
echo "What will be the BlockItem class name?"
echo "The BlockItem class name must be in Pascal Case eg. \"NewBlockItemClass\"."
read -p "Block: " class
if [ -z "$class" ]
then
    exit
fi

# Collect the block item ID constant.
echo
echo "What is the BlockItem ID constant?"
echo "The BlockItem ID constant must be in Upper case and Underscores eg. \"NEW_BLOCK_ITEM\"."
read -p "ID: " id
if [ -z "$id" ]
then
    exit
fi

# Collect the block item base Material.
echo
echo "What is the BlockItem base Material?"
echo "The BlockItem base Material must be in Upper case and Underscores, also exists in Minecraft eg. \"ROCK\"."
read -p "Material: " material
if [ -z "$material" ]
then
    exit
fi

# Collect the block item name.
echo
echo "What is the BlockItem name?"
echo "The BlockItem name is generally the same as the class name but with spaces eg. \"New Block Item\"."
read -p "Name: " name
if [ -z "$name" ]
then
    exit
fi


# Go to the Provider directory.
cd "$providerdir"

# Create the Provider.
touch "RRMoCBlockItemProvider$class.java"
chmod 744 "RRMoCBlockItemProvider$class.java"

echo "package mestretramador.rrmocreatures.provider.block;                               " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "import net.minecraft.block.AbstractBlock;                                          " >> "RRMoCBlockItemProvider$class.java"
echo "import net.minecraft.block.material.Material;                                      " >> "RRMoCBlockItemProvider$class.java"
echo "import net.minecraft.item.Item;                                                    " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "/**                                                                                " >> "RRMoCBlockItemProvider$class.java"
echo " * Mo'Creatures Redux&Redone $name block item provider.                            " >> "RRMoCBlockItemProvider$class.java"
echo " *                                                                                 " >> "RRMoCBlockItemProvider$class.java"
echo " * @version $version                                                               " >> "RRMoCBlockItemProvider$class.java"
echo " * @author $author                                                                 " >> "RRMoCBlockItemProvider$class.java"
echo " */                                                                                " >> "RRMoCBlockItemProvider$class.java"
echo "public class RRMoCBlockItemProvider$class extends RRMoCBlockItemProvider           " >> "RRMoCBlockItemProvider$class.java"
echo "{                                                                                  " >> "RRMoCBlockItemProvider$class.java"
echo "    /**                                                                            " >> "RRMoCBlockItemProvider$class.java"
echo "     * Using the parent constructor, start the $name with a                        " >> "RRMoCBlockItemProvider$class.java"
echo "     * {@link net.minecraft.block.material.Material#$material $material material}. " >> "RRMoCBlockItemProvider$class.java"
echo "     */                                                                            " >> "RRMoCBlockItemProvider$class.java"
echo "    public RRMoCBlockItemProvider$class()                                          " >> "RRMoCBlockItemProvider$class.java"
echo "    {                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "        super(Material.$material);                                                 " >> "RRMoCBlockItemProvider$class.java"
echo "    }                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "    /**                                                                            " >> "RRMoCBlockItemProvider$class.java"
echo "     * Return the block properties of                                              " >> "RRMoCBlockItemProvider$class.java"
echo "     * {@link mestretramador.rrmocreatures.block.RRMoCBlockItem$class              " >> "RRMoCBlockItemProvider$class.java"
echo "     * $name}.                                                                     " >> "RRMoCBlockItemProvider$class.java"
echo "     */                                                                            " >> "RRMoCBlockItemProvider$class.java"
echo "    @Override                                                                      " >> "RRMoCBlockItemProvider$class.java"
echo "    public AbstractBlock.Properties provideBlockProperties()                       " >> "RRMoCBlockItemProvider$class.java"
echo "    {                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "        // Add here the properties of $name.                                       " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "        return BLOCK_PROPERTIES();                                                 " >> "RRMoCBlockItemProvider$class.java"
echo "    }                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "   /**                                                                             " >> "RRMoCBlockItemProvider$class.java"
echo "    * Return the blockitem properties of                                           " >> "RRMoCBlockItemProvider$class.java"
echo "    * {@link mestretramador.rrmocreatures.block.RRMoCBlockItemW$class              " >> "RRMoCBlockItemProvider$class.java"
echo "    * $name}.                                                                      " >> "RRMoCBlockItemProvider$class.java"
echo "    */                                                                             " >> "RRMoCBlockItemProvider$class.java"
echo "    @Override                                                                      " >> "RRMoCBlockItemProvider$class.java"
echo "    public Item.Properties provideItemProperties()                                 " >> "RRMoCBlockItemProvider$class.java"
echo "    {                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "        // Add here the properties of $name.                                       " >> "RRMoCBlockItemProvider$class.java"
echo "                                                                                   " >> "RRMoCBlockItemProvider$class.java"
echo "        return ITEM_PROPERTIES();                                                  " >> "RRMoCBlockItemProvider$class.java"
echo "    }                                                                              " >> "RRMoCBlockItemProvider$class.java"
echo "}                                                                                  " >> "RRMoCBlockItemProvider$class.java"

# Add the Provider in Git.
git add RRMoCBlockItemProvider$class.java


# Go to the Blocks directory to create an block class.
cd $blockdir

# Create the Block.
touch "RRMoCBlock$class.java"
chmod 744 "RRMoCBlock$class.java"

echo "package mestretramador.rrmocreatures.block;                                                                       " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "import mestretramador.rrmocreatures.provider.block.RRMoCBlockItemProvider$class;                                  " >> "RRMoCBlock$class.java"
echo "import mestretramador.rrmocreatures.util.Constants;                                                               " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "import net.minecraft.block.Block;                                                                                 " >> "RRMoCBlock$class.java"
echo "import net.minecraft.item.BlockItem;                                                                              " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "/**                                                                                                               " >> "RRMoCBlock$class.java"
echo " * Mo'Creatures Redux&Redone $name block and block item.                                                          " >> "RRMoCBlock$class.java"
echo " *                                                                                                                " >> "RRMoCBlock$class.java"
echo " * @version $version                                                                                              " >> "RRMoCBlock$class.java"
echo " * @author $author                                                                                                " >> "RRMoCBlock$class.java"
echo " */                                                                                                               " >> "RRMoCBlock$class.java"
echo "public class RRMoCBlock$class extends RRMoCBlock implements RRMoCBlockItem                                        " >> "RRMoCBlock$class.java"
echo "{                                                                                                                 " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                           " >> "RRMoCBlock$class.java"
echo "     * Using the parent constructor, create a $name block.                                                        " >> "RRMoCBlock$class.java"
echo "     */                                                                                                           " >> "RRMoCBlock$class.java"
echo "    public RRMoCBlock$class()                                                                                     " >> "RRMoCBlock$class.java"
echo "    {                                                                                                             " >> "RRMoCBlock$class.java"
echo "        super(Constants.Blocks.$id, new RRMoCBlockItemProvider$class());                                          " >> "RRMoCBlock$class.java"
echo "    }                                                                                                             " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                           " >> "RRMoCBlock$class.java"
echo "     * With the {@link mestretramador.rrmocreatures.block.RRMoCBlock#setBlock(Block)                              " >> "RRMoCBlock$class.java"
echo "     * set helper function}, the $name block is created.                                                          " >> "RRMoCBlock$class.java"
echo "     */                                                                                                           " >> "RRMoCBlock$class.java"
echo "    @Override                                                                                                     " >> "RRMoCBlock$class.java"
echo "    protected void createBlock()                                                                                  " >> "RRMoCBlock$class.java"
echo "    {                                                                                                             " >> "RRMoCBlock$class.java"
echo "        setBlock(new Block(((RRMoCBlockItemProvider$class) provider).provideBlockProperties()));                  " >> "RRMoCBlock$class.java"
echo "    }                                                                                                             " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                           " >> "RRMoCBlock$class.java"
echo "     * Return the $name block in its current state.                                                               " >> "RRMoCBlock$class.java"
echo "     */                                                                                                           " >> "RRMoCBlock$class.java"
echo "    @Override                                                                                                     " >> "RRMoCBlock$class.java"
echo "    public Block returnAsBlock()                                                                                  " >> "RRMoCBlock$class.java"
echo "    {                                                                                                             " >> "RRMoCBlock$class.java"
echo "        return getBlock();                                                                                        " >> "RRMoCBlock$class.java"
echo "    }                                                                                                             " >> "RRMoCBlock$class.java"
echo "                                                                                                                  " >> "RRMoCBlock$class.java"
echo "    /**                                                                                                           " >> "RRMoCBlock$class.java"
echo "    * With the {@link mestretramador.rrmocreatures.block.RRMoCBlockItem interface},                               " >> "RRMoCBlock$class.java"
echo "    * also can be generated the $name block item.                                                                 " >> "RRMoCBlock$class.java"
echo "    *                                                                                                             " >> "RRMoCBlock$class.java"
echo "    * @return The $name block item with the                                                                       " >> "RRMoCBlock$class.java"
echo "    *         {@link net.minecraft.item.Item.Properties Item Properties} provided                                 " >> "RRMoCBlock$class.java"
echo "    *         by the provider.                                                                                    " >> "RRMoCBlock$class.java"
echo "    */                                                                                                            " >> "RRMoCBlock$class.java"
echo "    @Override                                                                                                     " >> "RRMoCBlock$class.java"
echo "    public BlockItem returnAsBlockItem()                                                                          " >> "RRMoCBlock$class.java"
echo "    {                                                                                                             " >> "RRMoCBlock$class.java"
echo "        return new BlockItem(returnAsBlock(), ((RRMoCBlockItemProvider$class) provider).provideItemProperties()); " >> "RRMoCBlock$class.java"
echo "    }                                                                                                             " >> "RRMoCBlock$class.java"
echo "}                                                                                                                 " >> "RRMoCBlock$class.java"

# Add the Block in Git.
git add RRMoCBlockItem$class.java


# Final message.
echo
echo "Created BlockItem and Provider for $name!"
echo "Plase insert it on lang files."
read -s -n 1 -p "Press any key to continue . . ."
echo ""