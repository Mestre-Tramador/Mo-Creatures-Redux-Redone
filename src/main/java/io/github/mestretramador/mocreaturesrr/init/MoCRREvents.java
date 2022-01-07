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

package io.github.mestretramador.mocreaturesrr.init;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;
import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Uses the Forge's {@link Mod.EventBusSubscriber.Bus EventBus} to
 * put {@link net.minecraft.world.entity.ai.attributes.AttributeSupplier Attributes}.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
@Mod.EventBusSubscriber(modid = MoCreaturesReduxRedone.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class MoCRREvents
{
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRREvents() { }
    //#endregion

    //#region Events
    /**
     * Get the registered mod {@link MoCRREntities Entities} and,
     * by each one, put its attributes.
     *
     * @param event The Event of Attribute Creation for Entities.
     * @since 0.0.0.2
     */
    @SubscribeEvent
    public static final void putAttributes(EntityAttributeCreationEvent event)
    {
        event.put(MoCRREntities.HORSE.get(), MoCRRHorse.createAttributes().build());
    }
    //#endregion
}