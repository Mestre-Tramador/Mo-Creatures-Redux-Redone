package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.init.RegisterItem;                              
import mestretramador.rrmocreatures.util.Tags;
import mestretramador.rrmocreatures.util.VanillaIDs;

import net.minecraft.item.Item;                            
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Wereables to Protect Tag's Items.                                  
 *                                                                                  
 * @version 0.0.14                                                               
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
     * <li><a href="https://minecraft.gamepedia.com/Horse_Armor"> Minecraft's Diamond Horse Armor</a></li>
     * <li><a href="https://minecraft.gamepedia.com/Horse_Armor"> Minecraft's Golden Horse Armor</a></li>
     * <li><a href="https://minecraft.gamepedia.com/Horse_Armor"> Minecraft's Iron Horse Armor</a></li>
     * <li><a href="https://minecraft.gamepedia.com/Horse_Armor"> Minecraft's Leather Horse Armor</a></li>
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
        
        ITEMS.add(Item.getItemById(VanillaIDs.IRON_HORSE_ARMOR.ID()));
        ITEMS.add(Item.getItemById(VanillaIDs.GOLDEN_HORSE_ARMOR.ID()));
        ITEMS.add(Item.getItemById(VanillaIDs.DIAMOND_HORSE_ARMOR.ID()));
        ITEMS.add(Item.getItemById(VanillaIDs.LEATHER_HORSE_ARMOR.ID()));
    }                                                                               
}                                                                                   
