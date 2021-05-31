package mestretramador.rrmocreatures.model.item;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.Item Item} to use
 * as an Essence.
 * 
 * @version 0.0.29
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemEssenceModel extends RRMoCItemModel
{
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceDarkness Essence of
     * Darkness}.
     */
    private static final String DARKNESS = "darkness";

    /**
     * Case String to {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceFire
     * Essence of Fire}.
     */
    private static final String FIRE = "fire";

    /**
     * Case String to {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceLight
     * Essence of Light}.
     */
    private static final String LIGHT = "light";

    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemEssenceUndead Essence of
     * the Undead}.
     */
    private static final String UNDEAD = "undead";

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
    public RRMoCItemEssenceModel(Properties provider)
    {
        super(provider);
    }

    /**
     * Redefines the usage of the Essence to be like a potion consumage.
     * 
     * @param world  Current World.
     * @param player The player who had used.
     * @param hand   The hand that started the action.
     * @return An action result of consume.
     */
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
        player.setActiveHand(hand);

        return ActionResult.resultConsume(player.getHeldItem(hand));
    }

    /**
     * Redefines the usage of the Essence to interact with tamed creatures.
     * 
     * @param context The context of the use.
     * @return The parent implementation, wich return a <i>pass</i> action type.
     */
    @Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        switch(getEssenceType())
        {
            case DARKNESS:
                // TODO: Implement when the Essence of Darkness is given to a tamed creature.
            break;

            case FIRE:
                // TODO: Implement when the Essence of Fire is given to a tamed creature.
            break;

            case LIGHT:
                // TODO: Implement when the Essence of Light is given to a tamed creature.
            break;

            case UNDEAD:
                // TODO: Implement when the Essence of the Undead is given to a tamed creature.
            break;
        }

        return super.onItemUse(context);
    }

    /**
     * Redefines the finishing to give the correct effects to the player, also
     * return a glass bottle.
     * 
     * @param stack  Used ItemStack.
     * @param world  Current world
     * @param entity The entity that finished the use.
     * @return The new ItemStack.
     */
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, LivingEntity entity)
    {
        final PlayerEntity player = (PlayerEntity) entity;

        switch(getEssenceType())
        {
            case DARKNESS:
                player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 1800, 1, false, true));
                player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1800, 2, false, true));
            break;

            case FIRE:
                player.addPotionEffect(new EffectInstance(Effects.HASTE, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 1800, 1, false, true));
                player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1800, 2, false, true));
            break;

            case LIGHT:
                player.addPotionEffect(new EffectInstance(Effects.SATURATION, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 1800, 1, false, true));
                player.addPotionEffect(new EffectInstance(Effects.LUCK, 1800, 1, false, true));
                player.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 1800, 2, false, true));
            break;

            case UNDEAD:
                player.addPotionEffect(new EffectInstance(Effects.SATURATION, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 1800, 0, false, true));
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 1800, 1, false, true));
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 1800, 2, false, true));
            break;
        }

        if(!player.isCreative())
        {
            super.onItemUseFinish(stack, world, entity);

            return new ItemStack(Items.GLASS_BOTTLE);
        }

        return super.onItemUseFinish(stack, world, entity);
    }

    /**
     * Override the action of the Essence usage.
     * 
     * @param stack Used ItemStack.
     * @return A new action (Drink).
     */
    @Override
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.DRINK;
    }

    /**
     * Override the duration of the Essence to a default time.
     * 
     * @param stack Used ItemStack.
     * @return The default duration time (32).
     */
    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * Based on the registred names, get the respective type of the used Essence.
     * 
     * @return The types {@link #DARKNESS Darkness}, {@link #FIRE Fire},
     *         {@link #LIGHT Light}, {@link #UNDEAD Undead} or <i>null</i>.
     */
    @Nullable
    private String getEssenceType()
    {
        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.ESSENCE_DARKNESS: return DARKNESS;
            
            case Constants.Items.ESSENCE_FIRE: return FIRE;
            
            case Constants.Items.ESSENCE_LIGHT: return LIGHT;
            
            case Constants.Items.ESSENCE_UNDEAD: return UNDEAD;
            
            default: return null;
        }
    }
}
