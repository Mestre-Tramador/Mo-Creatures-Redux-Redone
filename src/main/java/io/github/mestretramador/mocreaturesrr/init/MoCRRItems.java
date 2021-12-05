package io.github.mestretramador.mocreaturesrr.init;

import java.util.Collection;
import java.util.stream.Stream;

import io.github.mestretramador.mocreaturesrr.item.MoCRRCreaturepediaItem;

import net.minecraft.world.item.Item;

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
    //#region Constructor
    /** This class should not be instantiated. */
    private MoCRRItems() { }
    //#endregion

    //#region Items (Properties)
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
     * Call this method to register, <b>load</b>, as a matter of speak, the Item entries.
     */
    public static final void register() { }
    //#endregion
}