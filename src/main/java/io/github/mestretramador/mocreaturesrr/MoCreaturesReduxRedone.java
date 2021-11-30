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