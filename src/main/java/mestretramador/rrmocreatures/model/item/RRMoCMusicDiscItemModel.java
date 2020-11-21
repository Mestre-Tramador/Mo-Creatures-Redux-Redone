package mestretramador.rrmocreatures.model.item;

import java.util.function.Supplier;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.SoundEvent;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.MusicDiscItem MusicDiscItem}.
 * 
 * @version 0.0.23
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCMusicDiscItemModel extends MusicDiscItem
{
    /**
     * Using the parent constructor, create naturally a MusicDiscItem.
     * 
     * @param comparatorValue A number value (0-15) for comparation purposes.
     * @param sound           The SoundEvent registered, by a Suppier. 
     * @param provider        The MusicDiscItem Properties provided.
     */
    public RRMoCMusicDiscItemModel(int comparatorValue, Supplier<SoundEvent> sound, Properties provider)
    {
        super(comparatorValue, sound, provider);
    }
}
