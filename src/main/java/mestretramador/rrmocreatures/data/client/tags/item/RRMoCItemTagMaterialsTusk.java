package mestretramador.rrmocreatures.data.client.tags.item;                         
                                                                                    
import mestretramador.rrmocreatures.data.client.provider.item.RRMoCItemTagProvider; 
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Items;
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone Tusk Materials Tag's Items.                                  
 *                                                                                  
 * @version 0.0.24                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagMaterialsTusk extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the Tusk Materials tag.                        
     */                                                                             
    public RRMoCItemTagMaterialsTusk()                                                    
    {                                                                               
        super(Tags.Items.MATERIALS_TUSK);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#MATERIALS_TUSK Tusk Materials item                       
     * tag} to the below items:                                                     
     * </p>                                                                       
     * <ul>                                                                       
     * <li>{@link net.minecraft.item.Items#OAK_PLANKS Minecraft's Oak Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#SPRUCE_PLANKS Minecraft's Spruce Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#BIRCH_PLANKS Minecraft's Birch Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#JUNGLE_PLANKS Minecraft's Jungle Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#ACACIA_PLANKS Minecraft's Acacia Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#DARK_OAK_PLANKS Minecraft's Dark Oak Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#CRIMSON_PLANKS Minecraft's Crimson Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#WARPED_PLANKS Minecraft's Warped Planks}</li>                                           
     * <li>{@link net.minecraft.item.Items#IRON_INGOT Minecraft's Iron Ingot}</li>                                           
     * <li>{@link net.minecraft.item.Items#DIAMOND Minecraft's Diamond}</li>                                           
     * </ul>                                                                      
     */                                                                             
    @Override                                                                       
    protected void setItemsToTag()                                                  
    {                                                                               
        ITEMS.add(Items.OAK_PLANKS);        
        ITEMS.add(Items.SPRUCE_PLANKS); 
        ITEMS.add(Items.BIRCH_PLANKS); 
        ITEMS.add(Items.JUNGLE_PLANKS); 
        ITEMS.add(Items.ACACIA_PLANKS); 
        ITEMS.add(Items.DARK_OAK_PLANKS); 
        ITEMS.add(Items.CRIMSON_PLANKS); 
        ITEMS.add(Items.WARPED_PLANKS); 
        ITEMS.add(Items.IRON_INGOT);
        ITEMS.add(Items.DIAMOND);                                                  
    }                                                                               
}                                                                                   
