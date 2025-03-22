

package Atividade1HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class AT8 {

    
    public static void main(String[] args) {
        
        HashSet<String> cidades = new HashSet<>(Arrays.asList("São Paulo", "Rio de Janeiro", "Brasília"));
        
        
        System.out.println("Lista de cidades:");
        System.out.println(cidades);
        
        
        if(cidades.contains("São Paulo")){
            
            
            cidades.remove("São Paulo");
            
            
        }
        
        System.out.println("A cidade de São Paulo foi removida!");
        
        System.out.println(cidades);
        
    }
    
    
    
}
