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
    private MoCRRMobCategory category;

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

    /**
     * If an Animal may become a {@link MoCRRMobCategory#NATURAL natural} one...
     */
    protected void becomeNatural()
    {
        this.setCategory(MoCRRMobCategory.NATURAL);
    }

    /**
     * If an Animal may become a {@link MoCRRMobCategory#UNNATURAL unnatural} one...
     */
    protected void becomeUnnatural()
    {
        this.setCategory(MoCRRMobCategory.UNNATURAL);
    }

    /**
     * If an Animal may become a {@link MoCRRMobCategory#MYTHICAL mythical} one...
     */
    protected void becomeMythical()
    {
        this.setCategory(MoCRRMobCategory.MYTHICAL);
    }

    /**
     * The Category may be changed according to the procedures.
     *
     * @param category The new Category of the Animal.
     * @since 0.0.0.3
     */
    private void setCategory(MoCRRMobCategory category)
    {
        this.category = category;
    }
}