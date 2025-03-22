

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class AT7 {

    public static void main(String[] args) {
        
        HashSet<String> cores = new HashSet<>(Arrays.asList("Amarelo", "Marrom", "Vermelho"));
        
        
        System.out.println(cores);
        System.out.println("A lista contém a cor 'Vermelho'?");
        
        
        boolean estaPresente = cores.contains("Vermelho");
        System.out.println(estaPresente);
        
        
    }
    
    
}
