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

package io.github.mestretramador.mocreaturesrr;

import io.github.mestretramador.mocreaturesrr.init.MoCRRRegisters;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Mo'Creatures Redux&Redone is an attempt to
 * recreate DrZharks' Mo'Creatures in the new versions
 * of Minecraft with redesigned ideas.
 *
 * @version 0.0.0.1
 * @author Mestre Tramador
 */
@Mod(MoCreaturesReduxRedone.ID)
public final class MoCreaturesReduxRedone
{
    /** The Mod ID. */
    public static final String ID = "mocreaturesrr";

    /**
     * The Mod constructor gets the Minecraft Forge's
     * {@link IEventBus Event Bus} and register all
     * {@link net.minecraft.world.item.Item Items},
     * {@link net.minecraft.world.level.block.Block Blocks},
     * and {@link net.minecraft.sounds.SoundEvent Sound Events}.
     *
     * @see MoCRRRegisters#registerAll(IEventBus) Registering Method
     */
    public MoCreaturesReduxRedone()
    {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MoCRRRegisters.registerAll(bus);
    }
}