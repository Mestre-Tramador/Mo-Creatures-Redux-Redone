package mestretramador.rrmocreatures.model.item;

import mestretramador.rrmocreatures.init.RegisterSoundEvent;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.UseAction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.Item Item} to use
 * to {@link mestretramador.rrmocreatures.item.RRMoCItemWhip Whip}.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemWhipModel extends RRMoCItemModel
{
    /**
     * <p>
     * Using the parent constructor, create naturally a Item.
     * </p>
     * <p>
     * <b>None alteration is made on the Properties.</b>
     * </p>
     * 
     * @param provider The Item Properties provided.
     */
    public RRMoCItemWhipModel(Properties provider)
    {
        super(provider);
    }

    /**
     * Redefines the usage of the Whip to make a "crack".
     * 
     * @param context The context of the use.
     * @return If is possible to crack, than a <i>Succes</i>, otherwise a <i>Fail</i> result.
     */
    @Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        if(isPossibleToCrack(context))
        {
            final World world = context.getWorld();
            final BlockPos position = context.getPos();
            final PlayerEntity player = context.getPlayer();

            whipCrack(world, position, player);

            if(!player.isCreative())
            {
                final Hand hand = context.getHand();
                final ItemStack stack = player.getHeldItem(hand);

                stack.damageItem(1, player, (damage) -> damage.sendBreakAnimation(hand));
            }

            // TODO: Add interaction with entities.

            return ActionResultType.SUCCESS;
        }

        return ActionResultType.FAIL;
    }

    /**
     * Override the action of the Whip usage.
     * 
     * @param stack Used ItemStack.
     * @return A new action (Block).
     */
    @Override
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.BLOCK;
    }

    /**
     * Override the duration of the Whip.
     * 
     * @param stack Used ItemStack.
     * @return The quick duration time (1).
     */
    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 1;
    }
    
    /**
     * Execute all calculations to show a "crack" on a block.
     * 
     * @param world    Current World.
     * @param position Position of the block.
     * @param player   Current Player.
     */
    private void whipCrack(World world, BlockPos position, PlayerEntity player)
    {
        final double x = position.getX() + 0.5D;
        final double y = position.getY() + 1.0D;
        final double z = position.getZ() + 0.5D;
        final double h = 0.2199999988079071D;
        final double w = 0.27000001072883606D;
        final double v = 0.0D;

        world.playSound(player, position, RegisterSoundEvent.WHIP.returnAsSoundEvent(), SoundCategory.NEUTRAL, 1.0F, 1.0F);

        world.addParticle(ParticleTypes.SMOKE, (x - w), (y + h), z, v, v, v);
        world.addParticle(ParticleTypes.FLAME, (x - w), (y + h), z, v, v, v);
        world.addParticle(ParticleTypes.SMOKE, (x + w), (y + h), z, v, v, v);
        world.addParticle(ParticleTypes.FLAME, (x + w), (y + h), z, v, v, v);
        world.addParticle(ParticleTypes.SMOKE, x, (y + h), (z - w), v, v, v);
        world.addParticle(ParticleTypes.FLAME, x, (y + h), (z - w), v, v, v);
        world.addParticle(ParticleTypes.SMOKE, x, (y + h), (z + w), v, v, v);
        world.addParticle(ParticleTypes.FLAME, x, (y + h), (z + w), v, v, v);
        world.addParticle(ParticleTypes.SMOKE, x, y, z, v, v, v);
        world.addParticle(ParticleTypes.FLAME, x, y, z, v, v, v);
    }

    /**
     * Check the direction, the above block, and the state to determine
     * if is possible to crack on the block.
     * 
     * @param context The context of the use.
     * @return <i>True</i> if is possible to crack.
     */
    private boolean isPossibleToCrack(ItemUseContext context)
    {
        final World world = context.getWorld();
        final BlockPos position = context.getPos();
        final Direction face = context.getFace();

        final BlockState state = world.getBlockState(position);
        final IBlockReader reader = world.getBlockReader(position.getX(), position.getZ());
        final Block aboveBlock = world.getBlockState(position.up()).getBlock();

        return ((face == Direction.UP) && (aboveBlock == Blocks.AIR) && state.isSolid() && state.isNormalCube(reader, position));
    }
}
