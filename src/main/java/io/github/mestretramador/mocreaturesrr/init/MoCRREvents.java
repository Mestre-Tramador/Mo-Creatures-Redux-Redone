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