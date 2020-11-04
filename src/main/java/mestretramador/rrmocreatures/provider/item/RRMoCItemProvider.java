package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Item Provider base.
 * 
 * @version 0.0.8
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemProvider
{
    /** Properties to assemble and provide. */
    protected static final Properties PROPERTIES = new Properties();

    /**
     * Provide the Item Properties for its creation.
     * 
     * @return Properties object with all dependencies setted.
     */
    protected abstract Properties provideProperties();
}
