package mestretramador.rrmocreatures.block;

import net.minecraft.item.BlockItem;

/**
 * <p>
 * Mo'Creatures Redux&Redone {@link net.minecraft.item.BlockItem BlockItem} base.
 * </p>
 * <p>
 * Generally implemented with a Mo'Creatures Redux&Redone Block inherited class.
 * </p>
 * 
 * @version 0.0.17
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
@FunctionalInterface
public interface RRMoCBlockItem
{
    /**
     * Having a {@link net.minecraft.block.Block Block} and a Provider with
     * {@link net.minecraft.block.AbstractBlock.Properties Block Properties}, a
     * BlockItem can be returned with this method.
     * 
     * @return A newly {@link net.minecraft.item.BlockItem BlockItem}.
     */
    public BlockItem returnAsBlockItem();
}
