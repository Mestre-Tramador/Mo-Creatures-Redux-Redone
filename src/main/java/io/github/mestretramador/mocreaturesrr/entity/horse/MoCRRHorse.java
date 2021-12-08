package io.github.mestretramador.mocreaturesrr.entity.horse;

import io.github.mestretramador.mocreaturesrr.entity.MoCRRMobCategory;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRSpawnableMob;
import io.github.mestretramador.mocreaturesrr.init.MoCRREntities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

/**
 * The <b>Horses</b> are one of the most abundant creature
 * in the world. They run on the massive plain fields and are
 * constantly searched for their natural capabilities.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRRHorse extends MoCRRTamableHorse implements MoCRRSpawnableMob
{
    /**
     * The <b>Horse</b> is a {@link MoCRRMobCategory#NATURAL natural}
     * creature that requires the base parameters to be instantiated.
     *
     * @param parent The parent Entity to link on the class chain.
     * @param level  The current level to spawn.
     */
    public MoCRRHorse(EntityType<MoCRRHorse> type, Level level)
    {
        super(type, level, MoCRRMobCategory.NATURAL);
    }

    /**
     * Make the Spawn Egg for the Horse.
     *
     * @return The Spawn Egg Item.
     */
    public static final MoCRRSpawnEggItem egg()
    {
        return new MoCRRSpawnEggItem(MoCRREntities.HORSE, 0xC09E7D, 0xEEE500);
    }

    /**
     * A Horse has attributes matching its characteristics.
     *
     * @return A set of attributes, including
     *         {@link Attributes#MAX_HEALTH Maximum Health} and
     *         {@link Attributes#MOVEMENT_SPEED Movement Speed}.
     */
    public static final AttributeSupplier.Builder createAttributes()
    {
        return Mob
        .createMobAttributes()
        .add(Attributes.MAX_HEALTH, 23.0D)
        .add(Attributes.MOVEMENT_SPEED, 0.225D);
    }

    /**
     * When breeding, the determining baby may depend on the
     * genetics of its parents.
     *
     * @param level The level where the breeding occurred.
     * @param parent The parent mob which shall reproduce.
     * @return The infant Horse.
     */
    @Override
    public MoCRRHorse getBreedOffspring(ServerLevel level, AgeableMob parent)
    {
        return MoCRREntities.HORSE.get().create(level);
    }

    /**
     * A Horse has behaviors as the same as its
     * {@link MoCRRTamableHorse#registerGoals() parent class}.
     */
    @Override
    protected void registerGoals()
    {
        super.registerGoals();
    }
}