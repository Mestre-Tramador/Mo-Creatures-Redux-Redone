package io.github.mestretramador.mocreaturesrr.util;

import io.github.mestretramador.mocreaturesrr.MoCreaturesReduxRedone;

import net.minecraft.resources.ResourceLocation;

/**
 * A direct {@link ResourceLocation Resource Location}
 * from Mo'Creatures Redux&Redone.
 *
 * @since 0.0.0.2
 * @author Mestre Tramador
 */
public class MoCRRResourceLocation extends ResourceLocation
{
    /**
     * The Mod ID is already loaded, so just the path must
     * be informed to reach the resource.
     *
     * @param path The folder path to the resource,
     *             no matter its type.
     */
    public MoCRRResourceLocation(String path)
    {
        super(MoCreaturesReduxRedone.ID, path);
    }
}