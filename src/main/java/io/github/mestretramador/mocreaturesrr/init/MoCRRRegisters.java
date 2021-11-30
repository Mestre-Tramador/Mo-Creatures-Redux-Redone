package io.github.mestretramador.mocreaturesrr.init;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Creates and uses the Forge's
 * {@link DeferredRegister Deferred Registers} to
 * register {@link Item Items}, {@link Block Blocks} and
 * {@link SoundEvent Sound Events}.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public final class MoCRRRegisters
{
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRRRegisters() { }
    //#endregion

    //#region Properties
    /** The Blocks Deferred Register, <b>actually not in use</b>. */
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoCreaturesReduxRedone.ID);

    /**
     * The Items Deferred Registers, set to register the {@link MoCRRItems mod Items}.
     *
     * @since 0.0.0.1
     */
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoCreaturesReduxRedone.ID);

    /** The Sound Events Deferred Register, <b>actually not in use</b>. */
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(
        ForgeRegistries.SOUND_EVENTS, MoCreaturesReduxRedone.ID
    );
    //#endregion

    //#region Getters
    /**
     * The Blocks Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static DeferredRegister<Block> getBlocksRegister()
    {
        return BLOCKS;
    }

    /**
     * The Items Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static DeferredRegister<Item> getItemsRegister()
    {
        return ITEMS;
    }

    /**
     * The Sound Events Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static DeferredRegister<SoundEvent> getSoundEventsRegister()
    {
        return SOUND_EVENTS;
    }
    //#endregion

    //#region Registers
    /**
     * Quick caller to register all Mo'Creatures Redux&Redone
     * stuff that shall be registered, namely Items, Blocks and
     * Sound Events.
     *
     * @param bus The Minecraft Forge's Event Bus.
     * @see MoCRRRegisters#registerItems(IEventBus) Items Register Caller
     * @see MoCRRRegisters#registerBlocks(IEventBus) Blocks Register Caller
     * @see MoCRRRegisters#registerSoundEvents(IEventBus) Sound Events Register Caller
     */
    public static void registerAll(IEventBus bus)
    {
        registerBlocks(bus);
        registerItems(bus);
        registerSoundEvents(bus);
    }

    /**
     * Register solely the Mo'Creatures Redux&Redone Blocks.
     *
     * @param bus The Minecraft Forge's Event Bus.
     */
    public static void registerBlocks(IEventBus bus)
    {
        BLOCKS.register(bus);
    }

    /**
     * <p>
     * Register solely the Mo'Creatures Redux&Redone Items.
     * <br />
     * <br />
     * It also load all mod Items {@link MoCRRItems#all() instances}.
     * </p>
     *
     * @param bus The Minecraft Forge's Event Bus.
     * @since 0.0.0.1
     */
    public static void registerItems(IEventBus bus)
    {
        ITEMS.register(bus);

        MoCRRItems.register();
    }

    /**
     * Register solely the Mo'Creatures Redux&Redone Sound Events.
     *
     * @param bus The Minecraft Forge's Event Bus.
     */
    public static void registerSoundEvents(IEventBus bus)
    {
        SOUND_EVENTS.register(bus);
    }
    //#endregion
}