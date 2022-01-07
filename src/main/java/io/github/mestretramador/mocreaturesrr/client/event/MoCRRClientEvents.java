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

package io.github.mestretramador.mocreaturesrr.client.event;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;
import io.github.mestretramador.mocreaturesrr.client.renderer.MoCRRHorseRenderer;
import io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRHorseModel;
import io.github.mestretramador.mocreaturesrr.init.MoCRREntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Uses the Forge's {@link Mod.EventBusSubscriber.Bus EventBus} to
 * {@link EntityRenderersEvent.RegisterLayerDefinitions Register Layers} and
 * {@link EntityRenderersEvent.RegisterRenderers Register Renderers}.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
@Mod.EventBusSubscriber(modid = MoCreaturesReduxRedone.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class MoCRRClientEvents
{
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRRClientEvents() { }
    //#endregion

    //#region Events
    /**
     * This event get every MoC R&R {@link io.github.mestretramador.mocreaturesrr.client.renderer.model.MoCRRAnimalModel Model}
     * and register its Layer Definition.
     *
     * @param event The subscribed event given by the {@link Mod.EventBusSubscriber.Bus EventBus}.
     */
    @SubscribeEvent
    public static final void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(MoCRRHorseModel.LAYER_LOCATION, MoCRRHorseModel::createBodyLayer);
    }

    /**
     * This event get every MoC R&R {@link MoCRREntities Entities} and register their Renderers.
     *
     * @param event The subscribed event given by the {@link Mod.EventBusSubscriber.Bus EventBus}.
     */
    @SubscribeEvent
    public static final void registerEntityRenderes(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(MoCRREntities.HORSE.get(), MoCRRHorseRenderer::new);
    }
    //#endregion
}