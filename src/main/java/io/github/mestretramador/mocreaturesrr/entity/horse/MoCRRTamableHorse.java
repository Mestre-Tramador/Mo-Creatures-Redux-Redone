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

import io.github.mestretramador.mocreaturesrr.entity.MoCRRMobCategory;
import io.github.mestretramador.mocreaturesrr.entity.MoCRRTamableAnimal;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

/**
 * All MoC R&R Horse-like Animals, namely the
 * {@link MoCRRHorse Horse} and so on, start from a
 * base class which hold most shared attributes.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public abstract class MoCRRTamableHorse extends MoCRRTamableAnimal
{
    /**
     * In order to create a Tamable Horse, as of any Entity,
     * two parameters are essential. Since the third one,
     * it's MoC R&R stuff.
     *
     * @param parent   The parent Entity to link on the class chain.
     * @param level    The current level to spawn.
     * @param category The MoC R&R tier of the Animal.
     */
    protected MoCRRTamableHorse(
        EntityType<? extends MoCRRTamableHorse> type,
        Level level,
        MoCRRMobCategory category
    )
    {
        super(type, level, category);
    }

    /**
     * A Tamable Horse has a behavior similar to most passive creatures.
     * For instance, its mirror the Minecraft's Horse-like
     * {@link net.minecraft.world.entity.animal.horse.AbstractHorse#registerGoals() behaviors}.
     */
    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 0.7D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.0D));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2D));
        this.goalSelector.addGoal(0, new FloatGoal(this));
    }
}