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

package io.github.mestretramador.mocreaturesrr.entity.horse;

import java.util.Random;

import javax.annotation.Nullable;

import io.github.mestretramador.mocreaturesrr.entity.MoCRRMobCategory;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRSpawnableMob;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRTierableAnimal;
import io.github.mestretramador.mocreaturesrr.init.MoCRREntities;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

/**
 * The <b>Horses</b> are one of the most abundant creature
 * in the world. They run on the massive plain fields and are
 * constantly searched for their natural capabilities.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public final class MoCRRHorse extends MoCRRTamableHorse implements MoCRRSpawnableMob, MoCRRTierableAnimal
{
    //#region Properties
    /**
     * The Horse's {@link MoCRRHorse#tier Tier} is
     * synched by this key.
     */
    private static final EntityDataAccessor<Integer> DATA_TIER = SynchedEntityData.defineId(
        MoCRRHorse.class,
        EntityDataSerializers.INT
    );

    /**
     * The Horse's {@link MoCRRHorse#breed Breed} is
     * synched by this key.
     */
    private static final EntityDataAccessor<Integer> DATA_BREED = SynchedEntityData.defineId(
        MoCRRHorse.class,
        EntityDataSerializers.INT
    );

    /**
     * A String to access the {@link MoCRRHorse#tier Tier} on NBT
     * tags or string-key objects.
     */
    private static final String TIER = "tier";

    /**
     * A String to access the {@link MoCRRHorse#breed Breed} on NBT
     * tags or string-key objects.
     */
    private static final String BREED = "breed";

    /** Every Horse has a Tier. */
    private MoCRRHorseTier tier;

    /** Every Horses' Tier has a Breed. */
    private MoCRRHorseBreed breed;
    //#endregion

    //#region Constructor
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
    //#endregion

    //#region Synched Data
    /**
     * When defining Synched Data, it runs all base
     * definitions and then define the
     * {@link MoCRRHorse#DATA_TIER Tier's} and
     * {@link MoCRRHorse#DATA_BREED Breed's} key.
     */
    @Override
    protected void defineSynchedData()
    {
        super.defineSynchedData();

        this.entityData.define(DATA_TIER, 0);
        this.entityData.define(DATA_BREED, 0);
    }

    /**
     * When adding the additional data, the Tier and
     * the Breed are saved to be restored, as they usually
     * are read on their enumerated instances.
     *
     * @param nbt The NBT Compound Tag to save.
     *            It is reused on the parent methods.
     */
    @Override
    public void addAdditionalSaveData(CompoundTag nbt)
    {
        super.addAdditionalSaveData(nbt);

        nbt.putInt(TIER, this.getTier());
        nbt.putInt(BREED, this.getBreed());
    }

    /**
     * When restoring the additional data, the Tier and
     * Breed are only instanced if both are present on the Tag.
     *
     * @param nbt The NBT Compound Tag to get.
     *            It is reused on the parent methods.
     */
    @Override
    public void readAdditionalSaveData(CompoundTag nbt)
    {
        super.readAdditionalSaveData(nbt);

        if(tagContainsTierAndBreed(nbt))
        {
            this.setTierAndBreedFromTag(nbt);
        }
    }
    //#endregion

    //#region Spawn
    /**
     * When the Horse is spawned, it belongs to one of the
     * {@link MoCRRHorseTier#NATURAL Natural Tier} Breeds,
     * but if the correct NBT tags are passed, it may become
     * the desired horse.
     *
     * @param level      The Level Accessor on the Server.
     * @param difficulty The current Difficulty of the Level.
     * @param spawn      The Spawn Type.
     * @param group      The Spawn Group Data, which may be {@code null}.
     * @param nbt        The NTB Compound Tag with additional data,
     *                   which may be {@code null}.
     * @return If everything goes right, then it continues with the
     *         super implementations.
     */
    @Override
    public SpawnGroupData finalizeSpawn(
        ServerLevelAccessor level,
        DifficultyInstance difficulty,
        MobSpawnType spawn,
        @Nullable SpawnGroupData group,
        @Nullable CompoundTag nbt
    )
    {
        this.setNaturalTierAndBreed();

        if(nbt != null && tagContainsTierAndBreed(nbt))
        {
            this.setTierAndBreedFromTag(nbt);
        }

        // TODO: Implement method to get the Health and Speed by Breed.

        return super.finalizeSpawn(level, difficulty, spawn, group, nbt);
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
    //#endregion

    //#region Getters
    /**
     * The Tier may be read for rules.
     *
     * @return The respective Tier of this Horse.
     */
    public final MoCRRHorseTier getHorseTier()
    {
        if(this.tier == null)
        {
            this.setTier(this.getTier());
        }

        return this.tier;
    }

    /**
     * The asserted accessor of the Horse's Tier
     * returns a raw {@code int} value.
     *
     * @see MoCRRHorse#getHorseTier() The enumerated method.
     */
    @Override
    public final int getTier()
    {
        return this.entityData.get(DATA_TIER);
    }

    /**
     * Retrieve easily the Horse Tier from a NBT Compound Tag.
     *
     * @param nbt The previously verified NBT Compound Tag.
     * @return It must be guaranteed to have the key to
     *         return its value.
     */
    private static final int getTagTier(CompoundTag nbt)
    {
        return nbt.getInt(TIER);
    }

    /**
     * The Breed may be read for rules.
     *
     * @return The respective Breed of this Horse.
     */
    public final MoCRRHorseBreed getHorseBreed()
    {
        if(this.breed == null)
        {
            this.setBreed(this.getBreed());
        }

        return this.breed;
    }

    /**
     * The asserted accessor of the Horse's Breed
     * returns a raw {@code int} value.
     *
     * @see MoCRRHorse#getHorseBreed() The enumerated method.
     */
    @Override
    public final int getBreed()
    {
        return this.entityData.get(DATA_BREED);
    }

    /**
     * Retrieve easily the Horse Breed from a NBT Compound Tag.
     *
     * @param nbt The previously verified NBT Compound Tag.
     * @return It must be guaranteed to have the key to
     *         return its value.
     */
    private static final int getTagBreed(CompoundTag nbt)
    {
        return nbt.getInt(BREED);
    }

    /**
     * The other Breeds of the current Tier can be directly read
     * without the use of the {@link MoCRRHorse#getTier() Tier getter}.
     *
     * @return The vector includes the current Breed.
     */
    public final MoCRRHorseBreed[] getHorseTierBreeds()
    {
        return this.tier.getBreeds();
    }

    /**
     * The asserted accessor of the Tier's Breeds
     * returns a raw {@code int[]} value.
     *
     * @see MoCRRHorse#getHorseTierBreeds() The enumerated method.
     */
    @Override
    public final int[] getTierBreeds()
    {
        return MoCRRHorseTier.fromInt(this.getTier()).getBreedsAsInt();
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
    public final MoCRRHorse getBreedOffspring(ServerLevel level, AgeableMob parent)
    {
        return MoCRREntities.HORSE.get().create(level);
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
    //#endregion

    //#region Setters
    /**
     * The Tier may be set on spawn.
     *
     * @param tier The given Tier of the Horse.
     * @since 0.0.0.5
     */
    private final void setTier(MoCRRHorseTier tier)
    {
        this.setTier(tier.asInt());
    }

    /**
     * To truly set and synch the Tier of the Horse,
     * it must be inserted on the Entity Data and then
     * defined on the instance.
     *
     * @param tier The Tier indexer value.
     * @since 0.0.0.5
     */
    private final void setTier(int tier)
    {
        this.entityData.set(DATA_TIER, tier);

        this.tier = MoCRRHorseTier.fromInt(this.getTier());
    }

    /**
     * The Breed may be set on spawn.
     *
     * @param breed The given Breed of the Horse.
     * @since 0.0.0.5
     */
    private final void setBreed(MoCRRHorseBreed breed)
    {
        this.setBreed(breed.asInt());
    }

    /**
     * To truly set and synch the Tier of the Horse,
     * it must be inserted on the Entity Data and then
     * defined on the instance.
     *
     * @param tier The Tier indexer value.
     * @since 0.0.0.5
     */
    private final void setBreed(int breed)
    {
        this.entityData.set(DATA_BREED, breed);

        this.breed = MoCRRHorseBreed.fromInt(this.getTier(), this.getBreed());
    }

    /**
     * Directly set the Tier to {@link MoCRRHorseTier#NATURAL Natural} and
     * the Breed to one of its, namely {@link MoCRRHorseBreed#WHITE White},
     * {@link MoCRRHorseBreed#BUCKSKIN Buckskin}, {@link MoCRRHorseBreed#BLOOD_BAY Blood Bay},
     * {@link MoCRRHorseBreed#MAHOGANY Mahogany}, or {@link MoCRRHorseBreed#BLACK Black}.
     *
     * @see MoCRRHorse#setTier(int) The Tier setter.
     * @see MoCRRHorse#setBreed(int) The Breed setter.
     * @see MoCRRHorse#generateNaturalBreed() Natural Breed generator.
     */
    private final void setNaturalTierAndBreed()
    {
        this.setTier(1);
        this.setBreed(generateNaturalBreed());
    }

    /**
     * <p>
     * It will run trying to set both Tier and Breed retrieved from
     * the NBT Compound Tag, but wil only set in fact if both are valid.
     * </p>
     * <p>
     * Also, if the Tier and/or Breed are missing,
     * it {@link MoCRRHorse#setNaturalTierAndBreed() sets natural values}.
     * </p>
     *
     * @param nbt The given NBT Compound Tag.
     */
    private final void setTierAndBreedFromTag(CompoundTag nbt)
    {
        final MoCRRHorseTier tier = MoCRRHorseTier.fromInt(getTagTier(nbt));

        if(tier != null)
        {
            final MoCRRHorseBreed breed = MoCRRHorseBreed.fromInt(tier, getTagBreed(nbt));

            if(breed != null)
            {
                this.setTier(tier);
                this.setBreed(breed);

                return;
            }
        }

        if(this.getHorseTier() == null || this.getHorseBreed() == null)
        {
            this.setNaturalTierAndBreed();
        }
    }
    //#endregion

    //#region Helpers
    /**
     * Simply checks if the NBT Compound Tag contains a {@code tier} and
     * {@code breed} entries.
     *
     * @param nbt The given NBT Compound Tag of any source.
     * @return Only returns {@code true} if both keys are present.
     */
    private static final boolean tagContainsTierAndBreed(CompoundTag nbt)
    {
        return (nbt.contains(TIER) && nbt.contains(BREED));
    }

    /**
     * <p>
     * Randomly get a Breed from the {@link MoCRRHorseTier#NATURAL Natural} Tier.
     * </p>
     * <p>
     * The actual probabilities follows the rules on the table:
     * <p>
     * <table>
     *  <thead>
     *      <tr>
     *          <th>
     *              Breed
     *          </th>
     *          <th>
     *              Chance
     *          </th>
     *      </tr>
     *  <thead>
     *  <tbody>
     *      <tr>
     *          <td>
     *              {@link MoCRRHorseBreed#WHITE White}
     *          </td>
     *          <td>
     *              <b>15%</b>
     *          </td>
     *      </tr>
     *      <tr>
     *          <td>
     *              {@link MoCRRHorseBreed#BUCKSKIN Buckskin}
     *          </td>
     *          <td>
     *              <b>20%</b>
     *          </td>
     *      </tr>
     *      <tr>
     *          <td>
     *              {@link MoCRRHorseBreed#BLOOD_BAY Blood Bay}
     *          </td>
     *          <td>
     *              <b>25%</b>
     *          </td>
     *      </tr>
     *      <tr>
     *          <td>
     *              {@link MoCRRHorseBreed#MAHOGANY Mahogany}
     *          </td>
     *          <td>
     *              <b>30%</b>
     *          </td>
     *      </tr>
     *      <tr>
     *          <td>
     *              {@link MoCRRHorseBreed#BLACK Black}
     *          </td>
     *          <td>
     *              <b>10%</b>
     *          </td>
     *      </tr>
     *  </tbody>
     * </table>
     *
     * @return The {@code int} indexer of the Breed.
     */
    private static final int generateNaturalBreed()
    {
        final int[] breeds = MoCRRHorseTier.NATURAL.getBreedsAsInt();

        final double[] probs = new double[] {0.15D, 0.20D, 0.25D, 0.30D, 0.10D};

        double prob = (new Random()).nextDouble();

        double sum = 0.0D;

        int i = 0;

        while(sum < prob)
        {
            sum += probs[i];

            i++;
        }

        return breeds[i - 1];
    }

    /**
     * {@inheritDoc}
     *
     * @return Horses textures can vary, so it's {@code true}.
     */
    @Override
    public final boolean canVaryTexture()
    {
        return true;
    }
    //#endregion
}