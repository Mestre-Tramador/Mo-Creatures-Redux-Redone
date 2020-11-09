package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Item Provider base.
 * 
 * @version 0.0.12
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemProvider
{
    /** Properties to assemble and provide. */
    private static Properties PROPERTIES;

    /**
     * When creating an Item Provider, the Properties are reset.
     */
    protected RRMoCItemProvider()
    {
        PROPERTIES = new Properties();
    }

    protected static Properties PROPERTIES()
    {
        return PROPERTIES;
    }

    /**
     * Provide the Item Properties for its creation.
     * 
     * @return Properties object with all dependencies setted.
     */
    protected abstract Properties provideProperties();
}
