package mestretramador.rrmocreatures.model.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.tags.ITag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.block.BushBlock BushBlock}.
 * 
 * @version 0.0.24
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBushBlockModel extends BushBlock
{
    /**
     * If this bush have a valid ground tag, then
     * this property hold its value.
     */
    @Nullable
    private ITag.INamedTag<Block> validGround = null;

    /**
     * Using the parent constructor, create naturally a BushBlock.
     * 
     * @param provider The BushBlock Properties provided.
     */
    public RRMoCBushBlockModel(Properties provider)
    {
        super(provider);
    }
    
    /**
     * Using the parent constructor, create naturally a BushBlock.
     * Also set a Tag for the valid ground blocks.
     * 
     * @param provider    The BushBlock Properties provided.
     * @param validGround A Tag with every valid ground block.
     */
    public RRMoCBushBlockModel(Properties provider, ITag.INamedTag<Block> validGround)
    {
        super(provider);

        this.validGround = validGround;
    }

    /**
     * It checks if the {@link #validGround valid ground's tag} have a value and, if it
     * does, the check by it. Else do the parent verification.
     * 
     * @param state   The Block position.
     * @param worldIn The current world.
     * @param pos     The Block position.
     */
    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        if(this.validGround != null)
        {
            return this.validGround.getAllElements().contains(state.getBlock());
        }

        return super.isValidGround(state, worldIn, pos);
    }
}
