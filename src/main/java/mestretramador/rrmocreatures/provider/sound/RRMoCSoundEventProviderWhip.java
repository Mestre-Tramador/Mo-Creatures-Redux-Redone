package mestretramador.rrmocreatures.provider.sound;                         
                                                                             
import mestretramador.rrmocreatures.util.Constants;                          
                                                                             
import net.minecraft.util.ResourceLocation;                                  
                                                                             
/**                                                                          
 * Mo'Creatures Redux&Redone Whip Crack sound event provider.                  
 *                                                                           
 * @version 0.0.29                                                        
 * @author Eduardo de Oliveira Rosa, Mestre Tramador.                                                          
 */                                                                          
public class RRMoCSoundEventProviderWhip extends RRMoCSoundEventProvider  
{                                                                            
   /**                                                                       
    * Using the parent constructor, start Whip Crack with the                    
    * {@link mestretramador.rrmocreatures.util.Constants.Sounds#WHIP WHIP}   
    * constant path.                                                         
    */                                                                       
   public RRMoCSoundEventProviderWhip()                                   
   {                                                                         
       super(Constants.Sounds.FX.WHIP);                                         
   }                                                                         
                                                                             
   /**                                                                       
    * Return sound event properties of                                       
    * {@link mestretramador.rrmocreatures.sound.RRMoCSoundEventWhip       
    * Whip Crack}.                                                               
    */                                                                       
   @Override                                                                 
   public ResourceLocation provideProperties()                               
   {                                                                         
       return PROPERTIES();                                                  
   }                                                                         
}                                                                            
