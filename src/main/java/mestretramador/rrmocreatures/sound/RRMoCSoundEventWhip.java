package mestretramador.rrmocreatures.sound;                                                                      
                                                                                                                 
import mestretramador.rrmocreatures.model.sound.RRMoCSoundEventModel;                                            
import mestretramador.rrmocreatures.provider.sound.RRMoCSoundEventProviderWhip;                               
import mestretramador.rrmocreatures.util.Constants;                                                              
                                                                                                                 
import net.minecraft.util.SoundEvent;                                                                            
                                                                                                                 
/**                                                                                                              
 * Mo'Creatures Redux&Redone Whip Crack sound event.                                                               
 *                                                                                                               
 * @version 0.0.24                                                                                            
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                                                              
 */                                                                                                              
public class RRMoCSoundEventWhip extends RRMoCSoundEvent                                                      
{                                                                                                                
   /**                                                                                                           
    * Using the parent base constructor, create a Whip Crack sound event.                                            
    */                                                                                                           
   public RRMoCSoundEventWhip()                                                                               
   {                                                                                                             
       super(Constants.Sounds.FX.WHIP, new RRMoCSoundEventProviderWhip());                                       
   }                                                                                                             
                                                                                                                 
   /**                                                                                                           
    * With the mestretramador.rrmocreatures.sound.RRMoCSoundEvent#setSoundEvent(SoundEvent) set                 
    * helper function}, the Whip Crack sound event is created.                                                       
    */                                                                                                           
   @Override                                                                                                     
   protected void createSoundEvent()                                                                             
   {                                                                                                             
       setSoundEvent(new RRMoCSoundEventModel(((RRMoCSoundEventProviderWhip) provider).provideProperties())); 
   }                                                                                                             
                                                                                                                 
   /**                                                                                                           
    * Return the Whip Crack sound event in its current state.                                                        
    */                                                                                                           
   @Override                                                                                                     
   public SoundEvent returnAsSoundEvent()                                                                        
   {                                                                                                             
       return getSoundEvent();                                                                                   
   }                                                                                                             
}                                                                                                                
