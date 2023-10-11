import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        /*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, 
        em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa a temperatura em graus Celsius.*/

        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe a temperatura em Celsius: ");
		double C = entrada.nextDouble();
		
		//Formula = Multiplicamos a temperatura em ºC por 1,8 e somamos 32 ao resultado.
		
		double F = C * 1.8 + 32; 
		
		System.out.printf("A temperatura em Fahrenheit é: " + "%.2f ºF", F);
		
		entrada.close();

 }
}
