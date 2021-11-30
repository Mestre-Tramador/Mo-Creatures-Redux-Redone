package io.github.mestretramador.mocreaturesrr.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

/**
 * A Mo'Creatures Redux&Redone Item follows
 * the Minecraft {@link Item base} structure.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 */
public abstract class MoCRRItem extends Item
{
    /**
     * In order to create an Item on MoC R&R,
     * the {@link Item.Properties properties}
     * of it shall be passed.
     *
     * @param props The Item properties already created.
     */
    public MoCRRItem(Properties props)
    {
        super(props);
    }

    //#region Properties Builders (Protected Static Methods)
    /**
     * Default properties of all Items.
     *
     * @return The Properties with {@link Rarity#COMMON common} rarity and 64 stack maximum.
     */
    protected static Properties makeProperties()
    {
        return new Item.Properties().rarity(Rarity.COMMON).stacksTo(64);
    }

    /**
     * Default Properties for non-breakable tools.
     *
     * @return Default Properties, but with just 1 stack maximum.
     */
    protected static Properties makeToolProperties()
    {
        return makeProperties().stacksTo(1);
    }
    //#endregion
}