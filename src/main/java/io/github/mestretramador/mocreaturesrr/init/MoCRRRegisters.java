package io.github.mestretramador.mocreaturesrr.init;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Creates and uses the Forge's
 * {@link DeferredRegister Deferred Registers} to
 * register {@link Block Blocks}, {@link Item Items},
 * {@link EntityType Entities} and {@link SoundEvent Sound Events}.
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
     * The Items Deferred Register, set to register the {@link MoCRRItems mod Items}.
     *
     * @since 0.0.0.1
     */
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoCreaturesReduxRedone.ID);

    /**
     * This is an Items Deferred Registers,
     * but set only to {@link io.github.mestretramador.mocreaturesrr.entity.MoCRRSpawnableMob.MoCRRSpawnEggItem mod Spawn Egg Items}.
     *
     * @since 0.0.0.4
     */
    private static final DeferredRegister<Item> SPAWN_EGGS = DeferredRegister.create(ForgeRegistries.ITEMS,  MoCreaturesReduxRedone.ID);

    /** The Sound Events Deferred Register, <b>actually not in use</b>. */
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(
        ForgeRegistries.SOUND_EVENTS, MoCreaturesReduxRedone.ID
    );

    /**
     * The Entity Type Deferred Register, set to register the {@link MoCRREntities mod Entities}.
     *
     * @since 0.0.0.2
     */
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
        ForgeRegistries.ENTITIES, MoCreaturesReduxRedone.ID
    );
    //#endregion

    //#region Getters
    /**
     * The Blocks Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static final DeferredRegister<Block> getBlocksRegister()
    {
        return BLOCKS;
    }

    /**
     * The Items Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static final DeferredRegister<Item> getItemsRegister()
    {
        return ITEMS;
    }

    /**
     * The Spawn Egg Items Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static final DeferredRegister<Item> getSpawnEggsRegister()
    {
        return SPAWN_EGGS;
    }

    /**
     * The Sound Events Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static final DeferredRegister<SoundEvent> getSoundEventsRegister()
    {
        return SOUND_EVENTS;
    }

    /**
     * The Entities Deferred Register access method
     * for their respective registration.
     *
     * @return The Deferred Register already created.
     */
    public static final DeferredRegister<EntityType<?>> getEntitiesRegister()
    {
        return ENTITIES;
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
     * @see MoCRRRegisters#registerEntities(IEventBus) Entities Register Caller
     */
    public static final void registerAll(IEventBus bus)
    {
        registerBlocks(bus);
        registerItems(bus);
        registerSoundEvents(bus);
        registerEntities(bus);
    }

    /**
     * Register solely the Mo'Creatures Redux&Redone Blocks.
     *
     * @param bus The Minecraft Forge's Event Bus.
     */
    public static final void registerBlocks(IEventBus bus)
    {
        BLOCKS.register(bus);
    }

    /**
     * <p>
     * Register solely the Mo'Creatures Redux&Redone Items and Spawn Egg Items.
     * <br />
     * <br />
     * It also load all mod Items {@link MoCRRItems#allAndSpawnEggs() instances}.
     * </p>
     *
     * @param bus The Minecraft Forge's Event Bus.
     * @since 0.0.0.1
     */
    public static final void registerItems(IEventBus bus)
    {
        ITEMS.register(bus);

        SPAWN_EGGS.register(bus);

        MoCRRItems.register();
    }

    /**
     * Register solely the Mo'Creatures Redux&Redone Sound Events.
     *
     * @param bus The Minecraft Forge's Event Bus.
     */
    public static final void registerSoundEvents(IEventBus bus)
    {
        SOUND_EVENTS.register(bus);
    }

    /**
     * <p>
     * Register solely the Mo'Creatures Redux&Redone Entities.
     * <br />
     * <br />
     * It also load all mod Entities {@link MoCRREntities#all() instances}.
     * </p>
     *
     * @param bus The Minecraft Forge's Event Bus.
     * @since 0.0.0.2
     */
    public static final void registerEntities(IEventBus bus)
    {
        ENTITIES.register(bus);

        MoCRREntities.register();
    }
    //#endregion
}