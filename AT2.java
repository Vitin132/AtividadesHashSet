

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class AT2 {
    
    public static void main(String[] args) {
        
        
        Set<String> frutas = new HashSet<>(Arrays.asList("Maçã", "Laranja", "Uva", "Ameixa"));
        
        
        System.out.println(frutas);
        
        
        if(frutas.contains("Ameixa")){
            
            frutas.remove("Ameixa");
            System.out.println(frutas);
        }
        
        
        
    }
    
    

}
