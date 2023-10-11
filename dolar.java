import java.util.Scanner;

public class dolar {
    public static void main(String[] args) {
        /*Faça um programa que:  - Leia a cotação do dólar  - Leia um valor em dólares   - Converta esse valor para Real   - Mostre o resultado         */

        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a cotação em dólar: ");
        double cotacao = entrada.nextDouble();
        
        System.out.println("Informe o valor em dólar: ");
        double dolar = entrada.nextDouble();

        double converte = cotacao * dolar;

        System.out.printf("Convertido para real: %.2f", converte);

        entrada.close();
    }
    
}
