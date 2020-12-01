package mestretramador.rrmocreatures.provider.item;

import java.util.ArrayList;

import com.google.common.base.Supplier;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

/**
 * Mo'Creatures Redux&Redone Item Food Provider base.
 * 
 * @version 0.0.26
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public interface RRMoCItemFoodProvider
{
    /**
     * Provide the Food Properties for its creation.
     * 
     * @return The Food builded with all dependencies setted.
     */
    public Food provideFoodProperties();

    /**
     * Give the effect to <b>Candy</b> foods types.
     * 
     * @return A Supplier with the {@link net.minecraft.potion.Effects#SPEED Speed}
     *         effect.
     */
    public default Supplier<EffectInstance> provideCandyEffect()
    {
        return () -> new EffectInstance(Effects.SPEED, 100, 1, false, false);
    }

    /**
     * Give the effect to <b>Not Edible</b> foods types.
     * 
     * @return A Supplier with the {@link net.minecraft.potion.Effects#NAUSEA
     *         Nausea} effect.
     */
    public default Supplier<EffectInstance> provideNotEdibleEffect()
    {
        return () -> new EffectInstance(Effects.NAUSEA, 200, 0, false, false);
    }

    /**
     * Give the effect to <b>Raw Meat</b> foods types.
     * 
     * @return A Supplier with the {@link net.minecraft.potion.Effects#HUNGER
     *         Hunger} effect.
     */
    public default Supplier<EffectInstance> provideRawMeatEffect()
    {
        return () -> new EffectInstance(Effects.HUNGER, 600, 0, false, true);
    }

    /**
     * <p>
     * Give a list of effects to <b>Darkness</b> foods types.
     * </p>
     * <p>
     * Used by: {@link mestretramador.rrmocreatures.item.RRMoCItemHeartDarkness
     * Heart of Darkness}
     * </p>
     * 
     * @return A List of Suppliers with the
     *         {@link net.minecraft.potion.Effects#WITHER Wither},
     *         {@link net.minecraft.potion.Effects#BLINDNESS Blindness},
     *         {@link net.minecraft.potion.Effects#STRENGTH Strength} effects.
     */
    public default ArrayList<Supplier<EffectInstance>> provideEffectsOfDarkness()
    {
        final ArrayList<Supplier<EffectInstance>> effects = new ArrayList<Supplier<EffectInstance>>();

        effects.add(() -> new EffectInstance(Effects.WITHER, 400, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.BLINDNESS, 400, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.STRENGTH, 600, 0, false, false));

        return effects;
    }

    /**
     * <p>
     * Give a list of effects to <b>Fire</b> foods types.
     * </p>
     * <p>
     * Used by: {@link mestretramador.rrmocreatures.item.RRMoCItemHeartFire Heart of
     * Fire}
     * </p>
     * 
     * @return A List of Suppliers with the
     *         {@link net.minecraft.potion.Effects#MINING_FATIGUE Fatigue} and
     *         {@link net.minecraft.potion.Effects#SPEED Speed} effects.
     */
    public default ArrayList<Supplier<EffectInstance>> provideEffectsOfFire()
    {
        final ArrayList<Supplier<EffectInstance>> effects = new ArrayList<Supplier<EffectInstance>>();

        effects.add(() -> new EffectInstance(Effects.MINING_FATIGUE, 400, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.SPEED, 600, 0, false, false));

        return effects;
    }

    /**
     * <p>
     * Give a list of effects to <b>Light</b> foods types.
     * </p>
     * <p>
     * Used by: {@link mestretramador.rrmocreatures.item.RRMoCItemUnicornHorn
     * Unicorn Horn}
     * </p>
     * 
     * @return A List of Suppliers with the
     *         {@link net.minecraft.potion.Effects#SATURATION Saturation},
     *         {@link net.minecraft.potion.Effects#SLOW_FALLING Slow Falling},
     *         {@link net.minecraft.potion.Effects#LUCK Luck} effects.
     */
    public default ArrayList<Supplier<EffectInstance>> provideEffectsOfLight()
    {
        final ArrayList<Supplier<EffectInstance>> effects = new ArrayList<Supplier<EffectInstance>>();

        effects.add(() -> new EffectInstance(Effects.SATURATION, 200, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.SLOW_FALLING, 200, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.LUCK, 200, 0, false, true));

        return effects;
    }

    /**
     * <p>
     * Give a list of effects to <b>Undead</b> foods types.
     * </p>
     * <p>
     * Used by: {@link mestretramador.rrmocreatures.item.RRMoCItemHeartUndead Heart
     * of the Undead}
     * </p>
     * 
     * @return A List of Suppliers with the
     *         {@link net.minecraft.potion.Effects#POISON Poison},
     *         {@link net.minecraft.potion.Effects#HUNGER Hunger},
     *         {@link net.minecraft.potion.Effects#RESISTANCE Resistance} effects.
     */
    public default ArrayList<Supplier<EffectInstance>> provideEffectsOfTheUndead()
    {
        final ArrayList<Supplier<EffectInstance>> effects = new ArrayList<Supplier<EffectInstance>>();

        effects.add(() -> new EffectInstance(Effects.POISON, 400, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.HUNGER, 400, 0, false, true));
        effects.add(() -> new EffectInstance(Effects.RESISTANCE, 600, 0, false, false));

        return effects;
    }
}
