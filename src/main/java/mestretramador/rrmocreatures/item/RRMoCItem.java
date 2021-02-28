package mestretramador.rrmocreatures.item;

import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone Item base.
 * 
 * @version 0.0.27
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItem
{
    /** The Item ID. */
    public final String ID;

    /** The Item provider. */
    protected final Object provider;

    /** The {@link net.minecraft.item.Item Item} as is. */
    private Item rrmocitem;

    /**
     * To create a Mo'Creatures Redux&Redone Item, there is needed to pass and ID
     * and a data provider. The Item is automatically created.
     * 
     * @param ID       Item ID for registration on Constants.
     * @param provider An object of a inherited Provider class.
     */
    protected RRMoCItem(String ID, Object provider)
    {
        this.ID = ID;
        this.provider = provider;

        createItem();
    }

    /**
     * Get helper for the current Item.
     * 
     * @return The {@link net.minecraft.item.Item} itself.
     */
    protected Item getItem()
    {
        return this.rrmocitem;
    }

    /**
     * Set helper for the current Item.
     * 
     * @param item The {@link net.minecraft.item.Item} itself.
     */
    protected void setItem(Item item)
    {
        this.rrmocitem = item;
    }

    /**
     * With the created Item and the helper functions, do final adjusts to finally
     * return the Item.
     * 
     * @return The actual Block.
     */
    protected abstract Item returnAsItem();

    /**
     * Create an Item with the helper functions.
     */
    protected abstract void createItem();
}
