package mestretramador.rrmocreatures.provider.item;

import net.minecraft.item.Item.Properties;

/**
 * Mo'Creatures Redux&Redone Item Provider base.
 * @version 0.0.3
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public abstract class RRMoCItemProvider
{
    /** Properties to assemble and provide. */
    protected static final Properties PROPERTIES = new Properties();

    /**
     * Return a set of Minecraft item {@link Properties} for its construction.
     * @return Properties object with all dependencies setted.
     */
    protected abstract Properties provideProperties();    
}
