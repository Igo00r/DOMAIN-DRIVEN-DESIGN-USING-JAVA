package StreamAPI;

import Entidades.Midia;  // Importa a classe Midia, que representa as mídias do sistema.

import java.util.List;  // Importa a interface List para trabalhar com listas de mídias.
import java.util.Map;   // Importa a interface Map para armazenar o resultado da contagem de mídias.
import java.util.stream.Collectors;  // Importa Collectors para operações de coleta em streams.

// Implementação da classe MidiaGrouping
public class MidiaGrouping {

    // Metodo estático que agrupa mídias por tipo e retorna um mapa com a contagem de cada tipo.
    public static Map<String, Long> groupByType(List<Midia> midiaList) {
        // Inicia um stream a partir da lista de mídias.
        return midiaList.stream()
                // Agrupa as mídias pelo tipo retornado pelo metodo getType() da classe Midia.
                .collect(Collectors.groupingBy(
                        Midia::getType,                // Referencia o metodo getType() para obter o tipo de cada mídia.
                        Collectors.counting()          // Usa Collectors.counting() para contar quantas mídias existem em cada grupo.
                ));
    }
}
