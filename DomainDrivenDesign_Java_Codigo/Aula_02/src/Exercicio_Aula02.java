public class Exercicio_Aula02 {

    /*
Uma transportadora precisa comprar veículos utilitários de transporte, entre eles um
caminhão simples, um bitrem, um furgão e um VUC (veículo urbano de carga). Sabendo
que eles custam respectivamente R$200.000,00, R$400.000,00, R$100.000,00 e
R$100.000,00, escreva um programa que calcule e imprima o total a ser gasto pela
empresa.
Dica: crie variáveis para cada um dos veículos, crie outra variável onde seja feita a soma e,
ao final, imprima a variável onde foi feita a soma.
*/

    public static void main(String[] args) {

        String caminhao = "Caminhão Simples";
        String Bitrem =  "Bitre";
        String furgao = "Furgao";
        String VUC = "veículo urbano de carga";

        double teste1 = 200000.00;
        double teste2 = 400000.00;
        double teste3 = 100000.00;
        double teste4 = 100000.00;

        double resultadoFinal = teste1 + teste2 + teste3 + teste4;

        System.out.println( "O total a ser gasto pela empresa é de: R$ " + resultadoFinal);


    }

}
