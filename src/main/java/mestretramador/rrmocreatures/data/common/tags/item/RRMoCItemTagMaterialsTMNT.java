package mestretramador.rrmocreatures.data.common.tags.item;

import mestretramador.rrmocreatures.data.common.provider.tags.item.RRMoCItemTagProvider;
import mestretramador.rrmocreatures.util.Tags;

import net.minecraft.item.Items;
                                                                                    
/**                                                                                 
 * Mo'Creatures Redux&Redone TMNT Materials Tag's Items.                                  
 *                                                                                  
 * @version 0.0.29                                                               
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                 
 */                                                                                 
public class RRMoCItemTagMaterialsTMNT extends RRMoCItemTagProvider                       
{                                                                                   
    /**                                                                             
     * Using the parent constructor, creates the TMNT Materials tag.                        
     */                                                                             
    public RRMoCItemTagMaterialsTMNT()                                                    
    {                                                                               
        super(Tags.Items.MATERIALS_TMNT);                                                     
    }                                                                               
                                                                                    
    /**                                                                             
     * <p>                                                                        
     * The setter sets the {@link Tags.Items#MATERIALS_TMNT TMNT Materials item                       
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
     * <li>{@link net.minecraft.item.Items#BONE_MEAL Minecraft's Bone Meal}</li>                                            
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
        ITEMS.add(Items.BONE_MEAL);                                                    
    }                                                                               
}                                                                                   
