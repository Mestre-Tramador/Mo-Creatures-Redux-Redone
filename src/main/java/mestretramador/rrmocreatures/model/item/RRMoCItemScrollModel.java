package mestretramador.rrmocreatures.model.item;

import java.util.List;

import javax.annotation.Nullable;

import mestretramador.rrmocreatures.util.Constants;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Mo'Creatures Redux&Redone custom {@link net.minecraft.item.Item Item} to use
 * as a Scroll.
 * 
 * @version 0.0.21
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemScrollModel extends RRMoCItemModel
{
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemScrollFreedom Scroll - Freedom}.
     */
    private static final String FREEDOM = "freedom";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemScrollOwner Scroll - Owner}.
     */
    private static final String OWNER = "owner";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemScrollSale Scroll - Sale}.
     */
    private static final String SALE = "sale";

    /**
     * <p>
     * Using the parent constructor, create naturally a Item.
     * </p>
     * <p>
     * <b>None alteration is made on the Properties.</b>
     * </p>
     * 
     * @param provider The Item Properties provided.
     */
    public RRMoCItemScrollModel(Properties provider)
    {
        super(provider);
    }

    // TODO: Implement Scroll usage.

    /**
     * Based on the registred names, get the respective type of the Scroll.
     * 
     * @return The types {@link #FREEDOM Freedom}, {@link #OWNER Owner} and
     *         {@link #SALE Sale} or <i>null</i>.
     */
    @Nullable
    private String getScrollType()
    {
        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.SCROLL_FREEDOM: return FREEDOM;

            case Constants.Items.SCROLL_OWNER: return OWNER;

            case Constants.Items.SCROLL_SALE: return SALE;

            default: return null;
        }
    }

    // ! Client side.
    @OnlyIn(Dist.CLIENT)
    
    /**
     * Overides to implement custom texts to Scrolls wich are not blank.
     * 
     * @param stack   Current ItemStack.
     * @param world   Current World.
     * @param tooltip List of the Hover Tooltip lines.
     * @param flag    Tooltip helper flag.
     */
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        switch(getScrollType())
        {
            case FREEDOM:
                addScrollInformation(tooltip, "Freedom", "\"Freedom is priceless.\"", TextFormatting.RED);
            break;

            case OWNER:
                addScrollInformation(tooltip, "Owner", "\"Now you serve me.\"", TextFormatting.GRAY);
            break;

            case SALE:
                addScrollInformation(tooltip, "Sale", "\"As if you could, bargain a soul.\"", TextFormatting.GOLD);
            break;
            
            default: super.addInformation(stack, world, tooltip, flag);
        }
    }

    /**
     * Helper function to format equaly the Scrolls text.
     * 
     * @param tooltip List of the Hover Tooltip lines.
     * @param type    Scroll type subtitle.
     * @param flavor  Scroll flavor text, like a hint to the player.
     * @param color   Color of the flavor text.
     */
    private void addScrollInformation(List<ITextComponent> tooltip, String type, String flavor, TextFormatting color)
    {
        tooltip.add(new StringTextComponent(TextFormatting.DARK_GRAY + type));
        tooltip.add(new StringTextComponent(" "));
        tooltip.add(new StringTextComponent(color + (TextFormatting.ITALIC + flavor)));
    }
}
