package mestretramador.rrmocreatures.block;

import net.minecraft.block.Block;

/**
 * Mo'Creatures Redux&Redone {@link net.minecraft.block.Block Block} base.
 * 
 * @version 0.0.10
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCBlock
{
    /** The Block ID. */
    public String ID;

    /** The Block and BlockItem provider. */
    protected Object provider;

    /** The {@link net.minecraft.block.Block Block} as is. */
    private Block rrmocBlock;

    /**
     * To create a Mo'Creatures Redux&Redone Block, there is needed to pass and ID
     * and a data provider.
     * 
     * @param ID       Block ID for registration on Constants.
     * @param provider An object of a inherited Provider class.
     */
    protected RRMoCBlock(String ID, Object provider)
    {
        this.ID = ID;
        this.provider = provider;

        createBlock();
    }

    /**
     * Get helper for the current Block.
     * 
     * @return The {@link net.minecraft.block.Block Block} itself.
     */
    protected Block getBlock()
    {
        return this.rrmocBlock;
    }

    /**
     * Set helper for the current Block.
     * 
     * @param block A created {@link net.minecraft.block.Block Block}.
     */
    protected void setBlock(Block block)
    {
        this.rrmocBlock = block;
    }

    /**
     * With the created Block and the helper functions, do final adjusts to finally
     * return the Block.
     * 
     * @return The actual Block.
     */
    protected abstract Block returnAsBlock();

    /**
     * Create a Block with the helper functions.
     */
    protected abstract void createBlock();
}
