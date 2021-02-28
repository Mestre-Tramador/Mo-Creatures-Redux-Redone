package mestretramador.rrmocreatures.data.common.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.common.provider.tags.item.RRMoCItemTagProvider;
import mestretramador.rrmocreatures.init.RegisterItem;  
                            
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Items;                            
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Wereables to Protect Tag's Items.                                  
 *                                                                                  
 * @version 0.0.27                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagWereablesProtect extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Wereables to Protect tag.                            
     */                                                                             
    public RRMoCItemTagWereablesProtect()                                                    
    {                                                                               
        super(Tags.Items.WEREABLES_PROTECT);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#WEREABLES_PROTECT Wereables to Protect item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorCrystal Crystal Handmade Mount Armor}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorDiamond Diamond Handmade Mount Armor}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorGold Gold Handmade Mount Armor}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorIron Iron Handmade Mount Armor}</li>
     * <li>{@link mestretramador.rrmocreatures.item.RRMoCItemHandmadeMountArmorLeather Leather Handmade Mount Armor}</li>
     * <li>{@link net.minecraft.item.Items#IRON_HORSE_ARMOR Minecraft's Diamond Horse Armor}</li>
     * <li>{@link net.minecraft.item.Items#GOLDEN_HORSE_ARMOR Minecraft's Golden Horse Armor}</li>
     * <li>{@link net.minecraft.item.Items#DIAMOND_HORSE_ARMOR Minecraft's Iron Horse Armor}</li>
     * <li>{@link net.minecraft.item.Items#LEATHER_HORSE_ARMOR Minecraft's Leather Horse Armor}</li>
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(RegisterItem.HANDMADE_MOUNT_ARMOR_CRYSTAL.returnAsItem());
        ITEMS.add(RegisterItem.HANDMADE_MOUNT_ARMOR_DIAMOND.returnAsItem());
        ITEMS.add(RegisterItem.HANDMADE_MOUNT_ARMOR_GOLD.returnAsItem());
        ITEMS.add(RegisterItem.HANDMADE_MOUNT_ARMOR_IRON.returnAsItem());
        ITEMS.add(RegisterItem.HANDMADE_MOUNT_ARMOR_LEATHER.returnAsItem());   
        
        ITEMS.add(Items.IRON_HORSE_ARMOR);
        ITEMS.add(Items.GOLDEN_HORSE_ARMOR);
        ITEMS.add(Items.DIAMOND_HORSE_ARMOR);
        ITEMS.add(Items.LEATHER_HORSE_ARMOR);
    }                                                                               
}                                                                                   
