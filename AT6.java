

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class AT6 {
    public static void main(String[] args) {
        
        HashSet<String> animais = new HashSet<>(Arrays.asList("Jaguar", "Onça", "Leão", "Javali"));
        
        
        System.out.println("A lista contém o animal Javali?");
        
        if(animais.contains("Javali")){
            
            System.out.println(animais);
            System.out.println("Sim, a lista contém o animal Javali.");
            
            
            
        }
        
        
    }
    
    

}
