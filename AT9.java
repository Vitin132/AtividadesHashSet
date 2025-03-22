

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class AT9 {

    public static void main(String[] args) {
        
        HashSet<Character> letras = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
        
        
        System.out.println(letras);
        
        System.out.println("Qual a quantidade de caracteres na lista?");
        
        
        //letras.size();
        
        
        System.out.println("A lista possui "+letras.size()+" caracteres!");
        
    }
    
    
}
