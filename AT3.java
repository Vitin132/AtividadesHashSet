

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;
/**
 *
 * @author Aluno
 */
public class AT3 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> inteiros = new HashSet<>(Arrays.asList(1,2,3,4,5));
        
        System.out.println(inteiros);
        
        inteiros.removeAll(inteiros);
        
        System.out.println(inteiros);
        
        
    }
    
    

}
