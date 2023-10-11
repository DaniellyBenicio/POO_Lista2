/* Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
 Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, 
 será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
  basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. 
  O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. 
  Dica: trabalhe com valores reais.*/

import java.util.Scanner;

public class litrosCombustivel {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o tempo gasto na viagem: ");
        double tempo = entrada.nextDouble();

        System.out.println("Informe a velocidade média: ");
        double velocidade = entrada.nextDouble();

        double distancia = tempo * velocidade;

        double LITROS_USADOS = distancia / 12;

        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("DistÂncia percorrida: " + distancia + "km/h");
        System.out.println("Quantidade de litros utilizada na viagem: " + LITROS_USADOS + "L");

        entrada.close();

    }
    
}
