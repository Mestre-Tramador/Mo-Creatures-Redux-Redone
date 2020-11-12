package mestretramador.rrmocreatures.item;

import mestretramador.rrmocreatures.model.item.RRMoCItemModel;
import mestretramador.rrmocreatures.provider.item.RRMoCItemProviderOgreLairPrinceHammerBuilder;
import mestretramador.rrmocreatures.util.Constants;                                  
                                                                                     
import net.minecraft.item.Item;                                                      
                                                                                     
/**                                                                                  
 * Mo'Creatures Redux&Redone Builder Hammer item.                                          
 *                                                                                   
 * @version 0.0.17                                                                
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                  
 */                                                                                  
public class RRMoCItemOgreLairPrinceHammerBuilder extends RRMoCItem                                      
{                                                                                    
   /**                                                                               
    * Using the parent base constructor, create a Builder Hammer.                            
    */                                                                               
   public RRMoCItemOgreLairPrinceHammerBuilder()                                                         
   {                                                                                 
       super(Constants.Items.OGRE_LAIR_PRINCE_HAMMER_BUILDER, new RRMoCItemProviderOgreLairPrinceHammerBuilder());                  
   }                                                                                 
                                                                                     
   /**                                                                               
    * Return a Builder Hammer item in its current state.                                     
    */                                                                               
   @Override                                                                         
   public Item returnAsItem()                                                        
   {                                                                                 
       return getItem();                                                             
   }                                                                                 
                                                                                     
   /**                                                                               
    * With the {@link mestretramador.rrmocreatures.item.RRMoCItem#setItem(Item) set 
    * helper function}, the Builder Hammer is created.                                       
    */                                                                               
   @Override                                                                         
   protected void createItem()                                                       
   {                                                                                 
       setItem(new RRMoCItemModel(((RRMoCItemProviderOgreLairPrinceHammerBuilder) provider).provideProperties())); 
   }                                                                                 
}                                                                                    
