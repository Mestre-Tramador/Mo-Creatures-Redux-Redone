package mestretramador.rrmocreatures.item;

import net.minecraft.item.Item;

/**
 * Mo'Creatures Redux&Redone Item base.
 * @version 0.0.6
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItem
{
    /** The item ID. */
    public String ID;

    /** The provider for Properties and general data. */
    protected Object provider;
   
    /**
     * To create a Mo'Creatures Redux&Redone Item,
     * there is needed to pass and ID and a data provider.
     * @param ID Item ID for registration on Constants.
     * @param provider An object of a inherited Provider class.
     */
    protected RRMoCItem(String ID, Object provider)
    {
        this.ID = ID;
        this.provider = provider;
    }

    /**
     * Return the object as a Minecraft {@link Item} for registry.
     * @return An Minecraft item with all dependencies setted.
     */
    protected abstract Item returnAsItem();
}
