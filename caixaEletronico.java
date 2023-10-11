import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe um valor inteiro: ");
        int valor = entrada.nextInt();

        int cem = valor / 100;
        int cinquenta = (valor % 100) / 50;
        int dez = (valor % 50) / 10;
        int cinco = (valor % 10) / 5;
        int um = valor % 5;
        
        System.out.println("O valor do saque pode ser expresso em: ");
        System.out.printf("%d notas de 100\n", cem);
        System.out.printf("%d notas de 50\n", cinquenta);
        System.out.printf("%d notas de 10\n", dez);
        System.out.printf("%d nas de 5\n", cinco);
        System.out.printf("%d nas de 1\n", um);

        entrada.close();
    }
    
}
