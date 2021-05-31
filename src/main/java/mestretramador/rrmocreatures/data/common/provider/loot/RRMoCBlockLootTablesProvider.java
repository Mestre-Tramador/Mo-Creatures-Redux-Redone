package mestretramador.rrmocreatures.data.common.provider.loot;

import java.util.Map;
import java.util.stream.Collectors;

import mestretramador.rrmocreatures.init.Register;
import mestretramador.rrmocreatures.init.RegisterBlock;

import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootTable;

import net.minecraftforge.fml.RegistryObject;

/**
 * Mo'Creatures Redux&Redone Blocks Loot Tables Provider.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockLootTablesProvider extends BlockLootTables
{
    /**
     * Override the {@link net.minecraft.data.loot.BlockLootTables#addTables parent
     * method} to add only the Mo'Creatures Redux&Redone Block Loot Tables.
     */
    @Override
    protected void addTables()
    {
        this.addDropSelfLootTables();
        this.addWithSilkTouchLootTables();
        this.addOnlyWithShearsLootTables();        
    }

    /**
     * Override the {@link net.minecraft.data.loot.BlockLootTables#getKnowBlocks
     * parent method} to get the Mo'Creatures Redux&Redone Blocks.
     */
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return Register
        .getBlocksDeferredRegister()
        .getEntries()
        .stream()
        .map(RegistryObject::get)
        .collect(Collectors.toList());
    }

    /**
     * <p>
     * This method add the {@code Drop Self} Loot Table to the following Blocks: 
     * </p>
     * <ul>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt Ogre Lair Dirt}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLog Ogre Lair Log}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairPlanks Ogre Lair Planks}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairStone Ogre Lair Stone}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt Wyvern Lair Dirt}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLog Wyvern Lair Log}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks Wyvern Lair Planks}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone Wyvern Lair Stone}</li>
     * </ul>
     */
    private void addDropSelfLootTables()
    {
        final Block[] BLOCKS = new Block[] {
            RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock(),
            RegisterBlock.OGRE_LAIR_LOG.returnAsBlock(),
            RegisterBlock.OGRE_LAIR_PLANKS.returnAsBlock(),
            RegisterBlock.OGRE_LAIR_STONE.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_LOG.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_PLANKS.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_STONE.returnAsBlock()
        };

        for(Block block : BLOCKS)
        {
            this.registerDropSelfLootTable(block);    
        }
    }

    /**
     * <p>
     * This method add the all the Loot Tables {@code With Silk Touch} to the following Blocks: 
     * </p>
     * <ul>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass Ogre Lair Grass}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass Wyvern Lair Grass}</li>
     * </ul>
     */
    private void addWithSilkTouchLootTables()
    {
        final Map<Block, Block> GRASS = Map.ofEntries(
            Map.entry(RegisterBlock.OGRE_LAIR_GRASS.returnAsBlock(), RegisterBlock.OGRE_LAIR_DIRT.returnAsBlock()),  
            Map.entry(RegisterBlock.WYVERN_LAIR_GRASS.returnAsBlock(), RegisterBlock.WYVERN_LAIR_DIRT.returnAsBlock())
        );
        
        GRASS.forEach((block, drop) -> this.registerLootTable(block, (grass) -> dropWithSilkTouch(grass, drop)));
    }

    /**
     * <p>
     * This method add the all the Loot Tables {@code Only With Shears} to the following Blocks: 
     * </p>
     * <ul>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLeaves Ogre Lair Leaves}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockOgreLairTallGrass Ogre Lair Tall Grass}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLeaves Wyvern Lair Leaves}</li>
     * <li>{@link mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass Wyvern Lair Tall Grass}</li>
     * </ul>
     */
    private void addOnlyWithShearsLootTables()
    {
        final Block[] BLOCKS = new Block[] {
            RegisterBlock.OGRE_LAIR_LEAVES.returnAsBlock(),
            RegisterBlock.OGRE_LAIR_TALL_GRASS.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_LEAVES.returnAsBlock(),
            RegisterBlock.WYVERN_LAIR_TALL_GRASS.returnAsBlock()
        };

        for(Block block : BLOCKS)
        {
            this.registerLootTable(block, BlockLootTables::onlyWithShears);
        }
    }    

    /**
     * An function to improve code writting, it just encapsulate the
     * {@link net.minecraft.data.loot.BlockLootTables#droppingWithSilkTouch(Block, net.minecraft.util.IItemProvider)
     * parent function} wich manages the dropping with Silk Touch enchantment.
     * 
     * @param block The primary block, wich is destroyed.
     * @param drop  The drop, if it hasn't the Silk Touch enchantment.
     * @return The parent function.
     */
    private LootTable.Builder dropWithSilkTouch(Block block, Block drop)
    {
        return droppingWithSilkTouch(block, drop);
    }
}
