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
 * as a Staff.
 * 
 * @version 0.0.25
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.
 */
public class RRMoCItemStaffModel extends RRMoCItemModel
{
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStaffDiamond Staff - Diamond}.
     */
    private static final String DIAMOND = "diamond";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStaffEnder Staff - Ender}.
     */
    private static final String ENDER = "ender";
    
    /**
     * Case String to
     * {@link mestretramador.rrmocreatures.item.RRMoCItemStaffLight Staff - Light}.
     */
    private static final String LIGHT = "light";

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
    public RRMoCItemStaffModel(Properties provider)
    {
        super(provider);
    }

    // TODO: Implement Staff Usage.

    /**
     * Based on the registred names, get the respective type of the Staff.
     * 
     * @return The types {@link #DIAMOND Diamond}, {@link #ENDER Ender} and
     *         {@link #LIGHT Light} or <i>null</i>.
     */
    @Nullable
    private String getStaffType()
    {
        switch(this.getRegistryName().getPath())
        {
            case Constants.Items.STAFF_DIAMOND: return DIAMOND;

            case Constants.Items.STAFF_ENDER: return ENDER;

            case Constants.Items.STAFF_LIGHT: return LIGHT;

            default: return null;
        }
    }

    // ! Client side.
    @OnlyIn(Dist.CLIENT)

    /**
     * Overides to implement custom texts to Staffs wich are not only a base.
     * 
     * @param stack   Current ItemStack.
     * @param world   Current World.
     * @param tooltip List of the Hover Tooltip lines.
     * @param flag    Tooltip helper flag.
     */
    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {    
        switch(getStaffType())
        {
            case DIAMOND:
                addStaffInformation(tooltip, "Diamond", "\"Power beyond imagination.\"", TextFormatting.BLUE);
            break;

            case ENDER:
                addStaffInformation(tooltip, "Ender", "\"The key to the outer planes.\"", TextFormatting.DARK_PURPLE);
            break;

            case LIGHT:
                addStaffInformation(tooltip, "Light", "\"Purify all.\"", TextFormatting.YELLOW);
            break;

            default: super.addInformation(stack, world, tooltip, flag);
        }
    }

    /**
     * Helper function to format equaly the Staffs text.
     * 
     * @param tooltip List of the Hover Tooltip lines.
     * @param type    Staff type subtitle.
     * @param flavor  Staff flavor text, like a hint to the player.
     * @param color   Color of the flavor text.
     */
    private void addStaffInformation(List<ITextComponent> tooltip, String type, String flavor, TextFormatting color)
    {
        tooltip.add(new StringTextComponent(TextFormatting.DARK_GRAY + type));
        tooltip.add(new StringTextComponent(" "));
        tooltip.add(new StringTextComponent(color + (TextFormatting.ITALIC + flavor)));
    }
}
