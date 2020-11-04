package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.block.RRMoCBlockWyvernLairStone;

/**
 * Blocks to registrate.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RegisterBlock
{
    /** Wyvern Lair Stone Block and BlockItem. */
    public static final RRMoCBlockWyvernLairStone WYVERN_LAIR_STONE = new RRMoCBlockWyvernLairStone();

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
        Register.getBlocksDeferredRegister().register(WYVERN_LAIR_STONE.ID, () -> WYVERN_LAIR_STONE.returnAsBlock());
    }

    /**
     * Callback to register all blockitems.
     */
    private static void registerAllBlocksItems()
    {
        Register.getItemsDeferredRegister().register(WYVERN_LAIR_STONE.ID, () -> WYVERN_LAIR_STONE.returnAsBlockItem());
    }
}
