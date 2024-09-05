package fiap.tds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var nomes = new String[]{"João", "Maria", "José"};
        var numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        // for tradicional
        // para i = 0; i < tamanho do vetor; i++
        for(int i = 0; i< numeros.length; i++)
            System.out.println(numeros[i]);

        // para cada nome dentro do vetor de nomes
        for(var nome : nomes)
            // imprime o nome
        System.out.println(nome);

        //while
        var contador = 0;
        while (contador < nomes.length)
            System.out.println(nomes[contador]);
        contador++;

    }

    static
    {
        //variaveis();

        //operadores();
        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        var idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 18 && idade <= 200)
            System.out.println("A pessoa é maior de idade");
        else if (idade > 200)
            System.out.println("A pessoa é um vampiro");
        else
            System.out.println("A pessoa é menor de idade");

        var notaDDD = 8;
        var notaCPT = 3;
        var notaBD = 10;

        if (notaCPT < 6 || notaBD < 6)
            System.out.println(
                    "Reprovado em pelo menos uma disciplina, " +
                            "nao irá se formar no tempo minimo");

    }

    public static void variaveis() {
        System.out.println("Sistema iniciando...");

        var scan = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        var numero1 = scan.nextBigDecimal();
        scan.nextLine();
        System.out.println("Digite o numero 2: ");
        var numero2 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println(numero1.add(numero2));

        var nome = "FIAP";
        System.out.println(nome);

        var numero = 10;
        System.out.println(numero + 10);

        var valor = 10.5;
        System.out.println(numero + 10.5);

        var valorGrande = 1000000000000000000L;
        var valorPequeno = 10;

        var letra = 'A';
        var condicao = true;

        var temp = 30.5;
        System.out.println("A temp é de: " + temp + " graus");

        var numeroTexto = "10";
        // conversao explicita de String para int
        var numeroConvertido = Integer.parseInt(numeroTexto);

        //declaracao de variaveis
        int idade;
        //inicializacao de variaveis
        idade = 10;
        idade = 20;
        idade = 30;
        //declaracao e inicializacao
        var idade2 = 10;

        System.out.println("Sistema finalizando...");

    }
}


