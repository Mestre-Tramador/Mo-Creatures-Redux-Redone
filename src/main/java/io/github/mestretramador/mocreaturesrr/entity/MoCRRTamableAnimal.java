package io.github.mestretramador.mocreaturesrr.entity;

import javax.annotation.Nullable;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

/**
 * <p>
 * All MoC R&R Tamable Animal's instead of inheriting
 * Minecraft's base, directly follow the MoC R&R chain.
 * </p>
 * <br />
 * <p>
 * This type of Animal can be owned by a Player, this through
 * a specific method
 * </p>
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public abstract class MoCRRTamableAnimal extends MoCRRAnimal
{
    /**
     * <p>
     * The Owner of the Animal, which it forms a bound.
     * </p>
     * <br />
     * <p>
     * If ownerless, then its a {@code null} value.
     * </p>
     */
    // TODO: Implement relationship methods.
    @Nullable
    protected Player owner;


    /**
     * In order to create a Tamable Animal, as of any Entity,
     * two parameters are essential. Since the third one,
     * it's MoC R&R stuff.
     *
     * @param parent   The parent Entity to link on the class chain.
     * @param level    The current level to spawn.
     * @param category The MoC R&R tier of the Animal.
     */
    protected MoCRRTamableAnimal(
        EntityType<? extends MoCRRTamableAnimal> type,
        Level level,
        MoCRRMobCategory category
    )
    {
        super(type, level, category);
    }
}