//  Exercício 3: Número Máximo em um Array com Condição
//  Descrição: Encontramos o maior número múltiplo de 3 na lista.
//      Passos:
//      Usamos filter para selecionar os múltiplos de 3.
//      Usamos max para encontrar o valor máximo.
//      Usamos orElse para retornar -1 caso não existam múltiplos de 3.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,6,9,10,12,15);

        //Chama o metodo maiorMultiploDe3 e armazena o resultado
        int resultado = maiorMultiploDe3(numeros);

        //Imprime o resultado na tela
        System.out.println("O maior múltiplo de 3 é:" + resultado);
    }
    //Metodo para encontrar o maior múltiplo de 3 na lista
    public static int maiorMultiploDe3(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 == 0)    // Filtra apenas múltiplos de 3
                .max(Integer::compareTo)    // Encontra o valor máximo
                .orElse(-1);          // Retorna -1 se não houver múltiplos de 3
    }
}