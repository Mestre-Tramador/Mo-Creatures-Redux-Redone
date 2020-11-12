package mestretramador.rrmocreatures.util;

/**
 * Enumeration of the current Minecraft Items IDs.
 * 
 * @version 0.0.17
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public enum VanillaIDs
{
    SADDLE(664),   
    IRON_HORSE_ARMOR(861),    
    GOLDEN_HORSE_ARMOR(862),
    DIAMOND_HORSE_ARMOR(863),
    LEATHER_HORSE_ARMOR(864);

    // TODO: Implement all Minecraft IDs.

    /** Search index. */
    private final int ID;

    /**
     * Every searched item has an ID.
     * @param ID The item ID already registered.
     */
    VanillaIDs(int ID)
    {
        this.ID = ID;
    }

    /**
     * Return the searched ID.
     * @return The number registered on Minecraft.
     */
    public int ID()
    {
        return ID;
    }
}
