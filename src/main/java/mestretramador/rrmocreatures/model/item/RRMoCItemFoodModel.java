package mestretramador.rrmocreatures.model.item;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.Item Item} with
 * {@link net.minecraft.item.Food Food} properties or uses.
 * 
 * @version 0.0.22
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemFoodModel extends RRMoCItemModel
{
    /**
     * Using the parent constructor, create naturally a Item.
     * 
     * @param provider The Item (also Food) Properties provided.
     */
    public RRMoCItemFoodModel(Properties provider)
    {
        super(provider);
    }

    /**
     * <p>
     * Redefines the implementation to handle food cases.
     * </p>
     * <p>
     * When a {@link mestretramador.rrmocreatures.item.RRMoCItemTurtleCookedSoup
     * Turtle Soup} is eaten, the bowl is returned.
     * </p>
     * <p>
     * When a {@link mestretramador.rrmocreatures.item.RRMoCItemHeartFire Heart of
     * Fire} is eaten, set the player on fire.
     * </p>
     * 
     * @param stack        Used ItemStack.
     * @param worldIn      Current world
     * @param entityLiving The entity that finished the use.
     * @return The new ItemStack.
     */
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        final String PREFIX = Constants.MOD_ID + ":";

        switch(stack.getItem().getRegistryName().toString())
        {
            // ? When eating a Turtle Soup, the bowl is returned.
            case (PREFIX + Constants.Items.TURTLE_COOKED_SOUP):
                super.onItemUseFinish(stack, worldIn, entityLiving);
            return new ItemStack(Items.BOWL);

            // ? When eating a Heart of Fire, set the player on fire.
            case (PREFIX + Constants.Items.HEART_FIRE):
                entityLiving.setFire(400);
            break;
        }

        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
