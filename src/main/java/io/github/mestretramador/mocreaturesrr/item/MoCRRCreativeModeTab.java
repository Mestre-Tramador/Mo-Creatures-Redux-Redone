package io.github.mestretramador.mocreaturesrr.item;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * All MoC R&R Creative Mode Tabs follows
 * the Minecraft {@link CreativeModeTab base} structure.
 *
 * @since 0.0.0.3
 * @author Mestre Tramador
 */
public abstract class MoCRRCreativeModeTab extends CreativeModeTab
{
    /**
     * In order to create a Tab on MoC R&R, only
     * the identifier label shall be passed.
     *
     * @param label The label to identify the tab.
     */
    public MoCRRCreativeModeTab(String label)
    {
        super(MoCreaturesReduxRedone.ID.concat(".").concat(label));
    }

    /**
     * Represents the icon of the Tab.
     * The stack can hold an item itself or a block.
     */
    public abstract ItemStack makeIcon();
}