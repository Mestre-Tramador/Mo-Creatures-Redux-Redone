package mestretramador.rrmocreatures.init;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Initialization class for Registration.
 * 
 * @version 0.0.21
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class Register
{
    /** Blocks register. */
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    /** Items register. */
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    /** Sound Events register. */
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Constants.MOD_ID);

    /** Start the registration of the {@link Register} class. */
    public static void enable()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        SOUND_EVENTS.register(modEventBus);

        RegisterItem.registerAll();

        RegisterBlock.registerAll();

        RegisterSoundEvent.registerAll();
    }
    
    /**
     * A getter method to the Blocks Deferred Register.
     * 
     * @return Blocks register.
     */
    public static DeferredRegister<Block> getBlocksDeferredRegister()
    {
        return BLOCKS;
    }

    /**
     * A getter method to the Items Deferred Register.
     * 
     * @return Items register.
     */
    public static DeferredRegister<Item> getItemsDeferredRegister()
    {
        return ITEMS;
    }

    /**
     * A getter method to the Sound Events Deferred Register.
     * 
     * @return Sound Events Register.
     */
    public static DeferredRegister<SoundEvent> getSoundEventsDeferredRegister()
    {
        return SOUND_EVENTS;
    }
}
