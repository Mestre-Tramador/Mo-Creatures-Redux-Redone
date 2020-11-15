package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderOgreLairPrinceStaffTeleport;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Staff of Teleportation item.                                          
 *                                                                                   
 * @version 0.0.21                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemOgreLairPrinceStaffTeleport extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Staff of Teleportation.                            
    */                                                                               
   public RRMoCItemOgreLairPrinceStaffTeleport()                                                         
   {                                                                                 
       super(Constants.Items.OGRE_LAIR_PRINCE_STAFF_TELEPORT, new RRMoCItemProviderOgreLairPrinceStaffTeleport());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Staff of Teleportation item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Staff of Teleportation is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderOgreLairPrinceStaffTeleport) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
