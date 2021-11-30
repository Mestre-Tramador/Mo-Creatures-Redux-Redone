package io.github.mestretramador.mocreaturesrr.item;

import net.minecraft.world.item.CreativeModeTab;

/**
 * The Creaturepedia is one of the core items of Mo'Creatures Redux&Redone,
 * as it main function involves learning and progressing with the Entities and Mobs.
 *
 * @since 0.0.0.1
 * @author Mestre Tramador
 * @see io.github.mestretramador.mocreaturesrr.init.MoCRRItems#CREATUREPEDIA The Item
 */
public final class MoCRRCreaturepediaItem extends MoCRRItem
{
    /**
     * The Creaturepedia already creates itself,
     * so no Properties should be passed.
     */
    public MoCRRCreaturepediaItem()
    {
        super(makeToolProperties().tab(CreativeModeTab.TAB_MISC));
    }
}