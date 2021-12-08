package io.github.mestretramador.mocreaturesrr.init;

import java.util.Collection;
import java.util.stream.Stream;

import io.github.mestretramador.mocreaturesrr.entity.horse.MoCRRHorse;
import io.github.mestretramador.mocreaturesrr.item.MoCRRCreaturepediaItem;

import net.minecraft.world.item.Item;

import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;

/**
 * Aggregation of the Mo'Creatures R&R
 * registered {@link Item Items}.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public final class MoCRRItems
{
    //#region Constants
    /** The suffix of all Spawn Egg Items. */
    private static final String SPAWN_EGG = "_spawn_egg";
    //#endregion

    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRRItems() { }
    //#endregion

    //#region Items
    /**
     * The <b>Creaturepedia</b> is your best friend on getting info
     * about the Entities and Mobs. With this book, you can understand
     * more about the behavior of a domestic animal, a mythical creature
     * or maybe an evil being.
     *
     * @since 0.0.0.1
     */
    public static final RegistryObject<Item> CREATUREPEDIA = MoCRRRegisters.getItemsRegister().register(
        "creaturepedia", MoCRRCreaturepediaItem::new
    );
    //#endregion

    //#region Spawn Eggs
    /**
     * Spawns a <b>Horse</b>.
     *
     * @since 0.0.0.4
     * @see MoCRREntities#HORSE The Horse
     */
    public static final RegistryObject<ForgeSpawnEggItem> HORSE_SPAWN_EGG = MoCRRRegisters.getSpawnEggsRegister().register(
        spawnEggID(MoCRREntities.HORSE_ID), MoCRRHorse::egg
    );
    //#endregion

    //#region Public Methods
    /**
     * All MoC R&R Items already registered on
     * a immutable {@link Collection}.
     *
     * @return The registered Items entries.
     */
    public static final Collection<RegistryObject<Item>> all()
    {
        return MoCRRRegisters.getItemsRegister().getEntries();
    }

    /**
     * All MoC R&R Spawn Egg Items already registered on
     * a immutable {@link Collection}.
     *
     * @return The registered Spawn Egg Items entries.
     */
    public static final Collection<RegistryObject<Item>> allSpawnEggs()
    {
        return MoCRRRegisters.getSpawnEggsRegister().getEntries();
    }

    /**
     * All MoC R&R Items and Spawn Egg Items already registered on
     * a immutable {@link Collection}.
     *
     * @return The registered Items and Spawn Egg Items entries.
     */
    public static final Collection<RegistryObject<Item>> allAndSpawnEggs()
    {
        Collection<RegistryObject<Item>> all = all();

        all.addAll(allSpawnEggs());

        return all;
    }

    /**
     * All MoC R&R Items already registered on
     * a {@link Stream} that contains their direct
     * instances.
     *
     * @return The registered Items.
     */
    public static final Stream<Item> allItems()
    {
        return all().stream().map(RegistryObject::get);
    }

    /**
     * All MoC R&R Spawn Egg Items already registered on
     * a {@link Stream} that contains their direct
     * instances.
     *
     * @return The registered Spawn Egg Items.
     */
    public static final Stream<Item> allSpawnEggsItems()
    {
        return allSpawnEggs().stream().map(RegistryObject::get);
    }

    /**
     * All MoC R&R Items and Spawn Egg Items already registered on
     * a {@link Stream} that contains their direct
     * instances.
     *
     * @return The registered Items and Spawn Egg Items.
     */
    public static final Stream<Item> allAndSpawnEggsItems()
    {
        return allAndSpawnEggs().stream().map(RegistryObject::get);
    }

    /**
     * Call this method to register, <b>load</b>, as a matter of speak, the Item entries.
     */
    public static final void register() { }
    //#endregion

    //#region Private Methods
    /**
     * Use an Entity ID to make a Spawn Egg ID.
     *
     * @param entityID One of the IDs present on the {@link MoCRREntities Entities class}.
     * @return A string which follows the {@code entity_spawn_egg} pattern.
     */
    private static final String spawnEggID(String entityID)
    {
        return entityID.concat(SPAWN_EGG);
    }
    //#endregion
}