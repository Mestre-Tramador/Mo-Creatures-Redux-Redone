package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Item Provider base.
 * 
 * @version 0.0.10
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemProvider
{
    /** Properties to assemble and provide. */
    protected static Properties PROPERTIES;

    /**
     * When creating an Item Provider, the Properties are reset.
     */
    protected RRMoCItemProvider()
    {
        PROPERTIES = new Properties();
    }

    /**
     * Provide the Item Properties for its creation.
     * 
     * @return Properties object with all dependencies setted.
     */
    protected abstract Properties provideProperties();
}
