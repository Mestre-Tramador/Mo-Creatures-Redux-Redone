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