package io.github.mestretramador.mocreaturesrr.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

/**
 * All MoC R&R Animal's starts with Minecraft's
 * base {@link Animal class}, but as so implement
 * new features for the mod.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public abstract class MoCRRAnimal extends Animal
{
    /** Every Animal has a Category. */
    protected final MoCRRMobCategory category;

    /**
     * In order to create an Animal, as of any Entity,
     * two parameters are essential. Since the third one,
     * it's MoC R&R stuff.
     *
     * @param parent   The parent Entity to link on the class chain.
     * @param level    The current level to spawn.
     * @param category The MoC R&R tier of the Animal.
     */
    protected MoCRRAnimal(
        EntityType<? extends MoCRRAnimal> parent,
        Level level,
        MoCRRMobCategory category
    )
    {
        super(parent, level);

        this.category = category;
    }

    /**
     * The Category may be redden for rules.
     *
     * @return The respective Category of this Animal.
     */
    public MoCRRMobCategory getCategory()
    {
        return this.category;
    }
}