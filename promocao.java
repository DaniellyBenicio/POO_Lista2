import java.util.Scanner;

public class promocao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o valor da diária do hotel: ");
        double diaria = entrada.nextDouble();

        double taxapromocao = 0.22;
        double sempromocao = 0.40;
        double expectativataxapromocao = 0.70;

        double diariapromocao = diaria - (diaria * taxapromocao);
        double vmSPromocao = diaria * sempromocao * 30;
        double vmCPromocao = diaria * expectativataxapromocao * 30;
        double lucro = vmCPromocao - vmSPromocao;

        System.out.println("O valor da diária no período da promoção: " + diariapromocao);
        System.out.println("O valor médio arrecadado sem a promoção, durante um mês: " + vmSPromocao);
        System.out.println("O valor médio arrecadado com a promoção, durante um mês: " + vmCPromocao);
        System.out.println("O lucro ou prejuízo mensal com a promoção: " + lucro);

        entrada.close();
    }
}
