package mestretramador.rrmocreatures.item;                                           
                                                                                     
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderOgreLairPrinceCannonFire;          
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Fire Cannon item.                                          
 *                                                                                   
 * @version 0.0.15                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemOgreLairPrinceCannonFire extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Fire Cannon.                            
    */                                                                               
   public RRMoCItemOgreLairPrinceCannonFire()                                                         
   {                                                                                 
       super(Constants.Items.OGRE_LAIR_PRINCE_CANNON_FIRE, new RRMoCItemProviderOgreLairPrinceCannonFire());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Fire Cannon item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Fire Cannon is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new Item(((RRMoCItemProviderOgreLairPrinceCannonFire) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
