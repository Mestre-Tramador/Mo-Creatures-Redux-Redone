package mestretramador.rrmocreatures.model.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.BlockItem BlockItem}.
 * 
 * @version 0.0.18
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCBlockItemModel extends BlockItem
{
    /**
     * Using the parent constructor, create naturally a BlockItem.
     * 
     * @param parent   The parent Block to become an Item.
     * @param provider The Item Properties provided.
     */
    public RRMoCBlockItemModel(Block parent, Properties provider)
    {
        super(parent, provider);
    }
}
