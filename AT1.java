

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class AT1 {
    
    public static void main(String[] args) {
        
        
         Set<Integer> inteiros = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
         
         System.out.println(inteiros);
         
         if(inteiros.contains(5)){
            
            System.out.println(" 5 encontrado");
            
        }
    }
    
    

}
