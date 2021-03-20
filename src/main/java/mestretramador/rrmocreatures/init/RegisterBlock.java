package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairDirt;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairGrass;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLeaves;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairLog;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairPlanks;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairStone;
import mestretramador.rrmocreatures.block.RRMoCBlockOgreLairTallGrass;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairDirt;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairGrass;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLeaves;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairLog;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairPlanks;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone;
import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairTallGrass;

/**
 * Blocks to registrate.
 * 
 * @version 0.028
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RegisterBlock
{
    /** Ogre Lair Dirt Block and BlockItem. */
    public static final RRMoCBlockOgreLairDirt OGRE_LAIR_DIRT = new RRMoCBlockOgreLairDirt();

    /** Ogre Lair Grass Block and BlockItem. */
    public static final RRMoCBlockOgreLairGrass OGRE_LAIR_GRASS = new RRMoCBlockOgreLairGrass();

    /** Ogre Lair Leaves Block and BlockItem. */
    public static final RRMoCBlockOgreLairLeaves OGRE_LAIR_LEAVES = new RRMoCBlockOgreLairLeaves();

    /** Ogre Lair Log Block and BlockItem. */
    public static final RRMoCBlockOgreLairLog OGRE_LAIR_LOG = new RRMoCBlockOgreLairLog();

    /** Ogre Lair Planks Block and BlockItem. */
    public static final RRMoCBlockOgreLairPlanks OGRE_LAIR_PLANKS = new RRMoCBlockOgreLairPlanks();

    /** Ogre Lair Stone Block and BlockItem. */
    public static final RRMoCBlockOgreLairStone OGRE_LAIR_STONE = new RRMoCBlockOgreLairStone();

    /** Ogre Lair Tall Grass Block and BlockItem. */
    public static final RRMoCBlockOgreLairTallGrass OGRE_LAIR_TALL_GRASS = new RRMoCBlockOgreLairTallGrass();

    /** Wyvern Lair Dirt Block and BlockItem. */
    public static final RRMoCBlockWyvernLairDirt WYVERN_LAIR_DIRT = new RRMoCBlockWyvernLairDirt();

    /** Wyvern Lair Grass Block and BlockItem. */
    public static final RRMoCBlockWyvernLairGrass WYVERN_LAIR_GRASS = new RRMoCBlockWyvernLairGrass();

    /** Wyvern Lair Leaves Block and BlockItem. */
    public static final RRMoCBlockWyvernLairLeaves WYVERN_LAIR_LEAVES = new RRMoCBlockWyvernLairLeaves();

    /** Wyvern Lair Log Block and BlockItem. */
    public static final RRMoCBlockWyvernLairLog WYVERN_LAIR_LOG = new RRMoCBlockWyvernLairLog();

    /** Wyvern Lair Planks Block and BlockItem. */
    public static final RRMoCBlockWyvernLairPlanks WYVERN_LAIR_PLANKS = new RRMoCBlockWyvernLairPlanks();

    /** Wyvern Lair Stone Block and BlockItem. */
    public static final RRMoCBlockWyvernLairStone WYVERN_LAIR_STONE = new RRMoCBlockWyvernLairStone();

    /** Wyvern Lair Tall Grass Block and BlockItem. */
    public static final RRMoCBlockWyvernLairTallGrass WYVERN_LAIR_TALL_GRASS = new RRMoCBlockWyvernLairTallGrass();

    /**
     * Callback to register all blocks and blockitems.
     */
    public static void registerAll()
    {
        registerAllBlocks();
        registerAllBlocksItems();
    }

    /**
     * Callback to register all blocks.
     */
    private static void registerAllBlocks()
    {
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_DIRT.ID, () -> OGRE_LAIR_DIRT.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_GRASS.ID, () -> OGRE_LAIR_GRASS.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_LEAVES.ID, () -> OGRE_LAIR_LEAVES.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_LOG.ID, () -> OGRE_LAIR_LOG.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_PLANKS.ID, () -> OGRE_LAIR_PLANKS.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_STONE.ID, () -> OGRE_LAIR_STONE.returnAsBlock());
        Register.getBlocksDeferredRegister().register(OGRE_LAIR_TALL_GRASS.ID, () -> OGRE_LAIR_TALL_GRASS.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_DIRT.ID, () -> WYVERN_LAIR_DIRT.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_GRASS.ID, () -> WYVERN_LAIR_GRASS.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_LEAVES.ID, () -> WYVERN_LAIR_LEAVES.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_LOG.ID, () -> WYVERN_LAIR_LOG.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_PLANKS.ID, () -> WYVERN_LAIR_PLANKS.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_STONE.ID, () -> WYVERN_LAIR_STONE.returnAsBlock());
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_TALL_GRASS.ID, () -> WYVERN_LAIR_TALL_GRASS.returnAsBlock());
    }

    /**
     * Callback to register all blockitems.
     */
    private static void registerAllBlocksItems()
    {
        Register.getItemsDeferredRegister().register(OGRE_LAIR_DIRT.ID, () -> OGRE_LAIR_DIRT.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_GRASS.ID, () -> OGRE_LAIR_GRASS.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_LEAVES.ID, () -> OGRE_LAIR_LEAVES.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_LOG.ID, () -> OGRE_LAIR_LOG.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_PLANKS.ID, () -> OGRE_LAIR_PLANKS.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_STONE.ID, () -> OGRE_LAIR_STONE.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(OGRE_LAIR_TALL_GRASS.ID, () -> OGRE_LAIR_TALL_GRASS.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_DIRT.ID, () -> WYVERN_LAIR_DIRT.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_GRASS.ID, () -> WYVERN_LAIR_GRASS.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_LEAVES.ID, () -> WYVERN_LAIR_LEAVES.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_LOG.ID, () -> WYVERN_LAIR_LOG.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_PLANKS.ID, () -> WYVERN_LAIR_PLANKS.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_STONE.ID, () -> WYVERN_LAIR_STONE.returnAsBlockItem());
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_TALL_GRASS.ID, () -> WYVERN_LAIR_TALL_GRASS.returnAsBlockItem());
    }
}
