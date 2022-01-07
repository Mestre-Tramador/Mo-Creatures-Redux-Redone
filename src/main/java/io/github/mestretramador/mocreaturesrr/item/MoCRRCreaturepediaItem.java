//#region License
/**
 *  Mo'Creatures Redux&Redone is an attempt to restore the original
 *  DrZharks' Mo'Creatures with redesign ideas.
 *  Copyright (C) 2022 Mestre Tramador
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
//#endregion

package io.github.mestretramador.mocreaturesrr.item;

import io.github.mestretramador.mocreaturesrr.entity.MoCRRAnimal;
import io.github.mestretramador.mocreaturesrr.init.MoCRRTabs;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

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
        super(makeToolProperties(MoCRRTabs.MOCRR));
    }

    /**
     * The Creaturepedia, on the hands of an habile adventurer,
     * may reveal plenty of information about the various creatures
     * that roam the world.
     *
     * @param stack  This stack contains the Creaturepedia, which can hold maximum one per
     *               space on the inventory.
     * @param player Every player can use the Creaturepedia, but the shown info can vary
     *               according to certain realizations.
     * @param entity To the Creaturepedia works, the entity must be an instance of a
     *               {@link io.github.mestretramador.mocreaturesrr.entity.MoCRRAnimal MoC R&R Animal}
     *               or alike.
     * @param hand   Only the {@link InteractionHand#MAIN_HAND Main Hand} can be used.
     * @return The result will always be of {@link InteractionResult#PASS Pass} type.
     */
    @Override
    public InteractionResult interactLivingEntity(
        ItemStack stack,
        Player player,
        LivingEntity entity,
        InteractionHand hand
    )
    {
        if(hand == InteractionHand.MAIN_HAND)
        {
            if(entity instanceof MoCRRAnimal)
            {
                // TODO: Implement here the method.
            }
        }

        return InteractionResult.PASS;
    }
}