import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        //Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tabuada ");

        System.out.println("Informe o número para a tabuada: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

        entrada.close();
    }
}
