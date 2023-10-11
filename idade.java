import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        /*Escreva um programa Java console que solicite ao usuário que informe sua idade em anos, meses e dias, 
        ou seja, sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário. Seu programa deverá exibir uma saída parecida com:
        Informe sua idade em anos, meses e dias Anos: 25    Meses: 2     Dias: 12      Idade expressa em dias: 9197 
        Aqui o usuário tem 25 anos, 2 meses e 12 dias de idade. Assim, sua idade expressa em dias é 9.197 */

        System.out.println("Informe sua idade atual em anos: ");
        int idade = entrada.nextInt();


        System.out.println("Informe a quantidade de meses desde seu aniversário: ");
        int meses = entrada.nextInt();


        System.out.println("Informe a quantidade de dias decorridos desde seu aniversário: ");
        int dias = entrada.nextInt();

        int idadeDias = (idade * 365) +  (meses * 30) + dias;

        System.out.printf("O usuário tem %d anos, %d meses e %d dias. Assim, sua idade expressa em dias é: %d", idade, meses, dias, idadeDias);


        entrada.close();
    }
    
}
