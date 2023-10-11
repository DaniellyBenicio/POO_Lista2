import java.util.Scanner;

public class duracaoEvento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        /*Escreva um programa Java console que receberá a duração de um evento expresso em segundos e exiba-o expresso em horas, minutos e segundos. 
        Seu programa deverá exibir uma saída parecida com:Informe a duração do evento em segundos: 3712 Duração do evento: 01:01:52 */

        System.out.println("Qual a duração do evento em segundos: ");
        int s = entrada.nextInt();

        int horas = s / 3600;
        int minutos = (s % 3600)/ 60;
        int segundos = s % 60;
        System.out.printf("Duração do evento: %d/%d/%d", horas, minutos, segundos);

        entrada.close();
    }
    
}
