import java.util.Scanner;

public class inverterNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe um número de 3 digitos: ");
        int n = entrada.nextInt();

        int cen = n / 100;
        int dez = (n % 100) / 10;
        int uni = n % 10;
        
        System.out.println("Valor original: " + n);
        System.out.println("Valor invertido: " + uni + dez + cen);
    
        entrada.close();
    }
}
