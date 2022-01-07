//#region License
/**
 *  Mo'Creatures Redux&Redone is an attempt to restore the original
 *  DrZharks' Mo'Creatures with redesign ideas.
 *  Copyright (C) 2022 Mestre Tramador
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
//#endregion

package io.github.mestretramador.mocreaturesrr.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
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
public abstract class MoCRRAnimal extends Animal implements MoCRRCategorizableMob
{
    //#region Properties
    /**
     * The Animal's {@link MoCRRAnimal#category category}
     * is synched by this key.
     */
    private static final EntityDataAccessor<Integer> DATA_CATEGORY = SynchedEntityData.defineId(
        MoCRRAnimal.class,
        EntityDataSerializers.INT
    );

    /**
     * A String to access the {@link MoCRRAnimal#category category}
     * on NBT tags or string-key objects.
     */
    private static final String CATEGORY = "category";

    /** Every Animal has a Category. */
    private MoCRRMobCategory category;
    //#endregion

    //#region Constructor
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

        this.setCategory(category);
    }
    //#endregion

    //#region Synched Data
    /**
     * When defining Synched Data, it runs all base
     * definitions and then define the
     * {@link MoCRRAnimal#DATA_CATEGORY Category's key}.
     */
    @Override
    protected void defineSynchedData()
    {
        super.defineSynchedData();

        this.entityData.define(DATA_CATEGORY, 0);
    }

    /**
     * When adding the additional data, the Category
     * is saved to be restored, as it can be changed
     * before the spawn of the Animal.
     *
     * @param nbt The NBT Compound Tag to save.
     *            It is reused on the parent methods.
     */
    @Override
    public void addAdditionalSaveData(CompoundTag nbt)
    {
        super.addAdditionalSaveData(nbt);

        nbt.putInt(CATEGORY, this.getCategory());
    }

    /**
     * When restoring the additional data, the Category
     * is get, as it may've been changed.
     *
     * @param nbt The NBT Compound Tag to get.
     *            It is reused on the parent methods.
     */
    @Override
    public void readAdditionalSaveData(CompoundTag nbt)
    {
        super.readAdditionalSaveData(nbt);

        if(nbt.contains(CATEGORY))
        {
            this.setCategory(nbt.getInt(CATEGORY));
        }
    }
    //#endregion

    //#region Getters
    /**
     * The Category may be read for rules.
     *
     * @return The respective Category of this Animal.
     */
    public MoCRRMobCategory getAnimalCategory()
    {
        return this.category;
    }

    /**
     * The asserted accessor of the Animal's Category
     * returns a raw {@code int} value.
     *
     * @see MoCRRAnimal#getAnimalCategory() The enumerated method.
     */
    @Override
    public int getCategory()
    {
        return this.entityData.get(DATA_CATEGORY);
    }
    //#endregion

    //#region Setters
    /**
     * If an Animal may become a {@link MoCRRMobCategory#NATURAL natural} one...
     */
    protected final void becomeNatural()
    {
        this.setCategory(MoCRRMobCategory.NATURAL);
    }

    /**
     * If an Animal may become a {@link MoCRRMobCategory#UNNATURAL unnatural} one...
     */
    protected final void becomeUnnatural()
    {
        this.setCategory(MoCRRMobCategory.UNNATURAL);
    }

    /**
     * If an Animal may become a {@link MoCRRMobCategory#MYTHICAL mythical} one...
     */
    protected final void becomeMythical()
    {
        this.setCategory(MoCRRMobCategory.MYTHICAL);
    }

    /**
     * The Category may be changed according to the procedures.
     *
     * @param category The new Category of the Animal.
     * @since 0.0.0.3
     */
    private final void setCategory(MoCRRMobCategory category)
    {
        this.setCategory(category.asInt());
    }

    /**
     * To truly set and synch the Category of the Animal,
     * it must be inserted on the Entity Data and then
     * defined on the instance.
     *
     * @param category The Category indexer value.
     * @since 0.0.0.5
     */
    private final void setCategory(int category)
    {
        this.entityData.set(DATA_CATEGORY, category);

        this.category = MoCRRMobCategory.fromInt(category);
    }
    //#endregion

    //#region Helpers
    /**
     * Determines if a texture of an Animal can vary.
     *
     * @return Naturally it does not vary, so return {@code false}
     *         then the only need to override this method is to
     *         explicit determine a {@code true} return.
     */
    public boolean canVaryTexture()
    {
        return false;
    }
    //#endregion
}